package com.example.listasycols.productos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun VGView() {
    val VGV = pviewmodel()
    Column(modifier= Modifier.fillMaxSize()) {
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalArrangement = Arrangement.SpaceEvenly) {
            item (span = {GridItemSpan(maxLineSpan)}){
                Text("Videojuegos ", fontSize = 18.sp,fontWeight = FontWeight.Bold,
                    modifier = Modifier.size(20.dp))
            }
            items(VGV.getProducts()) { prod -> ProductView(prod, selected = {}) }
        } } }


