package com.example.iryna.daggerexample.DI;

import com.example.iryna.daggerexample.MainPresenter;
import com.example.iryna.daggerexample.MainView;
import com.example.iryna.daggerexample.Model;
import com.example.iryna.daggerexample.ModelImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by iryna on 17.08.16.
 */
@Module
public class MainActivityModule  {

    private MainView mMainView;

    public MainActivityModule(MainView mMainView) {
        this.mMainView = mMainView;
    }

    @Provides
    public MainPresenter providePresenter(ModelImpl model){
        return new MainPresenter(mMainView, model);
    }
}
