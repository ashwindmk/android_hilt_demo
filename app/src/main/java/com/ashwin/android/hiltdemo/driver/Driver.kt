package com.ashwin.android.hiltdemo.driver

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
data class Driver @Inject constructor(val name: String, val license: String)
