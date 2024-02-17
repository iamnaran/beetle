package com.iamnaran.beetle.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamnaran.beetle.presentation.data.repo.AuthRepository
import com.iamnaran.beetle.presentation.utils.AppLog
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class MainViewModel(private val authRepository: AuthRepository) : ViewModel() {


    init {
        doApiRequest()
    }

    private fun doApiRequest() {
        viewModelScope.launch {
            authRepository.serverLogin("kminchelle", "0lelplR")
                .catch {
                    AppLog.showLog("Called Error Catch")
                }
                .collect {
                    AppLog.showLog("Called Success")

                }

        }

    }

}