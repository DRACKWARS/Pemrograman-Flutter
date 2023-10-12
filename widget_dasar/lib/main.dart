import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        backgroundColor: Color.fromARGB(255, 57, 15, 194),
        appBar: AppBar(
          centerTitle: true,
          title: Text("My Apps"),
        ),
        body: Center(
          child: Text("HALLO"),
        ),
      ),
    );
  }
}
