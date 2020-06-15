package com.multimoduleproject.brewery.di

import com.multimoduleproject.brewery.BreweryManager
import com.multimoduleproject.brewery.BreweryManagerImpl
import dagger.Binds
import dagger.Module

@Module
interface BreweryModule {

    @Binds
    fun bindManager(breweryManagerImpl: BreweryManagerImpl): BreweryManager

}