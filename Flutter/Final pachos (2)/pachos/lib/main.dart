import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';
import 'package:iniciosecionproyecto/usuarios.dart';

import 'ListarProductosPage.dart';
import 'sqlhelpr.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'PACH - OS',
      theme: ThemeData(
        primarySwatch: Colors.brown,
      ),
      home: HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Pach-OS'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            // Image.asset(
            //   '../assets/Logo.png', // Nombre de la imagen
            //   // width: 150,
            //   // height: 150,
            // ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => ProductosPage(),
                  ),
                );
              },
              child: Text('Iniciar Sesión'),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => UsuarioRoute(),
                  ),
                );
              },
              child: Text('Usuario'),
            ),
          ],
        ),
      ),
    );
  }
}

class ProductosPage extends StatefulWidget {
  @override
  _ProductosPageState createState() => _ProductosPageState();
}

class _ProductosPageState extends State<ProductosPage> {
  final GlobalKey<FormState> _formKey = GlobalKey<FormState>();
  final TextEditingController _usuarioController = TextEditingController();
  final TextEditingController _contrasenaController = TextEditingController();
  String mensajeError = '';

  @override
  void dispose() {
    _usuarioController.dispose();
    _contrasenaController.dispose();
    super.dispose();
  }

  Future<void> iniciarSesion() async {
    if (_formKey.currentState!.validate()) {
      _formKey.currentState!.save();
      final valor = await SQLHelper.checkCredentials(
          _usuarioController.text, _contrasenaController.text);

      print(valor);
      if (valor) {
        Navigator.push(
          context,
          MaterialPageRoute(
            builder: (context) => ListarProductosPage(),
          ),
        );
      } else {
        setState(() {
          mensajeError = 'Usuario o contraseña incorrectos';
        });
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Iniciar Sesión'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            // Image.asset(
            //   '../assets/Logo.png', // Nombre de la imagen
            //   // width: 150,
            //   // height: 150,
            // ),
            SizedBox(height: 20),
            Form(
              key: _formKey,
              child: Column(
                mainAxisSize: MainAxisSize.min,
                children: [
                  TextFormField(
                    decoration: InputDecoration(labelText: 'Usuario'),
                    controller: _usuarioController,
                    validator: (value) {
                      if (value!.isEmpty) {
                        return 'Ingresa el usuario';
                      }
                      return null;
                    },
                  ),
                  TextFormField(
                    decoration: InputDecoration(labelText: 'Contraseña'),
                    obscureText: true,
                    controller: _contrasenaController,
                    validator: (value) {
                      if (value!.isEmpty) {
                        return 'Ingresa la contraseña';
                      }
                      return null;
                    },
                  ),
                  SizedBox(height: 20),
                  ElevatedButton(
                    onPressed: iniciarSesion,
                    child: Text('Iniciar Sesión'),
                  ),
                  SizedBox(height: 20),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class VentasLoggedInPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Ventas - Inició Sesión'),
      ),
      body: Center(
        child: Text('Vista de Ventas después de iniciar sesión'),
      ),
    );
  }
}
