package com.example.composablecookbookapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composablecookbookapp.ui.purple500

@Preview
@Composable
fun FavButton() {
    Button(
        border = BorderStroke(1.dp, purple500),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier.size(300.dp, 60.dp),
        onClick = {}
    ) {
        ButtonContent()
    }
}