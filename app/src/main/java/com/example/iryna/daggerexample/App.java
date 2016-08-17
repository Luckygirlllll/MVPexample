package com.example.iryna.daggerexample;

import android.app.Application;
import android.content.Context;

import com.example.iryna.daggerexample.DI.ApplicationComponent;
import com.example.iryna.daggerexample.DI.ApplicationModule;
import com.example.iryna.daggerexample.DI.DaggerApplicationComponent;

/**
 * Created by iryna on 17.08.16.
 */
public class App extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        resolveDependencies();
    }

    private void resolveDependencies() {
        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public static App getInstance(Context context) {
        return (App) context.getApplicationContext();
    }

    public ApplicationComponent getAppComponent(){
        return mApplicationComponent;
    }

}
