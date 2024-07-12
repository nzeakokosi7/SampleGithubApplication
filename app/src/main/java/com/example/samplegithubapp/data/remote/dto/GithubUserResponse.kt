package com.example.samplegithubapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class GithubUserResponse(
    val login: String,

    @SerializedName("avatar_url")
    val avatarUrl: String,

    @SerializedName("html_url")
    val githubUrl: String,
    val email: String?,
    val bio: String?,
    val name: String?,
    val location: String?,
    val followers: Int?,
    val following: Int?
): ApiResponse