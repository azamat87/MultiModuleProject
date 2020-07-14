package com.multimoduleproject.brewery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.multimoduleproject.core.AbstractApp

class BreweryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brewery)

        application as AbstractApp

    }
}
