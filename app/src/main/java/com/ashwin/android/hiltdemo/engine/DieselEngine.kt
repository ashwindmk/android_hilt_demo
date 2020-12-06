package com.ashwin.android.hiltdemo.engine

import dagger.hilt.android.scopes.ActivityScoped

@ActivityScoped
class DieselEngine : Engine {
    override fun getType(): String {
        return "diesel"
    }
}
