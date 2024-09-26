package com.example.task1.data

import com.example.task1.R

object DataProvider {
    val item = Item(
        id = 1,
        title = "Do smt",
        subtitle = "Sub",
        date = "date",
        imageResId = R.drawable.html
    )

    val itemslist = listOf(
        item, Item(
            id = 2,
            title = "1Do smt",
            subtitle = "Sub",
            date = "date",
            imageResId = R.drawable.html
        ), Item(
            id = 3,
            title = "3Do smt",
            subtitle = "Sub",
            date = "date",
            imageResId = R.drawable.html
        )

    )
}