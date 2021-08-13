package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.a12august.Factory.MainViewModelFactory
import com.example.a12august.Model.MainViewModel
import kotlinx.android.synthetic.main.activity_view_model.*

class ViewModelActivity : AppCompatActivity() {
    lateinit var mainViewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)
        setText()
    }

    fun increment(view: View) {
        mainViewModel.increment()
        setText()
    }

    fun setText(){
        text_counter.text = mainViewModel.count.toString()
    }
}