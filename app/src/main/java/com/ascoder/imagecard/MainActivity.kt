package com.ascoder.imagecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
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
           Box(
               modifier = Modifier.height(200.dp)
           ) {

           }
       }
    }

    @Preview(showBackground = true)
    @Composable
    fun ContainerPreview() {
        ComponentContainer()
    }
}