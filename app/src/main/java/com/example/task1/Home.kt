package com.example.task1

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.task1.data.DataProvider

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun HomeContent(paddingValues: PaddingValues = PaddingValues()) {
    val myItems = remember { DataProvider.itemslist }
    LazyColumn(
        contentPadding = paddingValues // Применяем переданные отступы
    ) {
        items(myItems) { item ->
            ItemsList(item = item)
        }
    }
}