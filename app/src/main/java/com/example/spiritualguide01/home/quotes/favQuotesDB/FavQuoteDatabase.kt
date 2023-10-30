package com.example.spiritualguide01.home.quotes.favQuotesDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.spiritualguide01.home.quotes.datamodel.FavoriteQuote

@Database(entities = [FavoriteQuote::class], version = 1)

abstract class FavQuoteDatabase : RoomDatabase() {

    abstract val favQuoteDao: FavQuoteDao

    companion object{
        private lateinit var dbInstance: FavQuoteDatabase

        fun getDatabase(context: Context): FavQuoteDatabase {
            synchronized(this) {
                // Initialisiere Datenbank
                if (!this::dbInstance.isInitialized) {
                    dbInstance = Room.databaseBuilder(
                        context.applicationContext,
                        FavQuoteDatabase::class.java,
                        "favorites_table"
                    ).allowMainThreadQueries().build()
                }
                return dbInstance
            }
        }


    }

}