package azamat.kz.multimoduleproject.modules

import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Singleton
    @Provides
    fun provideRetrofit(
        builder: Retrofit.Builder,
        okHttpClient: OkHttpClient,
        httpUrl: HttpUrl
    ): Retrofit {
        return builder
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(httpUrl)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder()
    }

}