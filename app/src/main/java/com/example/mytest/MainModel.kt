package com.example.mytest

import androidx.lifecycle.MutableLiveData

class MainModel:BaseViewModel() {

    var moneyString= MutableLiveData<String>("0")
    var timeString=MutableLiveData<String>()
    var time=MutableLiveData<String>()

}