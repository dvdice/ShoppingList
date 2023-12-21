package com.example.shoppinglist.domain

interface ShopListRepository {
    fun addItem(item: ShopItem)
    fun deleteItemUseCase(item: ShopItem)
    fun editItem(item: ShopItem)
    fun getItem(id: Int): ShopItem
    fun getShopListUseCase(): List<ShopItem>
}