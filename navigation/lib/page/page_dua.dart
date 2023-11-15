import 'package:flutter/material.dart';
import 'package:navigation/page/page_satu.dart';

class PageDua extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Page Dua"),
      ),
      body: Center(
        child: Text(
          "Ini Page Dua",
          style: TextStyle(fontSize: 50),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.of(context).push(
            MaterialPageRoute(
              builder: (context) {
                return Pagesatu();
              },
            ),
          );
        },
        child: Icon(Icons.keyboard_arrow_left),
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerFloat,
    );
  }
}
