package com.ashwin.android.hiltdemo

import com.ashwin.android.hiltdemo.engine.Engine
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class Car @Inject constructor(/* Constructor injection */ private val engine: Engine, private val wheel: Wheel) {
    fun getEngine(): Engine {
        return engine
    }

    fun getWheelRadius(): Int {
        return wheel.getRadius()
    }

    fun getName(): String {
        return "Tesla"
    }
}
