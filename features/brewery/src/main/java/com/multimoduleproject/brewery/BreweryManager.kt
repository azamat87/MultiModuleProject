package com.multimoduleproject.brewery

import com.multimoduleproject.brewery.dto.BreweryDTO
import retrofit2.Call

interface BreweryManager {

    fun loadBrewery(id: String)

}