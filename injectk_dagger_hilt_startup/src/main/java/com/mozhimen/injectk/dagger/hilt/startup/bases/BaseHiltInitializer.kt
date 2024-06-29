package com.mozhimen.injectk.dagger.hilt.startup.bases

import androidx.startup.Initializer

/**
 * @ClassName BaseHiltInitializer
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/6/17
 * @Version 1.0
 */
abstract class BaseHiltInitializer : Initializer<Unit> {
    abstract fun getDependencyGraphInitializer(): Class<out BaseDependencyGraphInitializer>
    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(getDependencyGraphInitializer())
    }
}