package com.example.movielist.repository

import com.example.movielist.services.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getAllMovies() = retrofitService.getAllMovies()
}