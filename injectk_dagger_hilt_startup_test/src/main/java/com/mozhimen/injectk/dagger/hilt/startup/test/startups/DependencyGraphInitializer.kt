package com.mozhimen.injectk.dagger.hilt.startup.test.startups

import android.content.Context
import com.mozhimen.injectk.dagger.hilt.startup.bases.BaseDependencyGraphInitializer
import com.mozhimen.injectk.dagger.hilt.startup.commons.IInitializerEntryPoint
import com.mozhimen.injectk.dagger.hilt.startup.optins.OApiCall_InitializerEntryPointResolve
import com.mozhimen.injectk.dagger.hilt.startup.test.dis.InitializerEntryPoint

@OptIn(OApiCall_InitializerEntryPointResolve::class)
class DependencyGraphInitializer : BaseDependencyGraphInitializer() {
    override fun create(context: Context) {
        IInitializerEntryPoint.resolve<InitializerEntryPoint>(context)
    }
}