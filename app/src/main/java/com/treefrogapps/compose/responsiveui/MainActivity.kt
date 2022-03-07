package com.treefrogapps.compose.responsiveui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.treefrogapps.compose.responsiveui.ui.theme.AppThemedContent
import com.treefrogapps.compose.responsiveui.ui.theme.PreviewContent
import com.treefrogapps.compose.responsiveui.ui.theme.rememberWindowSize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppThemedContent(windowSize = rememberWindowSize()) {
                PreviewContent()
            }
        }
    }
}