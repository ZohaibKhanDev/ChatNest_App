package com.example.chatnest.presentation.ui.screen

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

@Composable
fun CameraScreen(navController: NavController) {
    val context= LocalContext.current
    LaunchedEffect(key1 = Unit) {
        Intent(Intent.ACTION_MAIN).also {
            it.`package`="com.google.android.youtube"
            try {
                context.startActivity(it)
            }catch (e:ActivityNotFoundException){
                e.printStackTrace()
            }
        }
    }
}