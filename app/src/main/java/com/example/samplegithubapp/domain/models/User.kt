package com.example.samplegithubapp.domain.models

data class User(
    val login: String,
    val avatarUrl: String,
    val githubUrl: String,
    val email: String?,
    val bio: String?,
    val name: String?,
    val location: String?,
    val followers: Int?,
    val following: Int?
)