package com.ra.android_dagger2_example.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Rahul Abrol on 29/3/20.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
