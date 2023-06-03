package com.kartheek.localization

import android.content.Context
import android.content.ContextWrapper
import android.os.Build
import android.os.LocaleList
import java.util.*

class ContextUtils(base: Context) : ContextWrapper(base) {
    companion object {
        fun updateLocale(context: Context, localeToSwitchTo: Locale): ContextUtils {
            val resources = context.resources
            val configuration = resources.configuration // 1

            //Greater than ApI 24 i.e Naugat
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                val localeList = LocaleList(localeToSwitchTo) // 2
                LocaleList.setDefault(localeList) // 3
                configuration.setLocales(localeList) // 4
            } else {
                configuration.locale = localeToSwitchTo
            }
            val updatedContext = context.createConfigurationContext(configuration) // 5
            return ContextUtils(updatedContext)
        }
    }
}