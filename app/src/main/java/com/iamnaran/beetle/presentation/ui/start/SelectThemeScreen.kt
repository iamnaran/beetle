package com.iamnaran.beetle.presentation.ui.start

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.LightMode
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.AutoCenteringParams
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.ScalingLazyListState
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.PositionIndicator
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.material.Vignette
import androidx.wear.compose.material.VignettePosition
import com.iamnaran.beetle.presentation.utils.BeetleWearPreview

@Composable
fun SelectThemeScreen(navigateToMain: () -> Unit) {

    val scalingLazyListState = rememberScalingLazyListState()

    Scaffold(
        timeText = {
            TimeText()
        },
        vignette = {
            Vignette(vignettePosition = VignettePosition.TopAndBottom)
        },
        positionIndicator = {
            PositionIndicator(
                scalingLazyListState = scalingLazyListState
            )
        }
    ) {
        LoginContent(navigateToMain, scalingLazyListState)
    }

}

@Composable
fun LoginContent(navigateToMain: () -> Unit, scalingLazyListState: ScalingLazyListState) {
    val contentModifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 8.dp)
    val iconModifier = Modifier
        .size(24.dp)
        .wrapContentSize(align = Alignment.Center)


    ScalingLazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            top = 32.dp,
            start = 8.dp,
            end = 8.dp,
            bottom = 32.dp
        ),
        verticalArrangement = Arrangement.Bottom,
        state = scalingLazyListState,
        autoCentering = AutoCenteringParams(itemIndex = 1)
    ) {

        item {
            HeaderText(contentModifier)

        }

        item {
            LanguageChipContainer(contentModifier, iconModifier, navigateToMain)
        }


    }
}

@Composable
fun LanguageChipContainer(
    modifier: Modifier,
    iconModifier: Modifier,
    navigateToMain: () -> Unit
) {
    Column {
        Chip(
            modifier = modifier,
            onClick = {
                navigateToMain()
            },
            label = {
                Text(
                    text = "Dark Mode",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            },
            icon = {
                Icon(
                    imageVector = Icons.Rounded.DarkMode,
                    contentDescription = "dark mode action",
                    modifier = iconModifier
                )
            },
        )
        Chip(
            modifier = modifier,
            onClick = {
                navigateToMain()
            },
            label = {
                Text(
                    text = "Light Mode",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            },
            icon = {
                Icon(
                    imageVector = Icons.Rounded.LightMode,
                    contentDescription = "light action",
                    modifier = iconModifier
                )
            },
        )
    }

}


@Composable
fun HeaderText(modifier: Modifier) {

    Column {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            style = MaterialTheme.typography.caption1,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.primary,
            text = "Select a theme"
        )

    }

}

@BeetleWearPreview
@Composable
fun LoginPreview() {
    SelectThemeScreen() {


    }
}