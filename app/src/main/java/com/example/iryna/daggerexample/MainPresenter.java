package com.example.iryna.daggerexample;

import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by iryna on 17.08.16.
 */
public class MainPresenter {

    private final MainView mMainView;
    private final Model mModel;

    @Inject
    public MainPresenter(MainView mMainView, Model mModel) {
        this.mMainView = mMainView;
        this.mModel = mModel;
    }


    public void addDate(String text){
        mModel.setData(text);
        mMainView.done();

    }

    public void getData(){
        Subscription sub = mModel
                .getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(s -> {
                    mMainView.showData(s);
                }, throwable -> {
                    Log.d("Error ", throwable.getMessage());
                });
    }
}
