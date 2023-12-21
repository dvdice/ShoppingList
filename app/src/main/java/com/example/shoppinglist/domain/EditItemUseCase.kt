package com.example.shoppinglist.domain

class EditItemUseCase(private val repo: ShopListRepository) {
    fun editItem(item: ShopItem){
        repo.editItem(item)
    }
}