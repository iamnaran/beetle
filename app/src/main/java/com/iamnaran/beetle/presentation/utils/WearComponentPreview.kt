package com.iamnaran.beetle.presentation.utils

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.tooling.preview.devices.WearDevices

@Preview(
    apiLevel = 34,
    uiMode = Configuration.UI_MODE_TYPE_WATCH,
    device = WearDevices.SMALL_ROUND,
    showSystemUi = true
)
annotation class BeetleWearPreview