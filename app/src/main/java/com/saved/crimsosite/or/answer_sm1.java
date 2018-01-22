package com.saved.crimsosite.or;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by DanielPhiri on 1/11/2017.
 */

public class answer_sm1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ans_sm1);

        final ImageButton share = (ImageButton) findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Hey, there's something i've always wanted to say..";
                String shareSub = "Here's the News";
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });




    }
}
