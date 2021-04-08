package com.example.webviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val str = "<div style=»display: flex; flex-direction: column; justify-content: space-between; height: 100%;»>\n<div>\n<p>И первым получайте выгодные заказы. \nПринимайте безнал от компаний и наличку от клиентов — в два раза больше возможностей! А ещё такие заказы почти не срываются, так как уже оплачены клиентом.</p>\n\n<p style=»text-align: end;»>\n <a href=»https://retail.hands.ru/taxes»>Подробнее о самозанятости</a>\n</p>\n</div>\n\n<div>\n <img src=»https://hands.ru/media/3b/52/3b520902ca195c24b5b52f3da65b05d9.png»/>\n</div>\n</div>"
        val webview = findViewById<WebView>(R.id.web)
            //webview.loadData(str, "text/html", "UTF-8")

        webview.loadDataWithBaseURL(null,str,"text/html","UTF-8","about:blank")
    }
}