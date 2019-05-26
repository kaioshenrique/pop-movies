package com.kaiohenrique.popmovies.ui.splash

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.kaiohenrique.popmovies.R
import com.kaiohenrique.popmovies.extentions.intentFor
import com.kaiohenrique.popmovies.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 *
 *@author Kaio Henrique on 19/05/2019
 *
 */
class SplashActivity : AppCompatActivity() {

    companion object {
        private const val SPLASH_TIME_OUT = 2000L
    }

    private lateinit var splashAnimation: AnimationDrawable

    private val handler = Handler { true }

    private val startAnimationCallback = Runnable {
        animationCallback()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startAnimation()
    }

    private fun startAnimation() {
        container.apply {
            setBackgroundResource(R.drawable.splash_animation)
            splashAnimation = background as AnimationDrawable
        }
        addCallback()
    }


    private fun animationCallback() {
        removeCallback()
        intentFor<LoginActivity>()
            .run {
                startActivity(this)
                finishAffinity()
            }
    }

    private fun addCallback() {
        splashAnimation.start()
        handler.postDelayed(startAnimationCallback, SPLASH_TIME_OUT)
    }

    private fun removeCallback() {
        splashAnimation.stop()
        handler.removeCallbacks(startAnimationCallback)
    }

}