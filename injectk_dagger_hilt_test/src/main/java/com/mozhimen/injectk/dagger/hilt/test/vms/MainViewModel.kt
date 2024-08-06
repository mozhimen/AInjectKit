package com.mozhimen.injectk.dagger.hilt.test.vms

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mozhimen.basick.elemk.androidx.lifecycle.bases.BaseViewModel
import com.mozhimen.injectk.dagger.hilt.test.commons.IGetValueListener
import com.mozhimen.injectk.dagger.hilt.test.helpers.CacheRepository
import com.mozhimen.injectk.dagger.hilt.test.helpers.RemoteRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * @ClassName MainViewModel
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/7 11:27
 * @Version 1.0
 */
class MainViewModel @AssistedInject constructor(
    private val _cacheRepository: CacheRepository,
    private val _remoteRepository: RemoteRepository,
    private val _getValueListener: IGetValueListener,
    @Assisted
    private val _strTest: String
) : BaseViewModel() {
    fun getCache(): String = _cacheRepository.getCache()
    fun getRemote(): String = _remoteRepository.getRemote()

    private val _msfValue = MutableStateFlow(_getValueListener.onGetValue())
    val sfValue: StateFlow<String> = _msfValue

    @AssistedFactory
    interface Factory {
        fun create(strTest: String): MainViewModel
    }

    companion object {
        fun provideMainViewModelFactory(factory: Factory, strTest: String): ViewModelProvider.Factory {
            return object : ViewModelProvider.Factory {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return factory.create(strTest) as T
                }
            }
        }
    }

    private val _liveTest = MutableLiveData(_strTest)
    val liveTest: LiveData<String?> get() = _liveTest
}