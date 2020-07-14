package com.multimoduleproject.brewery_list

import javax.inject.Inject

class BreweryListManagerImpl
    @Inject constructor(private val breweryApi: BreweryApi) : BreweryListManager {

    override fun getBreweries() {
        breweryApi.getBrewery()
    }
}