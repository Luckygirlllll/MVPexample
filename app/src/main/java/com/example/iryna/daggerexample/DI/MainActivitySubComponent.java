package com.example.iryna.daggerexample.DI;

import com.example.iryna.daggerexample.MainActivity;

import dagger.Module;
import dagger.Subcomponent;

/**
 * Created by iryna on 17.08.16.
 */
@Subcomponent(modules={MainActivityModule.class})
public interface MainActivitySubComponent {

    void inject(MainActivity activity);
}
