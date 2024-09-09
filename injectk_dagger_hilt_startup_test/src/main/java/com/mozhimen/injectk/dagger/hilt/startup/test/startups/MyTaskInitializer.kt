package com.mozhimen.injectk.dagger.hilt.startup.test.startups

import android.content.Context
import androidx.startup.Initializer
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.mozhimen.injectk.dagger.hilt.startup.test.works.MyWorker

/**
 * @ClassName MyTaskInitializer
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/7/1
 * @Version 1.0
 */
class MyTaskInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        WorkManager.getInstance(context).beginWith(
            OneTimeWorkRequest.Builder(MyWorker::class.java).build()
        ).enqueue()
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(WorkManagerInitializer::class.java)
    }
}