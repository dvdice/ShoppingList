package com.example.shoppinglist.domain

class GetItemByIdUseCase(private val repo: ShopListRepository){
    fun getItem(id: Int): ShopItem{
        return repo.getItem(id)
    }
}