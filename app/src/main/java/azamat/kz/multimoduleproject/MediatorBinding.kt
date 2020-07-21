package azamat.kz.multimoduleproject

import com.multimoduleproject.brewery_list.BreweryMediatorImpl
import com.multimoduleproject.core.BreweryMediator
import dagger.Binds
import dagger.Module

@Module
interface MediatorBinding {

    @Binds
    fun bindBreweriesMediator(breweryMediator: BreweryMediatorImpl): BreweryMediator
}