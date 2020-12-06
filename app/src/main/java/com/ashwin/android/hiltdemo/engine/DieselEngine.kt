package com.ashwin.android.hiltdemo.engine

import com.ashwin.android.hiltdemo.engine.Engine
import dagger.hilt.android.scopes.ActivityScoped

@ActivityScoped
class DieselEngine : Engine {
    override fun getType(): String {
        return "diesel"
    }
}
