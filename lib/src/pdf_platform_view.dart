import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/gestures.dart';
import 'package:flutter/services.dart';

class PdfPlatformView extends StatelessWidget {
  final String path;
  final Set<Factory<OneSequenceGestureRecognizer>> gestureRecognizers;

  const PdfPlatformView(
      {@required this.path, Key key, @required this.gestureRecognizers})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    if (Platform.isAndroid) {
      return AndroidView(
        viewType: "pdf_reader_platform_view/reader",
        creationParams: <String, String>{"path": path},
        creationParamsCodec: StandardMessageCodec(),
        gestureRecognizers: this.gestureRecognizers,
      );
    } else {
      throw UnimplementedError("Ios is not implemented");
    }
  }
}
