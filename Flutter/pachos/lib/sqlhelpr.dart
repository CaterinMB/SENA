import 'dart:core';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:sqflite/sqflite.dart' as sql;
import 'package:path/path.dart' as path;
import 'package:sqflite/sqflite.dart';

class SQLHelper {
  // ignore: non_constant_identifier_names
  static Future<void> createTables(sql.Database usuario) async {
    //var tablas = {
    //"CREATE TABLE canciones(nombre TEXT);",
    // "CREATE TABLE usuarios(id INT);",

    //};
    // for (String tabla in tablas) {
    // await database.execute(tabla);
    // }

    await usuario.execute("""CREATE TABLE ususario(
        id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
        tipo_dpcumeto TEXT,
        documento TEXT,
        nombre TEXT,
        apellido TEXT,
        genero TEXT,
        correo TEXT,
        contrasena TEXT
      )
      """);
  }

// id: the id of a item
// title, description: name and description of your activity
// created_at: the time that the item was created. It will be automatically handled by SQLite

  static Future<sql.Database> db() async {
    String data = await getDatabasesPath();
    print(data);
    return sql.openDatabase(
      path.join(await getDatabasesPath(), 'usuario4.db'),
      version: 1,
      onCreate: (sql.Database usuario, int version) async {
        await createTables(usuario);
      },
    );
  }

  // Create new item (journal)
  static Future<int> createItem(String tipoDpcumeto, String? documento,
      String? nombre, String? apellido, String? genero, String? correo, String? contracena) async {
    final db = await SQLHelper.db();

    final data = {
      'tipo_dpcumeto': tipoDpcumeto,
      'documento': documento,
      'nombre': nombre,
      'apellido': apellido,
      'genero': genero,
      'correo':correo ,
      'contrasena':contracena
    };
     print(data);
    final id = await db.insert('ususario', data,
        conflictAlgorithm: sql.ConflictAlgorithm.replace);
    return id;
  }
static Future<bool> checkCredentials(String usuario, String contrasena) async {
  final db = await SQLHelper.db();
  final result = await db.rawQuery(
    "SELECT * FROM ususario WHERE correo = '$usuario' AND contrasena = '$contrasena'",
  );
 
  return result.isNotEmpty;
}


}



