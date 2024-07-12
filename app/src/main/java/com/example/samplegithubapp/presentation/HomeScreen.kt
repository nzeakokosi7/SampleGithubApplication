package com.example.samplegithubapp.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.samplegithubapp.R
import com.example.samplegithubapp.presentation.composables.SearchBar
import com.example.samplegithubapp.ui.theme.AppIcon
import com.example.samplegithubapp.ui.theme.CardBorderColor
import com.example.samplegithubapp.ui.theme.RepoCardColor
import com.example.samplegithubapp.ui.theme.Typography
import com.example.samplegithubapp.ui.theme.UserCardColor
import com.example.samplegithubapp.ui.theme.appicon.HomeUsersCardIcon
import com.example.samplegithubapp.ui.theme.plus
import com.example.samplegithubapp.ui.theme.shadowCustom

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Scaffold(
        containerColor = Color.White,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Home",
                        style = Typography.titleMedium,
                        color = Color.Black
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        content = { innerPadding ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        innerPadding
                                + PaddingValues(start = 18.dp, end = 18.dp, top = 14.dp)
                    ),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Card(
                    modifier = Modifier
                        .height(118.dp)
                        .weight(0.4f)
                        .padding(end = 8.dp)
                        .shadowCustom(
                            color = CardBorderColor.copy(0.5f),
                            offsetX = 1.dp,
                            offsetY = 2.dp,
                            blurRadius = 5.dp,
                        ),
                    shape = RoundedCornerShape(4.dp),
                    colors = CardDefaults.cardColors(containerColor = UserCardColor),
                    border = BorderStroke(0.4.dp, CardBorderColor),
                    onClick = { navController.navigate("users") }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.home_users_icon),
                            contentDescription = "Users CTA"
                        )

                        Text("Users")
                    }
                }

                Card(
                    modifier = Modifier
                        .height(118.dp)
                        .weight(0.4f)
                        .padding(start = 8.dp)
                        .shadowCustom(
                            color = CardBorderColor.copy(0.5f),
                            offsetX = 1.dp,
                            offsetY = 2.dp,
                            blurRadius = 5.dp,
                        ),
                    shape = RoundedCornerShape(4.dp),
                    colors = CardDefaults.cardColors(containerColor = RepoCardColor),
                    border = BorderStroke(0.4.dp, CardBorderColor),
                    onClick = { navController.navigate("repos") }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.home_repos_icon),
                            contentDescription = "Repositories CTA"
                        )
                        Text("Repositories")
                    }
                }

            }

        }
    )
}

