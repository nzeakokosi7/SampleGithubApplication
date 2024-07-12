package com.example.samplegithubapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.samplegithubapp.domain.state.UIEvent
import com.example.samplegithubapp.presentation.composables.EmptyState
import com.example.samplegithubapp.presentation.composables.SearchBar
import com.example.samplegithubapp.presentation.composables.Type
import com.example.samplegithubapp.presentation.composables.UserCard
import com.example.samplegithubapp.presentation.utils.UserLoader
import com.example.samplegithubapp.ui.theme.Typography
import com.example.samplegithubapp.ui.theme.plus

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UsersScreen(
    viewModel: MainViewModel,
    navController: NavHostController
) {
    var text by rememberSaveable { mutableStateOf("") }
    val state = viewModel.userScreenState.value
    val localFocus = LocalFocusManager.current

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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        innerPadding
                                + PaddingValues(start = 18.dp, end = 18.dp)
                    ),
            ) {
                SearchBar(
                    text = text,
                    placeholderText = "Search for users...",
                    onValueChange = {
                        text = it
                        viewModel.onEvent(UIEvent.UserSearchQueryChanged(it))
                    },
                    onSearch = {
                        viewModel.onEvent(UIEvent.SearchUser)
                        localFocus.clearFocus()
                    }
                )
                state.data?.let { users ->
                    if (users.isEmpty()) {
                        EmptyState(
                            message = "We’ve searched the ends of the earth, we've not found this user, please try again",
                            type = Type.NO_RESULT
                        )
                    } else {
                        LazyColumn (
                            Modifier.fillMaxHeight(0.96f)
                        ){
                            item {
                                users.map {
                                    Spacer(modifier = Modifier.height(10.dp))
                                    UserCard(
                                        username = it.login,
                                        fullName = it.name,
                                        avatarUrl = it.avatarUrl,
                                        bio = it.bio,
                                        location = it.location,
                                        email = it.email,
                                        onClick = {
                                            viewModel.onEvent(UIEvent.OnFindUser(it.login))
                                            navController.navigate("user_detail_screen")
                                        }
                                    )
                                }
                            }
                        }
                    }

                }

                if(state.data == null && !state.isLoading && !state.hasError) {
                    EmptyState(
                        message = "Search Github for users..."
                    )
                }


                if (state.hasError) {
                    //TODO: Parse error message better
                    EmptyState(
                        message = state.errorMessage ?: "Something went wrong"
                    )
                }

                if (state.isLoading) {
                    UserLoader()
                }

            }


        }
    )
}
