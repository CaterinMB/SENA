import 'dart:core';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:sqflite/sqflite.dart' as sql;
import 'package:path/path.dart' as path;
import 'package:sqflite/sqflite.dart';

class SQLHelper {
  static Future<void> createTables(sql.Database pachos) async {
    await pachos.execute("""
      CREATE TABLE Venta(
        id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
        Producto TEXT,
        Cantidad TEXT,
        Precio TEXT,
        Total TEXT,
        createdAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
      )
    """);
  }

  static Future<sql.Database> db() async {
    String data = await getDatabasesPath();
    print(data);
    return sql.openDatabase(path.join(data, 'pachos.db'), version: 1,
        onCreate: (sql.Database pachos, int version) async {
      await createTables(pachos);
    });
  }

  //Create new Item (journal)
  static Future<int> createItem(
      String? producto, String? cantidad, String? precio) async {
    final db = await SQLHelper.db();

    final data = {'Producto': producto, 'Cantidad': cantidad, 'Precio': precio};
    final id = await db.insert('Venta', data,
        conflictAlgorithm: sql.ConflictAlgorithm.replace);
    return id;
  }

  //Read all items (journals)
  static Future<List<Map<String, dynamic>>> getItems() async {
    final db = await SQLHelper.db();
    return db.query('Venta', orderBy: "id");
  }

  //Read a single item by id
  static Future<List<Map<String, dynamic>>> getItem(int id) async {
    final db = await SQLHelper.db();
    return db.query('Venta', where: "id = ?", whereArgs: [id], limit: 1);
  }

  //Update an item by id
  static Future<int> updateItem(
      int id, String? producto, String? cantidad, String? precio) async {
    final db = await SQLHelper.db();

    final data = {
      'Producto': producto,
      'Cantidad': cantidad,
      'Precio': precio,
      'createdAt': DateTime.now().toString()
    };

    final result =
        await db.update('Venta', data, where: "id = ?", whereArgs: [id]);
    return result;
  }

  //Delete
  static Future<void> deleteItem(int id) async {
    final db = await SQLHelper.db();
    try {
      await db.delete("Venta", where: "id = ?", whereArgs: [id]);
    } catch (err) {
      debugPrint("Algo salio mal al eliminar la venta: $err");
    }
  }
}
