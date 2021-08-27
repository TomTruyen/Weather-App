package com.tomtruyen.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tomtruyen.weatherapp.services.WeatherService

class MainActivity : AppCompatActivity() {
    private lateinit var mWeatherService : WeatherService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWeatherService = WeatherService(this)
        mWeatherService.mLocation = "Bree"
        mWeatherService.request()
    }
}