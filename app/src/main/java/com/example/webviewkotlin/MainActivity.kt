package com.example.webviewkotlin

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        //Habilita Javascript en el navegador
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        //Evita que los enlaces redireccionen al navegador
        myWebView.setWebViewClient(WebViewClient())

        /*myWebView.settings.javaScriptEnabled = true*/
        myWebView.loadUrl("https://github.com/")
    }
}