package com.kaiohenrique.popmovies.extentions

import android.app.Activity
import android.content.Intent


/**
 *
 *@author Kaio Henrique on 19/05/2019
 *
 */

inline fun <reified T : Activity> Activity.intentFor(): Intent {
    return Intent(this, T::class.java)
}