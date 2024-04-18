package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddIcCall
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CallsScreen(navController: NavController) {
    var selected by remember {
        mutableStateOf(false)
    }
    var selected1 by remember {
        mutableStateOf(false)
    }
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(
                text = "Edit",
                fontSize = MaterialTheme.typography.titleMedium.fontSize,
                color = Color(0XFF007AFF), modifier = Modifier.padding(top = 10.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {


                if (selected) {
                    TextButton(
                        onClick = { selected = !selected },
                        colors = ButtonColors(
                            containerColor = Color(0XFF007AFF),
                            contentColor = Color.White,
                            disabledContainerColor = Color.White,
                            disabledContentColor = Color(0XFF007AFF)
                        ),
                        shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp),
                        modifier = Modifier.width(76.dp).align(Alignment.CenterVertically)
                    ) {
                        Text(text = "All")
                    }

                } else {
                    TextButton(
                        onClick = { selected = !selected },
                        colors = ButtonColors(
                            containerColor = Color.White,
                            contentColor =Color(0XFF007AFF),
                            disabledContainerColor = Color.White,
                            disabledContentColor = Color(0XFF007AFF)
                        ),
                        shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp ),
                        modifier = Modifier.width(76.dp).align(Alignment.CenterVertically)
                    ) {
                        Text(text = "All")
                    }
                }

                if (selected1) {
                    TextButton(
                        onClick = { selected1 = !selected1 },

                        colors = ButtonColors(
                            containerColor = Color(0XFF007AFF),
                            contentColor = Color.White,
                            disabledContainerColor = Color.White,
                            disabledContentColor = Color(0XFF007AFF)
                        ),
                        shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp),
                        modifier = Modifier.width(76.dp).align(Alignment.CenterVertically)
                    ) {
                        Text(text = "Missed")
                    }

                } else {
                    TextButton(
                        onClick = { selected1 = !selected1 },

                        colors = ButtonColors(
                            containerColor = Color.White,
                            contentColor = Color(0XFF007AFF),
                            disabledContainerColor = Color.White,
                            disabledContentColor = Color(0XFF007AFF)
                        ),
                        shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp ),
                        modifier = Modifier.width(76.dp).align(Alignment.CenterVertically)
                    ) {
                        Text(text = "Missed")
                    }
                }


            }
        }, actions = {
            Icon(imageVector = Icons.Outlined.AddIcCall, contentDescription = "", tint = Color(0XFF007AFF), modifier = Modifier.padding(end = 10.dp))
        }, colors = TopAppBarDefaults.topAppBarColors(Color(0XFFF6F6F6)))
    }) {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "Calls")
        }
    }
}