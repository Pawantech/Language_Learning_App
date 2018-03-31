package com.example.android.miwok;

import android.graphics.drawable.Drawable;

/**
 * Created by pawan on 24-02-2018.
 */

public class word  {
    private String miwok_words,eng_words;
    private int images_resourceid = no_image;
    private static final int no_image=-1;
    private int play_sound;
    public word(String miwoktranslation, String engtranslations, int sound) {
        miwok_words = miwoktranslation;
        eng_words = engtranslations;
        play_sound = sound;
    }
    public word(String miwoktranslation, String engtranslations, int image, int sound ) {
        miwok_words = miwoktranslation;
        eng_words = engtranslations;
        images_resourceid = image;
        play_sound = sound;
    }

    @Override
    public String toString() {
        return "word{" +
                "miwok_words='" + miwok_words + '\'' +
                ", eng_words='" + eng_words + '\'' +
                ", images_resourceid=" + images_resourceid +
                ", play_sound=" + play_sound +
                '}';
    }
    // to get miwok words

    public String get_miwok_translation(){
        return miwok_words;
    }
    public String get_eng_translations(){
        return eng_words;
    }
    public int getImages_resourceid(){return  images_resourceid;}

    public int getPlay_sound()
    {
        return play_sound;
    }
    //returns whether image is present or not
    public boolean has_image(){
        return images_resourceid != no_image;
    }
    }


