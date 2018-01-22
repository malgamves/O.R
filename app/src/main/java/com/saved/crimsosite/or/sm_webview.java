package com.saved.crimsosite.or;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by DanielPhiri on 1/11/2017.
 */

public class sm_webview extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sm_wbview);

        final WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient(){


        });
        myWebView.loadUrl("http://www.wikihow.com/Be-Happy");

        final Button share = (Button) findViewById(R.id.sharewbv);
        Button next = (Button) findViewById(R.id.done);

        share.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Hey, this worked for me! It might for you too! http://www.wikihow.com/Be-Happy ..";
                String shareSub = "Here's the News";
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });

        next.setOnClickListener(new View.OnClickListener()

                               {
                                   public void onClick(View v) {

                                       Intent intent = new Intent(getApplicationContext(), answer_sm2.class);
                                       startActivity(intent);
                                   }
                               }

        );




    }
}
