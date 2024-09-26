package com.example.task1.data

data class Item(
    val id: Int,
    val title: String,
    val subtitle: String,
    val date: String,
    val imageResId: Int? = null
)