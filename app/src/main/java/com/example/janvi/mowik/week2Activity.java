package com.example.janvi.mowik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class week2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("Induvasarah","Monday", R.raw.idk));
        wordi.add(new word("Bhaumavasarah","Tuesday", R.raw.idk));
        wordi.add(new word("Saumyavasarah","Wednesday", R.raw.idk));
        wordi.add(new word("Guruvasarah","Thursday", R.raw.idk));
        wordi.add(new word("Sukravasarah","Friday", R.raw.idk));
        wordi.add(new word("Sanivasarah","Saturday", R.raw.idk));
        wordi.add(new word("Bhanuvasarah","Sunday", R.raw.idk));


        WordAdapter word=new WordAdapter(this,wordi,R.color.category_weeks);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }

}

