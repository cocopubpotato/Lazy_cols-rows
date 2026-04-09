package com.example.listasycols.categories

import com.example.listasycols.R

class CatViewmod {
    fun getCatlist():List<CatL>{
        val catlist =mutableListOf<CatL>()
        catlist.add(CatL(num=1,product = "VideoJuegos", image = R.drawable.ns2 ))
        catlist.add(CatL(num=2,product = "Libros", image =R.drawable.libros ))
        catlist.add(CatL(num=3,product = "Ropa", image =R.drawable.ropa ))
        catlist.add(CatL(num=4,product = "Juguetes", image =R.drawable.juguetes ))
        catlist.add(CatL(num=5,product = "Electrodomesticos", image =R.drawable.electrodomesticos ))
        return catlist
    }
}