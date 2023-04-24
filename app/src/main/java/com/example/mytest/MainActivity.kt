package com.example.mytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.blankj.utilcode.util.TimeUtils
import com.example.mytest.databinding.ActivityMainBinding

class MainActivity : BaseVMActivity<MainModel,ActivityMainBinding>() {
    override fun layoutId(): Int =R.layout.activity_main

    override fun initView(savedInstanceState: Bundle?) {
        mDatabind.vm=mViewModel
        mDatabind.listener=OnViewClick()



        mDatabind.etMoney.addTextChangedListener {

            mViewModel.moneyString.value=it.toString()
        }

        mDatabind.etTime.addTextChangedListener {

            mViewModel.time.value=it.toString()

            mViewModel.timeString.value= TimeUtils.millis2String(it.toString().toLong(),"yyyy-MM-dd HH:mm")
        }

    }



    override fun createObserver() {

    }

    inner class OnViewClick(){
        fun onResultClick(){

            var intent=Intent(this@MainActivity,Main2Activity::class.java)
            intent.putExtra("result", mViewModel.time.value?.toInt()?:0 * mViewModel.timeString.value?.toInt()!!
            ?:0)
            startActivity(intent)





        }
    }
}