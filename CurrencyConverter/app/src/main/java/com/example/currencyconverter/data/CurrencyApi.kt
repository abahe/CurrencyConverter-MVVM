package com.example.currencyconverter.data

import com.example.currencyconverter.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("v1/latest?access_key=933be08a62ebf90467c8948dfb8ac877&format=1")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}