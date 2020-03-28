package com.ra.android_dagger2_example.dagger;

import com.ra.android_dagger2_example.MainActivity;
import com.ra.android_dagger2_example.car.Car;
import com.ra.android_dagger2_example.car.PetrolEngine;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Rahul Abrol on 28/3/20.
 * <p>
 * DAGger-> Directed Acyclic Graph
 * <p>
 * dagger.Component is called "The Injector" as well.
 * <p>
 * This is  the backbone of the dagger and it knows how to provide dependencies.
 */
@Component(modules = {WheelsModule.class, PetrolEngineModule.class
        /* //we cannot use both module return the same Engine interface because of ambiguity error
        ,PetrolEngineModule.class*/
})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(int engineCapacity);

        CarComponent build();
    }

}

