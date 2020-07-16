package com.multimoduleproject.brewery_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.multimoduleproject.core.AbstractApp
import com.multimoduleproject.core.AppProvider

class BreweriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breweries)
        val networkProvider = (application as AbstractApp).getAppComponent()
        BreweriesComponent.create(networkProvider ).inject(this)
    }
}
