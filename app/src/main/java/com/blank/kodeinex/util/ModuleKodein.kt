package com.blank.kodeinex.util

import com.blank.kodeinex.ui.MainPresenter
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

val myModule = Kodein.Module(name = "My Module") {
    bind() from singleton { MainPresenter(instance()) }
}