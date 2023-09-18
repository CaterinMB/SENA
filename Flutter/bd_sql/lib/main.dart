import 'package:flutter/material.dart';
import 'package:bd_sql/sqlherlper.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        // Remove the debug banner
        debugShowCheckedModeBanner: false,
        title: 'Libros :P',
        theme: ThemeData(
          primarySwatch: Colors.purple,
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

  final TextEditingController _titleController = TextEditingController();
  final TextEditingController _descriptionController = TextEditingController();
  final TextEditingController _autorController = TextEditingController();
  final TextEditingController _fechaController = TextEditingController();
  final TextEditingController _precioController = TextEditingController();

  void _showForm(int? id) async {
    if (id != null) {
      final existingJournal =
          _journals.firstWhere((element) => element['id'] == id);
      _titleController.text = existingJournal['Titulo'];
      _descriptionController.text = existingJournal['Description'];
      _autorController.text = existingJournal['Autor'];
      _fechaController.text = existingJournal['FechaPublicacion'];
      _precioController.text = existingJournal['Precio'];
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
                    controller: _titleController,
                    decoration: const InputDecoration(hintText: 'Titulo'),
                  ),
                  const SizedBox(
                    height: 10,
                  ),
                  TextField(
                    controller: _descriptionController,
                    decoration: const InputDecoration(hintText: 'Descripcion'),
                  ),
                  const SizedBox(
                    height: 10,
                  ),
                  TextField(
                    controller: _autorController,
                    decoration: const InputDecoration(hintText: 'Autor'),
                  ),
                  const SizedBox(
                    height: 10,
                  ),
                  TextField(
                    controller: _fechaController,
                    decoration:
                        const InputDecoration(hintText: 'FechaPublicacion'),
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
                      }

                      if (id != null) {
                        await _updateItem(id);
                      }

                      _titleController.text = '';
                      _descriptionController.text = '';
                      _autorController.text = '';
                      _fechaController.text = '';
                      _precioController.text = '';

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
    await SQLHelper.createItem(
        _titleController.text,
        _descriptionController.text,
        _autorController.text,
        _fechaController.text,
        _precioController.text);
    _refreshJournals();
  }

  // Update an existing journal
  Future<void> _updateItem(int id) async {
    await SQLHelper.updateItem(
        id,
        _titleController.text,
        _descriptionController.text,
        _autorController.text,
        _fechaController.text,
        _precioController.text);
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
        title: const Text('Libros :P'),
      ),
      body: _isLoading
          ? const Center(
              child: CircularProgressIndicator(),
            )
          : ListView.builder(
              itemCount: _journals.length,
              itemBuilder: (context, index) => Card(
                color: Colors.purple[100],
                margin: const EdgeInsets.all(15),
                child: ListTile(
                    title: Text(_journals[index]['Titulo']),
                    subtitle: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(_journals[index]['Description']),
                        Text(_journals[index]['Autor']),
                        Text(_journals[index]['FechaPublicacion']),
                        Text(_journals[index]['Precio']),
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
