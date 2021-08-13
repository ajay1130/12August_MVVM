package com.example.a12august

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DataBindingViewModel:ViewModel() {
    var liveData:MutableLiveData<String> = MutableLiveData("inital value")

    fun changeText(){
        liveData.value = "value is ${Random.nextInt(1,100)}"
    }
}