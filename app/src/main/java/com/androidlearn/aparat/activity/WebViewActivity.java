package com.androidlearn.aparat.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.androidlearn.aparat.R;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_web_view );

        webView = findViewById ( R.id.webView );

        webView.loadUrl ("http://android-learn.ir");
        webView.getSettings ().setJavaScriptEnabled ( true );

       // webView.setWebViewClient ( new MyWebView () );


    }



    class MyWebView extends WebViewClient{

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            super.onReceivedError ( view, request, error );
        }

        @Override
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            super.onReceivedHttpError ( view, request, errorResponse );
        }


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted ( view, url, favicon );
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished ( view, url );
        }



    }



}