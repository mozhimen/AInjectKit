package com.mozhimen.study_hilt.dis

import com.mozhimen.injectk.dagger.hilt.test.helpers.CacheRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @ClassName Repository
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/12 17:49
 * @Version 1.0
 */
@Module
@InstallIn(SingletonComponent::class)
class SingletonModule {

    @Singleton
    @Provides
    fun provideCacheRepository(): CacheRepository = CacheRepository()
}