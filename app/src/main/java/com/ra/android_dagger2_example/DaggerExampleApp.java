package com.ra.android_dagger2_example;

import android.app.Application;

import com.ra.android_dagger2_example.dagger.AppComponent;
import com.ra.android_dagger2_example.dagger.DaggerAppComponent;

/**
 * Created by Rahul Abrol on 29/3/20.
 */
public class DaggerExampleApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
