package com.tomtruyen.weatherapp.services

import android.content.Context
import android.content.res.Resources
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.tomtruyen.weatherapp.R
import com.tomtruyen.weatherapp.models.Weather
import okhttp3.*
import java.io.IOException

class WeatherService(private val mContext: Context) {
    var mLocation : String = ""

    private var mClient : OkHttpClient = OkHttpClient()
    private var mWeather: Weather? = null

    fun request() {
        val request = Request.Builder().url(mContext.getString(R.string.api_url) + mLocation).build()

        mClient.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                println("ERROR: ${e.message}")

                mWeather = null
                updateUI()
            }

            override fun onResponse(call: Call, response: Response) {
                if(response.isSuccessful) {
                    try {
                        mWeather = Gson().fromJson(response.body?.string(), Weather::class.java)
                    } catch (e: JsonSyntaxException) {}

                    updateUI()
                }
            }


        })
    }

    private fun updateUI() {
        if(mWeather == null) {
            // Show Error
            return
        }

        // Do other things
    }
}