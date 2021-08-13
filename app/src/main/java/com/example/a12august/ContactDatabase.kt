package com.example.a12august

import android.content.Context
import androidx.room.*

@Database(entities = [Contact::class],version = 1)
@TypeConverters(Convertors::class)
abstract class ContactDatabase:RoomDatabase() {
    abstract fun contactDao() : ContactDao

    companion object {
        var instance:ContactDatabase?=null
        fun getInstance(context: Context):ContactDatabase{
            if(instance==null){
                synchronized(this){
                    instance = Room.databaseBuilder(context.applicationContext,
                        ContactDatabase::class.java,
                        "contactDB").build()

                }
            }
            return instance!!
        }
    }
}