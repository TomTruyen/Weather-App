package com.tomtruyen.weatherapp.models

import com.google.gson.annotations.SerializedName

class Weather {
    @SerializedName("location")
    var location: WeatherLocation? = null
    @SerializedName("current")
    var current : WeatherDay? = null
    @SerializedName("forecast")
    var forecast: WeatherForecast? = null
}