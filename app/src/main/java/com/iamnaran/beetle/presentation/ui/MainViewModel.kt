package com.iamnaran.beetle.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamnaran.beetle.presentation.data.repo.AuthRepository
import com.iamnaran.beetle.presentation.utils.AppLog
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainViewModel(private val authRepository: AuthRepository) : ViewModel() {


    public fun doApiRequest() {
        AppLog.showLog("Api Requesting..")
        viewModelScope.launch {
            authRepository.serverLogin("kminchelle", "0lelplR")
                .catch {
                    AppLog.showLog("Called Error Catch")
                }
                .collectLatest {
                    AppLog.showLog("Called Success")

                }

        }

    }

}