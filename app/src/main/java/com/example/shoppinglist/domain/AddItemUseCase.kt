package com.example.shoppinglist.domain

class AddItemUseCase(private val repo: ShopListRepository) {
    fun addItem(item: ShopItem){
        repo.addItem(item)
    }
}