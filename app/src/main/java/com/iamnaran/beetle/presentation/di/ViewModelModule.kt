package com.iamnaran.beetle.presentation.di

import com.iamnaran.beetle.presentation.ui.MainViewModel
import com.iamnaran.beetle.presentation.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object ViewModelModule {

    val vmModule = module {
        viewModel { MainViewModel(get()) }
        viewModel { HomeViewModel() }

    }

}


