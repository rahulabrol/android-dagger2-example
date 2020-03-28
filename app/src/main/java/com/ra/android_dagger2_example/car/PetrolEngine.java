package com.ra.android_dagger2_example.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Rahul Abrol on 28/3/20.
 */
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(
            @Named("horse power") int horsePower,
            @Named("engine capacity") int engineCapacity) {
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started." +
                "\nHorsepower: " + horsePower +
                "\nEngine Capacity: " + engineCapacity);
    }
}
