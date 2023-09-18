import 'package:flutter/material.dart';
import 'sqlherlperVenta.dart';
import 'package:mailer/mailer.dart';
import 'package:mailer/smtp_server.dart';

class VentaRoute extends StatelessWidget {
  const VentaRoute({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        // Remove the debug banner
        debugShowCheckedModeBanner: false,
        title: 'Pach-OS',
        theme: ThemeData(
          primarySwatch: Colors.brown,
        ),
        home: const HomePage());
  }
}

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  Mailer() async {
    String username = 'cmartinez2131@misena.edu.co';
    String password = 'mzmlhwmxpnwawhco';

    final smtpServer = gmail(username, password);

    final message = Message()
      ..from = Address(username, 'Pach-OS')
      ..recipients.add('martinezbadillocaterin@gmail.com')
      ..ccRecipients.addAll(['bibianabadillogaviria@gmail.com'])
      ..subject = 'Confirmacion de Pach-OS'
      ..text = 'Este mensaje sirve para la confirmacion de una venta'
      ..html =
          "Se a realizado una venta en el aplicativo movil :: Pach - OS :: | Producto : $_productoController | Cantidad : $_cantidadController | Precio : $_precioController | Total : $_totalController";

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

  List<Map<String, dynamic>> _journals = [];

  bool _isLoading = true;
  void _refreshJournals() async {
    final data = await SQLHelper.getItems();
    setState(() {
      _journals = data;
      _isLoading = false;
    });
  }

  @override
  void initState() {
    super.initState();
    _refreshJournals();
  }

  // conversion de string a int

  final TextEditingController _productoController = TextEditingController();
  final TextEditingController _cantidadController = TextEditingController();
  final TextEditingController _precioController = TextEditingController();
  final TextEditingController _totalController = TextEditingController();

  void _showForm(int? id) async {
    if (id != null) {
      final existingJournal =
          _journals.firstWhere((element) => element['id'] == id);
      _productoController.text = existingJournal['Producto'];
      _cantidadController.text = existingJournal['Cantidad'];
      _precioController.text = existingJournal['Precio'];
      _totalController.text = existingJournal['Total'];
    }

    showModalBottomSheet(
        context: context,
        elevation: 5,
        isScrollControlled: true,
        builder: (_) => Container(
              padding: EdgeInsets.only(
                top: 15,
                left: 15,
                right: 15,
                bottom: MediaQuery.of(context).viewInsets.bottom + 120,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.end,
                children: [
                  TextField(
                    controller: _productoController,
                    decoration: const InputDecoration(hintText: 'Producto'),
                  ),
                  const SizedBox(
                    height: 10,
                  ),
                  TextField(
                    controller: _cantidadController,
                    decoration: const InputDecoration(hintText: 'Cantidad'),
                  ),
                  const SizedBox(
                    height: 10,
                  ),
                  TextField(
                    controller: _precioController,
                    decoration: const InputDecoration(hintText: 'Precio'),
                  ),
                  const SizedBox(
                    height: 20,
                  ),
                  ElevatedButton(
                    onPressed: () async {
                      // Save new journal
                      if (id == null) {
                        await _addItem();
                        Mailer();
                      }

                      if (id != null) {
                        await _updateItem(id);
                      }

                      _productoController.text = '';
                      _cantidadController.text = '';
                      _precioController.text = '';
                      int cantidad = int.parse(_cantidadController.text);
                      int precio = int.parse(_precioController.text);
                      int total = int.parse(_totalController.text);
                      total = cantidad * precio;
                      String Totales = total.toString();
                      _totalController.text = Totales;

                      Navigator.of(context).pop();
                    },
                    child: Text(id == null ? 'Nuevo' : 'Actualizar'),
                  )
                ],
              ),
            ));
  }

// Insert a new journal to the database
  Future<void> _addItem() async {
    await SQLHelper.createItem(_productoController.text,
        _cantidadController.text, _precioController.text);
    _refreshJournals();
  }

  // Update an existing journal
  Future<void> _updateItem(int id) async {
    await SQLHelper.updateItem(id, _productoController.text,
        _cantidadController.text, _precioController.text);
    _refreshJournals();
  }

  // Delete an item
  void _deleteItem(int id) async {
    await SQLHelper.deleteItem(id);
    ScaffoldMessenger.of(context).showSnackBar(const SnackBar(
      content: Text('Registro eliminado con exito!'),
    ));
    _refreshJournals();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Pach-OS'),
      ),
      body: _isLoading
          ? const Center(
              child: CircularProgressIndicator(),
            )
          : ListView.builder(
              itemCount: _journals.length,
              itemBuilder: (context, index) => Card(
                color: Color.fromARGB(255, 255, 191, 108),
                margin: const EdgeInsets.all(15),
                child: ListTile(
                    title: Text(_journals[index]['Producto']),
                    subtitle: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(_journals[index]['Cantidad']),
                        Text(_journals[index]['Precio']),
                        Text(_journals[index]['Total']),
                      ],
                    ),
                    trailing: SizedBox(
                      width: 100,
                      child: Row(
                        children: [
                          IconButton(
                            icon: const Icon(Icons.edit),
                            onPressed: () => _showForm(_journals[index]['id']),
                          ),
                          IconButton(
                            icon: const Icon(Icons.delete),
                            onPressed: () =>
                                _deleteItem(_journals[index]['id']),
                          ),
                        ],
                      ),
                    )),
              ),
            ),
      floatingActionButton: FloatingActionButton(
        child: const Icon(Icons.add),
        onPressed: () => _showForm(null),
      ),
    );
  }
}
