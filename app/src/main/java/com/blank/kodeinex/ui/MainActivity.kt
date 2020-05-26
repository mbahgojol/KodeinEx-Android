package com.blank.kodeinex.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blank.kodeinex.R
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity(), KodeinAware {

    override val kodein: Kodein by kodein()
    private val presenter by instance<MainPresenter>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.getNameApp {
            txt.text = it
        }
    }
}
