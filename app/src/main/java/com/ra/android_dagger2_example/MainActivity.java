package com.ra.android_dagger2_example;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ra.android_dagger2_example.car.Car;
import com.ra.android_dagger2_example.dagger.ActivityComponent;
import com.ra.android_dagger2_example.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2; //field injection

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .appComponent(((DaggerExampleApp) getApplication()).getAppComponent())
                .build();

        activityComponent.inject(MainActivity.this);
//        car = activityComponent.getCar();
        car1.drive();
        car2.drive();
    }
}
