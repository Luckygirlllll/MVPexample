package com.example.iryna.daggerexample.DI;

import com.example.iryna.daggerexample.App;

import dagger.Module;

/**
 * Created by iryna on 17.08.16.
 */

@Module
public class ApplicationModule {

    private App mApp;

    public ApplicationModule(App mApp) {
        this.mApp = mApp;
    }
}
