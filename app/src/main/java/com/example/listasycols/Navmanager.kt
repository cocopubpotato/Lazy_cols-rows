package com.example.listasycols

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.listasycols.categories.CatView
import com.example.listasycols.categories.CatViewmod
import com.example.listasycols.productos.ProdView


@Composable
fun NavManager(){
    val navController = rememberNavController()
    val Categ = remember { CatViewmod().getCatlist() }
    val CatSel = remember { mutableStateOf(0) }



    NavHost(navController, startDestination = "Home"){
        composable("Home"){
            CatView(navegante = navController, Categ,CatSel)
        }
        composable("Products"){
            ProdView(navegante = navController,CatSel)
        }

    }
}