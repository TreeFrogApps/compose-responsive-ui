package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable

val Shapes
    @Composable get() = Shapes(
        small = RoundedCornerShape(dimens.small),
        medium = RoundedCornerShape(dimens.normal),
        large = RoundedCornerShape(dimens.large)
    )