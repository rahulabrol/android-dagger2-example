package com.ra.android_dagger2_example.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Rahul Abrol on 28/3/20.
 * <p>
 * Oder in which the injection execute by dagger:
 * 1. Constructor injection
 * 2. Field Injection
 * 3. Method Injection
 */
public class Car {
    private static final String TAG = "Car";
    //    @Inject
    Engine engine; // 2
    private Wheels wheels;

    /**
     * Constructor injection with other variables.
     *
     * @param wheels
     */
    @Inject //1
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject //3
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }

}
