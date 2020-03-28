package com.ra.android_dagger2_example.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Rahul Abrol on 28/3/20.
 */
public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    void setListener(Car car) {
        Log.d(TAG, "remote connected");
    }
}
