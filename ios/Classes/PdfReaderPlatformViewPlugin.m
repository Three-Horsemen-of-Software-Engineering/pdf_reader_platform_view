#import "PdfReaderPlatformViewPlugin.h"
#import <pdf_reader_platform_view/pdf_reader_platform_view-Swift.h>

@implementation PdfReaderPlatformViewPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftPdfReaderPlatformViewPlugin registerWithRegistrar:registrar];
}
@end
