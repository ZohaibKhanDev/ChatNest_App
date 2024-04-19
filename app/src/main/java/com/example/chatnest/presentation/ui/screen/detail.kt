package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextMotion
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.chatnest.MainActivity
import com.example.chatnest.R
import com.example.chatnest.domain.model.Screen
import com.example.chatnest.ui.theme.ChatNestTheme

class SecondActivity:ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatNestTheme {
                var message by remember {
                    mutableStateOf("")
                }
                val intent=Intent(applicationContext,MainActivity::class.java)
                val navController= rememberNavController()
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                               val name=intent.getStringExtra("name")
                            },
                            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color.White),
                            navigationIcon = {
                                Icon(
                                    imageVector = Icons.Default.ArrowBackIos,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 5.dp),
                                    tint = Color(0XFF007AFF)
                                )

                              val image=intent.getStringExtra("image")


                            },
                            actions = {
                                Image(
                                    painter = painterResource(id = R.drawable.videocall),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .width(28.dp)
                                        .height(19.dp)
                                )
                                Spacer(modifier = Modifier.width(25.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.calls),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .padding(end = 10.dp)
                                        .width(25.dp)
                                        .height(25.dp)
                                )
                            })
                    }, bottomBar = {
                        BottomAppBar(modifier = Modifier.fillMaxWidth(), containerColor = Color.White) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "",
                                    tint = Color(0XFF007AFF), modifier = Modifier.clickable { }
                                )
                                TextField(
                                    value = message,
                                    onValueChange = { message = it },
                                    trailingIcon = {
                                        Image(
                                            painter = painterResource(id = R.drawable.document),
                                            contentDescription = "", modifier = Modifier
                                                .width(18.dp)
                                                .height(19.dp)
                                                .clickable { }, contentScale = ContentScale.Crop
                                        )
                                    },
                                    modifier = Modifier
                                        .width(228.dp)
                                        .height(50.dp),
                                    shape = RoundedCornerShape(20.dp),
                                    colors = TextFieldDefaults.textFieldColors(
                                        focusedTextColor = Color.Gray,
                                        unfocusedTextColor = Color.Gray,
                                        focusedIndicatorColor = Color.White,
                                        unfocusedIndicatorColor = Color.White,
                                        focusedLeadingIconColor = Color.Blue,
                                        unfocusedLeadingIconColor = Color.Blue
                                    ),
                                    textStyle = TextStyle(
                                        fontSize = 18.sp,
                                        textAlign = TextAlign.Start,
                                        textDecoration = TextDecoration.LineThrough,
                                        textMotion = TextMotion.Animated
                                    )
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.outlinecamera),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(22.dp)
                                        .height(19.dp)
                                        .clickable { },
                                    contentScale = ContentScale.FillBounds
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.audio),
                                    contentDescription = "",
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier
                                        .width(16.dp)
                                        .height(24.dp)
                                        .clickable { }
                                )
                            }
                        }
                    }
                ) {

                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.wallpaper),
                            contentDescription = "",
                            Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillHeight

                        )
                    }
                }
            }
        }
    }
}