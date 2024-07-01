package com.mozhimen.injectk.dagger.hilt.startup.test.di

import android.content.Context
import com.mozhimen.injectk.dagger.hilt.startup.test.service.CrashTrackerService
import com.mozhimen.injectk.dagger.hilt.startup.test.service.TaskRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCrashTracker() = CrashTrackerService()

    @Provides
    @Singleton
    fun provideTaskRepository(@ApplicationContext context: Context) = TaskRepository(context)
}