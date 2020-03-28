package com.ra.android_dagger2_example.car;

/**
 * Created by Rahul Abrol on 28/3/20.
 */
public class Wheels {
//We don't own this class so we don't annotate it with @Inject

    private static final String TAG = "Car";

    private Rims rims;
    private Tires tires;

    //    @Inject
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}