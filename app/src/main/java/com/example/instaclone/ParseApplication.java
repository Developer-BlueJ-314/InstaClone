package com.example.instaclone;

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
                .applicationId("BCrUQVkk80pCdeImSXoKXL5ZCtyyEZwbN7mAb11f")
                .clientKey("rWFPEbTs7UzkaVsIXnQ4qmmr9oWqwXfiiJehtIZu")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }


}
