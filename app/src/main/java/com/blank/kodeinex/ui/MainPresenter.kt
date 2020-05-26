package com.blank.kodeinex.ui

import android.content.Context
import com.blank.kodeinex.R

class MainPresenter(private val context: Context) {
    fun getNameApp(nameApp: (String) -> Unit) {
        val name = context.resources.getString(R.string.app_name)
        nameApp.invoke(name)
    }
}