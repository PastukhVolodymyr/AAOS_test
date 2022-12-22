package com.example.amediaapp.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class TripDetailed(carContext: CarContext, private val tripId: Int) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("Trip $tripId").build()
    }
}