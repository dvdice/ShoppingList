package com.example.shoppinglist.domain

class GetShopListUseCase(private val repo: ShopListRepository) {
    fun getShopListUseCase(): List<ShopItem> {
        return repo.getShopListUseCase()
    }
}