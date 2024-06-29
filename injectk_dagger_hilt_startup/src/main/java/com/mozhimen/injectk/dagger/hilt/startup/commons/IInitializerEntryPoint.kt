package com.mozhimen.injectk.dagger.hilt.startup.commons

import android.content.Context
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

//    fun inject(initializer: BaseHiltInitializer)

//    companion object {
        //a helper method to resolve the InitializerEntryPoint from the context
//        @JvmStatic
//        fun resolve(context: Context): IInitializerEntryPoint {
//            val appContext = context.applicationContext ?: throw IllegalStateException()
//            return EntryPointAccessors.fromApplication(appContext, IInitializerEntryPoint::class.java)
//        }
//    }
}