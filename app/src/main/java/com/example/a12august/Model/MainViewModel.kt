package com.example.a12august.Model

import androidx.lifecycle.ViewModel

class MainViewModel(counter:Int):ViewModel() {
    var count:Int =counter

    fun increment(){
        count++
    }
}