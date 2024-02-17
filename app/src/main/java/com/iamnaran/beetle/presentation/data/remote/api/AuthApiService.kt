package com.iamnaran.beetle.presentation.data.remote.api

import com.iamnaran.beetle.presentation.data.model.User
import com.iamnaran.beetle.presentation.data.remote.ApiEndPoints
import com.iamnaran.beetle.presentation.utils.ApiResponse
import com.iamnaran.beetle.presentation.utils.safeRequest
import com.iamnaran.beetle.presentation.utils.safeRequestWithFlow
import io.ktor.client.HttpClient
import io.ktor.client.request.forms.formData
import io.ktor.client.request.parameter
import io.ktor.client.request.url
import io.ktor.http.HttpMethod
import kotlinx.coroutines.flow.Flow

interface AuthApiService {
    suspend fun serverLogin(username: String, password: String): ApiResponse<User>

    suspend fun serverLoginWithFlow(username: String, password: String): Flow<ApiResponse<User>>
}

class AuthApiServiceImpl(private val httpClient: HttpClient) : AuthApiService {

    override suspend fun serverLogin(username: String, password: String): ApiResponse<User> {
        return httpClient.safeRequest {
            method = HttpMethod.Get
            url(ApiEndPoints.LOGIN_URL)
            formData {
                parameter("username", username)
                parameter("password", password)
            }
        }
    }

    override suspend fun serverLoginWithFlow(
        username: String,
        password: String
    ): Flow<ApiResponse<User>> = httpClient.safeRequestWithFlow {
        method = HttpMethod.Get
        url(ApiEndPoints.LOGIN_URL)
        formData {
            parameter("username", username)
            parameter("password", password)
        }

    }


//    override fun getQuotes(category: String, limit: Int): Flow<ApiResult<List<Quote>>> = flow{
//        try {
//            emit(ApiResult.Success(httpClient.get("/v1/quotes"){
//                parameter("category",category)
//                parameter("limit",limit)
//            }.body()))
//        }catch (e:Exception){
//            e.printStackTrace()
//            emit(ApiResult.Error(e.message ?: "Something went wrong"))
//        }
//    }

}
