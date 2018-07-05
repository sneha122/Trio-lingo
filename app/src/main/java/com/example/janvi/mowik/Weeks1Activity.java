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

public class Weeks1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("Montag","Monday", R.raw.idk));
        wordi.add(new word("Dienstag","Tuesday", R.raw.idk));
        wordi.add(new word("Mittwoch","Wednesday", R.raw.idk));
        wordi.add(new word("Donnerstag","Thursday", R.raw.idk));
        wordi.add(new word("Freitag","Friday", R.raw.idk));
        wordi.add(new word("Samstag","Saturday", R.raw.idk));
        wordi.add(new word("Sonntag","Sunday", R.raw.idk));


        WordAdapter word=new WordAdapter(this,wordi,R.color.category_weeks);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }

}
