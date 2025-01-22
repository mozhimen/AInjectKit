package com.mozhimen.injectk.dagger.hilt.startup.test.startups

import android.content.Context
import androidx.lifecycle.ProcessLifecycleInitializer
import androidx.startup.Initializer
import com.mozhimen.injectk.dagger.hilt.startup.bases.BaseDependencyGraphInitializer
import com.mozhimen.injectk.dagger.hilt.startup.bases.BaseHiltInitializer
import com.mozhimen.injectk.dagger.hilt.startup.commons.IInitializerEntryPoint
import com.mozhimen.injectk.dagger.hilt.startup.optins.OApiCall_InitializerEntryPointResolve
import com.mozhimen.injectk.dagger.hilt.startup.test.dis.InitializerEntryPoint

/**
 * @ClassName MyInjectInitializer
 * @Description TODO
 * @Author mozhimen
 * @Date 2024/9/9
 * @Version 1.0
 */
@OptIn(OApiCall_InitializerEntryPointResolve::class)
class MyInjectInitializer : BaseHiltInitializer<Unit>() {
    override fun getDependencyGraphInitializer(): Class<out BaseDependencyGraphInitializer> {
        return DependencyGraphInitializer::class.java
    }

    override fun create(context: Context) {
        IInitializerEntryPoint.resolve<InitializerEntryPoint>(context).inject(this)
        //TODO
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return super.dependencies() + listOf(ProcessLifecycleInitializer::class.java)
    }
}