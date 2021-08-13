package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a12august.Model.LiveDataViewModel
import kotlinx.android.synthetic.main.activity_live_data.*
import kotlin.properties.Delegates

class LiveDataActivity : AppCompatActivity() {
    lateinit var liveDataViewModel:LiveDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        liveDataViewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        button_livedata.setOnClickListener {
            liveDataViewModel.setText()
        }

        liveDataViewModel.liveDataImmutable.observe(this, Observer{
            text_livedata.text=it
        })

    }
}