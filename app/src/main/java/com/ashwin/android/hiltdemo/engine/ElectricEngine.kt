package com.ashwin.android.hiltdemo.engine

import com.ashwin.android.hiltdemo.engine.Engine
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ElectricEngine @Inject constructor() : Engine {
    override fun getType(): String {
        return "electric"
    }
}
