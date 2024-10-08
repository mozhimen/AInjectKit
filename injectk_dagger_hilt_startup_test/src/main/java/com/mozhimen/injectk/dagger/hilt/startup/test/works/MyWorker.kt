package com.mozhimen.injectk.dagger.hilt.startup.test.works

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.Constraints
import androidx.work.CoroutineWorker
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequest
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkerParameters
import com.mozhimen.injectk.dagger.hilt.startup.test.helpers.TaskRepository
import com.mozhimen.kotlin.utilk.commons.IUtilK
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.delay
import java.util.concurrent.TimeUnit

@HiltWorker
class MyWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val taskRepository: TaskRepository,
) : CoroutineWorker(appContext, workerParams), IUtilK {

    override suspend fun doWork(): Result {
//        crashTrackerService.log(TAG, "doWork:------------> running my work")
        Log.d(TAG, "doWork: MyWorker success")
        return Result.success()
    }

//    companion object {
    //        WorkManager.getInstance(context).
//        enqueueUniqueWork(
//            "sync_work",
//            ExistingWorkPolicy.REPLACE,
//            MyWorker.oneTimeWorkRequest()
//        )

//        const val TAG = "MyWork"
//        private const val DEFAULT_MIN_INTERVAL = 15L
//
//        fun oneTimeWorkRequest(): OneTimeWorkRequest {
//            val constrains = Constraints.Builder()
//                .setRequiredNetworkType(NetworkType.CONNECTED)
//                .build()
//
//            return OneTimeWorkRequestBuilder<MyWorker>()
//                .setConstraints(constrains)
//                .addTag("my_work_tag")
//                .build()
//        }
//
//        fun periodicWorkRequest(): PeriodicWorkRequest {
//            val constrains = Constraints.Builder()
//                .setRequiredNetworkType(NetworkType.CONNECTED)
//                .build()
//            return PeriodicWorkRequestBuilder<MyWorker>(
//                DEFAULT_MIN_INTERVAL,
//                TimeUnit.MINUTES
//            ).setConstraints(constrains)
//                .build()
//        }
//    }
}
