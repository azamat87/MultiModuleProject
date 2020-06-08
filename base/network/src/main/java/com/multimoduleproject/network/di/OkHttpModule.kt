package com.multimoduleproject.network.di

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.Protocol
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

private const val TIMEOUT_CONNECTION_SECONDS = 10L
private const val TIMEOUT_IO_OPERATION_SECONDS = 10L

@Module
class OkHttpModule {

    @Provides
    @Singleton
    fun provideOkHttpBuilder(
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .followRedirects(true)
            .connectTimeout(TIMEOUT_CONNECTION_SECONDS, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_IO_OPERATION_SECONDS, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT_IO_OPERATION_SECONDS, TimeUnit.SECONDS)
            .protocols(listOf(Protocol.HTTP_1_1))
        return builder.build()
    }
}