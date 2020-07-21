package com.multimoduleproject.brewery_list

import android.content.Context
import com.multimoduleproject.core.BreweryMediator

class BreweryMediatorImpl: BreweryMediator {
    override fun openBrewery(context: Context) {
        BreweriesActivity.startActivity(context)
    }
}