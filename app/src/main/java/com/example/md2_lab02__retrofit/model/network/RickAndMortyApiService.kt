package com.example.md2_lab02__retrofit.model.network

import com.example.md2_lab02__retrofit.model.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApiService {
    @GET("character")
    suspend fun getCharacters(
        @Query("page") pageNumber: Int
    ): CharacterResponse
}