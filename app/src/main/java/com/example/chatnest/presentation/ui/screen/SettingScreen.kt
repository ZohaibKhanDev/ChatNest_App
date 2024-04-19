package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.BottomAppBar
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chatnest.R
import com.example.chatnest.domain.model.Screen

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SettingScreen(navController: NavController) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = {
                Text(text = "Chats", fontSize = 19.sp, fontWeight = FontWeight.W500)
            },
            navigationIcon = {

                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "",
                    tint = Color(0XFF007AFF)
                )
                Text(
                    text = "Setting",
                    color = Color(0XFF007AFF),
                    modifier = Modifier.padding(start = 20.dp)
                )
            }, colors = TopAppBarDefaults.topAppBarColors(Color(0XFFF6F6F6))
        )
    },bottomBar = {
        BottomAppBar(containerColor = Color.White) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.clickable {
                        navController.navigate(
                            Screen.Status.route
                        )
                    }) {
                    Image(
                        painter = painterResource(id = R.drawable.status),
                        contentDescription = "",
                        modifier = Modifier
                            .width(17.dp)
                            .height(17.dp), colorFilter = ColorFilter.tint(Color.DarkGray)
                    )
                    Text(
                        text = "Status",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.DarkGray
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.clickable { navController.navigate(Screen.Calls.route) }) {
                    Image(
                        painter = painterResource(id = R.drawable.call),
                        contentDescription = "",
                        modifier = Modifier
                            .width(17.dp)
                            .height(17.dp), colorFilter = ColorFilter.tint(Color.DarkGray)
                    )
                    Text(text = "Calls", fontSize = 12.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.clickable { navController.navigate(Screen.Camera.route) }) {
                    Image(
                        painter = painterResource(id = R.drawable.camera),
                        contentDescription = "",
                        modifier = Modifier
                            .width(17.dp)
                            .height(17.dp),
                    )
                    Text(text = "Camera", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.clickable { navController.navigate(Screen.Chats.route) }) {
                    Image(
                        painter = painterResource(id = R.drawable.chat),
                        contentDescription = "",
                        modifier = Modifier
                            .width(17.dp)
                            .height(17.dp), colorFilter = ColorFilter.tint(Color.DarkGray)
                    )
                    Text(text = "Chats", fontSize = 12.sp, fontWeight = FontWeight.Medium, color = Color.DarkGray)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.clickable { navController.navigate(Screen.Settings.route) }) {
                    Image(
                        painter = painterResource(id = R.drawable.setting),
                        contentDescription = "",
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp), colorFilter = ColorFilter.tint(Color(0XFF007AFF))
                    )
                    Text(text = "Setting", fontSize = 12.sp, fontWeight = FontWeight.Medium, color = Color(0XFF007AFF))
                }

            }
        }

    }) {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "Setting")
        }
    }
}