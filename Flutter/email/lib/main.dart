import 'package:flutter/material.dart';
import 'package:mailer/mailer.dart';
import 'package:mailer/smtp_server.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  static const String _title = 'Flutter Email :P';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: const MyStatefulWidget(),
      ),
    );
  }
}

class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({super.key});

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  Mailer() async {
    String username = 'cmartinez2131@misena.edu.co';
    String password = 'mzmlhwmxpnwawhco';

    final smtpServer = gmail(username, password);

    final message = Message()
      ..from = Address(username, 'Automatico')
      ..recipients.add('martinezbadillocaterin@gmail.com')
      ..ccRecipients.addAll(['bibianabadillogaviria@gmail.com'])
      ..bccRecipients.add(Address('flutter1@example.com'))
      ..subject = 'Mensaje de prueba :: 😀 :: ${DateTime.now()}'
      ..text = 'Mi orgullo en una ejecucion, cada vez mejor.'
      ..html = "Aqui se esta validando un mensaje de prueba :D";

    try {
      final sendReport = await send(message, smtpServer);
      print('Message sent: ' + sendReport.toString());
    } on MailerException catch (e) {
      print('Message not sent.');
      for (var p in e.problems) {
        print('Problem: ${p.code}: ${p.msg}');
      }
    }

    var connection = PersistentConnection(smtpServer);

    await connection.send(message);

    await connection.close();
  }

  @override
  Widget build(BuildContext context) {
    final ButtonStyle style =
        ElevatedButton.styleFrom(textStyle: const TextStyle(fontSize: 20));

    return Center(
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: <Widget>[
          ElevatedButton(
            style: style,
            onPressed: null,
            child: const Text('Disabled'),
          ),
          const SizedBox(height: 30),
          ElevatedButton(
            style: style,
            onPressed: () {
              Mailer();
            },
            child: const Text('Enviar Mensaje'),
          ),
        ],
      ),
    );
  }
}
