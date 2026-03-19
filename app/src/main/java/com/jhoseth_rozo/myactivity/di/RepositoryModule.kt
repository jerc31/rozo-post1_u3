package com.jhoseth_rozo.myactivity.di

import com.jhoseth_rozo.myactivity.data.FakeTaskRepository
import com.jhoseth_rozo.myactivity.domain.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindTaskRepository(
        impl: FakeTaskRepository
    ): TaskRepository
}
