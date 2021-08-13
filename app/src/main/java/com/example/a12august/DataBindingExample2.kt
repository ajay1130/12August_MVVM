package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a12august.databinding.ActivityDataBindingExample2Binding


class DataBindingExample2 : AppCompatActivity() {
    lateinit var dataBindingExample2: ActivityDataBindingExample2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBindingExample2 = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_example2)
        dataBindingExample2.modeldata = Student("xyz","123")

    }
}