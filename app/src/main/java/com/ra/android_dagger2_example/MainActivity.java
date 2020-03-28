package com.ra.android_dagger2_example;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ra.android_dagger2_example.car.Car;
import com.ra.android_dagger2_example.dagger.CarComponent;
import com.ra.android_dagger2_example.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car; //field injection

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(MainActivity.this);
//        car = component.getCar();
        car.drive();
    }
}
