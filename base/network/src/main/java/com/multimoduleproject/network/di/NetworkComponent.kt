package com.multimoduleproject.network.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [HttpUrlModule::class, OkHttpModule::class, RetrofitModule::class])
interface NetworkComponent {



}