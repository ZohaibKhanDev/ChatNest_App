package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
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
fun StatusScreen(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    text = "Privacy",
                    color = Color(0XFF007AFF),
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                )
                Text(
                    text = "Status",
                    modifier = Modifier.padding(start = 135.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W400
                )
            }, colors = TopAppBarDefaults.topAppBarColors(Color(0XFFF6F6F6)))
        }, bottomBar = {
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
                                .height(17.dp), colorFilter = ColorFilter.tint(Color(0XFF007AFF))
                        )
                        Text(
                            text = "Status",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0XFF007AFF)
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
                        Text(text = "Calls", fontSize = 12.sp, fontWeight = FontWeight.Medium)
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
                                .height(17.dp)
                        )
                        Text(text = "Chats", fontSize = 12.sp, fontWeight = FontWeight.Medium)
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
                                .height(20.dp), colorFilter = ColorFilter.tint(Color.DarkGray)
                        )
                        Text(text = "Setting", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                    }

                }
            }

        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.spacedBy(50.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(76.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(1.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .width(64.dp)
                            .height(64.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.e),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        Box(
                            modifier = Modifier
                                .padding(top = 30.dp, start = 44.dp)
                                .width(20.dp)
                                .height(20.dp)
                                .clip(
                                    RoundedCornerShape(11.dp)
                                )
                                .background(Color(0XFF007AFF)),
                            contentAlignment = Alignment.BottomCenter
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Add,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.align(
                                    Alignment.BottomEnd
                                )
                            )
                        }


                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .padding(start = 10.dp),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text(text = "My Status", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)

                        Text(
                            text = "Add to my status",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.W300
                        )
                    }


                    Row(
                        modifier = Modifier
                            .padding(end = 15.dp)
                            .width(95.dp)
                            .height(40.dp),
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .clip(
                                    RoundedCornerShape(30.dp)
                                )
                                .background(Color(0XFFEDEDFF).copy(0.45f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.CameraAlt,
                                contentDescription = "",
                                tint = Color(0XFF007AFF)
                            )

                        }

                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .clip(
                                    RoundedCornerShape(30.dp)
                                )
                                .background(Color(0XFFEDEDFF).copy(0.45f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Edit,
                                contentDescription = "",
                                tint = Color(0XFF007AFF)
                            )
                        }
                    }
                }


            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(1.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(text = "No recent updates to show right now.", fontSize = 14.sp, fontWeight = FontWeight.W300, color = Color(0XFF8E8E93))
                }
            }


        }
    }
}