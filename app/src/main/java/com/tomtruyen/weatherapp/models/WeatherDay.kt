package com.tomtruyen.weatherapp.models

import com.google.gson.annotations.SerializedName

class WeatherDay {
    @SerializedName("last_updated_epoch")
    var lastUpdatedEpoch : Int = 0
    @SerializedName("last_updated")
    var lastUpdated : String? = ""
    @SerializedName("temp_c")
    var temperatureCelsius : Double = 0.0
    @SerializedName("temp_f")
    var temperatureFahrenheit : Double = 0.0
    @SerializedName("condition")
    var condition: WeatherCondition? = null
    @SerializedName("wind_mph")
    var windMph : Double = 0.0
    @SerializedName("wind_kph")
    var windKph : Double = 0.0
    @SerializedName("wind_degree")
    var windDegree: Int = 0
    @SerializedName("wind_dir")
    var windDirection : String? = ""
    @SerializedName("pressure_mb")
    var pressureMillibar : Int = 0
    @SerializedName("pressure_in")
    var pressureIn : Double = 0.0
    @SerializedName("precip_mm")
    var precipitationMillimeter : Double = 0.0
    @SerializedName("precip_in")
    var precipitationInch : Double = 0.0
    @SerializedName("humidity")
    var humidityPercentage : Int = 0
    @SerializedName("cloud")
    var cloudPercentage : Int = 0
    @SerializedName("feelslike_c")
    var feelingCelsius : Double = 0.0
    @SerializedName("feelslike_f")
    var feelingFahrenheit : Double = 0.0
    @SerializedName("vis_km")
    var visionKm : Double = 0.0
    @SerializedName("vis_miles")
    var visionMiles : Double = 0.0
    @SerializedName("uv")
    var uv : Double = 0.0
    @SerializedName("gust_mph")
    var gustMph : Double = 0.0
    @SerializedName("gust_kph")
    var gustKph : Double = 0.0
}