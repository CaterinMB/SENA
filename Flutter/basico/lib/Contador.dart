import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Contador',
      theme: ThemeData(
        primarySwatch: Colors.lightBlue,
      ),
      home: const MyHomePage(title: 'Contador: Caterin & Estefania'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }
  void _decrementCounter() {
    setState(() {
      _counter--; // decrementa el contador en 1
    });
  }
  void _resetCounter() {
    setState(() {
      _counter = 0; // reinicia el contador a 0
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            const Text(
              'Su número es:',
            ),
            Text(
              '$_counter',
              style: Theme.of(context).textTheme.headlineMedium,
            ),
          ],
        ),
      ),
      backgroundColor: Colors.amber.shade50,
      floatingActionButton: Column(
        mainAxisAlignment: MainAxisAlignment.start,
        children: <Widget>[
          SizedBox(height: 130,),
          FloatingActionButton(
            onPressed: _incrementCounter,
            tooltip: 'Incrementar&',
            child: Icon(Icons.add),
          ),
          SizedBox(height: 10), // separación entre botones
          FloatingActionButton(
            onPressed: _decrementCounter,
            tooltip: 'Decrementar',
            child: Icon(Icons.remove),
          ),
          SizedBox(height: 30), // separación entre botones
          FloatingActionButton(
            onPressed: _resetCounter,
            tooltip: 'Reiniciar',
            child: Icon(Icons.restore),
            backgroundColor: Colors.purple, // cambia el color del botón a rojo
          ),
        ],
      ),
    );
    
  }
}
