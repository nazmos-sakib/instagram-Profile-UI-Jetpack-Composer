package com.example.instagram_ui_jetpack_composer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagram_ui_jetpack_composer.ui.ProfileScreen
import com.example.instagram_ui_jetpack_composer.ui.theme.InstagramUIJetpackcomposerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InstagramUIJetpackcomposerTheme {
        ProfileScreen()
    }
}