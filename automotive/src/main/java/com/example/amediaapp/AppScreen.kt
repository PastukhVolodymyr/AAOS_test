package com.example.amediaapp

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Template
import com.example.amediaapp.screen.TripsAroundScreen
import com.example.amediaapp.utils.*

class AppScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template =
        placeMapTemplate(
            title = "Home Page",
            actionStrip = actionStrip(
                action(
                    title = "Continue Trip",
                    onClick = {}
                ),
                action(
                    title = "End Trip",
                    onClick = {}
                ),
                action(
                    icon = carIcon(carContext.iconCompat(R.drawable.ic_settings)),
                    onClick = {}
                ),
            ),
            itemList = itemListTemplate(
                listOf(
                    rowTemplate(
                        title = "Iconic Places",
                        onClick = { screenManager.push(TripsAroundScreen(carContext)) },
                    ),
                    rowTemplate(
                        title = "Road Trip Guides",
                        onClick = { screenManager.push(TripsAroundScreen(carContext)) },
                    ),
                    rowTemplate(
                        title = "My Favourites",
                        onClick = {  },
                    ),
                    rowTemplate(
                        title = "How to Use",
                        onClick = {  },
                    ),
                )
            )
        )
}
