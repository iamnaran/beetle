package com.iamnaran.beetle.presentation.data.repo

import com.iamnaran.beetle.presentation.data.model.User
import com.iamnaran.beetle.presentation.data.remote.api.AuthApiService
import com.iamnaran.beetle.presentation.utils.ApiResponse
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun serverLogin(username: String, password: String): Flow<ApiResponse<User>>
}

class AuthRepositoryImpl(private val authApiService: AuthApiService) : AuthRepository {
    override suspend fun serverLogin(username: String, password: String): Flow<ApiResponse<User>> {

        return authApiService.serverLoginWithFlow(username, password)
    }


}