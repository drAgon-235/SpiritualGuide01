package com.example.spiritualguide01.home.cards

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spiritualguide01.home.cards.cardsDB.CardsDatabase.Companion.getDatabase
import com.example.spiritualguide01.home.cards.cardsDB.Repository
import com.example.spiritualguide01.home.cards.cardsModel.Card


private val TAG = "CardsViewModel_TAG"

class CardsViewModel(application: Application) : AndroidViewModel(application) {


    //Creating instance of the DB:
    private val database = getDatabase(application)

    //Creating a Repository (as an object) and giving it the (empty) DB:
    private var repository = Repository(database)

    // val sharedPreferences = application.applicationContext.getSharedPreferences("counter", Context.MODE_PRIVATE)



    // Creating a LiveData! where the abstract LDList of the Repository ist saved,
    // and will be filled by the Fragment which uses this ViewModel 'by activitiesViewModels()'
    var cardsListLD: LiveData<List<Card>> = repository.cardsLiveList

    // Creating a simple List<Card> for Card of the Day Fragment (NO LiveData!):
    var cardListSimple = repository.cardsListNoLD

    var oneCard: Card = repository.getCardByIDRepo(id = 0)

    var id: Int = 0

    init{
        // Filling Cards to Room-DB if App is run for the first time (in Main)
        Log.d(TAG, "PrepopulateDB while crating VM")
        repository.populateDB()
    }


    // Loading the DB to the LiveData-Variable:
    fun loadCardsFromDBinVMasLD(){
        cardsListLD = repository.getAllCardsRepoAsLD()
    }

    fun loadCUPSFromDBinVWasLD(){
        cardsListLD = repository.getAllCUPSRepoAsLD()
    }

    fun loadSWORDSFromDBinVMasLD(){
        cardsListLD = repository.getAllSWORDSRepoAsLD()
    }

    fun loadWANDSFromDBinVMasLD(){
        cardsListLD = repository.getAllWANDSRepoAsLD()
    }

    fun loadCOINSFromDBinVMasLD(){
        cardsListLD = repository.getAllCOINSRepoAsLD()
    }





    // Loading the simple List<Card> - NO LiveData !! (For "Card of the day")
    fun loadCardListFromDBinViewModel(){
        cardListSimple = repository.getCardsListRepo()
    }




}


/*
    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


 */