import 'package:flutter/material.dart';
import 'package:basico/TallerRoute.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Pagina',
      theme: ThemeData(
        primarySwatch: Colors.purple,
      ),
      home: const MyHomePage(title: 'Bienvenido!'),
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
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          children: <Widget>[
            const Text(
              'Hasta el final del mundo',
              style: TextStyle(color: Colors.red, fontSize: 30),
            ),
            Image.network(
                'https://img.freepik.com/foto-gratis/resumen-superficie-agua-piscina-fondo-reflejo-luz-sol_74190-8510.jpg?w=1380&t=st=1683240025~exp=1683240625~hmac=617bbbc9c089623038b8fd0a466f541ed9801778131dd50670fd4bf5b588a81b'),
            Text(
              'Hasta el fin del mundo, Te iría a buscar, De ti nada me puede separar, Cruzaría los siete mares, Hasta llegar a ti, Hasta el fin del mundo, Te seguiré, Donde sea que estés, Yo te encontraré, Nada en mí es más importante, Que vivir junto a ti, Me da tanto miedo, Esta gran necesidad, De tenerte siempre, Y quererte más y más',
              style: TextStyle(
                color: Colors.black,
                fontSize: 20,
              ),
            ),
            ElevatedButton(
              child: const Text('Holis Baby'),
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => const SeconRoute()),
                );
              },
            )
          ],
        ),
      ),
      backgroundColor: Colors.amber.shade100,
    );
  }
}
