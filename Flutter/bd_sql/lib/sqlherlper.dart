import 'dart:core';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:sqflite/sqflite.dart' as sql;
import 'package:path/path.dart' as path;
import 'package:sqflite/sqflite.dart';

class SQLHelper {
  static Future<void> createTables(sql.Database books) async {
    await books.execute("""
      CREATE TABLE Libros(
        id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
        Titulo TEXT,
        Description TEXT,
        Autor TEXT,
        FechaPublicacion TEXT,
        Precio TEXT,
        createdAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
      )
    """);
  }

  static Future<sql.Database> db() async {
    String data = await getDatabasesPath();
    print(data);
    return sql.openDatabase(path.join(data, 'books.db'), version: 1,
        onCreate: (sql.Database books, int version) async {
      await createTables(books);
    });
  }

  //Create new Item (journal)
  static Future<int> createItem(String? title, String? description,
      String? autor, String? fecha, String? precio) async {
    final db = await SQLHelper.db();

    final data = {
      'Titulo': title,
      'Description': description,
      'Autor': autor,
      'FechaPublicacion': fecha,
      'Precio': precio
    };
    final id = await db.insert('Libros', data,
        conflictAlgorithm: sql.ConflictAlgorithm.replace);

    return id;
  }

  //Read all items (journals)
  static Future<List<Map<String, dynamic>>> getItems() async {
    final db = await SQLHelper.db();
    return db.query('Libros', orderBy: "id");
  }

  //Read a single item by id
  //The app doesn´t use this method but I put here in case you want to see
  static Future<List<Map<String, dynamic>>> getItem(int id) async {
    final db = await SQLHelper.db();
    return db.query('Libros', where: "id = ?", whereArgs: [id], limit: 1);
  }

  //Update an item by id
  static Future<int> updateItem(int id, String title, String? description,
      String autor, String fecha, String precio) async {
    final db = await SQLHelper.db();

    final data = {
      'Titulo': title,
      'Description': description,
      'Autor': autor,
      'FechaPublicacion': fecha,
      'Precio': precio,
      'createdAt': DateTime.now().toString()
    };

    final result =
        await db.update('Libros', data, where: "id = ?", whereArgs: [id]);
    return result;
  }

  //Delete
  static Future<void> deleteItem(int id) async {
    final db = await SQLHelper.db();
    try {
      await db.delete("Libros", where: "id = ?", whereArgs: [id]);
    } catch (err) {
      debugPrint("Something went wrong when deleting an item: $err");
    }
  }
}
