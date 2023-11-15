import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
            appBar: AppBar(
              title: Text("List Tile"),
            ),
            body: ListView(
              children: [
                ListTile(
                  title: Text("Dion Pratama Putra"),
                  subtitle: Text("This is subtitle okay.."),
                  leading: CircleAvatar(),
                  trailing: Text("10:00 PM"),
                  tileColor: Colors.red,
                ),
                Divider(
                  color: Colors.black,
                ),
                ListTile(
                  title: Text("Dion Pratama Putra"),
                  subtitle: Text("This is subtitle okay.."),
                  leading: CircleAvatar(),
                  trailing: Text("10:00 PM"),
                  tileColor: Colors.pink,
                ),
                Divider(
                  color: Colors.black,
                ),
                ListTile(
                  title: Text("Dion Pratama Putra"),
                  subtitle: Text("This is subtitle okay.."),
                  leading: CircleAvatar(),
                  trailing: Text("10:00 PM"),
                  tileColor: Colors.purple,
                ),
                Divider(
                  color: Colors.black,
                ),
                ListTile(
                  title: Text("Dion Pratama Putra"),
                  subtitle: Text("This is subtitle okay.."),
                  leading: CircleAvatar(),
                  trailing: Text("10:00 PM"),
                  tileColor: Colors.blue,
                ),
                Divider(
                  color: Colors.black,
                ),
                ListTile(
                  title: Text("Dion Pratama Putra"),
                  subtitle: Text("This is subtitle okay.."),
                  leading: CircleAvatar(),
                  trailing: Text("10:00 PM"),
                  tileColor: Colors.greenAccent,
                )
              ],
            )));
  }
}
