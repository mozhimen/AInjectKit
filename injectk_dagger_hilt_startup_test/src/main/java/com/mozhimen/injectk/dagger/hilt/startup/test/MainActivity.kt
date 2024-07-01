package com.mozhimen.injectk.dagger.hilt.startup.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mozhimen.injectk.dagger.hilt.startup.test.service.CrashTrackerService
import com.mozhimen.injectk.dagger.hilt.startup.test.service.TaskRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var crashTrackerService: CrashTrackerService

    @Inject
    lateinit var taskRepository: TaskRepository

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.main_txt2).text = "Service initialized: ${crashTrackerService.isInitialized}"
        findViewById<Button>(R.id.main_btn1).setOnClickListener {
            taskRepository.runWork()
        }
        findViewById<Button>(R.id.main_btn2).setOnClickListener {
            taskRepository.runPeriodicWork()
        }
    }
}