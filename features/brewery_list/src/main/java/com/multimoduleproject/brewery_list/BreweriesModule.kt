package com.multimoduleproject.brewery_list

import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class BreweriesModule {

//    @Binds
//    fun bindBreweriesManager(breweryListManagerImpl: BreweryListManagerImpl): BreweryListManager

    @Provides
    fun provideBreweriesManager(breweryApi: BreweryApi): BreweryListManager{
        return BreweryListManagerImpl(breweryApi )
    }

    @Provides
    fun provideApi(retrofit: Retrofit): BreweryApi{
        return retrofit.create(BreweryApi::class.java)
    }

}