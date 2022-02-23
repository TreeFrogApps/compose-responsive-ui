package com.treefrogapps.compose.responsiveui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Window ${windowSize.name}")
        Text(text = "Dimen tiny ${dimens.tiny}")
        Text(text = "Dimen small ${dimens.small}")
        Text(text = "Dimen normal ${dimens.normal}")
        Text(text = "Dimen large ${dimens.large}")
        Text(text = "Dimen big ${dimens.big}")
        Text(text = "Dimen massive ${dimens.massive}")
        Text(text = "Dimen gigantic ${dimens.gigantic}")
        Text(text = "Dimen enormous ${dimens.enormous}")
        Text(text = "Dimen thumbnail ${dimens.thumbnail}")
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun DefaultPreview() {
    ThemedContent(windowSize = WindowSize.LargeLandscape) {
        WindowAndDimens()
    }
}