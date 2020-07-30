package com.twilio.video.quickstart.custommodules;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.twilio.video.quickstart.activity.VideoActivity;

import javax.annotation.Nonnull;

public class ActivityStarterModule extends ReactContextBaseJavaModule {
    public ActivityStarterModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    void navigateToVideo() {
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, VideoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public String getName() {
        return "ActivityStarter";
    }
}
