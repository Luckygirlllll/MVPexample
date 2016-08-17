package com.example.iryna.daggerexample.DI;

import com.example.iryna.daggerexample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by iryna on 17.08.16.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    MainActivitySubComponent plus(MainActivityModule mainActivityModule);



}
