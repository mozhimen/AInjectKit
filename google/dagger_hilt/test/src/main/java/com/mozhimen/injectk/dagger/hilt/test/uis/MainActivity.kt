package com.mozhimen.injectk.dagger.hilt.test.uis

import android.os.Bundle
import androidx.activity.viewModels
import com.mozhimen.uik.databinding.bases.activity.databinding.BaseActivityVDB
import com.mozhimen.injectk.dagger.hilt.test.databinding.ActivityMainBinding
import com.mozhimen.injectk.dagger.hilt.test.mos.ActivityBean
import com.mozhimen.injectk.dagger.hilt.test.vms.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivityVDB<ActivityMainBinding>() {
    @Inject
    lateinit var activityBean: ActivityBean

    @Inject
    lateinit var _factory: MainViewModel.Factory

    private val _vm: MainViewModel by viewModels {
        MainViewModel.provideMainViewModelFactory(_factory, "这是我要传进去的值")
    }

    override fun initView(savedInstanceState: Bundle?) {
        vdb.vm = _vm
        vdb.mainTxt.text = activityBean.name
        vdb.mainTxt1.text = _vm.getCache()
        vdb.mainTxt2.text = _vm.getRemote()
    }
}