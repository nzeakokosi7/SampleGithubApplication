package com.example.samplegithubapp.domain.use_cases

import com.example.samplegithubapp.data.api.FakeGithubRepository
import com.example.samplegithubapp.data.common.Resource
import com.example.samplegithubapp.data.remote.dto.GitHubRepository
import com.example.samplegithubapp.data.remote.dto.GithubRepositoryResponse
import com.example.samplegithubapp.data.remote.dto.Owner
import com.example.samplegithubapp.data.remote.dto.User
import com.example.samplegithubapp.domain.models.Repository
import com.example.samplegithubapp.domain.state.UserDetailScreenState
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ViewModelUseCaseTest {
    private lateinit var searchRepoUseCase: SearchRepoUseCase
    private lateinit var searchUserUseCase: SearchUserUseCase
    private lateinit var findRepoForUserUseCase: FindRepoForUserUseCase
    private lateinit var findUserUseCase: FindUserUseCase
    private lateinit var fakeGithubRepository: FakeGithubRepository

    @Before
    fun setup() {
        fakeGithubRepository = FakeGithubRepository()
        searchRepoUseCase = SearchRepoUseCase(fakeGithubRepository)
        searchUserUseCase = SearchUserUseCase(fakeGithubRepository)
        findUserUseCase = FindUserUseCase(fakeGithubRepository)
        findRepoForUserUseCase = FindRepoForUserUseCase(fakeGithubRepository)

        val reposToInsert = mutableListOf<GitHubRepository>()
        val userToInsert = mutableListOf<User>()
        ('a'..'z').forEach { c ->
            reposToInsert.add(
                GitHubRepository(
                    name = c.toString(),
                    fullName = "User/Repo1",
                    owner = Owner(login = c.toString(), avatarUrl = "https://example.com/avatar1.png"),
                    description = "Description 1",
                    fork = false,
                    url = "https://github.com/User/Repo1",
                    createdAt = "2023-01-01",
                    updatedAt = "2023-01-02",
                    pushedAt = "2023-01-03",
                    stargazersCount = 100,
                    language = "Kotlin",
                    topics = listOf("topic1", "topic2")
                ),
            )

            userToInsert.add(
                User(
                    login = c.toString(),
                    avatarUrl = "https://example.com/avatar1.png",
                    githubUrl = "https://github.com/User1",
                    email = "user1@example.com",
                    bio = "Bio1",
                    name = c.toString(),
                    location = "Location1",
                    followers = 10,
                    following = 5
                ),
            )
        }
        reposToInsert.shuffle()
        userToInsert.shuffle()

        runBlocking {
            reposToInsert.forEach { fakeGithubRepository.insertRepo(it) }
            userToInsert.forEach { fakeGithubRepository.insertUser(it) }
        }
    }

    @Test
    fun `search for repositories use_case returns matching domain object`() = runBlocking {
        searchRepoUseCase("a").collect { resource ->
            when(resource) {
                is Resource.Success -> {
                    assertEquals(resource.data!!.first().name, "a")
                }
                is Resource.Error -> {}
                is Resource.Loading -> {}
            }
        }
    }

    @Test
    fun `search for users use_case returns matching domain object`() = runBlocking {
        searchUserUseCase("a").collect { resource ->
            when(resource) {
                is Resource.Success -> {
                    assertEquals(resource.data!!.first().login, "a")
                }
                is Resource.Error -> {}
                is Resource.Loading -> {}
            }
        }
    }

    @Test
    fun `find repo for users use_case returns at least one matching domain object`() = runBlocking {
        findRepoForUserUseCase("a").collect { resource ->
            when(resource) {
                is Resource.Success -> {
                    assertEquals(resource.data!!.first().owner.login, "a")
                }
                is Resource.Error -> {}
                is Resource.Loading -> {}
            }
        }
    }

    @Test
    fun `find user with username use_case returns matching domain object`() = runBlocking {
        findUserUseCase("a").collect { resource ->
            when(resource) {
                is Resource.Success -> {
                    assertEquals(resource.data!!.login, "a")
                }
                is Resource.Error -> {}
                is Resource.Loading -> {}
            }
        }
    }
}