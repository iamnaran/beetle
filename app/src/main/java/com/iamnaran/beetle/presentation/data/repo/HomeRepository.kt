package com.iamnaran.beetle.presentation.data.repo

import com.iamnaran.beetle.presentation.data.remote.api.AuthApiService

interface HomeRepository {
    fun getUserName(name: String): String
}

class HomeRepositoryImpl(authApiService: AuthApiService) : HomeRepository {
    override fun getUserName(name: String): String {

        return "hello world"
    }


}