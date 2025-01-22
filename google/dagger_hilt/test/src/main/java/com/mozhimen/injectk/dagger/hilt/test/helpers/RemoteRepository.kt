package com.mozhimen.injectk.dagger.hilt.test.helpers

import javax.inject.Inject

/**
 * @ClassName Repository
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/6/12 22:13
 * @Version 1.0
 */
class RemoteRepository {
    @Inject constructor()

    fun getRemote(): String = "789"
}