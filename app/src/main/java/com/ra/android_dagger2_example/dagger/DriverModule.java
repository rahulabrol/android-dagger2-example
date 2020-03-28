package com.ra.android_dagger2_example.dagger;

import com.ra.android_dagger2_example.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rahul Abrol on 29/3/20.
 */
@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}
