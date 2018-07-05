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

public class weekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("Lundi","Monday", R.raw.idk));
        wordi.add(new word("Mardi","Tuesday", R.raw.idk));
        wordi.add(new word("Mercerdi","Wednesday", R.raw.idk));
        wordi.add(new word("Jeudi","Thursday", R.raw.idk));
        wordi.add(new word("Vendredi","Friday", R.raw.idk));
        wordi.add(new word("Samedi","Saturday", R.raw.idk));
        wordi.add(new word("Dimanche","Sunday", R.raw.idk));

        WordAdapter word=new WordAdapter(this,wordi,R.color.category_weeks);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }

}
