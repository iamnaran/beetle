package com.iamnaran.beetle.presentation.di

import com.iamnaran.beetle.presentation.ui.MainViewModel
import com.iamnaran.beetle.presentation.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
    viewModel { HomeViewModel() }

}


