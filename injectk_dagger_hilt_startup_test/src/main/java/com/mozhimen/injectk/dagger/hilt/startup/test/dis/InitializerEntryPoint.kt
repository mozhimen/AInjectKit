package com.mozhimen.injectk.dagger.hilt.startup.test.dis

import com.mozhimen.injectk.dagger.hilt.startup.commons.IInitializerEntryPoint
import com.mozhimen.injectk.dagger.hilt.startup.test.startups.MyInjectInitializer
import com.mozhimen.injectk.dagger.hilt.startup.test.startups.WorkManagerInitializer
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface InitializerEntryPoint : IInitializerEntryPoint {
    fun inject(workManagerInitializer: WorkManagerInitializer)
    fun inject(myInjectInitializer: MyInjectInitializer)
}