package com.example.a12august.Model

import androidx.lifecycle.ViewModel
import com.example.a12august.Api.RetroFitObj
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

class PhotoShowerViewModel():ViewModel() {
    var listData:ArrayList<PhotosModelItem>
    init {
      val job1 =   CoroutineScope(Dispatchers.IO).async {
            RetroFitObj.obj.getPhotosData()
        }
        runBlocking {
           listData = job1.await() as ArrayList<PhotosModelItem>
        }
        runBlocking {
            job1.join()
        }

    }
}