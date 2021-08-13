package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.a12august.databinding.ActivityDataBinding1Binding

class DataBinding1 : AppCompatActivity() {
    lateinit var binding:ActivityDataBinding1Binding
    lateinit var bindingViewModel: DataBindingViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding1)
        bindingViewModel = ViewModelProvider(this).get(DataBindingViewModel::class.java)
        binding.dataBindingViewModel = bindingViewModel
        binding.lifecycleOwner = this
    }
}