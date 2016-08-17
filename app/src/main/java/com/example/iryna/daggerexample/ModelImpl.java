package com.example.iryna.daggerexample;

import javax.inject.Inject;
import rx.Observable;

/**
 * Created by iryna on 17.08.16.
 */
public class ModelImpl implements Model {

    private final DataBase mDataBase;

    @Inject
    public ModelImpl(DataBase dataBase) {
        mDataBase=dataBase;
    }

    @Override
    public Observable<String> getData() {
        return  Observable.just(mDataBase.getSavedText());
    }

    @Override
    public void setData(String text) {
        mDataBase.setSavedText(text);
    }

}
