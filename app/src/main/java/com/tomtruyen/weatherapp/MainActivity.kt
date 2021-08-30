package com.tomtruyen.weatherapp

import android.graphics.drawable.Animatable2
import android.graphics.drawable.Animatable2.AnimationCallback
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.tomtruyen.weatherapp.services.WeatherService

class MainActivity : AppCompatActivity() {
    private lateinit var mWeatherService : WeatherService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWeatherService = WeatherService(this)
        mWeatherService.mLocation = "Bree"
        mWeatherService.request()

        startAnimations()
    }

    private fun startAnimations(registerCallback: Boolean = true) {
        val drawable = findViewById<ImageView>(R.id.image).drawable as AnimatedVectorDrawable

        if(registerCallback) {
            drawable.registerAnimationCallback(object : AnimationCallback() {
                override fun onAnimationEnd(drawable: Drawable) {
                    startAnimations(false)
                }
            })
        }


        drawable.start()
    }
}