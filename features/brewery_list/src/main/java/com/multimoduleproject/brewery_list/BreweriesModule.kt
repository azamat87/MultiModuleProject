package com.multimoduleproject.brewery_list

import dagger.Binds
import dagger.Module

@Module
interface BreweriesModule {

    @Binds
    fun bindBreweriesManager(breweryListManagerImpl: BreweryListManagerImpl): BreweryListManager

}