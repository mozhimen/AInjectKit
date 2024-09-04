package com.mozhimen.injectk.dagger.hilt.startup.test.service

import com.mozhimen.kotlin.utilk.android.util.UtilKLogWrapper

class CrashTrackerService {

    var isInitialized: Boolean = false
        private set

    fun initialize() {
        isInitialized = true
    }

    fun log(tag: String, data: String) {
        UtilKLogWrapper.i(tag, data)
    }
}