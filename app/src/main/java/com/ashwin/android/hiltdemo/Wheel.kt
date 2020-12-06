package com.ashwin.android.hiltdemo

import javax.inject.Inject

class Wheel {
    @Inject
    constructor()

    fun getRadius(): Int {
        return 80
    }
}