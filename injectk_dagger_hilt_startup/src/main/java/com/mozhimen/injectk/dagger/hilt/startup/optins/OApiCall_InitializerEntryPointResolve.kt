package com.mozhimen.injectk.dagger.hilt.startup.optins

/**
 * @ClassName OApiCall_InitializerEntryPointResolve
 * @Description TODO
 * @Author mozhimen
 * @Date 2024/9/9
 * @Version 1.0
 */
@RequiresOptIn("The api is must call < InitializerEntryPoint.resolve() >. 需要注入代码", RequiresOptIn.Level.WARNING)
annotation class OApiCall_InitializerEntryPointResolve