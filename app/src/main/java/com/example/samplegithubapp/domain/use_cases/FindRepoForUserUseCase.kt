package com.example.samplegithubapp.domain.use_cases

import com.example.samplegithubapp.data.common.Resource
import com.example.samplegithubapp.data.remote.toUserRepoList
import com.example.samplegithubapp.domain.models.Owner
import com.example.samplegithubapp.domain.models.Repository
import com.example.samplegithubapp.domain.repository.GithubRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.TimeoutException
import javax.inject.Inject

class FindRepoForUserUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {
    operator fun invoke(username: String) = flow {
        try {
            emit(Resource.Loading())
            val apiResponse = githubRepository.findRepoForUser(username)
            if (apiResponse.isSuccessful) {
                val result = apiResponse.body()
                emit(Resource.Success(result?.toUserRepoList()))
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