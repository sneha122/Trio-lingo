package com.example.janvi.mowik;

/**
 * Created by Janvi on 4/8/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        

        
        ArrayList<word> words=new ArrayList<word>();
        words.add(new word("Rot","Red",R.drawable.color_red,R.raw.noir));
        words.add(new word("Grün","Green",R.drawable.color_green,R.raw.noir));
        words.add(new word("Schwarz","Black",R.drawable.color_black,R.raw.noir));
        words.add(new word("Weiß","White",R.drawable.color_white,R.raw.noir));
        words.add(new word("Grau","Gray",R.drawable.color_gray,R.raw.noir));
        words.add(new word("Braun","Brown",R.drawable.color_brown,R.raw.noir));
        words.add(new word("Staub gelb"," Dusty yellow",R.drawable.color_dusty_yellow,R.raw.noir));

        WordAdapter word=new WordAdapter(this,words,R.color.category_colors);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }
}
