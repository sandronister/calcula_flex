package br.com.sandroni.calculaflex

import android.support.v7.app.AppCompatActivity
import CalculaFlexTracker
import ScreenMap

open class BaseActivity : AppCompatActivity() {

    open fun getScreenName(): String {
        return ScreenMap.getScreenNameBy(this)
    }

    override fun onStart() {
        super.onStart()
        CalculaFlexTracker.trackScreen(this, getScreenName())
    }
}
