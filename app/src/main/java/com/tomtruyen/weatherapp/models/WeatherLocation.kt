package com.tomtruyen.weatherapp.models

import com.google.gson.annotations.SerializedName

class WeatherLocation {
    @SerializedName("name")
    var name: String? = ""
    @SerializedName("region")
    var region: String? = ""
    @SerializedName("country")
    var country : String? = ""
    @SerializedName("lat")
    var latitude: Double = 0.0
    @SerializedName("lon")
    var longitude : Double = 0.0
    @SerializedName("tz_id")
    var timezoneId : String? = ""
    @SerializedName("localtime_epoch")
    var localtimeEpoch : Int = 0
    @SerializedName("localtime")
    var localtime : String? = ""
}