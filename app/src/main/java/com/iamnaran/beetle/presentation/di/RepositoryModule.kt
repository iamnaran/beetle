package com.iamnaran.beetle.presentation.di

import com.iamnaran.beetle.presentation.data.repo.AuthRepository
import com.iamnaran.beetle.presentation.data.repo.AuthRepositoryImpl
import com.iamnaran.beetle.presentation.data.repo.HomeRepository
import com.iamnaran.beetle.presentation.data.repo.HomeRepositoryImpl
import org.koin.dsl.module


val repositoryModule = module {
    single<HomeRepository> { HomeRepositoryImpl(get()) }
    single<AuthRepository> { AuthRepositoryImpl(get()) }
}