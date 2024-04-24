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
        Screen("Calls", "Calls", selectedIcon = R.drawable.calls, unSelectedIcon = R.drawable.calls)

    object Camera : Screen(
        "Camera",
        "Camera",
        selectedIcon = R.drawable.camera,
        unSelectedIcon = R.drawable.camera
    )

    object Chats :
        Screen("Chats", "Chats", selectedIcon = R.drawable.chats, unSelectedIcon = R.drawable.chats)

    object Settings : Screen(
        "Settings",
        "Settings",
        selectedIcon = R.drawable.settings,
        unSelectedIcon = R.drawable.settings
    )


}