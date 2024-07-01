package com.mozhimen.injectk.dagger.hilt.startup.test.di

import android.content.Context
import com.mozhimen.injectk.dagger.hilt.startup.test.initializer.CrashTrackerInitializer
import com.mozhimen.injectk.dagger.hilt.startup.test.initializer.WorkManagerInitializer
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface InitializerEntryPoint {
    fun inject(crashTrackerInitializer: CrashTrackerInitializer)
    fun inject(crashTrackerInitializer: WorkManagerInitializer)

    companion object {
        fun resolve(context: Context): InitializerEntryPoint {
            val appContext = context.applicationContext ?: throw IllegalStateException()
            return EntryPointAccessors.fromApplication(
                appContext,
                InitializerEntryPoint::class.java
            )
        }
    }

}