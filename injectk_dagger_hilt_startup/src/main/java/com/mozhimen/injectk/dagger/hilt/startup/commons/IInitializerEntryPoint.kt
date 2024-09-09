package com.mozhimen.injectk.dagger.hilt.startup.commons

import android.content.Context
import com.mozhimen.injectk.dagger.hilt.startup.bases.BaseHiltInitializer
import com.mozhimen.injectk.dagger.hilt.startup.optins.OApiCall_InitializerEntryPointResolve
import dagger.hilt.android.EntryPointAccessors

/**
 * @ClassName InitializerEntryPoint
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/6/17
 * @Version 1.0
 */
//@EntryPoint
//@InstallIn(SingletonComponent::class) //<-- installing in the ApplicationComponent !!
interface IInitializerEntryPoint {
    companion object {
        //a helper method to resolve the InitializerEntryPoint from the context
        @JvmStatic
        inline fun <reified T : IInitializerEntryPoint> resolve(context: Context): T {
            val appContext = context.applicationContext ?: throw IllegalStateException()
            return EntryPointAccessors.fromApplication(appContext, T::class.java)
        }
    }
}