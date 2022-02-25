package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Orange500 = Color(0xFFFF9800)

val LightGray = Color(0xFFCCCCCC)
val DarkGreen700 = Color(0xFF388E3C)

private val DarkColorPalette: Colors by lazy {
    darkColors(
        primary = Purple200,
        primaryVariant = Purple700,
        secondary = Orange500)
}

private val LightColorPalette: Colors by lazy {
    lightColors(
        primary = Purple500,
        primaryVariant = Purple700,
        secondary = Orange500)
}

fun providePalette(darkPalette: Boolean): Colors = if (darkPalette) DarkColorPalette else LightColorPalette