import 'package:flutter/material.dart';
import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart' as path;

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: MyProducto(),
    );
  }
}

class MyProducto extends StatelessWidget {
  const MyProducto({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final appTitle = 'Registrar Producto';
    return MaterialApp(
      title: appTitle,
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.brown,
          title: Text(appTitle),
        ),
        drawer: MyDrawer(),
        body: MyCustomForm(),
      ),
    );
  }
}

class MyDrawer extends StatelessWidget {
  const MyDrawer({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: ListView(
        padding: EdgeInsets.zero,
        children: <Widget>[
          DrawerHeader(
            decoration: BoxDecoration(
              color: Colors.brown,
            ),
            child: Text(
              'Menú',
              style: TextStyle(
                color: Colors.white,
                fontSize: 24,
              ),
            ),
          ),
          ListTile(
            leading: Icon(Icons.list),
            title: Text('Listar Productos'),
            onTap: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => ListarProductosPage(),
                ),
              );
            },
          ),
          ListTile(
            leading: Icon(Icons.attach_money),
            title: Text('Ventas'),
            onTap: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => VentaRoute(),
                ),
              );
            },
          ),
        ],
      ),
    );
  }
}

class ListarProductosPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Listar Productos'),
      ),
      body: Center(
        child: Text('Página de Listar Productos'),
      ),
    );
  }
}

class VentaRoute extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Ventas'),
      ),
      body: Center(
        child: Text('Página de Ventas'),
      ),
    );
  }
}

class MyCustomForm extends StatefulWidget {
  @override
  MyCustomFormState createState() {
    return MyCustomFormState();
  }
}

class MyCustomFormState extends State<MyCustomForm> {
  final _formKey = GlobalKey<FormState>();
  String? _category;
  String? _productName;
  String? _price;
  String? _pizzaSize;
  String? _maxFlavors;

  Future<void> _saveForm() async {
    if (_formKey.currentState!.validate()) {
      _formKey.currentState!.save();

      final database = await openDatabase(
        path.join(await getDatabasesPath(), 'my_database.db'),
        onCreate: (db, version) {
          return db.execute(
            'CREATE TABLE IF NOT EXISTS productos (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, category TEXT, price TEXT, size TEXT, flavors TEXT)',
          );
        },
        version: 1,
      );

      await database.insert(
        'productos',
        {
          'name': _productName,
          'category': _category,
          'price': _price,
          'size': _pizzaSize,
          'flavors': _maxFlavors,
        },
      );

      await database.close();

      Navigator.push(
        context,
        MaterialPageRoute(builder: (context) => ListarProductosPage()),
      );

      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text('Producto registrado correctamente.'),
        ),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _formKey,
      child: ListView(
        padding: EdgeInsets.all(16.0),
        children: <Widget>[
          TextFormField(
            decoration: const InputDecoration(
              icon: const Icon(Icons.person),
              hintText: 'Ingrese Nombre',
              labelText: 'Nombre del Producto',
            ),
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingrese el nombre';
              }
              return null;
            },
            onSaved: (value) {
              _productName = value;
            },
          ),
          SizedBox(height: 16.0),
          DropdownButtonFormField<String>(
            decoration: const InputDecoration(
              icon: const Icon(Icons.category),
              hintText: 'Seleccione la categoría',
              labelText: 'Categoría',
            ),
            value: _category,
            onChanged: (String? newValue) {
              setState(() {
                _category = newValue;
              });
            },
            items: [
              'Pizza',
              'Gratinados',
              'Bebidas',
              'Pastas',
              'Bar',
            ].map((String value) {
              return DropdownMenuItem<String>(
                value: value,
                child: Text(value),
              );
            }).toList(),
            validator: (value) {
              if (value == null || value.isEmpty) {
                return 'Seleccione la categoría';
              }
              return null;
            },
            onSaved: (value) {
              _category = value;
            },
          ),
          SizedBox(height: 16.0),
          TextFormField(
            decoration: const InputDecoration(
              icon: const Icon(Icons.person),
              hintText: 'Ingrese precio',
              labelText: 'Precio',
            ),
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingrese el precio';
              }
              return null;
            },
            onSaved: (value) {
              _price = value;
            },
          ),
          SizedBox(height: 16.0),
          TextFormField(
            decoration: const InputDecoration(
              icon: const Icon(Icons.email),
              hintText: 'Ingrese tamaño',
              labelText: 'Tamaño Pizza',
            ),
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingrese el tamaño de la pizza';
              }
              return null;
            },
            onSaved: (value) {
              _pizzaSize = value;
            },
          ),
          SizedBox(height: 16.0),
          TextFormField(
            decoration: const InputDecoration(
              icon: const Icon(Icons.password),
              hintText: 'Ingrese el máximo de sabores',
              labelText: 'Máximo de Sabores',
            ),
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingrese el máximo de sabores';
              }
              return null;
            },
            onSaved: (value) {
              _maxFlavors = value;
            },
          ),
          SizedBox(height: 16.0),
          ElevatedButton(
            onPressed: _saveForm,
            child: const Text('Registrar'),
          ),
        ],
      ),
    );
  }
}
