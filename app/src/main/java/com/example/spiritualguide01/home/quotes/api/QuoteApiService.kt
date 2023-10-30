package com.example.spiritualguide01.home.quotes.api

import com.example.spiritualguide01.home.quotes.datamodel.Quote
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


val BASE_URL = "https://zenquotes.io/api/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface QuoteApiService {

    @GET("random")
    suspend fun getRandomQuoteFromAPI(): List<Quote>
}


object QuotesApi {
    val apiRetrofitService: QuoteApiService by lazy { retrofit.create(QuoteApiService::class.java) }
}
