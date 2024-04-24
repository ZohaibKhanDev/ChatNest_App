package com.example.chatnest.presentation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Key
import androidx.compose.material.icons.filled.Laptop
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chatnest.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "InvalidColorHexValue")
@Composable
fun SettingScreen(navController: NavController) {
    Scaffold(topBar = {
        MediumTopAppBar(
            title = {
                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                    Text(
                        text = "Setting",
                        fontSize = 19.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.align(
                            Alignment.Center
                        )
                    )

                }
            },
            colors = TopAppBarDefaults.topAppBarColors(Color(0XFFF6F6F6)), modifier = Modifier
                .fillMaxWidth()
                .height(98.dp)
        )
    }) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 99.dp)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(76.dp),
                elevation = CardDefaults.cardElevation(1.dp),
                colors = CardDefaults.cardColors(
                    Color.White
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.e),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(start = 6.dp)
                            .width(64.dp)
                            .height(64.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .padding(start = 6.dp),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.spacedBy(2.dp)
                    ) {
                        Text(text = "Sabohiddin", fontSize = 20.sp, fontWeight = FontWeight.W400)

                        Text(
                            text = "Android Developer- UI ",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W300, color = Color.Gray.copy(alpha = 0.80f)
                        )
                    }

                    Row(
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .width(50.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = "",
                            modifier = Modifier
                                .rotate(180f)
                                .width(18.dp)
                                .height(20.dp),
                            tint = Color.Gray.copy(alpha = 0.50f)
                        )
                    }
                }
            }
        }


        Card(
            modifier = Modifier
                .padding(top = 224.dp)
                .fillMaxWidth()
                .height(120.dp),
            elevation = CardDefaults.cardElevation(1.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start
            ) {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0XFFFBB500))
                            .width(36.dp)
                            .height(36.dp), contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                    Text(
                        text = "Starred Messages",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 110.dp)
                            .size(18.dp)
                            .rotate(180f),
                        tint = Color.Gray.copy(alpha = 0.40f)
                    )

                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp), contentAlignment = Alignment.Center
                ) {
                    HorizontalDivider(color = Color.Gray.copy(alpha = 0.20f))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0XFF07AD9F))
                            .width(36.dp)
                            .height(36.dp), contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Laptop,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                    Text(
                        text = "WhatsApp Web/Desktop",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 62.dp)
                            .size(18.dp)
                            .rotate(180f),
                        tint = Color.Gray.copy(alpha = 0.40f)
                    )

                }


            }
        }


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 399.dp)
                .height(258.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            colors = CardDefaults.cardColors(
                Color.White
            )
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start
            ) {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0XFFF397AFE))
                            .width(36.dp)
                            .height(36.dp), contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Key,
                            contentDescription = "",
                            tint = Color.White, modifier = Modifier.rotate(90f)
                        )
                    }
                    Text(
                        text = "Account",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 184.dp)
                            .size(18.dp)
                            .rotate(180f),
                        tint = Color.Gray.copy(alpha = 0.40f)
                    )

                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp), contentAlignment = Alignment.Center
                ) {
                    HorizontalDivider(color = Color.Gray.copy(alpha = 0.20f))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0XFF4BD763))
                            .width(36.dp)
                            .height(36.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.whatsapp),
                            contentDescription = ""
                        )
                    }
                    Text(
                        text = "Chats",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 201.dp)
                            .size(18.dp)
                            .rotate(180f),
                        tint = Color.Gray.copy(alpha = 0.40f)
                    )

                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp), contentAlignment = Alignment.Center
                ) {
                    HorizontalDivider(color = Color.Gray.copy(alpha = 0.20f))
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0XFFFFF3B2F))
                            .width(36.dp)
                            .height(36.dp), contentAlignment = Alignment.Center
                    ) {
                       Image(painter = painterResource(id = R.drawable.notification), contentDescription ="" )
                    }
                    Text(
                        text = "Notifications",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 146.dp)
                            .size(18.dp)
                            .rotate(180f),
                        tint = Color.Gray.copy(alpha = 0.40f)
                    )

                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp), contentAlignment = Alignment.Center
                ) {
                    HorizontalDivider(color = Color.Gray.copy(alpha = 0.20f))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp, top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0XFF4BD763))
                            .width(36.dp)
                            .height(36.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(painter = painterResource(id = R.drawable.data), contentDescription = "")
                    }
                    Text(
                        text = "Data and Storage Usage",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 62.dp)
                            .size(18.dp)
                            .rotate(180f),
                        tint = Color.Gray.copy(alpha = 0.40f)
                    )

                }


            }
        }
    }


}
