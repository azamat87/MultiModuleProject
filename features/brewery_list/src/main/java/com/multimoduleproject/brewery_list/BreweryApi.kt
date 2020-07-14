package com.multimoduleproject.brewery_list

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BreweryApi {

    @GET("breweries")
    fun getBrewery(): Call<List<BreweryItem>>

} 