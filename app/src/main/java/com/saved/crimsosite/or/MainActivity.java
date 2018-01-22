package com.saved.crimsosite.or;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton smileB = (ImageButton) findViewById(R.id.smile);
        ImageButton heartB = (ImageButton) findViewById(R.id.heart);
        ImageButton clockB = (ImageButton) findViewById(R.id.clock);
        ImageButton settingsB = (ImageButton) findViewById(R.id.settings);


        smileB.setOnClickListener(new View.OnClickListener()

                                  {
                                      public void onClick(View v) {

                                          Intent intent = new Intent(getApplicationContext(), question_sm1.class);
                                          startActivity(intent);
                                      }
                                  }

        );
        settingsB.setOnClickListener(new View.OnClickListener()

                                     {
                                         public void onClick(View v) {

                                             Intent intent = new Intent(getApplicationContext(), about.class);
                                             startActivity(intent);
                                         }
                                     }
        );
        clockB.setOnClickListener(new View.OnClickListener()

                                  {
                                      public void onClick(View v) {

                                          Intent intent = new Intent(getApplicationContext(), coming_soon.class);
                                          startActivity(intent);
                                      }
                                  }
        );
        heartB.setOnClickListener(new View.OnClickListener()

                                  {
                                      public void onClick(View v) {

                                          Intent intent = new Intent(getApplicationContext(), question_h1.class);
                                          startActivity(intent);
                                      }
                                  }
        );

    }
}


