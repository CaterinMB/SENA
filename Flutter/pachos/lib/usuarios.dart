import 'package:flutter/material.dart';
// usuarios.dart
import 'package:flutter/material.dart';
import 'sqlhelpr.dart';
import 'package:mailer/mailer.dart';
import 'package:mailer/smtp_server.dart';



class UsuarioRoute extends StatelessWidget {
  const UsuarioRoute({Key? key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.brown,
        title: const Text('Registrar usuario'),
      ),
      body: const MyStatefulWidget(),
    );
  }
}

enum SingingCharacter { Masculino, Femenino, Otro }

class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({Key? key});

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  final GlobalKey<FormState> _formkey = GlobalKey<FormState>();
  String? value;
  String? _selectedDocumentType;
  final TextEditingController _documeto = TextEditingController();
  final TextEditingController _nombre = TextEditingController();
  final TextEditingController _apellido = TextEditingController();
  final TextEditingController _genero = TextEditingController();
  final TextEditingController _correo = TextEditingController();
  final TextEditingController _contasena = TextEditingController();

  SingingCharacter? _character = SingingCharacter.Masculino;

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _formkey,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          Padding(
            padding: EdgeInsets.fromLTRB(20, 30, 20, 10),
          ),
          DropdownButtonFormField<String>(
            decoration: const InputDecoration(
              hintText: 'Tipo de Documento',
            ),
            value: _selectedDocumentType,
            items: <String>[
              'Tarjeta de Identidad',
              'Cedula de Ciudadania',
              'Cedula Extrajera'
            ].map((String value) {
              return DropdownMenuItem<String>(
                value: value,
                child: Text(value),
              );
            }).toList(),
            onChanged: (String? newValue) {
              setState(() {
                _selectedDocumentType = newValue;
              });
            },
            validator: (String? value) {
              if (value == null || value.isEmpty) {
                return 'Seleccione el tipo de identificacion';
              }
              return null;
            },
          ),
          TextFormField(
            decoration: const InputDecoration(labelText: 'Doumento'),
            controller: _documeto,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingresa el usuario';
              }
              return null;
            },
          ),
          TextFormField(
            decoration: const InputDecoration(labelText: 'Nombre'),
            controller: _nombre,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingresa el nombre';
              }
              return null;
            },
          ),
          TextFormField(
            decoration: const InputDecoration(labelText: 'Apellido'),
            controller: _apellido,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingresa el apellido';
              }
              return null;
            },
          ),
          ListTile(
            title: const Text('Hombre'),
            leading: Radio<SingingCharacter>(
              value: SingingCharacter.Masculino,
              groupValue: _character,
              onChanged: (SingingCharacter? value) {
                setState(() {
                  _character = value;
                });
              },
            ),
          ),
          ListTile(
            title: const Text('Mujer'),
            leading: Radio<SingingCharacter>(
              value: SingingCharacter.Femenino,
              groupValue: _character,
              onChanged: (SingingCharacter? value) {
                setState(() {
                  _character = value;
                });
              },
            ),
          ),
          ListTile(
            title: const Text('Otro'),
            leading: Radio<SingingCharacter>(
              value: SingingCharacter.Otro,
              groupValue: _character,
              onChanged: (SingingCharacter? value) {
                setState(() {
                  _character = value;
                });
              },
            ),
          ),
          TextFormField(
            decoration: const InputDecoration(labelText: 'correo'),
            controller: _correo,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingresa el correo';
              }
              return null;
            },
          ),
          TextFormField(
            decoration: const InputDecoration(labelText: 'Contraseña'),
            obscureText: true,
            controller: _contasena,
            validator: (value) {
              if (value!.isEmpty) {
                return 'Ingresa la contraseña';
              }
              return null;
            },
          ),
          Padding(
            padding: const EdgeInsets.symmetric(vertical: 16.0),
            child: ElevatedButton(
              onPressed: () {
                if (_formkey.currentState!.validate()) {
                  _registerUser();
                  Mailer();
                  Navigator.pop(context); // Regresar a la pestaña anterior
                }
              },
              child: const Text('Ingresar Usuario'),
            ),
          ),
        ],
      ),
    );
  }

  void _registerUser() async {
    final tipoDocumento = _selectedDocumentType!;
    final documento = _documeto.text ;
    final nombre = _nombre.text;
    final apellido = _apellido.text;
    final genero = _character.toString().split('.').last;
    final correo = _correo.text;
    final contrasena = _contasena.text;

    final id = await SQLHelper.createItem(
        tipoDocumento, documento, nombre, apellido, genero, correo, contrasena);

    // ignore: use_build_context_synchronously
    showDialog(
      context: context,
      builder: (context) {
        return AlertDialog(
          title: const Text('Registro exitoso'),
          content: Text('Usuario registrado con ID: $id'),
          actions: [
            ElevatedButton(
              onPressed: () {
                Navigator.pop(context);
              },
              child: const Text('OK'),
            ),
          ],
        );
      },
    );
  }
Mailer() async {
    String username = 'karenlvsuarez@gmail.com';
    String password = 'uoafilbshuwgojsf';

    final smtpServer = gmail(username, password);
    final message = Message()
      ..from = Address(username, 'confirmacion del registro de usuario')
      ..recipients.add(_correo.text)
      ..ccRecipients.addAll([_correo.text, _correo.text])
      ..bccRecipients.add(Address(_correo.text))
      ..subject = 'Bienvenido :: 😀 :: ${DateTime.now()}'
      ..text = 'confirmacion de usuario.'
      ..html = "Hola bienvenido a PACH-OS su usuario ha sido registrado exitosamente";


    try {
      final sendReport = await send(message, smtpServer);
      print('Message sent: ' + sendReport.toString());
    } on MailerException catch (e) {
      print('Message not sent.');
      for (var p in e.problems) {
        print('Problem: ${p.code}: ${p.msg}');
      }
    }

    var connection = PersistentConnection(smtpServer);
    await connection.send(message);
    await connection.close();
  }
}
