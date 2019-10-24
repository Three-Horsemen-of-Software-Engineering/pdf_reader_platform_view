package com.three_horseman.pdf_reader.pdf_reader_platform_view

import android.content.Context
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory

class PdfPlatformViewFactory : PlatformViewFactory(StandardMessageCodec.INSTANCE) {

    override fun create(context: Context?, id: Int, args: Any?): PlatformView {
        if (args == null) {
            throw IllegalArgumentException("Arguments can't be null")
        } else {
            val path: String? = (args as Map<String, String>)["path"]
            if (path == null) {
                throw IllegalArgumentException("Path parameter was not specified")
            } else {
                return PdfPlatformView(context, path)
            }
        }
    }

}