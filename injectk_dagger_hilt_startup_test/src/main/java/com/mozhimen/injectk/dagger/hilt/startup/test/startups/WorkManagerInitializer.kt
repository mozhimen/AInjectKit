package com.mozhimen.injectk.dagger.hilt.startup.test.startups

import android.content.Context
import androidx.hilt.work.HiltWorkerFactory
import androidx.startup.Initializer
import androidx.work.Configuration
import androidx.work.WorkManager
import com.mozhimen.injectk.dagger.hilt.startup.bases.BaseDependencyGraphInitializer
import com.mozhimen.injectk.dagger.hilt.startup.bases.BaseHiltInitializer
import com.mozhimen.injectk.dagger.hilt.startup.commons.IInitializerEntryPoint
import com.mozhimen.injectk.dagger.hilt.startup.optins.OApiCall_InitializerEntryPointResolve
import com.mozhimen.injectk.dagger.hilt.startup.test.dis.InitializerEntryPoint
import javax.inject.Inject

@OptIn(OApiCall_InitializerEntryPointResolve::class)
class WorkManagerInitializer : BaseHiltInitializer<WorkManager>(), Configuration.Provider {

    @Inject
    lateinit var workerFactory: HiltWorkerFactory

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()

    override fun create(context: Context): WorkManager {
        IInitializerEntryPoint.resolve<InitializerEntryPoint>(context).inject(this)
        WorkManager.initialize(context, workManagerConfiguration)
        return WorkManager.getInstance(context)
    }

    override fun getDependencyGraphInitializer(): Class<out BaseDependencyGraphInitializer> {
        return DependencyGraphInitializer::class.java
    }
}