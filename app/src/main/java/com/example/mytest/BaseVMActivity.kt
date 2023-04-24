package com.example.mytest

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider

abstract class BaseVMActivity<VM : BaseViewModel, DB : ViewDataBinding> : AppCompatActivity() {
    lateinit var mViewModel: VM
    lateinit var mDatabind: DB
    abstract fun layoutId(): Int
    abstract fun initView(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)



        initDataBind()

        init(savedInstanceState)

    }


    private fun init(savedInstanceState: Bundle?) {
        mViewModel = createViewModel()
        initView(savedInstanceState)
        createObserver()
    }


    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        return super.dispatchTouchEvent(ev)
    }
    fun createViewModel(): VM {
        return ViewModelProvider(this).get(getVmClazz(this))
    }

    abstract fun createObserver()

    open fun initDataBind() {
        mDatabind = DataBindingUtil.setContentView(this, layoutId())
        mDatabind.lifecycleOwner = this
    }








}