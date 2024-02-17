package com.iamnaran.beetle.presentation.di

import com.iamnaran.beetle.presentation.data.repo.HomeRepository
import com.iamnaran.beetle.presentation.data.repo.HomeRepositoryImpl
import com.iamnaran.beetle.presentation.data.remote.api.AuthApiService
import org.koin.dsl.module

object RepositoryModule {

    val repoModule = module {
        single<HomeRepository> { provideHomeRepository(get()) }
    }

    private fun provideHomeRepository(api: AuthApiService): HomeRepository {
        return HomeRepositoryImpl(api)
    }

}