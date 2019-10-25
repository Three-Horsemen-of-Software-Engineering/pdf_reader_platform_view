package com.three_horseman.pdf_reader.pdf_reader_platform_view

import android.content.Context
import android.view.View
import android.webkit.WebView
import com.github.barteksc.pdfviewer.PDFView
import io.flutter.plugin.platform.PlatformView
import java.io.File

open class PdfPlatformView(private val context: Context?, private val path: String) : PlatformView {
    override fun dispose() {
        return
    }

    override fun getView(): View {
        val webView = WebView(context)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(path)
        val pdfView = PDFView(context, null)
        val file = File(path)
        pdfView.fromFile(file)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .defaultPage(0).load()
        return webView
    }
}