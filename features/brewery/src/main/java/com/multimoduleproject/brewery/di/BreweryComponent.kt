package com.multimoduleproject.brewery.di

import com.multimoduleproject.brewery.BreweryActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BreweryModule::class])
interface BreweryComponent {

    fun inject(breweryActivity: BreweryActivity)

}