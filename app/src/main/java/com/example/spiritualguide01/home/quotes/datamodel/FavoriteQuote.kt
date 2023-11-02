package com.example.spiritualguide01.home.quotes.datamodel

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites_table")
data class FavoriteQuote(
    val q: String,
    val a: String,
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L
)