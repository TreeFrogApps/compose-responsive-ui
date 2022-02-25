package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable

val Shapes
    @Composable get() = Shapes(
        small = RoundedCornerShape(dimens.spacing.small),
        medium = RoundedCornerShape(dimens.spacing.normal),
        large = RoundedCornerShape(dimens.spacing.large)
    )