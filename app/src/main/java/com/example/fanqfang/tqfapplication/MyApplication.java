package com.example.fanqfang.tqfapplication;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by fanqfang on 4/5/2017 AD.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    private void initFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/HelveticaNeue.dfont")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
