package com.example.spiritualguide01.home.cards.cardsDB

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.spiritualguide01.home.cards.cardsModel.Card

@Dao
interface CardsDao {

    // for innitial DB-populating (only once at he beginning)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCardDao(cards: Card)

    //getting only Major Arcana:
    @Query("SELECT * FROM cards_table WHERE suit = 'MAJOR_ARCANA'")
    fun getAllCardsDao(): LiveData<List<Card>>

    //getting only Cups:
    @Query("SELECT * FROM cards_table WHERE suit = 'CUPS'")
    fun getAllCUPSCardsDao(): LiveData<List<Card>>

    //getting only Swords:
    @Query("SELECT * FROM cards_table WHERE suit = 'SWORDS'")
    fun getAllSWORDSCardsDao(): LiveData<List<Card>>

    //getting only Wands:
    @Query("SELECT * FROM cards_table WHERE suit = 'WANDS'")
    fun getAllWANDSCardsDao(): LiveData<List<Card>>

    //getting only Coins:
    @Query("SELECT * FROM cards_table WHERE suit = 'COINS'")
    fun getAllCOINSCardsDao(): LiveData<List<Card>>

    // getting all AS LiveData :
    @Query("SELECT * FROM cards_table")
    fun getAllCardsListLDDAO(): LiveData<List<Card>>

    // For "Card of the day" (we don't need LiveData here):
    @Query("SELECT * FROM cards_table")
    fun getCardsList(): List<Card>

    @Query("SELECT COUNT(*) FROM cards_table")
    fun countDAO(): Int

    @Query("SELECT * FROM cards_table WHERE id = :id")
    fun getOneCardByID(id: Int): Card

}