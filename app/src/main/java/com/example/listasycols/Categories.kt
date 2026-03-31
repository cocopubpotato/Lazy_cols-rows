package com.example.listasycols

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listasycols.productos.Catmodel
import com.example.listasycols.productos.Catmodels

@Composable
fun CategoryView(product: Catmodels,selected:()-> Unit){
    Card(modifier = Modifier.height(120.dp).fillMaxWidth().padding(10.dp), colors = CardDefaults.cardColors(containerColor = Color.White)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row() {
                Image(painter = painterResource(product.image),
                    contentDescription = "imagen de producto",
                    modifier = Modifier.size(80.dp).align(Alignment.CenterVertically)
                )
                Column(modifier = Modifier.padding(5.dp)) {
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(product.product, fontSize = 20.sp)
                    Spacer(modifier = Modifier.size(10.dp))
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun CatView() {
    val CatV = Catmodel()
    Column(modifier= Modifier.fillMaxSize()) {
        Text("" )
        Text("Shopping Categories", fontSize = 40.sp)
        LazyRow (horizontalArrangement = Arrangement.SpaceEvenly ){
            items(CatV.getCatlist()) { cat -> CategoryView(cat, selected = {}) }
        }
    }
}