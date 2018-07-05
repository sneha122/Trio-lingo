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

public class Colors2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("Raktavarnah","Red",R.drawable.color_red, R.raw.idk));
        wordi.add(new word("Haritah","Green",R.drawable.color_green, R.raw.idk));
        wordi.add(new word("Syamah","Black",R.drawable.color_black, R.raw.idk));
        wordi.add(new word("Svetah","White",R.drawable.color_white, R.raw.idk));
        wordi.add(new word("Dhusarah","Gray",R.drawable.color_gray, R.raw.idk));
        wordi.add(new word("Kapisah","Brown",R.drawable.color_brown, R.raw.idk));
        wordi.add(new word("Pitah","Yellow",R.drawable.color_dusty_yellow, R.raw.idk));

        WordAdapter word=new WordAdapter(this,wordi,R.color.category_colors);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }
}

