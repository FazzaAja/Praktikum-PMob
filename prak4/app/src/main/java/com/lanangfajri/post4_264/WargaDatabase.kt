package com.lanangfajri.post4_264

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Warga::class], version = 1, exportSchema = false)
abstract class WargaDatabase : RoomDatabase() {

    abstract fun wargaDao(): WargaDao

    companion object {
        @Volatile
        private var INSTANCE: WargaDatabase? = null

        fun getDatabase(context: Context): WargaDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WargaDatabase::class.java,
                    "warga_database"
                )
                    .allowMainThreadQueries()
                    .build()

                INSTANCE = instance
                instance
            }
        }
    }
}