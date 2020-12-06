package com.ashwin.android.hiltdemo.driver

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Name

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class License

@Module
@InstallIn(ApplicationComponent::class)
class DriverModule {
    @Provides
    @Singleton
    fun provideDriver(@Name name: String, @License license: String): Driver {
        return Driver(name, license)
    }

    @Provides
    @Name
    fun provideName(): String {
        return "Jake Williams";
    }

    @Provides
    @License
    fun provideLicense(): String {
        return "MH123ERY4563";
    }
}
