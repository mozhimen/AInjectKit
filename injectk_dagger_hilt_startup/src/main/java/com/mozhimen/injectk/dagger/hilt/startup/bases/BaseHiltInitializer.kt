package com.mozhimen.injectk.dagger.hilt.startup.bases

import android.content.Context
import androidx.startup.Initializer
import com.mozhimen.injectk.dagger.hilt.startup.optins.OApiCall_InitializerEntryPointResolve

/**
 * @ClassName BaseHiltInitializer
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/6/17
 * @Version 1.0
 */
@OApiCall_InitializerEntryPointResolve
abstract class BaseHiltInitializer<T : Any> : Initializer<T> {
    abstract fun getDependencyGraphInitializer(): Class<out BaseDependencyGraphInitializer>

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(getDependencyGraphInitializer())
    }
}