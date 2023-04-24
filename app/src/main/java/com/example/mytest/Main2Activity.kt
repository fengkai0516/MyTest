package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.blankj.utilcode.util.TimeUtils
import com.example.mytest.databinding.ActivityMain2Binding
import com.example.mytest.databinding.ActivityMainBinding

class Main2Activity : BaseVMActivity<MainModel2,ActivityMain2Binding>() {
    override fun layoutId(): Int =R.layout.activity_main2

    override fun initView(savedInstanceState: Bundle?) {
        mDatabind.vm=mViewModel

     var time=  intent.getStringExtra("result")

        mDatabind.tvResult.text=time





    }



    override fun createObserver() {

    }


}