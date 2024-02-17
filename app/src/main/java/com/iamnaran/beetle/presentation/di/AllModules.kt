package com.iamnaran.beetle.presentation.di

val appDiComponents = listOf(
    AppModule.coroutineModule,
    NetworkModule.httpModule,
    NetworkModule.apiServiceModule,
    repositoryModule,
    viewModelModule,

    )