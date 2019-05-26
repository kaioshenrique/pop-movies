package com.kaiohenrique.popmovies.application

import android.app.Application
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.module

/**
 *
 *@author Kaio Henrique on 18/05/2019
 *
 */

class App : Application() {

    private val appModules by lazy {
        listOf(
            module {
                // NOT YET IMPLEMENTED
            }
        )
    }

    override fun onCreate() {
        super.onCreate()
        startKoin(this, appModules)
    }
}