package com.example.listasycols.productos

data class Pmodels(
    val product: String,
    val image:Int,
    val price: String,
    val promo: Boolean,
    val shipping: Boolean,
)

data class Catmodels(
    val product: String,
    val image:Int
)