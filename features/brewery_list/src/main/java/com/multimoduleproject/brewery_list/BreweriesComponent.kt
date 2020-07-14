package com.multimoduleproject.brewery_list

import com.multimoduleproject.core.NetworkProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [NetworkProvider::class],
    modules = [BreweriesModule::class])
interface BreweriesComponent {

    companion object {
        fun create(networkProvider: NetworkProvider): BreweriesComponent{
            return DaggerBreweriesComponent.builder().networkProvider(networkProvider).build()
        }
    }

    fun inject(breweriesActivity: BreweriesActivity)

}