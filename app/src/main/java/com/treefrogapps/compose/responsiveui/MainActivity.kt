package com.treefrogapps.compose.responsiveui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.treefrogapps.compose.responsiveui.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemedContent(windowSize = rememberWindowSize()) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    WindowAndDimens()
                }
            }
        }
    }
}

@Composable
fun WindowAndDimens() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Window ${AppTheme.windowSize.name}")
        Spacer(modifier = Modifier.height(AppTheme.dimens.spacing.normal))
        Text(text = "Dimen zero ${AppTheme.dimens.zero}")
        Text(text = "Dimen hairline ${AppTheme.dimens.hairline}")
        Text(text = "Dimen one ${AppTheme.dimens.one}")
        Text(text = "Dimen elevation ${AppTheme.dimens.elevation.normal}")
        Text(text = "Dimen elevation high ${AppTheme.dimens.elevation.high}")
        Text(text = "Dimen elevation highest ${AppTheme.dimens.elevation.highest}")
        Text(text = "Dimen spacing tiny ${AppTheme.dimens.spacing.tiny}")
        Text(text = "Dimen spacing small ${AppTheme.dimens.spacing.small}")
        Text(text = "Dimen spacing normal ${AppTheme.dimens.spacing.normal}")
        Text(text = "Dimen spacing large ${AppTheme.dimens.spacing.large}")
        Text(text = "Dimen spacing big ${AppTheme.dimens.spacing.big}")
        Text(text = "Dimen spacing massive ${AppTheme.dimens.spacing.massive}")
        Text(text = "Dimen spacing gigantic ${AppTheme.dimens.spacing.gigantic}")
        Text(text = "Dimen spacing enormous ${AppTheme.dimens.spacing.enormous}")
        Text(text = "Dimen icon minuscule ${AppTheme.dimens.icon.minuscule}")
        Text(text = "Dimen icon small ${AppTheme.dimens.icon.small}")
        Text(text = "Dimen icon notification ${AppTheme.dimens.icon.notification}")
        Text(text = "Dimen icon normal ${AppTheme.dimens.icon.normal}")
        Text(text = "Dimen icon large ${AppTheme.dimens.icon.large}")
        Text(text = "Dimen icon big ${AppTheme.dimens.icon.big}")
        Text(text = "Dimen icon massive ${AppTheme.dimens.icon.massive}")
        Text(text = "Dimen icon enormous ${AppTheme.dimens.icon.enormous}")
        Text(text = "Dimen icon thumbnail ${AppTheme.dimens.icon.thumbnail}")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4_XL)
@Composable
fun DefaultPreview() {
    ThemedContent(windowSize = WindowSize.SmallPortrait) {
        WindowAndDimens()
    }
}