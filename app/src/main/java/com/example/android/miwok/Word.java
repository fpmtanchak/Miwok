package com.example.android.miwok;

/**
 * Created by Bohdan Tanchak on 06.02.2017.
 *
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String miwokTranslation, String defaultTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
