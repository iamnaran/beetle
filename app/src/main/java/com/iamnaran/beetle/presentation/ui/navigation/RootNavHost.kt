package com.iamnaran.beetle.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import com.iamnaran.beetle.presentation.ui.home.HomeScreen
import com.iamnaran.beetle.presentation.ui.start.SelectThemeScreen

@Composable
fun RootNavHost(navHostController: NavHostController) {
    SwipeDismissableNavHost(
        navController = navHostController,
        startDestination = AppScreen.Login.route
    ) {

        composable(AppScreen.Login.route) {
            SelectThemeScreen {
                navHostController.navigate(AppScreen.Home.route){

                }
            }
        }

        composable(AppScreen.Home.route) {
            HomeScreen {
                navHostController.navigateUp()
            }
        }


    }

}