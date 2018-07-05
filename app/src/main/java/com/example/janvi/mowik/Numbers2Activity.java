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

public class Numbers2Activity extends AppCompatActivity {
    int i;
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("ekam","One",R.drawable.number_one, R.raw.idk));
        wordi.add(new word("dve","Two",R.drawable.number_two, R.raw.idk));
        wordi.add(new word("trini","Three",R.drawable.number_three, R.raw.idk));
        wordi.add(new word("catvari","Four",R.drawable.number_four, R.raw.idk));
        wordi.add(new word("panca","Five",R.drawable.number_five, R.raw.idk));
        wordi.add(new word("sat","Six",R.drawable.number_six, R.raw.idk));
        wordi.add(new word("sapta","Seven",R.drawable.number_seven, R.raw.idk));
        wordi.add(new word("asta","Eight",R.drawable.number_eight, R.raw.idk));
        wordi.add(new word("nava","Nine",R.drawable.number_nine, R.raw.idk));
        wordi.add(new word("daśa","Ten",R.drawable.number_ten, R.raw.idk));

        WordAdapter word=new WordAdapter(this,wordi,R.color.category_numbers);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);

    }

}
