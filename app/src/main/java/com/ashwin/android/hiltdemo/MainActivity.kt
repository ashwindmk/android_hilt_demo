package com.ashwin.android.hiltdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ashwin.android.hiltdemo.driver.Driver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint  // Injects this Activity in any component
class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "hilt-demo"
    }

    @Inject  // Field injection
    lateinit var car: Car

    @Inject
    lateinit var driver: Driver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w(TAG, "MainActivity | Car: ${car.getName()} | engine: ${car.getEngine().getType()} | wheel: ${car.getWheelRadius()} | hash: ${System.identityHashCode(car)}")

        Log.w(TAG, "MainActivity | Driver: $driver")

        next_button.setOnClickListener {
            startActivity(Intent(MainActivity@this, NextActivity::class.java))
        }
    }
}
