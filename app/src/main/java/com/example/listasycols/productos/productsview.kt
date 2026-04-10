package com.example.listasycols.productos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun ProdView(navegante: NavHostController,seleccionada: MutableState<Int>) {
    val selected= pviewmodel().selected(seleccionada.value)


    Column(modifier= Modifier.fillMaxSize().padding(4.dp).padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
            Text("Disfruta de Nuestra Seleccion", textAlign = TextAlign.Center)
            Button(onClick = {navegante.navigate("Home")}, Modifier.width(120.dp)){
                Text("Regresar") }
        Spacer(modifier = Modifier.size(10.dp))


        LazyVerticalGrid(columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalArrangement = Arrangement.SpaceEvenly) {

            items( selected){prod->
                Card(modifier = Modifier.fillMaxWidth().padding(10.dp), colors = CardDefaults.cardColors(containerColor = Color.White)) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row {
                            Image(painter = painterResource(prod.image),
                                contentDescription = "imagen de producto",
                                modifier = Modifier.size(50.dp).align(Alignment.CenterVertically)
                            )
                            Column(modifier = Modifier.padding(5.dp)) {
                                //Spacer(modifier = Modifier.size(10.dp))
                                Text(prod.product, fontSize = 20.sp)

                                Text(text="$ ${prod.price}", fontSize = 14.sp, fontWeight = FontWeight.Bold)
                                if (prod.shipping){
                                    Text("Envio disponible")
                                }else{
                                    Text("No se encuentra disponible")
                                }
                                if (prod.promo){
                                    Text(text="Promociones y descuentos disponibles en checkout ", fontSize = 12.sp)
                                }else{Text("")}

                                Spacer(modifier = Modifier.size(8.dp))
                                Button(onClick = {}, colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Yellow,
                                    contentColor = Color.Black)) {Text("Agregar al carrito")
                                }
                                Spacer(modifier = Modifier.size(10.dp))

                            }
                        }
                    }
                }

            }

        } } }


