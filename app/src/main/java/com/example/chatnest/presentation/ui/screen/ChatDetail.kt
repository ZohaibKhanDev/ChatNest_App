package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.outlined.Videocam
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.chatnest.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ChatDetail(navController: NavController, image: String?, name: String?) {
    var message by remember {
        mutableStateOf("")
    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "$name", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color.White),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBackIos,
                        contentDescription = "",
                        modifier = Modifier.padding(start = 5.dp),
                        tint = Color(0XFF007AFF)
                    )

                    AsyncImage(
                        model = image, contentDescription = "", modifier = Modifier
                            .width(36.dp)
                            .height(36.dp)
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
            BottomAppBar {
                TextField(value = message, onValueChange = { message = it }, leadingIcon = {
                    Image(painter = painterResource(id = R.drawable.document), contentDescription = "")
                }, modifier = Modifier.width(228.dp).height(32.dp), shape = RoundedCornerShape(1f))
            }
        }
    ) {

    }
}