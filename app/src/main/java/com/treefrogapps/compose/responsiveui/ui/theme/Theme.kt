package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable


object AppTheme {

    val dimens: Dimens
        @ReadOnlyComposable
        @Composable
        get() = LocalAppDimens.current

    val windowSize: WindowSize
        @ReadOnlyComposable
        @Composable
        get() = LocalWindowSize.current

    val colors: Colors
        @ReadOnlyComposable
        @Composable
        get() = MaterialTheme.colors

    val typography: Typography
        @ReadOnlyComposable
        @Composable
        get() = MaterialTheme.typography

    val shapes: Shapes
        @ReadOnlyComposable
        @Composable
        get() = MaterialTheme.shapes
}

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


