package com.ashwin.android.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint  // No need to inject this Activity in any component
class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "hilt-demo"
    }

    @Inject  // Field injection
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w(TAG, "MainActivity | Car: ${car.getName()} | wheel: ${car.getWheelRadius()}")
    }
}
