package com.ra.android_dagger2_example.dagger;

import com.ra.android_dagger2_example.car.DieselEngine;
import com.ra.android_dagger2_example.car.Engine;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rahul Abrol on 28/3/20.
 */
@Module
public /*abstract*/ class DieselEngineModule {

    private int horsePower;

    @Inject
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsepower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }

//    @Binds/*If you want  to bind the implementation use Binds annotation & dagger
//     never create implementation of this class so we cannot use simple methods with
//     provide annotations here because dagger needs instance of this class to use provides methods
//      and there is no instance of this class .But we can use static methods in this class*/
//    abstract Engine bindEngine(DieselEngine engine);
}
