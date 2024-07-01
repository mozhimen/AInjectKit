package com.mozhimen.injectk.dagger.hilt.startup.test.initializer

import android.content.Context
import androidx.startup.Initializer
import com.mozhimen.injectk.dagger.hilt.startup.test.di.InitializerEntryPoint

class DependencyGraphInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        InitializerEntryPoint.resolve(context)
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}