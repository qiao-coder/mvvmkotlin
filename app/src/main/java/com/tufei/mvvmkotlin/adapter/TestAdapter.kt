package com.tufei.mvvmkotlin.adapter

import com.tufei.mvvmkotlin.R
import com.tufei.mvvmkotlin.databinding.TestItemBinding

/**
 * @author tufei
 * @date 2018/2/21.
 */
class TestAdapter(layoutId: Int = R.layout.test_item)
    : BaseAdapter<Data, TestItemBinding>(layoutId)