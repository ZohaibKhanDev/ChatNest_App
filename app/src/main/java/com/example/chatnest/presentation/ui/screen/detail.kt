package com.example.chatnest.presentation.ui.screen

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.chatnest.ui.theme.ChatNestTheme

class SecondActivity:ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatNestTheme {
                Text(text = "SecondActivity")
            }
        }
    }
}