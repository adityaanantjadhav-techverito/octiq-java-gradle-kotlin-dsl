package com.octiq.fixture

data class Item(val name: String, val quantity: Int)

fun totalQuantity(items: List<Item>): Int = items.sumOf { it.quantity }
