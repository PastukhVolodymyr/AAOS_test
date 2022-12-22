package com.example.amediaapp.utils

import androidx.annotation.DrawableRes
import androidx.car.app.CarContext
import androidx.core.graphics.drawable.IconCompat


fun CarContext.iconCompat(
    @DrawableRes drawable: Int
) = IconCompat.createWithResource(this, drawable)