package ru.dmitrytry.moviesapp.data.network

import retrofit2.Response
import retrofit2.http.GET
import ru.dmitrytry.moviesapp.data.models.Movies

interface ApiService {

    @GET(value = "/shows")
    suspend fun getAllMovies() : Response<List<Movies>>
}