package com.example.iryna.daggerexample;

import javax.inject.Inject;

/**
 * Created by iryna on 17.08.16.
 */

public class DataBase {

    private String mSavedText;
    @Inject
    public DataBase() {

    }

    public void setSavedText(String savedText) {
        mSavedText = savedText;
    }


    public String getSavedText() {
        return mSavedText;
    }

}
