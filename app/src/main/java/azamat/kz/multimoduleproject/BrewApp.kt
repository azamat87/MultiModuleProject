package azamat.kz.multimoduleproject

import android.app.Application
import com.multimoduleproject.core.AbstractApp

class BrewApp: Application(), AbstractApp {

    companion object {
        private var appComponent: AppComponent? = null
    }

    override fun onCreate() {
        super.onCreate()

    }

    override fun getAppComponent(): AppComponent {
        return appComponent!!
    }

}