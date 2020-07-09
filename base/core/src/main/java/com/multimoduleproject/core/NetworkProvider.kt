package com.multimoduleproject.core

import retrofit2.Retrofit

interface NetworkProvider {

    fun getRetrofit(): Retrofit

}