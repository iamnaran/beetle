package com.iamnaran.beetle.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.material.Vignette
import androidx.wear.compose.material.VignettePosition
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.iamnaran.beetle.presentation.theme.BeetleTheme
import com.iamnaran.beetle.presentation.ui.navigation.RootNavHost
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {


    private val mainViewModel: MainViewModel by viewModel<MainViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        mainViewModel.doApiRequest()
        super.onCreate(savedInstanceState)

        setTheme(android.R.style.Theme_DeviceDefault)

        setContent {
            BeetleTheme {

                val navController = rememberSwipeDismissableNavController()
                MainContent(navController)
            }

        }
    }
}


@Composable
fun MainContent(navController: NavHostController) {
    Scaffold(
        timeText = {
            TimeText()
        },
        vignette = {
            Vignette(vignettePosition = VignettePosition.TopAndBottom)
        },
        positionIndicator = {
//            PositionIndicator(
//                scalingLazyListState = scalingLazyListState
//            )
        }
    ) {
        RootNavHost(navHostController = navController)
    }

}


@Preview(device = Devices.WEAR_OS_SQUARE, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MainContent(rememberSwipeDismissableNavController())
}