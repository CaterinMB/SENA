import 'package:flutter/material.dart';
import 'package:sqflite/sqflite.dart';
import 'package:pachos/Ventas.dart';
import 'package:path/path.dart' as path;

class ListarProductosPage extends StatefulWidget {
  @override
  _ListarProductosPageState createState() => _ListarProductosPageState();
}

class _ListarProductosPageState extends State<ListarProductosPage> {
  List<Map<String, dynamic>> _productos = [];

  @override
  void initState() {
    super.initState();
    _getProductosFromDatabase();
  }

  Future<void> _getProductosFromDatabase() async {
    final database = await openDatabase(
      path.join(await getDatabasesPath(), 'my_database.db'),
    );
    final productos = await database.query('productos');
    setState(() {
      _productos = productos;
    });
    await database.close();
  }

  Future<void> _eliminarProducto(int id) async {
    final database = await openDatabase(
      path.join(await getDatabasesPath(), 'my_database.db'),
    );
    await database.delete(
      'productos',
      where: 'id = ?',
      whereArgs: [id],
    );
    await _getProductosFromDatabase();
    await database.close();
  }

  Future<void> _actualizarProducto(int id) async {
    final database = await openDatabase(
      path.join(await getDatabasesPath(), 'my_database.db'),
    );
    final producto = await database.query(
      'productos',
      where: 'id = ?',
      whereArgs: [id],
    );
    await database.close();
    Navigator.push(
      context,
      MaterialPageRoute(
        builder: (context) => EditarProductoPage(
          producto: producto[0],
        ),
      ),
    ).then((value) async {
      if (value == true) {
        await _getProductosFromDatabase();
      }
    });
  }

  Future<void> _registrarProducto() async {
    Navigator.push(
      context,
      MaterialPageRoute(builder: (context) => Myproducto()),
    ).then((value) async {
      if (value == true) {
        await _getProductosFromDatabase();
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Productos'),
        actions: [
        PopupMenuButton(
          itemBuilder: (BuildContext context) => [
            PopupMenuItem(
              child: ListTile(
                leading: Icon(Icons.shopping_cart),
                title: Text('Ventas'),
                onTap: () {
                  Navigator.pop(context);
                  Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => VentaRoute()),
                  );
                },
              ),
            ),
          ],
        )
        ]
      ),
      body: ListView.builder(
        itemCount: _productos.length,
        itemBuilder: (context, index) {
          final producto = _productos[index];
          return ListTile(
            title: Text(producto['name']),
            subtitle: Text('Categoría: ${producto['category']}'),
            trailing: Text('Precio: ${producto['price']}'),
            onTap: () => _actualizarProducto(producto['id']),
            onLongPress: () {
              showDialog(
                context: context,
                builder: (BuildContext context) {
                  return AlertDialog(
                    title: Text('Confirmar Eliminación'),
                    content: Text('¿Desea eliminar el producto?'),
                    actions: [
                      TextButton(
                        onPressed: () => Navigator.pop(context),
                        child: Text('Cancelar'),
                      ),
                      TextButton(
                        onPressed: () async {
                          await _eliminarProducto(producto['id']);
                          Navigator.pop(context);
                        },
                        child: Text('Eliminar'),
                      ),
                    ],
                  );
                },
              );
            },
          );
        },
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: _registrarProducto,
        child: Icon(Icons.add),
      ),
    );
  }
}

class EditarProductoPage extends StatefulWidget {
  final Map<String, dynamic> producto;

  const EditarProductoPage({required this.producto});

  @override
  _EditarProductoPageState createState() => _EditarProductoPageState();
}

class _EditarProductoPageState extends State<EditarProductoPage> {
  final _formKey = GlobalKey<FormState>();
  late String _category;
  late String _productName;
  late String _price;
  late String _pizzaSize;
  late String _maxFlavors;

  @override
  void initState() {
    super.initState();
    _category = widget.producto['category'];
    _productName = widget.producto['name'];
    _price = widget.producto['price'];
    _pizzaSize = widget.producto['size'];
    _maxFlavors = widget.producto['flavors'];
  }

  Future<void> _updateProductoInDatabase() async {
    if (_formKey.currentState!.validate()) {
      _formKey.currentState!.save();

      final database = await openDatabase(
        path.join(await getDatabasesPath(), 'my_database.db'),
      );

      await database.update(
        'productos',
        {
          'name': _productName,
          'category': _category,
          'price': _price,
          'size': _pizzaSize,
          'flavors': _maxFlavors,
        },
        where: 'id = ?',
        whereArgs: [widget.producto['id']],
      );

      await database.close();

      Navigator.pop(context, true);
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Editar Producto'),
      ),
      body: Form(
        key: _formKey,
        child: ListView(
          padding: EdgeInsets.all(16.0),
          children: <Widget>[
            TextFormField(
              initialValue: _productName,
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
                _productName = value!;
              },
            ),
            SizedBox(height: 16.0),
            DropdownButtonFormField<String>(
              value: _category,
              decoration: const InputDecoration(
                icon: const Icon(Icons.category),
                hintText: 'Seleccione la categoría',
                labelText: 'Categoría',
              ),
              onChanged: (String? newValue) {
                setState(() {
                  _category = newValue!;
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
                _category = value!;
              },
            ),
            SizedBox(height: 16.0),
            TextFormField(
              initialValue: _price,
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
                _price = value!;
              },
            ),
            SizedBox(height: 16.0),
            TextFormField(
              initialValue: _pizzaSize,
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
                _pizzaSize = value!;
              },
            ),
            SizedBox(height: 16.0),
            TextFormField(
              initialValue: _maxFlavors,
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
                _maxFlavors = value!;
              },
            ),
            SizedBox(height: 16.0),
            ElevatedButton(
              onPressed: _updateProductoInDatabase,
              child: const Text('Actualizar'),
            ),
          ],
        ),
      ),
    );
  }
}

class Myproducto extends StatelessWidget {
  const Myproducto({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final appTitle = 'Registrar Producto';
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.brown,
        title: Text(appTitle),
      ),
      body: MyCustomForm(),
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

      Navigator.pop(context, true);
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
              icon: const Icon(Icons.email),
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
              icon: const Icon(Icons.password),
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
            child: const Text('Guardar'),
          ),
        ],
      ),
    );
  }
}

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'App Demo',
      theme: ThemeData(
        primarySwatch: Colors.brown,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: ListarProductosPage(),
    );
  }
}
