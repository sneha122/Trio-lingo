package com.example.janvi.mowik;

/**
 * Created by Janvi on 4/8/2018.
 */

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers1Activity extends AppCompatActivity {
    int i;
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi = new ArrayList<word>();
        wordi.add(new word("Ein", "One", R.drawable.number_one, R.raw.noir));
        wordi.add(new word("Zwei", "Two", R.drawable.number_two, R.raw.noir));
        wordi.add(new word("Drei", "Three", R.drawable.number_three, R.raw.noir));
        wordi.add(new word("Vier", "Four", R.drawable.number_four, R.raw.noir));
        wordi.add(new word("Fünf", "Five", R.drawable.number_five, R.raw.noir));
        wordi.add(new word("Sechs", "Six", R.drawable.number_six, R.raw.noir));
        wordi.add(new word("Sieben", "Seven", R.drawable.number_seven, R.raw.noir));
        wordi.add(new word("Acht", "Eight", R.drawable.number_eight, R.raw.noir));
        wordi.add(new word("Neun", "Nine", R.drawable.number_nine, R.raw.noir));
        wordi.add(new word("Zehn", "Ten", R.drawable.number_ten, R.raw.noir));

        WordAdapter word = new WordAdapter(this, wordi, R.color.category_numbers);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(word);


    }
}