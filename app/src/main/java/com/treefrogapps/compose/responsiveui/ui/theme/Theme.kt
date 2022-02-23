package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.colas.spf.ui.theme.Typography

private val DarkColorPalette: Colors by lazy {
    darkColors(
        primary = Purple200,
        primaryVariant = Purple700,
        secondary = Orange500
    )
}

private val LightColorPalette: Colors by lazy {
    lightColors(
        primary = Purple500,
        primaryVariant = Purple700,
        secondary = Orange500)
}

private val Boolean.providePalette: Colors
    get() = if (this) DarkColorPalette else LightColorPalette

@Composable
fun ThemedContent(
    windowSize: WindowSize,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit) {

    WithLocalWindowSize(windowSize = windowSize) {
        WithLocalDimens(windowSize = windowSize) {
            MaterialTheme(
                colors = darkTheme.providePalette,
                typography = Typography,
                shapes = Shapes,
                content = content)
        }
    }
}

