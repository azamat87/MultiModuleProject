package com.multimoduleproject.brewery

import com.multimoduleproject.brewery.dto.BreweryDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BreweryApi {

    @GET("breweries/{brewery}")
    fun getBrewery(@Path("brewery") id: String): Call<BreweryDTO>

}