package com.ashwin.android.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NextActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        Log.w(MainActivity.TAG, "NextActivity | Car: ${car.getName()} | wheel: ${car.getWheelRadius()} | hash: ${System.identityHashCode(car)}")
    }
}
