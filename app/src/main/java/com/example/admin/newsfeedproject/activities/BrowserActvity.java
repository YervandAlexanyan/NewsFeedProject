package com.example.admin.newsfeedproject.activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.admin.newsfeedproject.R;

public class BrowserActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_actvity);
        WebView webView = (WebView) findViewById(R.id.webview);
        Uri data = getIntent().getData();

        webView.loadUrl(data.toString());
    }
}
