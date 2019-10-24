package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.three_horseman.pdf_reader.pdf_reader_platform_view.PdfReaderPlatformViewPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    PdfReaderPlatformViewPlugin.registerWith(registry.registrarFor("com.three_horseman.pdf_reader.pdf_reader_platform_view.PdfReaderPlatformViewPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
