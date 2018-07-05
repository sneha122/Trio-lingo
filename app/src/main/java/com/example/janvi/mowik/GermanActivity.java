package com.example.janvi.mowik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Janvi on 4/7/2018.
 */

public class GermanActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_german);
        TextView french = (TextView) findViewById(R.id.numbers);
        french.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent nIntent = new Intent(GermanActivity.this, Numbers1Activity.class);
                                          startActivity(nIntent);
                                      }
                                  }
        );
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent fIntent = new Intent(GermanActivity.this, Family1Activity.class);
                                          startActivity(fIntent);
                                      }
                                  }
        );
        TextView colors = (TextView) findViewById(R.id.colors1);
        colors.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent c1Intent = new Intent(GermanActivity.this, Colors1Activity.class);
                                          startActivity(c1Intent);
                                      }
                                  }
        );
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent pIntent = new Intent(GermanActivity.this, Phrases1Activity.class);
                                           startActivity(pIntent);
                                       }
                                   }
        );
        TextView weeks = (TextView) findViewById(R.id.weeks);
        weeks.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent wIntent = new Intent(GermanActivity.this, Weeks1Activity.class);
                                         startActivity(wIntent);
                                     }
                                 }
        );

    }
}

