package com.multimoduleproject.brewery_list

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.multimoduleproject.core.AbstractApp
import com.multimoduleproject.core.AppProvider

class BreweriesActivity : AppCompatActivity() {

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, BreweriesActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breweries)
        val networkProvider = (application as AbstractApp).getAppComponent()
        BreweriesComponent.create(networkProvider ).inject(this)
    }
}
