package com.mozhimen.injectk.dagger.hilt.startup.test.helpers

import android.content.Context

class TaskRepository(private val appContext: Context) {

    fun getUniqueWorkName():String =
        "UniqueWork"

//    fun getUniquePeriodicWorkName() :String =
//        "UniquePeriodicWork"

//    fun enqueueUniqueWork() {
//        WorkManager.getInstance(appContext).enqueueUniqueWork(
//            "sync_work",
//            ExistingWorkPolicy.REPLACE,
//            MyWorker.oneTimeWorkRequest()
//        )
//    }
//
//    fun enqueueUniquePeriodicWork() {
//        WorkManager.getInstance(appContext).enqueueUniquePeriodicWork(
//            MyWorker.TAG,
//            ExistingPeriodicWorkPolicy.CANCEL_AND_REENQUEUE,
//            MyWorker.periodicWorkRequest()
//        )
//    }
}