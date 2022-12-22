package com.example.amediaapp.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.LongMessageTemplate
import androidx.car.app.model.Template
import com.example.amediaapp.entity.mockTrips

class TripIntroScreen(carContext: CarContext, private val tripId: Int) : Screen(carContext) {
    private val tripIntro = mockTrips().firstOrNull { it.id == tripId }?.intro

    override fun onGetTemplate(): Template = LongMessageTemplate.Builder("Long messaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaage").apply {
    }.build()
}