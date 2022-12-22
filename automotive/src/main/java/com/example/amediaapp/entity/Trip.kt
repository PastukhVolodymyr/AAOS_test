package com.example.amediaapp.entity

data class Trip(
    val id: Int,
    val title: String,
    val author: String,
    val startCity: String,
    val days: Int,
    val totalKm: Double,
    val intro: TripIntro,
    val tripPoi: TripPoiGroup,
    val tripParts: List<TripPart>,
){
        val description: String
        get() = "$days Days, from $startCity, $totalKm km total, by $author"
}

data class TripIntro(
    val title: String,
    val description: String,
    val audio: String,
)

data class TripPoiGroup(
    val title: String,
    val description: String = "Selected bu Road Trip Expert",
    val listPoi: List<TripPoi>
)
data class TripPoi(
    val id: Int,
    val title: String,
    val minutes: Int,
    val distance: Double,
    val type: String,
    val visited: Boolean,
) {
    val description: String
    get() = "${minutes}min • ${distance}km • Type:$type • ${if(!visited) "Not" else ""}Visited"
}

data class TripPart(
    val id: Int,
    val title: String,
    val places: Int,
    val distanceDrive: Double,
    val distanceWalk: Double,
){
    val description: String
        get() = "$places places to visit • $distanceDrive km to drive • $distanceWalk km to walk"
}

fun mockTrips() = listOf(
    Trip(
        id = 1,
        title = "Art and nature in the California Deser",
        days = 3,
        totalKm = 345.0,
        author = "Euna Jacobs",
        startCity = "Detroit",
        intro = TripIntro(
            title = "Intro from Euna Jacobs",
            description = "traveling is coooooool!!! 3 days from Detroit, 345 rm total, by Euna Jacobs"
        + "3 days from Detroit, 345 rm total, by Euna Jacobs3 days from Detroit, 345 rm total, by Euna Jacobs",
            audio = "1m39s"
        ),
        tripPoi = TripPoiGroup(
            title = " 5 Iconic Places in the Guide",
            listPoi = listOf(
                TripPoi(
                    id = 1,
                    title = "Parkeerplaats",
                    minutes = 15,
                    distance = 1.5,
                    type = "Attraction",
                    visited = true,
                ),
                TripPoi(
                    id = 2,
                    title = "Downtown Diner",
                    minutes = 15,
                    distance = 1.5,
                    type = "Restaurant",
                    visited = false,
                ),
                TripPoi(
                    id = 1,
                    title = "Glory Memorial",
                    minutes = 15,
                    distance = 1.5,
                    type = "Attraction",
                    visited = false,
                ),
            ),
        ),
        tripParts = listOf(
            TripPart(
                id = 1,
                title = "Day 1, Meeting Seals on Texas",
                places = 10,
                distanceDrive = 162.1,
                distanceWalk = 1.9,
            ),
            TripPart(
                id = 1,
                title = "Day 1, Meeting Seals on Texas",
                places = 10,
                distanceDrive = 162.1,
                distanceWalk = 1.9,
            )
        ),
    ),
    Trip(
        id = 2,
        title = "Two National Park to Explore: a Weekend out of Oslo",
        days = 3,
        totalKm = 345.0,
        author = "Euna Jacobs",
        startCity = "Detroit",
        intro = TripIntro(
            title = "Intro from Euna Jacobs",
            description = "traveling is coooooool!!! 3 days from Detroit, 345 rm total, by Euna Jacobs"
                    + "3 days from Detroit, 345 rm total, by Euna Jacobs3 days from Detroit, 345 rm total, by Euna Jacobs",
            audio = "1m39s"
        ),
        tripPoi = TripPoiGroup(
            title = " 5 Iconic Places in the Guide",
            listPoi = listOf(
                TripPoi(
                    id = 1,
                    title = "Parkeerplaats",
                    minutes = 15,
                    distance = 1.5,
                    type = "Attraction",
                    visited = true,
                ),
                TripPoi(
                    id = 2,
                    title = "Downtown Diner",
                    minutes = 15,
                    distance = 1.5,
                    type = "Restaurant",
                    visited = false,
                ),
                TripPoi(
                    id = 1,
                    title = "Glory Memorial",
                    minutes = 15,
                    distance = 1.5,
                    type = "Attraction",
                    visited = false,
                ),
            ),
        ),
        tripParts = listOf(
            TripPart(
                id = 1,
                title = "Day 1, Meeting Seals on Texas",
                places = 10,
                distanceDrive = 162.1,
                distanceWalk = 1.9,
            ),
            TripPart(
                id = 1,
                title = "Day 1, Meeting Seals on Texas",
                places = 10,
                distanceDrive = 162.1,
                distanceWalk = 1.9,
            )
        ),
    ),
    Trip(
        id = 3,
        title = "Some another very interesting Trip where u end your life",
        days = 3,
        totalKm = 345.0,
        author = "Euna Jacobs",
        startCity = "Detroit",
        intro = TripIntro(
            title = "Intro from Euna Jacobs",
            description = "traveling is coooooool!!! 3 days from Detroit, 345 rm total, by Euna Jacobs"
                    + "3 days from Detroit, 345 rm total, by Euna Jacobs3 days from Detroit, 345 rm total, by Euna Jacobs",
            audio = "1m39s"
        ),
        tripPoi = TripPoiGroup(
            title = " 5 Iconic Places in the Guide",
            listPoi = listOf(
                TripPoi(
                    id = 1,
                    title = "Parkeerplaats",
                    minutes = 15,
                    distance = 1.5,
                    type = "Attraction",
                    visited = true,
                ),
                TripPoi(
                    id = 2,
                    title = "Downtown Diner",
                    minutes = 15,
                    distance = 1.5,
                    type = "Restaurant",
                    visited = false,
                ),
                TripPoi(
                    id = 1,
                    title = "Glory Memorial",
                    minutes = 15,
                    distance = 1.5,
                    type = "Attraction",
                    visited = false,
                ),
            ),
        ),
        tripParts = listOf(
            TripPart(
                id = 1,
                title = "Day 1, Meeting Seals on Texas",
                places = 10,
                distanceDrive = 162.1,
                distanceWalk = 1.9,
            ),
            TripPart(
                id = 1,
                title = "Day 1, Meeting Seals on Texas",
                places = 10,
                distanceDrive = 162.1,
                distanceWalk = 1.9,
            )
        ),
    ),
)