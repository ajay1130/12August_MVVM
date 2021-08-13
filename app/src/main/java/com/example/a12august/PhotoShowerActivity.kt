package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a12august.Api.RetroFitObj
import com.example.a12august.Model.PhotoShowerAdpater
import com.example.a12august.Model.PhotoShowerViewModel
import com.example.a12august.Model.PhotosModelItem
import kotlinx.android.synthetic.main.activity_photo_shower.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

class PhotoShowerActivity : AppCompatActivity() {
    lateinit var photoViewModel : PhotoShowerViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_shower)
        photoViewModel = ViewModelProvider(this).get(PhotoShowerViewModel::class.java)
        setData()

    }

    fun changeData(view: View) {
       setData()
    }

    private fun setData(){

        val adpater = PhotoShowerAdpater(this,
            photoViewModel.listData.shuffled() as ArrayList<PhotosModelItem>
        )
        recyclerview_photoshower.layoutManager = LinearLayoutManager(this)
        recyclerview_photoshower.adapter = adpater
    }
}