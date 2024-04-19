package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material.icons.filled.KeyboardVoice
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.chatnest.R
import com.example.chatnest.domain.model.Chat
import com.example.chatnest.domain.model.Screen

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ChatsScreen(navController: NavController) {
    var search by remember {
        mutableStateOf("")
    }
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(
                text = "Edit",
                color = Color(0XFF007AFF),
                fontSize = 16.sp
            )


        },
            colors = TopAppBarDefaults.topAppBarColors(Color.White),

            actions = {
                Image(
                    painter = painterResource(id = R.drawable.edit),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .size(24.dp)
                )
            }
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
                            .height(17.dp), colorFilter = ColorFilter.tint(Color(0XFF007AFF))
                    )
                    Text(text = "Chats", fontSize = 12.sp, fontWeight = FontWeight.Medium, color = Color(0XFF007AFF))
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
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(top = it.calculateTopPadding(), start = 13.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Chats",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            val scroll = rememberScrollState()
            Column(
                modifier = Modifier
                    .verticalScroll(scroll)
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(top = 10.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = search,
                    onValueChange = {
                        search = it
                    },
                    placeholder = {
                        Text(text = "Search", fontSize = 14.sp)
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        focusedTextColor = Color.DarkGray,
                        focusedPlaceholderColor = Color.DarkGray,
                        unfocusedPlaceholderColor = Color.DarkGray,
                        unfocusedTextColor = Color.DarkGray,
                        containerColor = Color(0XFFF6F6F6),
                        disabledIndicatorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White,
                    ),
                    modifier = Modifier
                        .height(50.dp)
                        .width(320.dp),
                    shape = RoundedCornerShape(14.dp),
                    singleLine = true,
                    textStyle = TextStyle(
                        fontSize = 14.sp, fontWeight = FontWeight.SemiBold
                    ),
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(top = 25.dp, start = 17.dp, end = 17.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Broadcast List",
                        color = Color(0XFF03a1fc),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W500
                    )

                    Text(
                        text = "New Group",
                        color = Color(0XFF03a1fc),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W500
                    )


                }
                HorizontalDivider(
                    color = Color.LightGray.copy(alpha = 0.40f),
                    modifier = Modifier.padding(top = 5.dp)
                )
            }

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(top = 1.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(chats) { chat ->
                    ChatsItem(chat = chat,navController)
                }
            }



        }
    }


}

@Composable
fun ChatsItem(chat: Chat,navController: NavController) {
    val context= LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth().clickable {Intent(context,SecondActivity::class.java).also {
               val intent =Intent(context,SecondActivity::class.java)
                intent.putExtra("image",chat.image.toString())
                intent.putExtra("name",chat.name)
                context.startActivity(it)
            }}
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
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
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

                    Text(
                        text = chat.date,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        color = Color.Gray
                    )
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

                    Text(
                        text = chat.lastMessage,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.W400,
                        color = Color.Gray
                    )
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

        HorizontalDivider(
            modifier = Modifier
                .width(296.dp)
                .align(Alignment.End), color = Color(0XFF3C3C43).copy(alpha = 0.20f)
        )
    }

}