package com.example.samplegithubapp.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.samplegithubapp.data.common.Resource
import com.example.samplegithubapp.domain.state.RepoScreenState
import com.example.samplegithubapp.domain.state.UIEvent
import com.example.samplegithubapp.domain.state.UserDetailScreenState
import com.example.samplegithubapp.domain.state.UserScreenState
import com.example.samplegithubapp.domain.use_cases.FindRepoForUserUseCase
import com.example.samplegithubapp.domain.use_cases.FindUserUseCase
import com.example.samplegithubapp.domain.use_cases.SearchRepoUseCase
import com.example.samplegithubapp.domain.use_cases.SearchUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    val searchRepoUseCase: SearchRepoUseCase,
    val searchUserUseCase: SearchUserUseCase,
    val findUserUseCase: FindUserUseCase,
    val findRepoForUserUseCase: FindRepoForUserUseCase
): ViewModel() {


    private var _userScreenState = mutableStateOf(UserScreenState())
    val userScreenState: State<UserScreenState> = _userScreenState

    private var _repoScreenState = mutableStateOf(RepoScreenState())
    val repoScreenState: State<RepoScreenState> = _repoScreenState

    private var _userDetailScreenState = mutableStateOf(UserDetailScreenState())
    val userDetailScreenState: State<UserDetailScreenState> = _userDetailScreenState

    init {
    }

    fun onEvent(event: UIEvent) {
        when(event) {
            is UIEvent.RepoSearchQueryChanged -> {
                _repoScreenState.value = _repoScreenState.value.copy(
                    query = event.query
                )
            }
            is UIEvent.UserSearchQueryChanged -> {
                _userScreenState.value = _userScreenState.value.copy(
                    query = event.query
                )
            }
            is UIEvent.SearchRepo -> {
                if(_repoScreenState.value.query.isNotBlank()) {
                    searchForRepo(_repoScreenState.value.query)
                }
            }
            is UIEvent.SearchUser -> {
                if(_userScreenState.value.query.isNotBlank()) {
                    searchForUser(_userScreenState.value.query)
                }
            }

            is UIEvent.OnFindUser -> {
                findUser(event.username)
            }
        }
    }

    private fun searchForRepo(q: String) {
        viewModelScope.launch {
            searchRepoUseCase(q).collect{ resource ->
                when(resource) {
                    is Resource.Success -> {
                        _repoScreenState.value = RepoScreenState(
                            data = resource.data
                        )
                    }
                    is Resource.Error -> {
                        _repoScreenState.value = RepoScreenState(
                            hasError = true,
                            errorMessage = resource.message
                        )
                    }
                    is Resource.Loading -> {
                        _repoScreenState.value = RepoScreenState(
                            isLoading = true
                        )
                    }
                }
            }
        }
    }
    private fun searchForUser(q: String) {
        viewModelScope.launch {
            searchUserUseCase(q).collect{ resource ->
                when(resource) {
                    is Resource.Success -> {
                        _userScreenState.value = UserScreenState(
                            data = resource.data
                        )
                    }
                    is Resource.Error -> {
                        _userScreenState.value = UserScreenState(
                            hasError = true,
                            errorMessage = resource.message
                        )
                    }
                    is Resource.Loading -> {
                        _userScreenState.value = UserScreenState(
                            isLoading = true
                        )
                    }
                }
            }
        }
    }

    private fun findUser(username: String) {
        viewModelScope.launch {
            findUserUseCase(username).collect{ resource ->
                when(resource) {
                    is Resource.Success -> {
                        _userDetailScreenState.value = UserDetailScreenState(
                            userData = resource.data
                        )
                        findRepoForUser(username)
                    }
                    is Resource.Error -> {
                        _userDetailScreenState.value = UserDetailScreenState(
                            hasError = true,
                            errorMessage = resource.message
                        )
                    }
                    is Resource.Loading -> {
                        _userDetailScreenState.value = UserDetailScreenState(
                            isLoadingUserData = true
                        )
                    }
                }
            }
        }
    }

    private fun findRepoForUser(username: String) {
        viewModelScope.launch {
            findRepoForUserUseCase(username).collect{ resource ->
                when(resource) {
                    is Resource.Success -> {
                        _userDetailScreenState.value = _userDetailScreenState.value.copy(
                            userRepo = resource.data,
                            isLoadingUserRepoData = false
                        )
                    }
                    is Resource.Error -> {
                        _userDetailScreenState.value = _userDetailScreenState.value.copy(
                            hasError = true,
                            errorMessage = resource.message
                        )
                    }
                    is Resource.Loading -> {
                        _userDetailScreenState.value = _userDetailScreenState.value.copy(
                            isLoadingUserRepoData = true
                        )
                    }
                }
            }
        }
    }
}