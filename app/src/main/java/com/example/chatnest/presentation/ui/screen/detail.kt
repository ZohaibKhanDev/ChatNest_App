package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.chatnest.R
import com.example.chatnest.ui.theme.ChatNestTheme

class SecondActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatNestTheme {
                var message by remember {
                    mutableStateOf("")
                }
                val intent = getIntent()
                val name = intent.getStringExtra("name")
                val image = intent.getStringExtra("image")


                val navController = rememberNavController()
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(start = 30.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.a),
                                        contentDescription = "",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .width(44.dp)
                                            .height(44.dp)
                                    )
                                    Column(
                                        modifier = Modifier.fillMaxWidth(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.Start
                                    ) {
                                        Text(
                                            text = name.toString(),
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.SemiBold
                                        )


                                    }


                                }
                            },
                            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color.White),
                            navigationIcon = {
                                Icon(
                                    imageVector = Icons.Default.ArrowBackIos,
                                    contentDescription = "",
                                    modifier = Modifier
                                        .padding(start = 5.dp)
                                        .clickable { navController.popBackStack() },
                                    tint = Color(0XFF007AFF)
                                )


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
                        BottomAppBar(
                            modifier = Modifier.fillMaxWidth(),
                            containerColor = Color.White
                        ) {
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
                    val timepicker = rememberTimePickerState()

                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.chatbg),
                            contentDescription = "",
                            Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop

                        )

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.TopEnd)
                                .padding(top = 70.dp, end = 14.dp),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.End
                        ) {


                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }

                            Spacer(modifier = Modifier.height(4.dp))

                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }
                            Spacer(modifier = Modifier.height(4.dp))



                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }

                            Spacer(modifier = Modifier.height(4.dp))
                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }

                            Spacer(modifier = Modifier.height(4.dp))

                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }



                            Spacer(modifier = Modifier.height(4.dp))

                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }




                            Spacer(modifier = Modifier.height(4.dp))

                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }



                            Spacer(modifier = Modifier.height(4.dp))

                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }


                            Spacer(modifier = Modifier.height(4.dp))

                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }

                            Spacer(modifier = Modifier.height(4.dp))

                            Card(
                                modifier = Modifier
                                    .width(162.dp)
                                    .height(34.dp)
                                    .align(Alignment.End),
                                colors = CardDefaults.cardColors(Color(0XFFDCF7C5)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "GoodBye!",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.W400
                                    )
                                    Text(
                                        text = "2:14", fontSize = 10.sp, modifier = Modifier
                                            .align(
                                                Alignment.Bottom
                                            )
                                            .padding(start = 30.dp)
                                    )
                                    Icon(
                                        imageVector = Icons.Filled.DoneAll,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(top = 7.dp, start = 4.dp)
                                            .width(17.dp)
                                            .height(15.dp)
                                            .align(Alignment.CenterVertically),
                                        tint = Color(0XFF3497F9)
                                    )

                                }
                            }


                        }
                    }

                }
            }
        }
    }
}
