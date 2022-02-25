package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun ThemedContent(
    windowSize: WindowSize,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    WithLocalWindowSize(windowSize = windowSize) {
        WithLocalDimens(windowSize = windowSize) {
            MaterialTheme(
                colors = providePalette(darkTheme),
                typography = Typography,
                shapes = Shapes,
                content = content)
        }
    }
}


