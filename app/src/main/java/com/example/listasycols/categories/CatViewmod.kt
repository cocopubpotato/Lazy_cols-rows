package com.example.listasycols.categories

import com.example.listasycols.R

class CatViewmod {
    fun getCatlist():List<Catmodels>{
        val catlist =mutableListOf<Catmodels>()
        catlist.add(Catmodels(num=1,product = "VideoJuegos", image = R.drawable.ns2 ))
        catlist.add(Catmodels(num=2,product = "Libros", image =R.drawable.libros ))
        catlist.add(Catmodels(num=3,product = "Ropa", image =R.drawable.ropa ))
        catlist.add(Catmodels(num=4,product = "Juguetes", image =R.drawable.juguetes ))
        catlist.add(Catmodels(num=5,product = "Electrodomesticos", image =R.drawable.electrodomesticos ))
        return catlist
    }
}