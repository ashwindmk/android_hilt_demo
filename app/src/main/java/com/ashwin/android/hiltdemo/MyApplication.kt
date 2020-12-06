package com.ashwin.android.hiltdemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp  // No need to initialize components
class MyApplication : Application() {
}