package com.ra.android_dagger2_example.car;

import android.util.Log;

/**
 * Created by Rahul Abrol on 28/3/20.
 */
public class Tires {
    //We don't own this class so we don't annotate it with @Inject

    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tires Inflated.....");
    }
}
