package com.example.firrebasedatabase;

import android.app.Application;

import com.firebase.client.Firebase;

public class FIrrebaseDatabase  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
