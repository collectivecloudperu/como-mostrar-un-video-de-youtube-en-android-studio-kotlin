package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    // Cancelamos alguna advertencia de JavaScript
    @SuppressLint("SetJavaScriptEnabled")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Instanciamos nuestro layout
        setContentView(R.layout.activity_main)

        // Instanciamos el WebView
        val webView: WebView = findViewById(R.id.video)

        // Colocamos el video de YouTube (El ancho y el alto le ponemos en 100%)
        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/MZRmNCgzl3E?si=eNAb0A2l3iqBIsNo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"

        // Configuramos el mimeType y la codificación a utf-8
        webView.loadData(video, "text/html", "utf-8")

        // Habilitamos JavaScript en el WebView
        webView.getSettings().javaScriptEnabled = true

        // Usamos el cliente de Google Chrome como contenedor del video
        webView.webChromeClient = WebChromeClient()

    }
}
