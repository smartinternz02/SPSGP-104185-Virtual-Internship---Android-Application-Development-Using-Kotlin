package com.neelketu.grocerycart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.neelketu.grocerycart.GroceryRepository
import com.neelketu.grocerycart.GroceryViewModel

class GroceryViewModelFactory(private val repository: GroceryRepository):ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GroceryViewModel(repository) as T
    }
}