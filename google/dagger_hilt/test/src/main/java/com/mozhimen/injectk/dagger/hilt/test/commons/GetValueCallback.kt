package com.mozhimen.injectk.dagger.hilt.test.commons

import javax.inject.Inject

/**
 * @ClassName GetValueCallback
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/13 11:52
 * @Version 1.0
 */
class GetValueCallback @Inject constructor() : IGetValueListener {
    override fun onGetValue(): String = "这是@Bind的实践"
}