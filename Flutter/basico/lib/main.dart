//Clase
import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.cyan,
      ),
      home: const MyHomePage(title: 'q mas carabana, bn o no'),
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
  /*int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
  }*/

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(widget.title),
        ),
        body:
            // Column(children: [widget]): Container
            /*Image(
            image: NetworkImage(
                "https://e00-elmundo.uecdn.es/elmundo/imagenes/2007/09/07/1189176706_0.jpg"),
            height: 180,
            alignment: Alignment.center
          ),*/

            //child: Container(
            // constraints: BoxConstraints.expand(
            /*height: Theme.of(context).textTheme.headlineMedium!.fontSize! * 1.1 + 200.0,
          ),
          padding:const EdgeInsets.all(7.0),
          color:Colors.purple.shade300,
          alignment:Alignment.center,
          transform: Matrix4.rotationZ(0.0)*/
            /*  child: Text('Del hombre que te hizo suspirar, te hizo reir, te hizo llorar y te puso a bellaquiar,tu cuerpo y mi cuerpo piden mas Y te puso a bellaquiar, Tu cuerpo y mi cuerpo piden mas'), */

            Text(
          'Você é louco',
          textAlign: TextAlign.center,
          style: TextStyle(
              color: Colors.blue, fontSize: 20, fontWeight: FontWeight.bold),
        )
        //   Text(
        //     'Você é louco',
        //     style: Theme.of(context).textTheme.headlineMedium,
        //   ),
        //   Icon(Icons.all_inclusive, size: 50, color: Colors.green,),

        /*floatingActionButton: FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        backgroundColor: Colors.yellow,
        child: const Icon(Icons.add),
      ),
      backgroundColor: Colors.brown.shade200*/
        );
  }
}
