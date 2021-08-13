package com.example.a12august.Model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a12august.R

class PhotoShowerAdpater(val context: Context,val listData:ArrayList<PhotosModelItem>):
    RecyclerView.Adapter<PhotoShowerAdpater.PhotosViewHolder>() {
    class PhotosViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
        val imagePhotosShower : ImageView = itemview.findViewById(R.id.image_photoshower)
        val textPhotoShower : TextView = itemview.findViewById(R.id.text_photoshower)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_photoshower,parent,false)
        return PhotosViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        Glide
            .with(context)
            .load("https://images.unsplash.com/photo-1509825826883-62284c8c7ea5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MnwxMDY1Mzc2fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
            .into(holder.imagePhotosShower)
        holder.textPhotoShower.text = listData[position].title
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}