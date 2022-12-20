package com.apps.android_with_aws_amplify

import android.app.Application

class AndroidWithAwsAmplify: Application() {
    override fun onCreate() {
        super.onCreate()

        // initialize Amplify when application is starting
        Backend.initialize(applicationContext)
    }
}