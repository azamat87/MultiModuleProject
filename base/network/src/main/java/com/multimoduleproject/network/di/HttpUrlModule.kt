package com.multimoduleproject.network.di

import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import javax.inject.Singleton

private const val DEBUG_URL = "https://www.openbrewerydb.org"

@Module
class HttpUrlModule {

    @Singleton
    @Provides
    fun provideHttpUrl() = HttpUrl.parse(DEBUG_URL)!!
}