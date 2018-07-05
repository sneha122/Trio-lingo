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

public class Phrases2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("svagatam","Welcome", R.raw.idk));
        wordi.add(new word("namaste","Hello (General greeting)", R.raw.idk));
        wordi.add(new word("kathamasti bhavan?(m) kathamasti bhavati(f)","How are you?", R.raw.idk));
        wordi.add(new word("aham kusali(m) aham kusalini(f)","Reply to 'How are you?'", R.raw.idk));
        wordi.add(new word("tava nama kim?","What's your name?", R.raw.idk));
        wordi.add(new word("mama nama ...","My name is ...", R.raw.idk));
        wordi.add(new word("bhavan kutratyah(m) bhavati kutratya(f)","Where are you from?", R.raw.idk));
        wordi.add(new word("suprabhatam","Good morning ", R.raw.idk));
        wordi.add(new word("subharatri","Good night", R.raw.idk));
        wordi.add(new word("sudinamastu","Have a nice day", R.raw.idk));
        wordi.add(new word("bhavatu","Yes", R.raw.idk));
        wordi.add(new word("na","No", R.raw.idk));
        wordi.add(new word("na janami","I don't know", R.raw.idk));
        wordi.add(new word("krupya kshyamyatam","Excuse me", R.raw.idk));
        wordi.add(new word("dhanyavadah","Thank you", R.raw.idk));
        wordi.add(new word("janmadina subhecchah","Birthday greetings", R.raw.idk));

        WordAdapter word=new WordAdapter(this,wordi,R.color.category_phrases);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }

}
