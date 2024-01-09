package com.example.hilt_demo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp :Application() {
    override fun onCreate() {
        super.onCreate()
    }
}