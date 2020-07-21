package azamat.kz.multimoduleproject

import com.multimoduleproject.core.AppProvider
import dagger.Component

@Component(modules = [MediatorBinding::class ])
interface AppComponent: AppProvider{

}