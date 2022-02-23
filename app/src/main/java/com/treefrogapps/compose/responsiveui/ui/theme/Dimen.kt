package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.runtime.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.treefrogapps.compose.responsiveui.ui.theme.WindowSize.Companion.isMedium
import com.treefrogapps.compose.responsiveui.ui.theme.WindowSize.Companion.isSmall

class Dimens(
    val none: Dp = 0.dp,
    val one: Dp = 1.dp,
    val tiny: Dp = 4.dp,
    val small: Dp = 8.dp,
    val normal: Dp = 16.dp,
    val large: Dp = 24.dp,
    val big: Dp = 32.dp,
    val massive: Dp = 48.dp,
    val gigantic: Dp = 64.dp,
    val enormous: Dp = 128.dp,
    val thumbnail: Dp = 164.dp)

private val smallDimens: Dimens = Dimens()
private val mediumDimens: Dimens = Dimens(
    tiny = 6.dp,
    small = 10.dp,
    normal = 20.dp,
    large = 28.dp,
    big = 36.dp,
    massive = 54.dp,
    gigantic = 72.dp,
    enormous = 148.dp,
    thumbnail = 180.dp)
private val largeDimens: Dimens = Dimens(
    tiny = 8.dp,
    small = 12.dp,
    normal = 24.dp,
    large = 32.dp,
    big = 40.dp,
    massive = 60.dp,
    gigantic = 80.dp,
    enormous = 160.dp,
    thumbnail = 196.dp)

private val LocalAppDimens = staticCompositionLocalOf { smallDimens }

val dimens: Dimens
    @ReadOnlyComposable
    @Composable
    get() = LocalAppDimens.current

@Composable
fun WithLocalDimens(
    windowSize: WindowSize,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        values = arrayOf(LocalAppDimens provides remember { windowSize.toDimens() }),
        content = content)
}

private fun WindowSize.toDimens(): Dimens =
    when {
        isSmall()  -> smallDimens
        isMedium() -> mediumDimens
        else       -> largeDimens
    }

