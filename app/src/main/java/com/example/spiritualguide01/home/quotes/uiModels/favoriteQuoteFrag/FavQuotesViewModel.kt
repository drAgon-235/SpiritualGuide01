package com.example.spiritualguide01.home.quotes.uiModels.favoriteQuoteFrag

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.spiritualguide01.home.quotes.datamodel.FavoriteQuote
import com.example.spiritualguide01.home.quotes.favQuotesDB.FavQuoteDatabase.Companion.getDatabase
import com.example.spiritualguide01.home.quotes.favQuotesDB.FavQuoteRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class FavQuotesViewModel(application: Application) : AndroidViewModel(application)  {

    private val database = getDatabase(application)

    private var repository = FavQuoteRepository(database)

    var favQuotesListLD: LiveData<List<FavoriteQuote>> = repository.favQuotesList


    init {
        // repository.dummyData()
    }


    // Banned. It shows the last added Quote at the bottom :-(
    fun loadQuotesVM(){
        //Loading all Data from DB into the variable
        favQuotesListLD = repository.loadFavQuotes()
    }


    // This fun shows all FavQuotes saved in DB in INVERTED order.
    // So you can see your last added Quote first on top !!! :-)
    fun loadInvertedListVM(){
        favQuotesListLD = repository.loadInvertedList()
    }


    fun getCountFavsTable(): Int{
        return repository.getCount()
    }


    fun insertFavQuoteVM(favQuote: FavoriteQuote) : Job {
        return viewModelScope.launch {
            repository.insertFavQuote(favQuote)
        }
    }

    fun deleteFavQuoteVM(idText: String) : Job {
        return viewModelScope.launch {
            repository.deleteFavQuoteByID(idText)
        }
    }


    fun deleteByIdNrVM(id: Long) : Job {
        return viewModelScope.launch {
            repository.deletebyIdNr(id)
        }
    }


}