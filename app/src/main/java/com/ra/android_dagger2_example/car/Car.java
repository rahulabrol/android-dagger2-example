package com.ra.android_dagger2_example.car;

import android.util.Log;

import com.ra.android_dagger2_example.dagger.PerActivity;

import javax.inject.Inject;

/**
 * Created by Rahul Abrol on 28/3/20.
 * <p>
 * Oder in which the injection execute by dagger:
 * 1. Constructor injection
 * 2. Field Injection
 * 3. Method Injection
 */
@PerActivity
public class Car {
    private static final String TAG = "Car";
    //    @Inject
    private Engine engine; // 2
    private Wheels wheels;
    private Driver driver;

    /**
     * Constructor injection with other variables.
     *
     * @param wheels
     */
    @Inject //1
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject //3
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
    }

}
