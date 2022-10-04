package com.example.thursdaytrivia3.data

import com.example.thursdaytrivia3.R
import com.example.thursdaytrivia3.model.Restaurant

class RestaurantData {

    fun getRestaurnats(): List<Restaurant> {
        return listOf<Restaurant>(
            Restaurant(R.drawable.img1, R.string.restaurant1, R.string.description1, R.string.rating1, R.string.price1),
            Restaurant(R.drawable.img2, R.string.restaurant2, R.string.description2, R.string.rating2, R.string.price2),
            Restaurant(R.drawable.img3, R.string.restaurant3, R.string.description3, R.string.rating3, R.string.price3),
            Restaurant(R.drawable.img4, R.string.restaurant4, R.string.description4, R.string.rating4, R.string.price4),
            Restaurant(R.drawable.img5, R.string.restaurant5, R.string.description5, R.string.rating5, R.string.price5),
        )
    }
}