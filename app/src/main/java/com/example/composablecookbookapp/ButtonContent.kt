package com.example.composablecookbookapp

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composablecookbookapp.ui.purple500

@Preview
@Composable
fun ButtonContent() {
    Row(
        verticalGravity = Alignment.CenterVertically) {
        Column(
            Modifier.width(24.dp),
            horizontalGravity = Alignment.CenterHorizontally
        ) {
            Icon(
                tint = purple500,
                asset = Icons.Default.FavoriteBorder,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            "ADD TO FAVORITES!",
            softWrap = false,
            color = purple500
        )
    }
}