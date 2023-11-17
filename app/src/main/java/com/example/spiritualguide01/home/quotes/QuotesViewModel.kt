package com.example.spiritualguide01.home.quotes

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope

import com.example.spiritualguide01.home.quotes.api.QuotesApi
import com.example.spiritualguide01.home.quotes.uiModels.quoteOfDayFrag.QuotesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

private val TAG = "ViewModel_TAG"
class QuotesViewModel(application: Application) : AndroidViewModel(application){

    // Just the Quote from the API:
    private val repository = QuotesRepository(QuotesApi)

    val dayQuote= repository.quoteList


    init {
        loadQuoteFromRepoToVM()
    }

    // Just the fresh Daily Quote from the API:
    fun loadQuoteFromRepoToVM(){

        try {
            viewModelScope.launch(Dispatchers.IO){
                Log.d(TAG, "LOAD Quote FROM Repo TO ViewModel")
                repository.loadQuoteListFromApiToRepo()
        }
        }catch (e: Exception){
            Log.e(TAG, "LOAD Quote FROM Repo TO ViewModel NOT POSSIBLE")
        }
    }

}