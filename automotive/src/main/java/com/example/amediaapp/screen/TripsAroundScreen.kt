package com.example.amediaapp.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.Template
import com.example.amediaapp.R
import com.example.amediaapp.entity.mockTrips
import com.example.amediaapp.utils.*

class TripsAroundScreen(carContext: CarContext) : Screen(carContext) {
    private val trips = mockTrips()

    override fun onGetTemplate(): Template =
        listTemplate(
            title = "Road Trips Around Me",
            headerAction = Action.BACK,
            actionStrip = actionStrip(
                action(
                    title = "Close",
                    onClick = { screenManager.popToRoot() }
                )
            ),
            itemList = itemListTemplate(
                trips.map {
                    rowTemplate(
                        title = it.title,
                        description = it.description,
                        image = carContext.iconCompat(R.drawable.ic_test_icon),
                        onClick = { screenManager.push(TripScreen(carContext, it.id)) },
                    )
                }
            )
        )
}