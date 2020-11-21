package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iXGqn4KfHdbJXFttQzLV4ifIefqfIziZ6U0Ilds8")
                .clientKey("SmLt7WpFIixZjw9QZLdXXdjHGBC6AITEqdkjwmzA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}