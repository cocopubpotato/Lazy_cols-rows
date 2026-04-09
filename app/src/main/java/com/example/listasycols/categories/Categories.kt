package com.example.listasycols.categories

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


//@Preview(showBackground = true)
@Composable
fun CatView(navegante: NavHostController, prod: List<Catmodels>, seleccionada: MutableState<Int>) {
    val catV = CatViewmod()
    Column(modifier= Modifier.fillMaxSize()) {
        Text("" )
        Text("Shopping Categories", fontSize = 40.sp)
        LazyRow (horizontalArrangement = Arrangement.SpaceEvenly ){
            items(prod) { cat ->
                Card(modifier = Modifier.height(100.dp).fillMaxWidth().padding(10.dp)
                    .clickable{
                        seleccionada.value= cat.num
                        navegante.navigate(route="Products")}

                    ,colors = CardDefaults.cardColors(containerColor = Color.White)) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row {
                            Image(painter = painterResource(cat.image),
                                contentDescription = "imagen de categoria${cat.num}",
                                modifier = Modifier.size(80.dp).align(Alignment.CenterVertically)
                            )
                            Column(modifier = Modifier.padding(5.dp)) {
                                Spacer(modifier = Modifier.size(10.dp))
                                Text(cat.product, fontSize = 20.sp)
                                Spacer(modifier = Modifier.size(10.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}