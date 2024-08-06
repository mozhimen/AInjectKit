package com.mozhimen.injectk.dagger.hilt.test

import com.mozhimen.basick.elemk.android.app.bases.BaseApplication
import com.mozhimen.basick.lintk.optins.OApiMultiDex_InApplication
import dagger.hilt.android.HiltAndroidApp

@OptIn(OApiMultiDex_InApplication::class)
@HiltAndroidApp
class MainApplication : BaseApplication()