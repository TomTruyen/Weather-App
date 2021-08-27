package com.tomtruyen.weatherapp.models

import com.google.gson.annotations.SerializedName

class WeatherForecast {
    @SerializedName("forecastday")
    var days : List<WeatherForecastDay> = arrayListOf()

    inner class WeatherForecastDay {
        @SerializedName("date")
        var date : String? = ""
        @SerializedName("date_epoch")
        var dateEpoch : Int = 0
        @SerializedName("day")
        var day : WeatherDay? = null
        @SerializedName("astro")
        var astronomy : Astronomy? = null

     inner class Astronomy {
         @SerializedName("sunrise")
         var sunrise : String? = ""
         @SerializedName("sunset")
         var sunset: String? = ""
         @SerializedName("moonrise")
         var moonrise : String? = ""
         @SerializedName("moonset")
         var moonset : String? = ""
         @SerializedName("moon_phase")
         var moonPhase: String? = ""
         @SerializedName("moon_illumination")
         var moonIllumination : String? = ""
     }
    }
}