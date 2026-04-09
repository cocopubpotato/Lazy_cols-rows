package com.example.listasycols

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.listasycols.categories.CatL
import com.example.listasycols.categories.CatView
import com.example.listasycols.categories.CatViewmod
import com.example.listasycols.productos.VGView


@Preview(showBackground = true)
@Composable
fun NavManager(){
    val navController= rememberNavController()
    val cat = remember { CatViewmod. }
    val CatSel = remember { mutableStateOf(0) }

    NavHost(navController, startDestination = "Categories"){
        composable("Categories"){
            CatView(navegante = navController, cat,CatSel)
        }
        composable("Products"){
            VGView(navegante = navController)
        }

    }
}