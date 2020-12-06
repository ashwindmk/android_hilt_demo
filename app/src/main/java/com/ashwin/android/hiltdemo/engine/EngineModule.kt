package com.ashwin.android.hiltdemo.engine

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {
    @Binds
    abstract fun bindEngine(engine: ElectricEngine): Engine
}
