package com.example.mytest

import androidx.lifecycle.MutableLiveData

class MainModel2:BaseViewModel() {

    var moneyString= MutableLiveData<String>()
    var timeString=MutableLiveData<String>()
}