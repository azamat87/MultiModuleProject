package com.multimoduleproject.core

interface MediatorsProvider {

    fun provideBreweryMediator(breweryMediator: BreweryMediator): BreweryMediator
}