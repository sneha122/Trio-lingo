package com.example.janvi.mowik;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Janvi on 7/22/2017.
 */

public class WordAdapter extends ArrayAdapter<word> {
    private int mColorId;
    public WordAdapter(Activity context, ArrayList<word> words,int colorid)
    {
        super(context,0,words);
        mColorId=colorid;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentword = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentword.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.d_text_view);
        defaultTextView.setText(currentword.getDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentword.hasImage()) {
            iconView.setImageResource(currentword.getImageResourceId());
        }
        else
            iconView.setVisibility(View.GONE);

        View textContainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
