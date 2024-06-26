package com.mozhimen.injectk.dagger.hilt.startup.test.service

import android.content.Context
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import com.mozhimen.injectk.dagger.hilt.startup.test.work.MyWorker

class TaskRepository(private val appContext: Context) {

    fun runWork() {
        val workManager = WorkManager.getInstance(appContext)
        workManager.enqueueUniqueWork(
            "sync_work",
            ExistingWorkPolicy.REPLACE,
            MyWorker.oneTimeWorkRequest()
        )
    }

    fun runPeriodicWork() {
        val workManager = WorkManager.getInstance(appContext)
        workManager.enqueueUniquePeriodicWork(
            MyWorker.TAG,
            ExistingPeriodicWorkPolicy.CANCEL_AND_REENQUEUE,
            MyWorker.periodicWorkRequest()
        )
    }
}