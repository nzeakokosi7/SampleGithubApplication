package com.example.samplegithubapp.domain.models

data class Repository(
    val name: String,
    val fullName: String,
    val owner: Owner,
    val description: String,
    val fork: Boolean,
    val url: String,
    val createdAt: String,
    val updatedAt: String,
    val pushedAt: String,
    val stargazersCount: Int,
    val language: String,
    val topics: List<String>
)

data class Owner(
    val login: String,
    val avatarUrl: String,
)