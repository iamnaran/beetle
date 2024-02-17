package com.iamnaran.beetle.presentation.theme

import android.os.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.wear.compose.material.Colors
import androidx.wear.compose.material.MaterialTheme
import initialThemeValues

@Composable
fun BeetleTheme(
    colors: Colors = initialThemeValues.colors,
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colors = colors,
        typography = BeetleTypography,
        content = content
    )
}
