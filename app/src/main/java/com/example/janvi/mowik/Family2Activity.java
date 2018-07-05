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

public class Family2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("Mata","Mother",R.drawable.family_mother, R.raw.idk));
        wordi.add(new word("Pita","Father",R.drawable.family_father, R.raw.idk));
        wordi.add(new word("Putri","Daughter",R.drawable.family_daughter, R.raw.idk));
        wordi.add(new word("Putrah","Son",R.drawable.family_son, R.raw.idk));
        wordi.add(new word("Patih","Husband",R.drawable.family_father, R.raw.idk));
        wordi.add(new word("Patni","Wife",R.drawable.family_mother, R.raw.idk));
        wordi.add(new word("Pautrah","Grandson",R.drawable.family_son, R.raw.idk));
        wordi.add(new word("Pautri","Granddaughter",R.drawable.family_daughter, R.raw.idk));
        wordi.add(new word("sakha","Friend",R.drawable.family_son, R.raw.idk));

        WordAdapter word=new WordAdapter(this,wordi,R.color.category_family);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }

}
