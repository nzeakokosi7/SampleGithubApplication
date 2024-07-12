package com.example.samplegithubapp.domain.use_cases

import com.example.samplegithubapp.data.common.Resource
import com.example.samplegithubapp.data.remote.dto.GithubRepositoryResponse
import com.example.samplegithubapp.data.remote.toRepoList
import com.example.samplegithubapp.domain.repository.GithubRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.TimeoutException
import javax.inject.Inject

class SearchRepoUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {
    operator fun invoke(q: String) = flow {
        try {
            emit(Resource.Loading())
            val apiResponse = githubRepository.searchForRepositories(q)
            if (apiResponse.isSuccessful) {
                val result = apiResponse.body() as GithubRepositoryResponse
                emit(Resource.Success(result.toRepoList()))
            } else {
                emit(Resource.Error("Api is unsuccessful"))
            }
        } catch (e: IOException) {
            emit(Resource.Error("IO Exception: ${e.message}"))
        } catch (e: TimeoutException) {
            emit(Resource.Error("Timeout Exception: ${e.message}"))
        } catch (e: HttpException) {
            emit(Resource.Error("Http Exception: ${e.message}"))
        }
    }
}