package com.tomtruyen.weatherapp.models

import com.google.gson.annotations.SerializedName

class WeatherCondition {
    @SerializedName("text")
    var text : String? = ""
    @SerializedName("icon")
    var icon : String? = ""
    @SerializedName("code")
    var code : Int = 0
}