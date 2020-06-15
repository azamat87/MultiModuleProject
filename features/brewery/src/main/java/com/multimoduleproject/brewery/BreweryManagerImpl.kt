package com.multimoduleproject.brewery

import com.multimoduleproject.brewery.dto.BreweryDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class BreweryManagerImpl
    @Inject constructor(private val breweryApi: BreweryApi): BreweryManager {

    override fun loadBrewery(id: String) {
         breweryApi.getBrewery(id).enqueue(object : Callback<BreweryDTO>{
             override fun onFailure(call: Call<BreweryDTO>, t: Throwable) {

             }

             override fun onResponse(call: Call<BreweryDTO>, response: Response<BreweryDTO>) {

             }
         })
    }
}