package com.example.a12august

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_live_data.*
import kotlinx.android.synthetic.main.activity_room_database.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class RoomDatabaseActivity : AppCompatActivity() {
    lateinit var database:ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_database)
        database = ContactDatabase.getInstance(this)
        CoroutineScope(Dispatchers.IO).launch {
            database.contactDao().insertContact(Contact(0,"ajay","8888888888",
                Date()))
        }

    }

    fun setData(view: View) {
        text_database.text =database.contactDao().getContact().value.toString()
    }
}