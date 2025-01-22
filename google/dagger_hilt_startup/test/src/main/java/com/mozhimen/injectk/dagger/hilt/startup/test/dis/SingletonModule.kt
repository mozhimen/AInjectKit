package com.mozhimen.injectk.dagger.hilt.startup.test.dis

import android.content.Context
import com.mozhimen.injectk.dagger.hilt.startup.test.helpers.TaskRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SingletonModule {

    @Provides
    @Singleton
    fun provideTaskRepository(@ApplicationContext context: Context): TaskRepository =
        TaskRepository(context)
}