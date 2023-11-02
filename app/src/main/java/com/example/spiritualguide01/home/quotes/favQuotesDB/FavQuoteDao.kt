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


    // get all  FavoriteQuotes (banned for bad performance)
    @Query("SELECT * FROM favorites_table")
    fun getAll(): LiveData<List<FavoriteQuote>>


    // This fun shows all FavQuotes saved in DB in INVERTED order.
    // So you can see your last added Quote first on top !!! :-)
    @Query("SELECT * FROM favorites_table ORDER BY id DESC")
    fun getInvertedList(): LiveData<List<FavoriteQuote>>


    // delete FavoriteQuote by Text-ID:
    @Query("DELETE FROM favorites_table WHERE q = :text")
    fun delete(text: String)

    // get number of all FavoriteQuotes in DB:
    @Query("SELECT COUNT(*) FROM favorites_table")
    fun count(): Int








}