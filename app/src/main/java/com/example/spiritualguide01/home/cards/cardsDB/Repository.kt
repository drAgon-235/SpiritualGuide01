package com.example.spiritualguide01.home.cards.cardsDB

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.spiritualguide01.home.cards.cardsModel.Card
import com.example.spiritualguide01.home.cards.cardsModel.RawCardData
import java.lang.Exception


private val TAG = "Cards_Repository_TAG"

class Repository(private val databse: CardsDatabase)  {

    // Saves the result of the   fun getAllCardsDao()   of the DAO as LiveData:
    val cardsLiveList: LiveData<List<Card>> = MutableLiveData()

    // Saves a NO Live Data List<Card>
    val cardsListNoLD: List<Card> = listOf()

    //  populate our DB in the ...
    fun populateDB(){
        try {
            Log.d(TAG, "TRY: populating the DB in Repository")
            // Put each card from the cardListRaw into DB:
            if (databse.cardsDao.countDAO() == 0){
                for (each in RawCardData.cardListRaw){
                    Log.d(TAG, "START: populating the DB in Repository")
                    databse.cardsDao.insertCardDao(each)
                    Log.d(TAG, "SUCCESS_1: populating the DB in Repository")
                }
            }
        }catch (e: Exception){
            Log.e(TAG, "ERROR: populating the DB - maybe DB is not empty")
        }
        Log.d(TAG, "SUCCESS_2: BD is fully loaded  in Repository")
    }



    // Fun to load all cards as LiveData (for a RecyclerView e.g.)
    fun getAllCardsRepoAsLD(): LiveData<List<Card>> {
        return databse.cardsDao.getAllCardsDao()
    }

    // Fun to load all CUPS-cards as LiveData (for a RecyclerView e.g.)
    fun getAllCUPSRepoAsLD(): LiveData<List<Card>> {
        return databse.cardsDao.getAllCUPSCardsDao()
    }

    // Fun to load all SWORDS-cards as LiveData (for a RecyclerView e.g.)
    fun getAllSWORDSRepoAsLD(): LiveData<List<Card>> {
        return databse.cardsDao.getAllSWORDSCardsDao()
    }

    // Fun to load all WANDS-cards as LiveData (for a RecyclerView e.g.)
    fun getAllWANDSRepoAsLD(): LiveData<List<Card>> {
        return databse.cardsDao.getAllWANDSCardsDao()
    }

    // Fun to load all COINS-cards as LiveData (for a RecyclerView e.g.)
    fun getAllCOINSRepoAsLD(): LiveData<List<Card>> {
        return databse.cardsDao.getAllCOINSCardsDao()
    }




    fun getALLRepoAsLD(): LiveData<List<Card>> {
        return databse.cardsDao.getAllCardsListLDDAO()
    }

    // Load all without LiveData for "Card of the day" - Button:
    fun getCardsListRepo(): List<Card> {
        return databse.cardsDao.getCardsList()
    }

    fun getCardByIDRepo(id: Int): Card {
        return databse.cardsDao.getOneCardByID(id)
    }


}