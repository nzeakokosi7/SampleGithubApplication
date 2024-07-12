package com.example.samplegithubapp.data.api

import com.example.samplegithubapp.data.remote.GithubApi
import com.example.samplegithubapp.data.remote.dto.ApiResponse
import com.example.samplegithubapp.data.remote.dto.GitHubRepository
import com.example.samplegithubapp.domain.repository.GithubRepository
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GithubRepositoryImpl @Inject constructor(
    private val githubApi: GithubApi
) : GithubRepository {
    override suspend fun searchForRepositories(q: String): Response<out ApiResponse> =
        githubApi.searchForRepositories(q)

    override suspend fun searchForUsers(q: String): Response<out ApiResponse> =
        githubApi.searchForUsers(q)

    override suspend fun findUserByUsername(username: String): Response<out ApiResponse> =
        githubApi.findUserWithUsername(username)

    override suspend fun findRepoForUser(username: String): Response<out List<GitHubRepository>> =
        githubApi.findReposForUser(username)
}