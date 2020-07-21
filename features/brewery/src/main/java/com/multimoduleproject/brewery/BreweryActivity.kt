package com.multimoduleproject.brewery

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.multimoduleproject.core.AbstractApp
import com.multimoduleproject.core.BreweryMediator
import javax.inject.Inject

class BreweryActivity : AppCompatActivity() {

    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, BreweryActivity::class.java))
        }
    }

    @Inject lateinit var breweryMediator: BreweryMediator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brewery)

        breweryMediator.openBrewery(this)

    }
}
