package com.three_horseman.pdf_reader.pdf_reader_platform_view

import android.content.Context
import android.view.View
import com.github.barteksc.pdfviewer.PDFView
import io.flutter.plugin.platform.PlatformView
import java.io.File

open class PdfPlatformView(private val context: Context?, private val path: String) : PlatformView {
    override fun dispose() {
    }

    override fun getView(): View {
        return PDFView(context, null).apply {
            fromFile(File(path))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .enableDoubletap(true)
                    .defaultPage(0).load()
        }
    }
}