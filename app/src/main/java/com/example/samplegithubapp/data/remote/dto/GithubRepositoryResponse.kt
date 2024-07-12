package com.example.samplegithubapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class GithubRepositoryResponse(
    @SerializedName("total_count")
    val totalCount: Int,

    @SerializedName("incomplete_results")
    val inCompleteResults: Boolean,
    val items: List<GitHubRepository>
): ApiResponse

data class GitHubRepository(
    val name: String,

    @SerializedName("full_name")
    val fullName: String,
    val owner: Owner,
    val description: String?,
    val fork: Boolean,
    val url: String,

    @SerializedName("created_at")
    val createdAt: String,

    @SerializedName("updated_at")
    val updatedAt: String,

    @SerializedName("pushed_at")
    val pushedAt: String?,

    @SerializedName("stargazers_count")
    val stargazersCount: Int,

    val language: String?,
    val topics: List<String>
)

data class Owner(
    val login: String,

    @SerializedName("avatar_url")
    val avatarUrl: String,
)