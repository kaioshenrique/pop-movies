package com.kaiohenrique.popmovies.ui.login

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.kaiohenrique.popmovies.R
import kotlinx.android.synthetic.main.fragment_login.*


/**
 *
 *@author Kaio Henrique on 20/05/2019
 *
 */
class LoginFragment : Fragment() {

    private lateinit var catAnimation: AnimationDrawable

    private val options by lazy {
        NavOptions
            .Builder()
            .setEnterAnim(R.anim.slide_in_left)
            .setExitAnim(R.anim.slide_out_left)
            .setPopEnterAnim(R.anim.slide_in_right)
            .setPopExitAnim(R.anim.slide_out_right)
            .setPopUpTo(R.id.irLoginFragment, true)
            .build()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        startAnimation()

        actionSignUp.setOnClickListener { navigateToSignUp() }
    }

    private fun navigateToSignUp() {
        findNavController().navigate(R.id.irSignUpFragment, SignUpFragment().arguments, options)
    }

    private fun startAnimation() {
        imageTop.apply {
            setBackgroundResource(R.drawable.cat_animation)
            catAnimation = background as AnimationDrawable
        }
        catAnimation.start()
    }
}