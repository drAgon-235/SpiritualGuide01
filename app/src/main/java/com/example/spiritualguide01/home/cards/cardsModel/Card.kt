package com.example.spiritualguide01.home.cards.cardsModel

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cards_table")
data class Card(
    @PrimaryKey
    val id: Int,
    val name: String,
    val suit: SuitEnum,
    val value: String,
    val keywords: String,
    val fortuneTelling: String,
    val meaning_up: String,
    val meaning_rev: String,
    val qta: String,
    val description: String,
    val picture: Int
)