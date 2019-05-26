package com.kaiohenrique.popmovies.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.kaiohenrique.popmovies.R

/**
 *
 *@author Kaio Henrique on 18/05/2019
 *
 */

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onSupportNavigateUp() = findNavController(R.id.loginNavHostFragment).navigateUp()

}
