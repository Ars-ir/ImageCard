package com.ascoder.imagecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentContainer()
        }
    }

    @Composable
    fun ComponentContainer(
        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier
    ) {
       Card(
           modifier = modifier.fillMaxWidth(),
           shape = RoundedCornerShape(15.dp),
           elevation = 5.dp
       ) {
           Box(modifier = Modifier.height(200.dp)) {
               Image(
                   painter = painter,
                   contentDescription = contentDescription,
                   contentScale = ContentScale.Crop
               )
               Box(modifier = Modifier
                   .fillMaxSize()
                   .padding(12.dp),
                   contentAlignment = Alignment.BottomStart
               ) {
                   Text(text = title)
               }
           }
       }
    }

    @Preview(showBackground = true)
    @Composable
    fun ContainerPreview() {
        ComponentContainer()
    }
}