package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun StatusScreen(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(title = {
                    Text(text = "Privacy",  color = Color(0XFF007AFF), fontSize = MaterialTheme.typography.bodyLarge.fontSize,)
                    Text(text = "Status", modifier = Modifier.padding(start = 135.dp), fontSize = 20.sp, fontWeight = FontWeight.W400)
            }, colors = TopAppBarDefaults.topAppBarColors(Color(0XFFF6F6F6)))
        }
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "Status")
        }
    }
}