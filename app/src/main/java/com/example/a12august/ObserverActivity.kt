package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ObserverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)
        lifecycle.addObserver(Observer())
        Log.d("Observer","onCreate called from observeractivity...")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Observer","onStart called from observeractivity...")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Observer","onResume called from observeractivity...")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Observer","onPause called from observeractivity...")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Observer","onStop called from observeractivity...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Observer","onDestroy called from observeractivity...")
    }
}