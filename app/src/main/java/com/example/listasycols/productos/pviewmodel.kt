package com.example.listasycols.productos

import com.example.listasycols.R

class pviewmodel {
    fun getProducts(): List<Pmodels> {
        var prodlist = mutableListOf<Pmodels>()
        prodlist.add(
            Pmodels(
                product = "Metroid Prime Beyond",
                image = R.drawable.mp4,
                price = "69.9",
                promo = true,
                shipping = false
            )
        )
        prodlist.add(
            Pmodels(
                product = "Mario Kart World",
                image = R.drawable.mkw,
                price = "79.9",
                promo = true,
                shipping = true
            )
        )
        prodlist.add(
            Pmodels(
                product = "Kirby Air Riders",
                image = R.drawable.kar,
                price = "49.9",
                promo = true,
                shipping = true
            )
        )
        prodlist.add(
            Pmodels(
                product = "Pokopia",
                image = R.drawable.pkp,
                price = "69.9",
                promo = true,
                shipping = true
            )
        )
        prodlist.add(
            Pmodels(
                product = "Tomodachi Life: Living The Dream",
                image = R.drawable.tlltd,
                price = "59.9",
                promo = false,
                shipping = false
            )
        )
        prodlist.add(
            Pmodels(
                product = "Kirby Air Riders",
                image = R.drawable.kar,
                price = "49.9",
                promo = false,
                shipping = true
            )
        )
        prodlist.add(
            Pmodels(
                product = "Pokopia",
                image = R.drawable.pkp,
                price = "69.9",
                promo = false,
                shipping = false
            )
        )
        prodlist.add(
            Pmodels(
                product = "Metroid Prime Beyond",
                image = R.drawable.mp4,
                price = "69.9",
                promo = true,
                shipping = true
            )
        )
        return prodlist
    }
}
class Catmodel {
    fun getCatlist():List<Catmodels>{
        var catlist =mutableListOf<Catmodels>()
        catlist.add(Catmodels(product = "Video Games", image =R.drawable.ns2 ))
        catlist.add(Catmodels(product = "Books", image =R.drawable.ns2 ))
        catlist.add(Catmodels(product = "Clothes", image =R.drawable.ns2 ))
        catlist.add(Catmodels(product = "Plushies", image =R.drawable.ns2 ))
        catlist.add(Catmodels(product = "", image =R.drawable.ns2 ))
        catlist.add(Catmodels(product = "Books", image =R.drawable.ns2 ))
        return catlist
    }
}


