package com.example.spiritualguide01.home.cards.cardsModel

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cards_table")
data class Card(
    @PrimaryKey
    val id: Int,
    val name: Int,
    val suit: SuitEnum,
    val value: String,
    val keywords: Int,
    val fortuneTelling: Int,
    val meaning_up: Int,
    val meaning_rev: String,
    val qta: Int,
    val description: Int,
    val picture: Int
)