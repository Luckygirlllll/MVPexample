package com.example.iryna.daggerexample;


import rx.Observable;

/**
 * Created by iryna on 17.08.16.
 */
public interface Model {

    Observable<String> getData();
    void setData(String text);
    
}
