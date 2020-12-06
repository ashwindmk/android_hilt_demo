package com.ashwin.android.hiltdemo

import javax.inject.Inject

class Car @Inject constructor(/* Constructor injection */ private val wheel: Wheel) {
    fun getWheelRadius(): Int {
        return wheel.getRadius()
    }

    fun getName(): String {
        return "Tesla"
    }
}
