package com.example.janvi.mowik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView french=(TextView)findViewById(R.id.french);
        french.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                Intent fIntent=new Intent(MainActivity.this,FrenchActivity.class);
                startActivity(fIntent);
            }
        }
        );
        TextView family=(TextView)findViewById(R.id.german);
        family.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view){
                                           Intent gIntent=new Intent(MainActivity.this,GermanActivity.class);
                                           startActivity(gIntent);
                                       }
                                   }
        );
        TextView colors=(TextView)findViewById(R.id.sanskrit);
        colors.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view){
                                           Intent sIntent=new Intent(MainActivity.this,SanskritActivity.class);
                                           startActivity(sIntent);
                                       }
                                   }
        );
    }

        }
