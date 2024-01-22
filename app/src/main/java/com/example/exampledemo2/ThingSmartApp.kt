package com.example.exampledemo2

import android.app.Application
import com.thingclips.smart.home.sdk.ThingHomeSdk

class ThingSmartApp : Application() {

    override fun onCreate() {
        super.onCreate()
        ThingHomeSdk.setDebugMode(true)
        ThingHomeSdk.init(this)
    }


}