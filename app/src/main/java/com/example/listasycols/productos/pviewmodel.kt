package com.example.listasycols.productos

import com.example.listasycols.R

class pviewmodel {
    fun selected(catnum: Int):List<Pmodels>{

        return when(catnum){
            1-> getProducts()
            2-> getBooks()
            3-> getClothess()
            4-> getToylist()
            5-> gethome()
            else-> getnone()
        }
    }
    fun getnone():List<Pmodels>{
        val msg=  mutableListOf<Pmodels>()
        msg.add(Pmodels(
                "Selecciona una bien"
                , image = R.drawable.tj, price = "", promo = false , shipping = false
            ))
        return msg
    }

    fun getProducts(): List<Pmodels> { //videojuegos
        val prodlist = mutableListOf<Pmodels>()
        prodlist.add(Pmodels(product = "Metroid Prime Beyond", image = R.drawable.mp4, price = "69.9", promo = true, shipping = false))
        prodlist.add(Pmodels(product = "Mario Kart World", image = R.drawable.mkw, price = "79.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Kirby Air Riders", image = R.drawable.kar, price = "49.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Pokopia", image = R.drawable.pkp, price = "69.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Tomodachi Life: Living The Dream", image = R.drawable.tlltd, price = "59.9", promo = false, shipping = false))
        prodlist.add(Pmodels(product = "Starfox 64", image = R.drawable.sf64, price = "49.9", promo = false, shipping = true))
        prodlist.add(Pmodels(product = "Resident Evil 4", image = R.drawable.re4, price = "79.9", promo = false, shipping = false))
        prodlist.add(Pmodels(product = "Transformers War for Cybertron", image = R.drawable.tfwc, price = "69.9", promo = true, shipping = true))
        return prodlist
    }
    fun getBooks():List<Pmodels>{ //Libros
        val Toylist =mutableListOf<Pmodels>()
        Toylist.add(Pmodels(product = "Percy Jackson and the Lightning Thief", image = R.drawable.pjo, price = "20.08", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "El Principito", image = R.drawable.prince, price = "15.9", promo = true, shipping = false))
        Toylist.add(Pmodels(product = "Diario de Greg", image = R.drawable.ddg, price = "19.9", promo = false, shipping = true))
        Toylist.add(Pmodels(product = "excel", image = R.drawable.excel, price = "19.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Mitologia Griega", image = R.drawable.mg, price = "39.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Adventures of Sherlock Holmes", image = R.drawable.ash, price = "259.9", promo = true, shipping = true))

        return Toylist
    }

    fun getClothess(): List<Pmodels> {//ropa
        val prodlist = mutableListOf<Pmodels>()
        prodlist.add(Pmodels(product = "Leather Jacket", image = R.drawable.lj, price = "69.9", promo = true, shipping = false))
        prodlist.add(Pmodels(product = "Denim Jacket", image = R.drawable.dj, price = "79.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Winter Coat", image = R.drawable.wc, price = "49.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Parka", image = R.drawable.pk, price = "69.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Summer Dress", image = R.drawable.sfd, price = "59.9", promo = false, shipping = false))
        prodlist.add(Pmodels(product = "Polka dot Dress", image = R.drawable.mdd, price = "49.9", promo = false, shipping = true))
        prodlist.add(Pmodels(product = "Pullover", image = R.drawable.pj, price = "69.9", promo = false, shipping = false))
        prodlist.add(Pmodels(product = "Concert Tee", image = R.drawable.ct, price = "69.9", promo = true, shipping = true))
        return prodlist
    }
    fun getToylist():List<Pmodels>{//juguetes
        val Toylist =mutableListOf<Pmodels>()
        Toylist.add(Pmodels(product = "Transformers Studio Series 86: Hot Rod", image = R.drawable.t_hr, price = "39.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Transformers Legacy Armada Starscream", image = R.drawable.t_armada, price = "19.9", promo = true, shipping = false))
        Toylist.add(Pmodels(product = "Transformers Studio Series 86: Sound Wave", image = R.drawable.t_sw, price = "39.9", promo = false, shipping = true))
        Toylist.add(Pmodels(product = "Transformers Devastation Optimus Prime", image = R.drawable.t_op, price = "19.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Studio Series 86: Hot Rod", image = R.drawable.t_hr, price = "39.9", promo = true, shipping = true))
        Toylist.add(Pmodels(product = "Transformers Legacy Armada Megatron", image = R.drawable.t_armadam, price = "29.9", promo = true, shipping = true))

        return Toylist
    }
    fun gethome(): List<Pmodels> { //home
        val prodlist = mutableListOf<Pmodels>()
        prodlist.add(Pmodels(product = "Microwave", image = R.drawable.mcw, price = "69.9", promo = true, shipping = false))
        prodlist.add(Pmodels(product = "AirFryer", image = R.drawable.air, price = "79.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Toaster Oven", image = R.drawable.to, price = "49.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Dehumidifier", image = R.drawable.dh, price = "69.9", promo = true, shipping = true))
        prodlist.add(Pmodels(product = "Bread maker", image = R.drawable.bm, price = "59.9", promo = false, shipping = false))
        prodlist.add(Pmodels(product = "Grill", image = R.drawable.grill, price = "49.9", promo = false, shipping = true))
        return prodlist
    }


}