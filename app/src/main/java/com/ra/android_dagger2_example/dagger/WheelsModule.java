package com.ra.android_dagger2_example.dagger;

import com.ra.android_dagger2_example.car.Rims;
import com.ra.android_dagger2_example.car.Tires;
import com.ra.android_dagger2_example.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rahul Abrol on 28/3/20.
 * If all provides methods are static then make your class abstract
 */
@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
