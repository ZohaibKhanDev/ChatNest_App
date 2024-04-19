package com.example.chatnest.domain.model

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class Chat(
    val name:String,
    val lastMessage:String,
    val lastMessageIcon:ImageVector,
    val image:Painter,
    val date:String
)
