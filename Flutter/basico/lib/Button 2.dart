import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp( home: FabExample(),));
}

class FabExample extends StatefulWidget {

  @override
  _FabExampleState createState() => _FabExampleState();
}

class _FabExampleState extends State<FabExample> {

  int contar = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Boton'),
      ),
      body: Center (
        child: Text (
          '$contar',
          style: TextStyle(
            fontSize: 30
          ),
        ),
      ),
      floatingActionButton: FloatingActionButton (
        onPressed: () {
          setState(() {
            sumar();
          });
        },
        backgroundColor: Colors.yellowAccent,
        child: const Icon(Icons.music_note),
      ),
    );
  }

  void sumar() {
    contar = contar + 1;
  }
}