package com.mozhimen.injectk.dagger.hilt.startup.test

import android.os.Bundle
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.mozhimen.injectk.dagger.hilt.startup.test.databinding.ActivityMainBinding
import com.mozhimen.injectk.dagger.hilt.startup.test.helpers.TaskRepository
import com.mozhimen.injectk.dagger.hilt.startup.test.works.MyWorker
import com.mozhimen.bindk.bases.activity.viewbinding.BaseActivityVB
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivityVB<ActivityMainBinding>() {

    @Inject
    lateinit var taskRepository: TaskRepository

    override fun initView(savedInstanceState: Bundle?) {
        vb.mainBtn1.setOnClickListener {
            WorkManager.getInstance(this).enqueueUniqueWork(
                taskRepository.getUniqueWorkName(),
                ExistingWorkPolicy.KEEP,
                OneTimeWorkRequest.Builder(MyWorker::class.java).build()
            )
        }
    }
}