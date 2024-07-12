package com.example.samplegithubapp.di

import com.example.samplegithubapp.data.api.GithubRepositoryImpl
import com.example.samplegithubapp.domain.repository.GithubRepository
import com.example.samplegithubapp.domain.use_cases.SearchRepoUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindGithubRepository(
        githubRepositoryImpl: GithubRepositoryImpl
    ): GithubRepository

}