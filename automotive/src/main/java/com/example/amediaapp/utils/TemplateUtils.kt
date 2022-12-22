package com.example.amediaapp.utils

import androidx.car.app.model.*
import androidx.car.app.model.Action.APP_ICON
import androidx.core.graphics.drawable.IconCompat
import com.example.amediaapp.entity.Location

fun carIcon(
    iconCompat: IconCompat,
) = CarIcon.Builder(iconCompat).build()

fun action(
    title: String? = null,
    onClick: () -> Unit,
    flag: Int = Action.FLAG_DEFAULT,
    icon: CarIcon? = null,
    enabled: Boolean = true,
) = Action.Builder().apply {
    title?.let { setTitle(it) }
    setFlags(flag)
    icon?.let { setIcon(icon) }
    setOnClickListener(onClick)
    setEnabled(enabled)
}.build()

fun rowTemplate(
    title: String = "Point",
    description: String = "",
    image: IconCompat? = null,
    onClick: (() -> Unit)? = null,
    location: Location? = null
) = Row.Builder().apply {
    setTitle(title)
    addText(description)
    image?.let { setImage(CarIcon.Builder(image).build()) }
    location?.let {
        setMetadata(
            Metadata.Builder()
                .setPlace(
                    Place.Builder(
                        CarLocation.create(location.lat, location.lon)
                    ).build()
                ).build()
        )
    }
    onClick?.let { setBrowsable(true).setOnClickListener(it) }
}.build()

fun actionStrip(
    vararg actions: Action
) = ActionStrip.Builder().apply {
    for (action in actions) addAction(action)
}.build()

fun itemListTemplate(
    items: List<Item>
) = ItemList.Builder().apply {
    for (item in items) addItem(item)
}.build()

fun listTemplate(
    title: String? = null,
    headerAction: Action = APP_ICON,
    actionStrip: ActionStrip? = null,
    itemList: ItemList? = null,
) = ListTemplate.Builder().apply {
    title?.let { setTitle(it) }
    setHeaderAction(headerAction)
    actionStrip?.let { setActionStrip(it) }
    itemList?.let { setSingleList(it) } ?: setLoading(true)
}.build()

fun placeMapTemplate(
    title: String? = null,
    headerAction: Action = APP_ICON,
    currentLocationEnabled: Boolean = false,
    actionStrip: ActionStrip? = null,
    itemList: ItemList? = null
) = PlaceListMapTemplate.Builder().apply {
    title?.let { setTitle(it) }
    setHeaderAction(headerAction)
    setCurrentLocationEnabled(currentLocationEnabled)
    itemList?.let { setItemList(it) } ?: setLoading(true)
    actionStrip?.let { setActionStrip(it) }
}.build()


