package com.iamnaran.beetle.presentation.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

private object Routes {

    const val LOGIN = "login"

    const val HOME = "home"

    const val PRODUCT_DETAIL = "productDetail/{${ArgParams.PRODUCT_ID}}"

}

private object ArgParams {

    const val PRODUCT_ID = "productId"
    fun toPath(param: String) = "{${param}}"

}

sealed class AppScreen(val route: String, val navArguments: List<NamedNavArgument> = emptyList()) {
    data object Login : AppScreen(Routes.LOGIN)
    data object Home : AppScreen(Routes.HOME)
    data object ProductDetail : AppScreen(
        route = Routes.PRODUCT_DETAIL,
        navArguments = listOf(navArgument(ArgParams.PRODUCT_ID) {
            type = NavType.Companion.StringType
        })
    ) {
        fun createRoute(productId: String) =
            Routes.PRODUCT_DETAIL
                .replace(
                    ArgParams.toPath(ArgParams.PRODUCT_ID), productId
                )
    }

}