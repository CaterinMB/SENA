import 'package:flutter/material.dart';
void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp ({super.key});

  static const String _title = 'Regístrese pues mi rey';
  

  @override
  Widget build(BuildContext context) {
    return MaterialApp(

      title: _title,
      
      
      home: Scaffold(
        appBar: AppBar(title: const Text(_title), backgroundColor: Colors.pink[200]),
        body: const MyStatefulWidget(),
        
      ),
    );
  }
}

enum SingingCharacter { Masculino, Femenino, Otro }

class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({super.key});

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  final GlobalKey<FormState> _formkey = GlobalKey<FormState>();
  String? value;
  SingingCharacter? _character = SingingCharacter.Masculino;

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _formkey,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          TextFormField(
            decoration: const InputDecoration(
              hintText: 'Ingresa tu nombre',
            ),
            validator: (String? value){
              if (value == null || value.isEmpty) {
                return 'Ingrese valor';
              }
              return 'El nombre ingresado es $value';
            },
          ),

          TextFormField(
            decoration: const InputDecoration(
              hintText: 'Ingresa tu apellido',
            ),
            validator: (String? value){
              if (value == null || value.isEmpty) {
                return 'Ingrese valor';
              }
              return 'El apellido ingresado es $value';
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
            decoration: const InputDecoration(
              hintText: 'Ingrese correo',
            ),
            validator: (String? value){
              if (value == null || value.isEmpty) {
                return 'Ingrese valor';
              }
              return 'El correo ingresado es $value';
            },
          ),

          

          TextFormField(
            decoration: const InputDecoration(
              hintText: 'Ingrese contraseña',
            ),
            validator: (String? value){
              if (value == null || value.isEmpty) {
                return 'Ingrese valor';
              }
              return 'La contraseña ingresada es $value';
            },
          ),

          Padding(padding: const EdgeInsets.symmetric(vertical: 16.0),
          child: Align(
            alignment: Alignment(0.0, -.3),
            child: ElevatedButton(
              onPressed: () {
                if (_formkey.currentState!.validate()) {}
              },
              child: const Text ('Enviar'),
              style: ElevatedButton.styleFrom(
                primary: Colors.green[300]
              ),
            ),
          ),
          ),
        
        ],
      ),
    );
  }
}