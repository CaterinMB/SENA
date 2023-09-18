import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp ({super.key});

  static const String _title = 'Check List';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(
          title: const Text(_title)
        ),
        body: const Center (
          child: MyStatefulWidget()
        ),
      )
    );
  }
}

enum SingingCharacter { caterin, santiago }

class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget ({super.key});

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  SingingCharacter? _character = SingingCharacter.caterin;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: <Widget>[
        ListTile(
          title: const Text('Caterin'),
          leading: Radio<SingingCharacter>(
            value: SingingCharacter.caterin,
            groupValue: _character,
            onChanged: (SingingCharacter? value) {
              setState(() {
                _character = value;
              });
            },
          ),
        ),
        ListTile(
          title: const Text('Santiago'),
          leading: Radio<SingingCharacter>(
            value: SingingCharacter.santiago,
            groupValue: _character,
            onChanged: (SingingCharacter? value) {
              setState(() {
                _character = value;
              });
            },
          ),
        )
      ],
    );
  }
}