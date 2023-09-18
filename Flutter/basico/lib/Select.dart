import 'package:flutter/material.dart';

const List<String> list = <String>['Santiago', 'Caterin', 'Mariana', 'Samuel'];

void main() {
  runApp(const DropdownButtonApp());
}

class DropdownButtonApp extends StatelessWidget {
  const DropdownButtonApp ({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Select')
        ),
        body: const Center(
          child: DropdownButtonExample(),
        ),
      ),
    );
  }
}

class DropdownButtonExample extends StatefulWidget{
  const DropdownButtonExample ({super.key});

  @override
  State<DropdownButtonExample> createState() => _DropdownButtonExampleState();
}

class _DropdownButtonExampleState extends State<DropdownButtonExample> {
  String dropdownValue = list.first;

  @override
  Widget build(BuildContext context) {
    return DropdownButton<String>(
      value: dropdownValue,
      icon: const Icon(Icons.arrow_downward),
      elevation: 5,
      style: const TextStyle(
        color: Colors.black,
        fontSize: 30
      ),
      underline: Container(
        height: 2,
        color: Colors.purple,
      ),
      isExpanded: true,
      onChanged: (String? value) {
        setState(() {
          dropdownValue = value!;
        });
      },
      items: list.map<DropdownMenuItem<String>>((String value) {
        return DropdownMenuItem<String> (
          value: value,
          child: Text(value),
        );
      }).toList(),
    );
  }
}