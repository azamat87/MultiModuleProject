package com.multimoduleproject.network.di

import com.multimoduleproject.core.NetworkProvider
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [HttpUrlModule::class, OkHttpModule::class, RetrofitModule::class])
interface NetworkComponent: NetworkProvider {


}