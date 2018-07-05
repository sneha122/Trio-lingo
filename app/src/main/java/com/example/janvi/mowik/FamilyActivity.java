package com.example.janvi.mowik;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {
                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                            focusChange== AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        // Pause playback
                        mMediaPlayer.start();
                    } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                        releaseMediaPlayer();
                    }
                }
            };
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        mAudioManager=(AudioManager)getSystemService(Context.AUDIO_SERVICE);
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Father","Père",R.drawable.family_father,R.raw.pere));
        words.add(new word("Mother","Mère",R.drawable.family_mother,R.raw.mere));
        words.add(new word("Brother","frère",R.drawable.family_younger_brother,R.raw.frere));
        words.add(new word("Sister","sœur",R.drawable.family_younger_sister,R.raw.soeur));
        words.add(new word("Uncle","Oncle",R.drawable.family_older_brother,R.raw.oncle));
        words.add(new word("Aunt","Tante",R.drawable.family_older_sister,R.raw.tante));
        words.add(new word("Grand-father","Grand-père",R.drawable.family_grandfather,R.raw.grandp));
        words.add(new word("Grand-Mother","Grand-mère",R.drawable.family_grandmother,R.raw.grandm));
        words.add(new word("Nephew","Neveu",R.drawable.family_son,R.raw.neveu));
        words.add(new word("Niece","Nièce",R.drawable.family_daughter,R.raw.niece));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                word word1=words.get(i);
                releaseMediaPlayer();
                int result= mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        AudioManager.STREAM_MUSIC,
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if(result==AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word1.getmAudioId());
                    mMediaPlayer.start();
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });
    }
    protected void onStop()
    {
        super.onStop();
        releaseMediaPlayer();
    }
    private void releaseMediaPlayer()
    {
        if(mMediaPlayer!=null)
            mMediaPlayer.release();

        mMediaPlayer=null;
        mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
    }
}
