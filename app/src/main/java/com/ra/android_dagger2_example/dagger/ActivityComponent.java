package com.ra.android_dagger2_example.dagger;

import com.ra.android_dagger2_example.MainActivity;
import com.ra.android_dagger2_example.car.Car;

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
@PerActivity
@Component(dependencies = AppComponent.class/*This tells dgger if we need to create
           activity component it needs app components*/,
        modules = {WheelsModule.class, PetrolEngineModule.class
        /* //we cannot use both module return the same Engine interface because of ambiguity error
        ,PetrolEngineModule.class*/
        })
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
    }

}

