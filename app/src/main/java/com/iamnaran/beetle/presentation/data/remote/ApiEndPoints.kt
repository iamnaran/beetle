package com.iamnaran.beetle.presentation.data.remote

object ApiEndPoints {
//    const val DEFAULT_PAGE_SIZE = BuildConfig

    // yep--no slash at unlike retrofit :)
    private const val BASE_URL = "https://dummyjson.com"

    //auth
    const val LOGIN_URL = "$BASE_URL/login"


    //products
    const val PRODUCTS_URL = "$BASE_URL/products"

}