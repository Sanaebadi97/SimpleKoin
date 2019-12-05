package test.test.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import test.test.koin.di.appModule
import test.test.koin.di.viewModelModule

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)

            modules(listOf(appModule, viewModelModule))
        }
    }
}