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

public class PhrasesActivity extends AppCompatActivity {
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
        words.add(new word("Please","S'il vous plait",R.raw.please));
        words.add(new word("Sorry","Desolè",R.raw.sorry));
        words.add(new word("Thank You","Merci",R.raw.merci));
        words.add(new word("You are welcome","De rien",R.raw.derien));
        words.add(new word("Good-day","Bonjour",R.raw.bonjour));
        words.add(new word("Bye","Au revoir",R.raw.bye));
        words.add(new word("Hi","Salut",R.raw.salut));
        words.add(new word("I don't understand","Je ne comprends pas",R.raw.idk));
        words.add(new word("What is your name?","Comment vous appelez-vous?",R.raw.wat));
        words.add(new word("How are you?","Comment allez-vous?",R.raw.hru));
        words.add(new word("I am fine","Ca va/je vais bien",R.raw.cava));
        words.add(new word("Excuse me","Excusez-moi",R.raw.excuse));
        words.add(new word("Okay","D'accord",R.raw.okau));
        words.add(new word("I love you","Je t'aime",R.raw.ilu));
        words.add(new word("I don't know","je ne sais pas",R.raw.idc));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_phrases);
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
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word1.getmAudioId());
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
