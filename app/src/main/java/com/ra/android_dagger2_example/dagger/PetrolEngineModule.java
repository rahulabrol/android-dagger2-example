package com.ra.android_dagger2_example.dagger;

import com.ra.android_dagger2_example.car.Engine;
import com.ra.android_dagger2_example.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Rahul Abrol on 28/3/20.
 */
@Module
public abstract class PetrolEngineModule {

   /*
    @Provides
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }*/

    @Binds/*If you want  to bind the implementation use Binds annotation & dagger
     never create implementation of this class so we cannot use simple methods with
     provide annotaions here because dagger needs instance of this class to use provides methods
      and there is no instance of this class .But we can use static methods in this class*/
    abstract Engine bindEngine(PetrolEngine engine);
}
