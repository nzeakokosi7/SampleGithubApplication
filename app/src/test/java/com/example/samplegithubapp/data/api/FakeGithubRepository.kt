package com.example.samplegithubapp.data.api

import com.example.samplegithubapp.data.remote.dto.ApiResponse
import com.example.samplegithubapp.data.remote.dto.GitHubRepository
import com.example.samplegithubapp.data.remote.dto.GithubRepositoryResponse
import com.example.samplegithubapp.data.remote.dto.GithubUserResponse
import com.example.samplegithubapp.data.remote.dto.Owner
import com.example.samplegithubapp.data.remote.dto.SearchGithubUserResponse
import com.example.samplegithubapp.data.remote.dto.User
import com.example.samplegithubapp.data.remote.toUser
import com.example.samplegithubapp.domain.models.Repository
import com.example.samplegithubapp.domain.repository.GithubRepository
import retrofit2.Response

class FakeGithubRepository : GithubRepository {

    private val repos = mutableListOf<GitHubRepository>()
    private val users = mutableListOf<User>()

    override suspend fun searchForRepositories(q: String): Response<out ApiResponse> {
        val result = repos.filter { a -> a.name.contains(q) }.toList()
        return Response.success(
            GithubRepositoryResponse(
                totalCount = 2,
                inCompleteResults = false,
                items = result
            )
        )

    }

    override suspend fun searchForUsers(q: String): Response<out ApiResponse> {
        val result = users.filter { a -> a.login.contains(q) }.toList()
        return Response.success(
            SearchGithubUserResponse(
                totalCount = 2,
                inCompleteResults = false,
                items = result
            )
        )
    }

    override suspend fun findUserByUsername(username: String): Response<out ApiResponse> {
        val result = users.first { a -> a.login.contains(username) }
        return Response.success(
            GithubUserResponse(
                login = result.login,
                avatarUrl = result.avatarUrl,
                githubUrl = result.githubUrl,
                name = result.name,
                email = result.email,
                location = result.location,
                followers = result.followers,
                following = result.following,
                bio = result.bio
            )
        )
    }

    override suspend fun findRepoForUser(username: String): Response<out List<GitHubRepository>> {
        val result = repos.filter { a -> a.owner.login.contains(username) }
        return Response.success(
            result
        )
    }

    suspend fun insertRepo(repository: GitHubRepository) {
        repos.add(repository)
    }

    suspend fun insertUser(user: User) {
        users.add(user)
    }
}