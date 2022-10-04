package com.example.thursdaytrivia3.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Restaurant(
    @DrawableRes val image: Int,
    @StringRes val restaurantName: Int,
    @StringRes val restaurantDes: Int,
    @StringRes val ratings: Int,
    @StringRes val price: Int
    )
