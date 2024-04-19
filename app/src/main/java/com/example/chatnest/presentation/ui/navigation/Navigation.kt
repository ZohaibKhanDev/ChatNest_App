package com.example.chatnest.presentation.ui.navigation

import android.annotation.SuppressLint
import android.telecom.Call
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.chatnest.domain.model.Screen
import com.example.chatnest.presentation.ui.screen.CallsScreen
import com.example.chatnest.presentation.ui.screen.CameraScreen
import com.example.chatnest.presentation.ui.screen.ChatsScreen
import com.example.chatnest.presentation.ui.screen.SettingScreen
import com.example.chatnest.presentation.ui.screen.StatusScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Status.route){
      composable(Screen.Status.route){
          StatusScreen(navController = navController)
      }
        composable(Screen.Calls.route){
            CallsScreen(navController = navController)
        }
        
        composable(Screen.Camera.route){
            CameraScreen(navController = navController)
        }
        
        composable(Screen.Chats.route){
            ChatsScreen(navController = navController)
        }
        composable(Screen.Settings.route){
            SettingScreen(navController = navController)
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavEntry() {
    val navController= rememberNavController()
    Scaffold(bottomBar = { BottomNavigation(navController = navController)}) {
        com.example.chatnest.presentation.ui.navigation.Navigation(navController = navController)
    }
}
@Composable
fun BottomNavigation(navController: NavController) {
    val item= listOf(
        Screen.Status,
        Screen.Calls,
        Screen.Camera,
        Screen.Chats,
        Screen.Settings
    )
    
    NavigationBar {
        val navStack by navController.currentBackStackEntryAsState()
        val current=navStack?.destination?.route
        item?.forEach { 
            NavigationBarItem(selected = current==it.route, onClick = {
                navController.navigate(it.route) {
                navController.graph?.let {
                    it.route?.let { it1 -> popUpTo(it1) }
                    launchSingleTop = true
                    restoreState = true
                }
            }}, icon = {
                if (current==it.route){
                    Icon(painter = painterResource(id = it.selectedIcon), contentDescription = "", tint = Color(0XFF007AFF), modifier = Modifier.size(18.dp))
                }
                else{
                    Icon(painter = painterResource(id = it.unSelectedIcon), contentDescription ="", tint = Color(0XFF545458), modifier = Modifier.size(18.dp) )
                }
            },

                label = {
                    if (current==it.route){
                        Text(text = it.route, color = Color(0XFF007AFF))
                    }
                    else{
                        Text(text = it.route, color = Color(0XFF545458))
                    }
                }
                )
        }
    }
}