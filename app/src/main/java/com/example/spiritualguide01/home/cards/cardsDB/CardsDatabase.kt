package com.example.spiritualguide01.home.cards.cardsDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.spiritualguide01.home.cards.cardsModel.Card

@Database(entities = [Card::class], version = 1)
abstract class CardsDatabase  : RoomDatabase() {

    abstract val cardsDao: CardsDao

    companion object {
        private lateinit var dbInstance: CardsDatabase

        fun getDatabase(context: Context): CardsDatabase {
            synchronized(this) {
                if (!this::dbInstance.isInitialized) {
                    dbInstance = Room.databaseBuilder(
                        context.applicationContext,
                        CardsDatabase::class.java,
                        "cards_database"
                    ).allowMainThreadQueries().build()
                }
                return dbInstance
            }
        }
    }



}