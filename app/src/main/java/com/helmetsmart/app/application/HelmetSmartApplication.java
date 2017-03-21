package com.helmetsmart.app.application;

import android.app.Application;

import com.helmetsmart.app.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Application Class
 *
 * @since 3/21/2017
 */

public class HelmetSmartApplication extends Application {

    // Called when the application is starting, before any other application objects have been created.
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath(getString(R.string.SetAppFont))
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
