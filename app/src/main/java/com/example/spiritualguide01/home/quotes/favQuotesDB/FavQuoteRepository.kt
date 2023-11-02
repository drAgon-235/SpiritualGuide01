package com.example.spiritualguide01.home.quotes.favQuotesDB

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.spiritualguide01.home.quotes.datamodel.FavoriteQuote
import java.lang.Exception


private val TAG = "FavQuotes_RepositoryTAG"

class FavQuoteRepository(private val database: FavQuoteDatabase)  {

    // Variable for saving the List (in the viewModel):
    val favQuotesList: LiveData<List<FavoriteQuote>> = MutableLiveData()


    fun insertFavQuote(newFavQuote: FavoriteQuote){
        try {
            Log.d(TAG, "START: Inserting FavoriteQuote into DB")
            database.favQuoteDao.insertFavDao(newFavQuote)
            Log.d(TAG, "SUCCESS: Inserting FavoriteQuote into DB finished!")
        }catch (e: Exception){
            Log.e(TAG, "Error while inserting FAVQuote to Database: $e!!")
        }
    }

    // Banned. It shows the last added Quote at the bottom :-(
    fun loadFavQuotes(): LiveData<List<FavoriteQuote>>{
        return database.favQuoteDao.getAll()
    }


    // This fun shows all FavQuotes saved in DB in inverted order.
    //So you can see your last added Quote first on top !!! :-)
    fun loadInvertedList(): LiveData<List<FavoriteQuote>>{
        return database.favQuoteDao.getInvertedList()
    }

    fun getCount(): Int {
        return database.favQuoteDao.count()
    }


    fun deleteFavQuoteByID(idText: String){
        try {
            Log.d(TAG, "START Deleting FAVQuote from Database...")
            database.favQuoteDao.delete(idText)
            Log.d(TAG, "...Deleting FAVQuote from Database: SUCCESSFUL!!")
        }catch (e: Exception){
            Log.e(TAG, "Error while deleting FAVQuote from Database: $e!!")
        }
    }

/*
    // For testing purposes only:
    fun dummyData() {
        database.favQuoteDao.insertFavDao(DummyQuotes.quote1)
        database.favQuoteDao.insertFavDao(DummyQuotes.quote2)
    }

 */


}