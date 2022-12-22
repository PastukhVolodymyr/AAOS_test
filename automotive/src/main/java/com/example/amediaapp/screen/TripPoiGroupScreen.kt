package com.example.amediaapp.screen

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.Template
import com.example.amediaapp.R
import com.example.amediaapp.entity.mockTrips
import com.example.amediaapp.utils.*

class TripPoiGroupScreen(carContext: CarContext, private val tripId: Int) : Screen(carContext) {
    private val tripPoi = mockTrips().firstOrNull { it.id == tripId }?.tripPoi

    override fun onGetTemplate(): Template = listTemplate(
        title = "Guide Page",
        headerAction = Action.BACK,
        actionStrip = actionStrip(
            action(
                title = "Close",
                onClick = { screenManager.popToRoot() }
            )
        ),
        itemList = tripPoi?.let {
            itemListTemplate(
                tripPoi.listPoi.map {
                    rowTemplate(
                        title = it.title,
                        description = it.description,
                        image = carContext.iconCompat(R.drawable.ic_test_icon),
                    )
                }
            )
        }
    )
}