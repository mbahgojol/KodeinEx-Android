package com.blank.kodeinex

import android.app.Application
import com.blank.kodeinex.util.myModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class AppLoader : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@AppLoader))
        import(myModule)
    }
}