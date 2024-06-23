package com.example.instagram_ui_jetpack_composer

import android.media.Image
import androidx.compose.ui.graphics.painter.Painter

data class StoryHighlight(
    val image: Painter,
    val text: String
)
