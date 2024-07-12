package com.example.samplegithubapp.domain.state

import com.example.samplegithubapp.domain.models.Repository
import com.example.samplegithubapp.domain.models.User

data class UserScreenState(
    val data: List<User>? = null,
    val query: String = "",
    val isLoading: Boolean = false,
    val hasError: Boolean = false,
    val errorMessage: String? = null
)

data class RepoScreenState(
    val data: List<Repository>? = null,
    val query: String = "",
    val isLoading: Boolean = false,
    val hasError: Boolean = false,
    val errorMessage: String? = null
)

data class UserDetailScreenState(
    val userData: User? = null,
    val userRepo: List<Repository>? = null,
    val isLoadingUserData: Boolean = false,
    val isLoadingUserRepoData: Boolean = false,
    val hasError: Boolean = false,
    val errorMessage: String? = null
)