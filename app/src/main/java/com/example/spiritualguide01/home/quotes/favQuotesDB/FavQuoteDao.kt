package com.example.spiritualguide01.home.quotes.favQuotesDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.spiritualguide01.home.quotes.datamodel.FavoriteQuote

@Dao
interface FavQuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavDao(itemData: FavoriteQuote)

    // get all  FavoriteQuote:
    @Query("SELECT * FROM favorites_table")
    fun getAll(): LiveData<List<FavoriteQuote>>

    // delete FavoriteQuote by ID:
    @Query("DELETE FROM favorites_table WHERE q = :text")
    fun delete(text: String)

    @Query("SELECT COUNT(*) FROM favorites_table")
    fun count(): Int

    /*
    // getting the inverted list:
    @Query("SELECT * FROM favorites_table SORT BY ")
    fun getInvertedList(): LiveData<List<FavoriteQuote>>

     */

}