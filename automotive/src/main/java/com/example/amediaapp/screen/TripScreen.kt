package com.example.amediaapp.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.Template
import com.example.amediaapp.R
import com.example.amediaapp.entity.Trip
import com.example.amediaapp.entity.mockTrips
import com.example.amediaapp.utils.*

class TripScreen(carContext: CarContext, private val tripId: Int) : Screen(carContext) {
    private val trip = mockTrips().firstOrNull() { it.id == tripId }

    override fun onGetTemplate(): Template = listTemplate(
        title = trip?.title ?: "Trip",
        headerAction = Action.BACK,
        actionStrip = actionStrip(
            action(
                title = "Close",
                onClick = { screenManager.popToRoot() }
            )
        ),
        itemList = trip?.let {
            itemListTemplate(
                listOf(
                    rowTemplate(
                        title = trip.intro.title,
                        description = trip.intro.description,
                        image = carContext.iconCompat(R.drawable.ic_test_icon),
                        onClick = { screenManager.push(TripIntroScreen(carContext, it.id)) },
                    ),
                    rowTemplate(
                        title = trip.tripPoi.title,
                        description = it.description,
                        image = carContext.iconCompat(R.drawable.ic_test_icon),
                        onClick = { screenManager.push(TripPoiGroupScreen(carContext, it.id)) },
                    ),
                ) + trip.tripParts.map {
                    rowTemplate(
                        title = it.title,
                        description = it.description,
                        image = carContext.iconCompat(R.drawable.ic_test_icon),
                        onClick = { screenManager.push(TripDetailed(carContext, it.id)) },
                    )
                }
            )
        }
    )
}
