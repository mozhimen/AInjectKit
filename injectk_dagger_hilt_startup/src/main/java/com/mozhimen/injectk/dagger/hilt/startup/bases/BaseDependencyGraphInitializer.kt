package com.mozhimen.injectk.dagger.hilt.startup.bases

import android.content.Context
import androidx.startup.Initializer
import com.mozhimen.injectk.dagger.hilt.startup.optins.OApiCall_InitializerEntryPointResolve

/**
 * @ClassName DependencyGraphInitializer
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/6/17
 * @Version 1.0
 */
@OApiCall_InitializerEntryPointResolve
abstract class BaseDependencyGraphInitializer : Initializer<Unit> {

//    override fun create(context: Context) {
        //this will lazily initialize ApplicationComponent before Application's `onCreate`
//        InitializerEntryPoint.resolve(context)
//        return
//    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}