import 'package:flutter/material.dart';
import 'package:navigation/page/page_satu.dart';
import 'page/page_dua.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Pagesatu(),
    );
  }
}
