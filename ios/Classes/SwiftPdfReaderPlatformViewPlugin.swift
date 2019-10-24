import Flutter
import UIKit

public class SwiftPdfReaderPlatformViewPlugin: NSObject, FlutterPlugin {
  public static func register(with registrar: FlutterPluginRegistrar) {
    let channel = FlutterMethodChannel(name: "pdf_reader_platform_view", binaryMessenger: registrar.messenger())
    let instance = SwiftPdfReaderPlatformViewPlugin()
    registrar.addMethodCallDelegate(instance, channel: channel)
  }

  public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
    result("iOS " + UIDevice.current.systemVersion)
  }
}
