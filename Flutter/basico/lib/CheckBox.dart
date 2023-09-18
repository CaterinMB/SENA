import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(home: MyHomePage(),));
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  bool isChecked = false;

  bool isChecked2 = false;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text(
            "Check :D"
          )
        ),
        body: Container(
          child: Column(
            children: <Widget>[
              Row(
                children: <Widget>[
                  SizedBox(
                    width: 5,
                  ),
                  Text(
                    'Holis, Como estas?', style: TextStyle(
                      fontSize: 20.0
                    ),
                  ),
                  Checkbox(
                    checkColor: Colors.white,
                    activeColor: Colors.red,
                    value: isChecked,
                    onChanged: (bool? value){
                      setState((){
                        isChecked = value!;
                        print('$isChecked');
                      });
                    }
                  ),
                  Checkbox(
                    value: isChecked2,
                    onChanged: (bool? value){
                      setState((){
                        isChecked2 = value!;
                        print('$isChecked2');
                      });
                    },
                  )
                ],
              )
            ],
          ),
        )
      )
    );
  }
}
