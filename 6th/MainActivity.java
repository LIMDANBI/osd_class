package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    private WebView webView;
    private String url = "https://limdanbi.github.io";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true); // 자바 스크립트 허용을 해주냐 -> true
        webView.loadUrl(url); // url을 틀어라
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClientClass());
    }

    @Override
    public boolean onKeyDown(int KeyCode, KeyEvent event){ // 뒤로가기
        if((KeyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(KeyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) { // 현재 페이지의 url 읽어올 수 있는 메소드
            view.loadUrl(url);
            return true;
        }
    }
}

