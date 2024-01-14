import 'package:flutter/material.dart';
import 'package:pegawai/main.dart';

void main() {
  runApp(MyUts());
}

class MyUts extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return  MaterialApp(
      home: HomePage()
    );
  }
}



Widget build(BuildContext context){
  return Scaffold(
    appBar: AppBar(
      title: Text(""),
    ),
    body: SingleChildScrollView(
        child: Padding(
          padding: const EdgeInsets.all(20),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            mainAxisAlignment: MainAxisAlignment.start,
            children: [
              SizedBox(height: 20.0),
              Title("faktur"),
              Padding(
                padding: const EdgeInsets.all(10),
                child: DropdownButton(
                  
                    );
                  }).toList(),
                  onChanged: (value) {
                  },
                ),
              ),
              SizedBox(height: 20.0),
              Title("no faktur"),
              TextField(controller: fakturController),
              SizedBox(height: 20.0),
              Title("Pelanggan"),
              TextField(controller: PelanganController),
              SizedBox(height: 20.0),
              Title("totalbayar"),

          ),
        ),
      ),
}