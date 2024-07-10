package com.example.dwikimobile.service

import com.example.dwikimobile.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=dad3e32464c984733cb703ea4ef91f58")
    fun getTVList(): Call<TelevisionResponse>

}