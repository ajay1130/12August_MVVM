package com.example.a12august

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showObserverActivity(view: View) {
        startActivity(Intent(this,ObserverActivity::class.java))
    }

    fun showViewModelActivity(view: View) {
        startActivity(Intent(this,ViewModelActivity::class.java))
    }

    fun showPhotosActivity(view: View) {
        startActivity(Intent(this,PhotoShowerActivity::class.java))
    }

    fun showLiveDataActivity(view: View) {
        startActivity(Intent(this,LiveDataActivity::class.java))
    }

    fun showDataBinding(view: View) {
        startActivity(Intent(this,DataBindingExample2::class.java))
    }

    fun showDataBinding2(view: View) {
        startActivity(Intent(this,DataBinding1::class.java))
    }

    fun showCustomBinding(view: View) {
        startActivity(Intent(this,CustomDataBinding::class.java))
    }

    fun showRoomDatabase(view: View) {
        startActivity(Intent(this,RoomDatabaseActivity::class.java))
    }

    fun showRoomDatabseMVVM(view: View) {

    }
}