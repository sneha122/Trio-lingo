package com.example.janvi.mowik;

import android.view.View;

/**
 * Created by Janvi on 7/21/2017.
 */

public class word{
    private String mDtrans;
    private String mMtrans;
    private int mid=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioId;
    private static final int NO_AUDIO_PROVIDED=-1;

    public word(String dtrans,String mtrans,int id,int AudioId){
        mDtrans=dtrans;
        mMtrans=mtrans;
        mid=id;
        mAudioId=AudioId;
    }
    public word(String dtrans,String mtrans,int AudioId) {
        mDtrans = dtrans;
        mMtrans = mtrans;
        mAudioId=AudioId;
    }

    public String getDefaultTranslation(){
        return mDtrans;
    }

    public String getMiwokTranslation() {
        return mMtrans;
    }

    public int getImageResourceId()
    {
        return mid;
    }
    public boolean hasImage()
    {
        return mid!=NO_IMAGE_PROVIDED;
    }

    public int getmAudioId() {
        return mAudioId;
    }
    public boolean hasAudio(){ return mAudioId!=NO_AUDIO_PROVIDED; }
}
