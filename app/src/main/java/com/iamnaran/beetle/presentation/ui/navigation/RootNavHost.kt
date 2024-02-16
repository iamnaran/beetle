package com.iamnaran.beetle.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import com.iamnaran.beetle.presentation.ui.login.LoginScreen

@Composable
fun RootNavHost(navHostController: NavHostController) {
    SwipeDismissableNavHost(
        navController = navHostController,
        startDestination = AppScreen.Login.route
    ) {

        composable(AppScreen.Login.route) {
            LoginScreen {
                navHostController.navigate(AppScreen.Home.route)
            }
        }

        composable(AppScreen.Home.route) {
            LoginScreen {
                navHostController.navigate(AppScreen.Login.route)
            }
        }


    }

}