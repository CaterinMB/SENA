import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // Hide the debug banner
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.purple,
      ),
      title: 'Examen API :P',
      home: const HomePage(),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  List Datos = [];

  Future<void> _fetchData() async {
    const apiUrl = 'https://jsonplaceholder.typicode.com/posts';

    final response = await http.get(Uri.parse(apiUrl));
    final data = json.decode(response.body);

    setState(() {
      Datos = data;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('API :P'),
      ),
      body: SafeArea(
        child: Datos.isEmpty
        ? Center(
            child: ElevatedButton(
              onPressed: _fetchData,
              child: const Text('Cargar Datos :D'),
            ),
          )
        // The ListView that displays photos
        : ListView.builder(
          itemCount: Datos.length,
          itemBuilder: (BuildContext ctx, index) {
            return ListTile(
              leading: Text('User: ${Datos[index]["userId"]}'),
              title: Text(Datos[index]["title"]),
              subtitle:
                  Text(Datos[index]["body"]),
            );
          },
        )
      )
    );
  }
}

/*
return Scaffold(
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          ElevatedButton(
            onPressed: _fetchData,
            child: const Text('Load Photos'),
          ),

          ListView.builder(
            itemBuilder: (BuildContext ctx, index) {
              return ListTile(
                title: Text("title"),
                subtitle: Text('ID: ["id"]}'),
              );
            },
          )
        ],
      ),
    );
*/