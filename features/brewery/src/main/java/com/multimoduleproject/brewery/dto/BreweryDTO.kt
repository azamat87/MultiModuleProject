package com.multimoduleproject.brewery.dto

import com.google.gson.annotations.SerializedName

data class BreweryDTO (
    val id: Int,
    val name: String,
    @SerializedName("website_url")
    val website: String,
    val street: String,
    val city: String,
    val country: String
)