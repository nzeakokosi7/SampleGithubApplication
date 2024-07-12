package com.example.samplegithubapp.domain.use_cases

import com.example.samplegithubapp.data.common.Resource
import com.example.samplegithubapp.data.remote.dto.GithubUserResponse
import com.example.samplegithubapp.data.remote.toUser
import com.example.samplegithubapp.domain.repository.GithubRepository
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.TimeoutException
import javax.inject.Inject

class FindUserUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {
    operator fun invoke(username: String) = flow {
        try {
            emit(Resource.Loading())
            val apiResponse = githubRepository.findUserByUsername(username)
            if (apiResponse.isSuccessful) {
                val result = apiResponse.body() as GithubUserResponse
                emit(Resource.Success(result.toUser()))
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