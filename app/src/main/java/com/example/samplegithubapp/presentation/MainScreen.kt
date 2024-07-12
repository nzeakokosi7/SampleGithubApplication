package com.example.samplegithubapp.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.samplegithubapp.ui.theme.CardBorderColor
import com.example.samplegithubapp.ui.theme.Manrope
import com.example.samplegithubapp.ui.theme.shadowCustom

@Composable
fun Main(
    viewModel: MainViewModel,
) {
    val homeNavController = rememberNavController()

    Scaffold(
        containerColor = Color.White,
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomBar(navController = homeNavController)
        }
    ) { it ->
        BottomBarNavGraph(
            viewModel = viewModel,
            navController = homeNavController
        )
    }
}

@Composable
fun BottomBarNavGraph(
    viewModel: MainViewModel,
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.route
    ) {
        composable(route = BottomNavItem.Home.route) {
            HomeScreen(navController)
        }

        composable(route = BottomNavItem.Repos.route) {
            RepositoriesScreen(viewModel)
        }
        composable(route = BottomNavItem.Users.route) {
            UsersScreen(viewModel, navController)
        }
        composable(route = "user_detail_screen") {
            UserDetailScreen(viewModel, navController)
        }

    }
}

@Composable
fun BottomBar( navController: NavHostController){

    val screens = listOf(
        BottomNavItem.Home,
        BottomNavItem.Repos,
        BottomNavItem.Users
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Card(
        modifier = Modifier
            .shadowCustom(
                color = CardBorderColor.copy(0.5f),
                offsetX = 1.dp,
                offsetY = -4.dp,
                blurRadius = 8.dp,
            ),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(0.dp)
    ){
        NavigationBar(
            modifier = Modifier
                .height(60.dp)
                .padding(0.dp),
            containerColor = Color.White,
        ){
            screens.forEach {screen->
                AddItem(
                    screen = screen,
                    navDestination = currentDestination,
                    navController = navController
                )

            }
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomNavItem,
    navDestination: NavDestination?,
    navController: NavHostController
){
    val selected = navDestination?.hierarchy?.any { it.route == screen.route } == true
    val icon =  when(selected) {
        true -> screen.selectedIcon
        false -> screen.unselectedIcon
    }
    NavigationBarItem(
        modifier = Modifier.padding(top = 10.dp),
        icon = {
            Icon(imageVector = icon, tint = Color.Black, contentDescription = " NavBar Icon")
        },
        label = {
            Text(
                text = screen.title,
                fontSize = 10.sp,
                fontFamily = Manrope,
                color = Color.Black
            )
        },
        selected = false,
        onClick = {
            navController.navigate(screen.route){
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
        })
}

@Composable
fun ScreenContent(screenName: String) {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Text(text = screenName)
    }
}