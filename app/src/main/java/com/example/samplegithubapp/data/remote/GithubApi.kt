package com.example.samplegithubapp.data.remote

import com.example.samplegithubapp.data.remote.dto.ApiResponse
import com.example.samplegithubapp.data.remote.dto.GitHubRepository
import com.example.samplegithubapp.data.remote.dto.GithubRepositoryResponse
import com.example.samplegithubapp.data.remote.dto.GithubUserResponse
import com.example.samplegithubapp.data.remote.dto.SearchGithubUserResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubApi {
    @GET("/search/repositories")
    suspend fun searchForRepositories(
        @Query("q") q : String
    ): Response<GithubRepositoryResponse>

    @GET("/search/users")
    suspend fun searchForUsers(
        @Query("q") q : String
    ): Response<SearchGithubUserResponse>

    @GET("/users/{username}")
    suspend fun findUserWithUsername(
        @Path("username") username : String
    ): Response<GithubUserResponse>

    @GET("/users/{username}/repos")
    suspend fun findReposForUser(
        @Path("username") username : String
    ): Response<List<GitHubRepository>>
}