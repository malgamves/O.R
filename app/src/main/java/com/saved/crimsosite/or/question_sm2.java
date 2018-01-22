package com.saved.crimsosite.or;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by DanielPhiri on 1/11/2017.
 */

public class question_sm2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.que_sm2);

        ImageButton yes = (ImageButton) findViewById(R.id.yes);
        ImageButton no = (ImageButton) findViewById(R.id.no);


        yes.setOnClickListener(new View.OnClickListener()

                               {
                                   public void onClick(View v) {

                                       Intent intent = new Intent(getApplicationContext(), answer_sm2.class);
                                       startActivity(intent);
                                   }
                               }

        );
        no.setOnClickListener(new View.OnClickListener()

                              {
                                  public void onClick(View v) {

                                      Intent intent = new Intent(getApplicationContext(), sm_webview.class);
                                      startActivity(intent);
                                  }
                              }
        );


    }
}
