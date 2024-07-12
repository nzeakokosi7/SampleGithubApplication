package com.example.samplegithubapp.domain.repository

import com.example.samplegithubapp.data.remote.dto.ApiResponse
import com.example.samplegithubapp.data.remote.dto.GitHubRepository
import com.example.samplegithubapp.data.remote.dto.GithubRepositoryResponse
import retrofit2.Response

interface GithubRepository {
    suspend fun searchForRepositories(q: String): Response<out ApiResponse>
    suspend fun searchForUsers(q: String): Response<out ApiResponse>
    suspend fun findUserByUsername(username: String): Response<out ApiResponse>
    suspend fun findRepoForUser(username: String): Response<out List<GitHubRepository>>
}