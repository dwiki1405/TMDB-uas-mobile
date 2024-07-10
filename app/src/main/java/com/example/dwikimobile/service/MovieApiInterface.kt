package com.example.dwikimobile.service

import com.example.dwikimobile.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=dad3e32464c984733cb703ea4ef91f58")
    fun getMovieList(): Call<MovieResponse>

}