package com.neelketu.grocerycart

import androidx.lifecycle.ViewModel
import com.neelketu.grocerycart.GroceryItems
import com.neelketu.grocerycart.GroceryRepository

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository):ViewModel() {
    fun insert(items: GroceryItems) = GlobalScope.launch {
        repository.insert(items)
    }
    fun delete(items: GroceryItems) = GlobalScope.launch {
        repository.delete(items)
    }
    fun getAllGroceryItems() = repository.getAllItems()
}