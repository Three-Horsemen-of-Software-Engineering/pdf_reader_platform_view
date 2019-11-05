package com.three_horseman.pdf_reader.pdf_reader_platform_view

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.Toast
import io.flutter.plugin.platform.PlatformView

open class PdfPlatformView(private val context: Context?, private val path: String) : PlatformView {
    override fun dispose() {
    }

    override fun getView(): View {
        return Button(context).apply {
            text = "button"
            setOnClickListener { Toast.makeText(context, "Button was pressed", Toast.LENGTH_SHORT).show() }
        }
//        return PDFView(context, null).apply {
//            fromFile(File(path))
//                    .enableSwipe(true)
//                    .swipeHorizontal(false)
//                    .enableDoubletap(true)
//                    .defaultPage(0).load()
//        }
    }
}