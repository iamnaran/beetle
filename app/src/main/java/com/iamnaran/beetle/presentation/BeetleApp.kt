package com.iamnaran.beetle.presentation

import android.app.Application
import com.iamnaran.beetle.presentation.di.appDiComponents
import com.iamnaran.beetle.presentation.utils.AppLog
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class BeetleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AppLog.init()
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