package com.example.samplegithubapp.data.remote

import com.example.samplegithubapp.data.remote.dto.GitHubRepository
import com.example.samplegithubapp.data.remote.dto.GithubRepositoryResponse
import com.example.samplegithubapp.data.remote.dto.GithubUserResponse
import com.example.samplegithubapp.data.remote.dto.SearchGithubUserResponse
import com.example.samplegithubapp.domain.models.Owner
import com.example.samplegithubapp.domain.models.Repository
import com.example.samplegithubapp.domain.models.User

fun GithubRepositoryResponse.toRepoList(): List<Repository> {
    return this.items.map {
        Repository(
            name = it.name,
            fullName = it.fullName,
            owner = Owner(
                login = it.owner.login,
                avatarUrl = it.owner.avatarUrl
            ),
            description = it.description ?: "",
            fork = it.fork,
            url = it.url,
            createdAt = it.createdAt,
            updatedAt = it.updatedAt,
            pushedAt = it.pushedAt?: "",
            stargazersCount = it.stargazersCount,
            language = it.language ?: "",
            topics = it.topics
        )
    }
}

fun List<GitHubRepository>.toUserRepoList() : List<Repository> {
    return this.map {
        Repository(
            name = it.name,
            fullName = it.fullName,
            owner = Owner(
                login = it.owner.login,
                avatarUrl = it.owner.avatarUrl
            ),
            description = it.description ?: "",
            fork = it.fork,
            url = it.url,
            createdAt = it.createdAt,
            updatedAt = it.updatedAt,
            pushedAt = it.pushedAt?: "",
            stargazersCount = it.stargazersCount,
            language = it.language ?: "",
            topics = it.topics
        )
    }
}

fun SearchGithubUserResponse.toUserList(): List<User> {
    return this.items.map {
        User(
            login = it.login,
            avatarUrl = it.avatarUrl,
            githubUrl = it.githubUrl,
            name = it.name,
            email = it.email,
            location = it.location,
            followers = it.followers,
            following = it.following,
            bio = it.bio
        )
    }
}

fun GithubUserResponse.toUser(): User {
    return User(
        login = this.login,
        avatarUrl = this.avatarUrl,
        githubUrl = this.githubUrl,
        name = this.name,
        email = this.email,
        location = this.location,
        followers = this.followers,
        following = this.following,
        bio = this.bio
    )
}