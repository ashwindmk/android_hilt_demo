package com.ashwin.android.hiltdemo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp  // Initializes components
class MyApplication : Application() {
}
