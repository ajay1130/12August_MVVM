package com.example.a12august.Api

import com.example.a12august.Model.PhotosModelItem
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val BASE_URI = "https://jsonplaceholder.typicode.com/"
interface PhotosApi {
    @GET("photos")
    suspend fun getPhotosData():List<PhotosModelItem>

}

object RetroFitObj {
    val obj:PhotosApi
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URI)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        obj = retrofit.create(PhotosApi::class.java)
    }
}