package com.mozhimen.injectk.dagger.hilt.test

import com.mozhimen.stackk.bases.BaseApplication
import com.mozhimen.kotlin.lintk.optins.api.OApiMultiDex_InApplication
import dagger.hilt.android.HiltAndroidApp

@OptIn(OApiMultiDex_InApplication::class)
@HiltAndroidApp
class MainApplication : BaseApplication()