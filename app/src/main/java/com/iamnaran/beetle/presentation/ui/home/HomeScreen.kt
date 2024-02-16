package com.iamnaran.beetle.presentation.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.iamnaran.beetle.R

@Composable
fun HomeScreen(navigateToLogin: () -> Unit) {

    Column(modifier = Modifier.fillMaxWidth()) {

        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colors.primary,
            text = stringResource(R.string.hello_world, "iamnaran")
        )

        Button(onClick = {
            navigateToLogin()
        }) {
            Text(text = "Next")
        }

    }

}