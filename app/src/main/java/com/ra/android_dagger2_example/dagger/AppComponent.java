package com.ra.android_dagger2_example.dagger;

import com.ra.android_dagger2_example.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rahul Abrol on 29/3/20.
 */
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
