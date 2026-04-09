package com.example.listasycols.productos

import com.example.listasycols.R

class pviewmodel {
    fun getProducts(): List<Pmodels> {
        val prodlist = mutableListOf<Pmodels>()
        prodlist.add(
            Pmodels(product = "Metroid Prime Beyond", image = R.drawable.mp4, price = "69.9", promo = true, shipping = false))
        prodlist.add(Pmodels(product = "Mario Kart World", image = R.drawable.mkw, price = "79.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Kirby Air Riders", image = R.drawable.kar, price = "49.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Pokopia", image = R.drawable.pkp, price = "69.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Tomodachi Life: Living The Dream", image = R.drawable.tlltd, price = "59.9", promo = false, shipping = false))
        prodlist.add(Pmodels(product = "Kirby Air Riders", image = R.drawable.kar, price = "49.9", promo = false, shipping = true))
        prodlist.add(Pmodels(product = "Pokopia", image = R.drawable.pkp, price = "69.9", promo = false, shipping = false))
        prodlist.add(Pmodels(product = "Metroid Prime Beyond", image = R.drawable.mp4, price = "69.9", promo = true, shipping = true))
        return prodlist
    }
    fun getToylist():List<Pmodels>{
        val Toylist =mutableListOf<Pmodels>()
        Toylist.add(Pmodels(product = "Transformers Studio Series 86: Hot Rod", image = R.drawable.t_hr, price = "39.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Transformers Legacy Armada Starscream", image = R.drawable.t_armada, price = "19.9", promo = true, shipping = false))
        Toylist.add(Pmodels(product = "Transformers Studio Series 86: Sound Wave", image = R.drawable.t_sw, price = "39.9", promo = false, shipping = true))
        Toylist.add(Pmodels(product = "Transformers Devastation Optimus Prime", image = R.drawable.t_op, price = "19.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Studio Series 86: Hot Rod", image = R.drawable.t_hr, price = "39.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Transformers Legacy Armada Megatron", image = R.drawable.t_armadam, price = "29.9", promo = true, shipping = true))

        return Toylist
    }

}