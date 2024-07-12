package com.example.samplegithubapp.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.samplegithubapp.ui.theme.AppIcon
import com.example.samplegithubapp.ui.theme.appicon.HomeFilled
import com.example.samplegithubapp.ui.theme.appicon.HomeOutline
import com.example.samplegithubapp.ui.theme.appicon.SearchFilled
import com.example.samplegithubapp.ui.theme.appicon.SearchOutline
import com.example.samplegithubapp.ui.theme.appicon.UserFilled
import com.example.samplegithubapp.ui.theme.appicon.UserOutline

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
) {
    data object Home: BottomNavItem(
        route = "home",
        title = "Home",
        selectedIcon = AppIcon.HomeFilled,
        unselectedIcon = AppIcon.HomeOutline
    )

    data object Repos: BottomNavItem(
        route = "repos",
        title = "Repositories",
        selectedIcon = AppIcon.SearchFilled,
        unselectedIcon = AppIcon.SearchOutline
    )

    data object Users: BottomNavItem(
        route = "users",
        title = "Users",
        selectedIcon = AppIcon.UserFilled,
        unselectedIcon = AppIcon.UserOutline
    )
}