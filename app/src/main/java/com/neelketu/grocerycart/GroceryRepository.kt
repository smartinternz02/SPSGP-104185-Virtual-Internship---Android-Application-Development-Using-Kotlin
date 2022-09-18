package com.neelketu.grocerycart

import com.neelketu.grocerycart.GroceryDatabase
import com.neelketu.grocerycart.GroceryItems


class GroceryRepository(private val db: GroceryDatabase) {
    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}