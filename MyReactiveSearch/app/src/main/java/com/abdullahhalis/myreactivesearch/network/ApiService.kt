package com.abdullahhalis.myreactivesearch.network

import com.abdullahhalis.myreactivesearch.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("geocoding/{query}.json")
    suspend fun getPlace(
        @Path("query") query: String,
        @Query("key") key: String,
        @Query("autocomplete") autoComplete: Boolean = true
    ): PlaceResponse
}