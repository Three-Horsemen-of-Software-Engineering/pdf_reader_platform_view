import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/services.dart';

class PdfPlatformView extends StatelessWidget {
  final String path;

  const PdfPlatformView({@required this.path,Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    if (Platform.isAndroid) {
      return AndroidView(
        viewType: "pdf_reader_platform_view",
        creationParams: <String, String>{"path": path},
        creationParamsCodec: StandardMessageCodec(),
      );
    } else {
      throw UnimplementedError("Ios is not implemented");
    }
  }
}
