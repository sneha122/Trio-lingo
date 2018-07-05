package com.example.janvi.mowik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Janvi on 4/7/2018.
 */

public class SanskritActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanskrit);
        TextView french = (TextView) findViewById(R.id.numbers);
        french.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent nIntent = new Intent(SanskritActivity.this, Numbers2Activity.class);
                                          startActivity(nIntent);
                                      }
                                  }
        );
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent fIntent = new Intent(SanskritActivity.this, Family2Activity.class);
                                          startActivity(fIntent);
                                      }
                                  }
        );
        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent cIntent = new Intent(SanskritActivity.this, Colors2Activity.class);
                                          startActivity(cIntent);
                                      }
                                  }
        );
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent pIntent = new Intent(SanskritActivity.this, Phrases2Activity.class);
                                           startActivity(pIntent);
                                       }
                                   }
        );
        TextView weeks = (TextView) findViewById(R.id.weeks);
        weeks.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent pIntent = new Intent(SanskritActivity.this, week2Activity.class);
                                           startActivity(pIntent);
                                       }
                                   }
        );
    }
}

