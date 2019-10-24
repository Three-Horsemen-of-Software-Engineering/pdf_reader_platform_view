import 'dart:async';

import 'package:flutter/services.dart';

class PdfReaderPlatformView {
  static const MethodChannel _channel =
      const MethodChannel('pdf_reader_platform_view');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
