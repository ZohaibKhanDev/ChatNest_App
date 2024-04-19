package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material.icons.filled.KeyboardVoice
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chatnest.R
import com.example.chatnest.domain.model.Chat

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ChatsScreen(navController: NavController) {

    Scaffold(topBar = {
        CenterAlignedTopAppBar(title = {
            Text(text = "Chats", fontSize = 18.sp, fontWeight = FontWeight.W500)


        },
            navigationIcon = {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = "Edit",
                        color = Color(0XFF007AFF),
                        modifier = Modifier.padding(end = 130.dp), fontSize = 16.sp
                    )
                }
            }, colors = TopAppBarDefaults.topAppBarColors(Color(0XFFF6F6F6)),

            actions = {
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(24.dp)
                )
            }
        )
    }) {
        val chats = listOf(
            Chat(
                "Martin Randolph",
                "0:14",
                lastMessageIcon = Icons.Filled.DoneAll,
                image = painterResource(
                    id = R.drawable.b
                ),
                "4/19/24"
            ),


            Chat(
                "Andrew Parker",
                "0:14",
                lastMessageIcon = Icons.Filled.PhotoCamera,
                image = painterResource(
                    id = R.drawable.c
                ),
                "4/15/24"
            ),


            Chat(
                "Karen Castillo",
                "Yes, 2pm is awesome",
                lastMessageIcon = Icons.Filled.DoneAll,
                image = painterResource(
                    id = R.drawable.d
                ),
                "3/2/24"
            ),


            Chat(
                "Maximillian Jacobson",
                "0:14",
                lastMessageIcon = Icons.Filled.KeyboardVoice,
                image = painterResource(
                    id = R.drawable.e
                ),
                "1/2/24"
            ),


            Chat(
                "Martha Craig",
                "What kind of strategy is better?",
                lastMessageIcon = Icons.Filled.DoneAll,
                image = painterResource(
                    id = R.drawable.f
                ),
                "12/23/23"
            ),


            Chat(
                "Tabitha Potter",
                "0:14",
                lastMessageIcon = Icons.Filled.CameraAlt,
                image = painterResource(
                    id = R.drawable.g
                ),
                "10/2/23"
            ),

            Chat(
                "Maisy Humphrey",
                "0:14",
                lastMessageIcon = Icons.Filled.KeyboardVoice,
                image = painterResource(
                    id = R.drawable.h
                ),
                "8/14/23"
            ),

            Chat(
                "Kieron Dotson",
                "Actually I wanted to…",
                lastMessageIcon = Icons.Filled.DoneAll,
                image = painterResource(
                    id = R.drawable.i
                ),
                "5/9/23"
            ),

            Chat(
                "Martha",
                "Bro, I have a good idea! ",
                lastMessageIcon = Icons.Filled.DoneAll,
                image = painterResource(
                    id = R.drawable.a
                ),
                "4/29/23"
            ),
        )


        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = it.calculateTopPadding()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(chats) { chat ->
                ChatsItem(chat = chat)
            }
        }

    }

}

@Composable
fun ChatsItem(chat: Chat) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(), colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = chat.image,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(52.dp)
                    .height(52.dp)
            )

            Column(
                modifier = Modifier.fillMaxWidth().weight(1f),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(text = chat.name, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)

                    Text(text = chat.date, fontSize = 14.sp, fontWeight = FontWeight.W400, color = Color.Gray)
                }



                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        imageVector = chat.lastMessageIcon,
                        contentDescription = "",
                        colorFilter = ColorFilter.tint(
                            Color(0XFF3497F9)
                        ),
                        modifier = Modifier
                            .width(20.dp)
                            .height(16.dp)
                    )

                    Text(text = chat.lastMessage, fontSize = 15.sp, fontWeight = FontWeight.W400, color = Color.Gray)
                }

            }
            Icon(
                imageVector = Icons.Default.ArrowBackIos,
                contentDescription = "",
                modifier = Modifier
                    .rotate(180f)
                    .size(14.dp), tint = Color.Gray

            )


        }

        HorizontalDivider(modifier = Modifier.width(296.dp).align(Alignment.End), color = Color(0XFF3C3C43).copy(alpha = 0.20f))
    }

}