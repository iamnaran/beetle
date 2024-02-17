package com.iamnaran.beetle.presentation

import android.app.Application
import com.iamnaran.beetle.presentation.di.appDiComponents
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class BeetleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        configureAppDI()
    }

    private fun configureAppDI() {
        startKoin {

            androidLogger()
            androidContext(this@BeetleApp)
            modules(provideComponents())
        }
    }

    private fun provideComponents() = appDiComponents

}