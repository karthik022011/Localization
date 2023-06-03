package com.kartheek.localization

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import java.util.*

open class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        //We will get selected language from data store and pass here.
        //For now i am passing directly.
        //On click of button we need to change the language, so on click of button we update the language in data store.
        //our activity should extend the BaseActivity, magic will be done.
        val localeToSwitch = Locale("hi")
        val localeUpdatedContext = ContextUtils.updateLocale(newBase, localeToSwitch)
        super.attachBaseContext(localeUpdatedContext)
    }
}