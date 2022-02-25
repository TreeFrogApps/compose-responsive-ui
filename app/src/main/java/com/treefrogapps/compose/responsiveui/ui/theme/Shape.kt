package com.treefrogapps.compose.responsiveui.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable

val Shapes
    @Composable get() = Shapes(
        small = RoundedCornerShape(AppTheme.dimens.spacing.small),
        medium = RoundedCornerShape(AppTheme.dimens.spacing.normal),
        large = RoundedCornerShape(AppTheme.dimens.spacing.large)
    )