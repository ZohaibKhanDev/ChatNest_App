package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chatnest.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ChatsScreen(navController: NavController) {

    Scaffold (topBar = {
        CenterAlignedTopAppBar(title = {
            Text(text = "Chats", fontSize = 18.sp, fontWeight = FontWeight.W500)


        },
            navigationIcon = {
                Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start){
                    Text(
                        text = "Edit",
                        color = Color(0XFF007AFF),
                        modifier = Modifier.padding(end = 130.dp), fontSize = 16.sp
                    )
                }
            }, colors = TopAppBarDefaults.topAppBarColors(Color(0XFFF6F6F6)),

            actions = {
               Image(painter = painterResource(id = R.drawable.edit), contentDescription ="", contentScale = ContentScale.Crop, modifier = Modifier.size(24.dp) )
            }
            )
    }){
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "Chats")
        }
    }
    
}