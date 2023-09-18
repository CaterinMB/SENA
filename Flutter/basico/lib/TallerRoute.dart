import 'package:flutter/material.dart';

class SeconRoute extends StatelessWidget {
  const SeconRoute({super.key});

  @override
  Widget build(BuildContext context){
    return Scaffold(
      appBar: AppBar(
        title: const Text('Besos y Abrazos'),
      ),
      body: Center(
        child: ElevatedButton(
          onPressed: (){
            Navigator.pop(context);
          },
          child: const Text('Bye'),
        ),
      ),
      backgroundColor: Colors.amber.shade100, 
    );
  }
}