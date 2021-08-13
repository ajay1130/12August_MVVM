package com.example.a12august.Model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class LiveDataViewModel:ViewModel() {
    private var liveData = MutableLiveData("First text")
        val liveDataImmutable:LiveData<String>
        get() = liveData
    fun setText(){
        liveData.value = "Text number ${Random.nextInt(1,100)}"
    }
}