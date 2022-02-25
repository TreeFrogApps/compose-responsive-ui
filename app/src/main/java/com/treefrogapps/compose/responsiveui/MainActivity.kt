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
        Text("Window ${windowSize.name}")
        Spacer(modifier = Modifier.height(dimens.spacing.normal))
        Text(text = "Dimen zero ${dimens.zero}")
        Text(text = "Dimen hairline ${dimens.hairline}")
        Text(text = "Dimen one ${dimens.one}")
        Text(text = "Dimen elevation ${dimens.elevation.normal}")
        Text(text = "Dimen elevation high ${dimens.elevation.high}")
        Text(text = "Dimen elevation highest ${dimens.elevation.highest}")
        Text(text = "Dimen spacing tiny ${dimens.spacing.tiny}")
        Text(text = "Dimen spacing small ${dimens.spacing.small}")
        Text(text = "Dimen spacing normal ${dimens.spacing.normal}")
        Text(text = "Dimen spacing large ${dimens.spacing.large}")
        Text(text = "Dimen spacing big ${dimens.spacing.big}")
        Text(text = "Dimen spacing massive ${dimens.spacing.massive}")
        Text(text = "Dimen spacing gigantic ${dimens.spacing.gigantic}")
        Text(text = "Dimen spacing enormous ${dimens.spacing.enormous}")
        Text(text = "Dimen icon minuscule ${dimens.icon.minuscule}")
        Text(text = "Dimen icon small ${dimens.icon.small}")
        Text(text = "Dimen icon notification ${dimens.icon.notification}")
        Text(text = "Dimen icon normal ${dimens.icon.normal}")
        Text(text = "Dimen icon large ${dimens.icon.large}")
        Text(text = "Dimen icon big ${dimens.icon.big}")
        Text(text = "Dimen icon massive ${dimens.icon.massive}")
        Text(text = "Dimen icon enormous ${dimens.icon.enormous}")
        Text(text = "Dimen icon thumbnail ${dimens.icon.thumbnail}")
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