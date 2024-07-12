package com.example.samplegithubapp.domain.state

sealed class UIEvent {
    data class RepoSearchQueryChanged(val query: String): UIEvent()
    data class UserSearchQueryChanged(val query: String): UIEvent()
    data class OnFindUser(val username: String): UIEvent()
    object SearchRepo: UIEvent()
    object SearchUser: UIEvent()
}
