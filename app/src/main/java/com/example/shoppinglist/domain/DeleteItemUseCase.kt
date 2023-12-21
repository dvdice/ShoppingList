package com.example.shoppinglist.domain

class DeleteItemUseCase(private val repo: ShopListRepository) {
    fun deleteItemUseCase(item: ShopItem){
        repo.deleteItemUseCase(item)
    }
}