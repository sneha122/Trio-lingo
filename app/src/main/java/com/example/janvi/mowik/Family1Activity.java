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

public class Family1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<word> wordi=new ArrayList<word>();
        wordi.add(new word("Mutter","Mother",R.drawable.family_mother,R.raw.noir));
        wordi.add(new word("Vater","Father",R.drawable.family_father,R.raw.noir));
        wordi.add(new word("Tochter","Daughter",R.drawable.family_daughter,R.raw.noir));
        wordi.add(new word("Sohn","Son",R.drawable.family_son,R.raw.noir));
        wordi.add(new word("Mann","Husband",R.drawable.family_father,R.raw.noir));
        wordi.add(new word("Ehefrau","Wife",R.drawable.family_mother,R.raw.noir));
        wordi.add(new word("Enkel","Grandson",R.drawable.family_son,R.raw.noir));
        wordi.add(new word("Enkelin","Granddaughter",R.drawable.family_daughter,R.raw.noir));
        wordi.add(new word("Freund","Friend",R.drawable.family_son,R.raw.noir));

        WordAdapter word=new WordAdapter(this,wordi,R.color.category_family);
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(word);
    }

}
