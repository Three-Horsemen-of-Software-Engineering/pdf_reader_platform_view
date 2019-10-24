import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:pdf_reader_platform_view/src/pdf_reader_platform_view.dart';

void main() {
  const MethodChannel channel = MethodChannel('pdf_reader_platform_view');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await PdfReaderPlatformView.platformVersion, '42');
  });
}
