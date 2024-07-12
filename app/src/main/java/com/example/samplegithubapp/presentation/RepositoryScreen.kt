package com.example.samplegithubapp.presentation

import android.widget.Toast
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.example.samplegithubapp.domain.state.UIEvent
import com.example.samplegithubapp.presentation.composables.EmptyState
import com.example.samplegithubapp.presentation.composables.RepositoryCard
import com.example.samplegithubapp.presentation.composables.SearchBar
import com.example.samplegithubapp.presentation.composables.Type
import com.example.samplegithubapp.presentation.utils.RepositoryLoader
import com.example.samplegithubapp.ui.theme.Typography
import com.example.samplegithubapp.ui.theme.plus

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RepositoriesScreen(
    viewModel: MainViewModel,
) {
    var text by rememberSaveable { mutableStateOf("") }
    val state = viewModel.repoScreenState.value
    val localFocus = LocalFocusManager.current


    Scaffold(
        containerColor = Color.White,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Repositories",
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
                    placeholderText = "Search for repositories...",
                    onValueChange = {
                        text = it
                        viewModel.onEvent(UIEvent.RepoSearchQueryChanged(it))
                    },
                    onSearch = {
                        viewModel.onEvent(UIEvent.SearchRepo)
                        localFocus.clearFocus()
                    }
                )

                state.data?.let { repos ->
                    if (repos.isEmpty()) {
                        EmptyState(
                            message = "We’ve searched the ends of the earth, repository not found, please try again",
                            type = Type.NO_RESULT
                        )
                    } else {
                        Spacer(modifier = Modifier.height(10.dp))
                        LazyColumn(
                            Modifier.fillMaxHeight(0.96f)
                        ) {
                            item {
                                repos.map {
                                    Spacer(modifier = Modifier.height(6.dp))
                                    RepositoryCard(
                                        githubUsername = it.owner.login,
                                        repository = it.name,
                                        repoImageUrl = it.owner.avatarUrl,
                                        mainStack = it.language,
                                        description = it.description,
                                        githubStarCount = it.stargazersCount,
                                        tags = it.topics.toSet()
                                    )
                                }
                            }
                        }

                    }

                }

                if (state.data == null && !state.isLoading && !state.hasError) {
                    EmptyState(
                        message = "Search Github for repositories, issues and pull requests!"
                    )
                }

                if (state.hasError) {
                    //TODO: Parse error message better
                    EmptyState(
                        message = state.errorMessage ?: "Something went wrong"
                    )
                }

                if (state.isLoading) {
                    RepositoryLoader()
                }

            }

        }
    )
}