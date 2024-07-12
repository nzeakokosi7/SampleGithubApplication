package com.example.samplegithubapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.samplegithubapp.App
import com.example.samplegithubapp.presentation.composables.CircularNetworkImage
import com.example.samplegithubapp.presentation.composables.EmptyState
import com.example.samplegithubapp.presentation.composables.RepositoryCard
import com.example.samplegithubapp.presentation.composables.UserProfileCard
import com.example.samplegithubapp.presentation.composables.UserRepositoryCard
import com.example.samplegithubapp.presentation.utils.RepositoryLoader
import com.example.samplegithubapp.presentation.utils.UserLoader
import com.example.samplegithubapp.ui.theme.AppIcon
import com.example.samplegithubapp.ui.theme.CustomGray
import com.example.samplegithubapp.ui.theme.DimmedBlack
import com.example.samplegithubapp.ui.theme.GithubNameTextColor
import com.example.samplegithubapp.ui.theme.Typography
import com.example.samplegithubapp.ui.theme.appicon.ArrowLeft
import com.example.samplegithubapp.ui.theme.appicon.Location
import com.example.samplegithubapp.ui.theme.appicon.People
import com.example.samplegithubapp.ui.theme.appicon.Url
import com.example.samplegithubapp.ui.theme.plus

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserDetailScreen(
    viewModel: MainViewModel,
    navController: NavHostController
) {
    val state = viewModel.userDetailScreenState.value

    Scaffold(
        containerColor = Color.White,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Users",
                        style = Typography.titleMedium,
                        color = Color.Black
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = { navController.navigateUp() }
                    ) {
                        Icon(
                            imageVector = AppIcon.ArrowLeft,
                            contentDescription = "back button"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        content = { innerPadding ->
            state.userData?.let {
                Column {
                    UserProfileCard(
                        avatarUrl = it.avatarUrl,
                        fullName = it.name ?: "Not specified",
                        username = it.login,
                        url = it.githubUrl,
                        bio = it.bio,
                        location = it.location,
                        followers = it.followers ?: 0,
                        following = it.following ?: 0,
                        innerPadding = innerPadding
                    )

                    Spacer(modifier = Modifier.height(15.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp, end = 18.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Repositories",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.W600,
                                lineHeight = 13.sp,
                                color = Color.Black
                            )
                            InputChip(
                                modifier = Modifier
                                    .height(14.dp),
                                selected = true,
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(8.dp),
                                colors = InputChipDefaults.inputChipColors(selectedContainerColor = CustomGray),
                                label = {
                                    Text(
                                        text = if(state.userRepo == null) "0" else state.userRepo.size.toString(),
                                        fontWeight = FontWeight.W600,
                                        fontSize = 8.sp,
                                        lineHeight = 11.sp,
                                        color = Color.Black
                                    )
                                }
                            )
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            HorizontalDivider(
                                modifier = Modifier.fillMaxWidth(0.38f),
                                color = Color.Black,
                                thickness = 1.dp
                            )
                            HorizontalDivider(
                                modifier = Modifier.fillMaxWidth(1f),
                                color = CustomGray,
                                thickness = 1.dp
                            )
                        }
                        LazyColumn (
                            Modifier.fillMaxHeight(0.96f)
                        ){
                            item {
                                if (state.isLoadingUserRepoData) {
                                    UserLoader(3)
                                }
                                if (state.hasError) {
                                    EmptyState(
                                        message = state.errorMessage ?: "Something went wrong"
                                    )
                                }
                                state.userRepo?.let { repos ->
                                    repos.map { r ->
                                        Spacer(modifier = Modifier.height(6.dp))
                                        UserRepositoryCard(
                                            githubUsername = r.owner.login,
                                            repository = r.name,
                                            mainStack = r.language,
                                            description = r.description,
                                            githubStarCount = r.stargazersCount,
                                            lastUpdated = r.updatedAt
                                        )
                                    }
                                }

                            }
                        }
                    }
                }
            }

            if (state.hasError) {
                //TODO: Parse error message better
                EmptyState(
                    message = state.errorMessage ?: "Something went wrong"
                )
            }

            if (state.isLoadingUserData) {
                Column {
                    RepositoryLoader(1)
                    Spacer(modifier = Modifier.height(20.dp))
                    UserLoader(3)
                }
            }

        }
    )
}