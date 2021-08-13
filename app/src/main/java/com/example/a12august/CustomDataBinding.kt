package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a12august.databinding.ActivityCustomDataBindingBinding

class CustomDataBinding : AppCompatActivity() {
    lateinit var binding:ActivityCustomDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_custom_data_binding)
        binding.postObj = Post("this is title",
            "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
            "https://images.unsplash.com/photo-1493962621260-74cc5a3baf89?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MXwxMDY1Mzc2fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60")

    }
}