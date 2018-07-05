package com.example.janvi.mowik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("Herzlich willkommen","Welcome", R.raw.noir));
        wordi.add(new word("Hallo","Hello (General greeting)",R.raw.noir));
        wordi.add(new word("Wie geht es dir?","How are you?", R.raw.noir));
        wordi.add(new word("Mir geht es gut","I am fine", R.raw.noir));
        wordi.add(new word("Wie heißen Sie?","What's your name?", R.raw.noir));
        wordi.add(new word("Mein Name ist ...","My name is ...", R.raw.noir));
        wordi.add(new word("Wo kommen Sie her?","Where are you from?", R.raw.noir));
        wordi.add(new word("Guten Morgen","Good morning ", R.raw.noir));
        wordi.add(new word("Gute Nacht","Good night", R.raw.noir));
        wordi.add(new word("Einen schönen Tag noch","Have a nice day", R.raw.noir));
        wordi.add(new word("Ja","Yes", R.raw.noir));
        wordi.add(new word("Nein","No", R.raw.noir));
        wordi.add(new word("Ich weiß es nicht","I don't know", R.raw.noir));
        wordi.add(new word("Entschuldigen Sie mich","Excuse me", R.raw.noir));
        wordi.add(new word("Vielen Dank","Thank you", R.raw.noir));
        wordi.add(new word("Geburtstags Grüße","Birthday greetings", R.raw.noir));

        WordAdapter word=new WordAdapter(this,wordi,R.color.category_phrases);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }

}
