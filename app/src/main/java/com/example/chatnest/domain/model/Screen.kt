package com.example.chatnest.domain.model

import com.example.chatnest.R

sealed class Screen(
    val tittle: String,
    val route: String,
    val selectedIcon: Int,
    val unSelectedIcon: Int
) {

    object Status : Screen(
        "Status",
        "Status",
        selectedIcon = R.drawable.status,
        unSelectedIcon = R.drawable.status
    )

    object Calls :
        Screen("Calls", "Calls", selectedIcon = R.drawable.call, unSelectedIcon = R.drawable.call)

    object Camera : Screen(
        "Camera",
        "Camera",
        selectedIcon = R.drawable.camera,
        unSelectedIcon = R.drawable.camera
    )

    object Chats :
        Screen("Chats", "Chats", selectedIcon = R.drawable.chat, unSelectedIcon = R.drawable.chat)

    object Settings : Screen(
        "Settings",
        "Settings",
        selectedIcon = R.drawable.setting,
        unSelectedIcon = R.drawable.setting
    )
}