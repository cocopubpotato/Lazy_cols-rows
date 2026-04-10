package com.example.listasycols.productos

import com.example.listasycols.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ProductPreview(){
    val computadora= Pmodels(image=R.drawable.pkp, product = "Pokopia", promo = true, price = "15022", shipping = false)
    ProductView(computadora) {

    }
}

@Composable
fun ProductView(product: Pmodels,selected:()-> Unit){


Card(modifier = Modifier.fillMaxWidth().padding(10.dp), colors = CardDefaults.cardColors(containerColor = Color.White)) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row {
            Image(painter = painterResource(product.image),
                contentDescription = "imagen de producto",
                modifier = Modifier.size(50.dp).align(Alignment.CenterVertically)
            )
            Column(modifier = Modifier.padding(5.dp)) {
                Spacer(modifier = Modifier.size(8.dp))
                Text(product.product, fontSize = 18.sp)

                Text(text="$ ${product.price}", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                if (product.shipping){
                    Text("Envio disponible")
                }else{
                    Text("No se encuentra disponible")
                }
                if (product.promo){
                Text(text="Promociones y descuentos disponibles en checkout ", fontSize = 12.sp)
                }else{Text("")}

                Spacer(modifier = Modifier.size(8.dp))
                Button(onClick = {selected()}, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black)) {Text("Agregar al carrito",fontSize = 10.sp)
                }
                Spacer(modifier = Modifier.size(10.dp))

            }
        }
    }
}

}
