package com.mozhimen.injectk.dagger.hilt.startup.test.initializer

import android.content.Context
import androidx.startup.Initializer
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import com.mozhimen.injectk.dagger.hilt.startup.test.work.MyWorker

/**
 * @ClassName MyTaskInitializer
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/7/1
 * @Version 1.0
 */
class MyTaskInitializer: Initializer<Unit> {
    override fun create(context: Context) {
        val workManager = WorkManager.getInstance(context)
        workManager.enqueueUniqueWork(
            "sync_work",
            ExistingWorkPolicy.REPLACE,
            MyWorker.oneTimeWorkRequest()
        )
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(WorkManagerInitializer::class.java)
    }
}