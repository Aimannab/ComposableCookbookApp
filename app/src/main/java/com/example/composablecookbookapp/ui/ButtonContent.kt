package com.example.composablecookbookapp.ui

import androidx.compose.animation.core.TransitionState
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composablecookbookapp.properties.textColor

@Composable
fun ButtonContent(buttonState: MutableState<ButtonState>, state: TransitionState) {
    Row(
        verticalGravity = Alignment.CenterVertically) {
        Column(
            Modifier.width(24.dp),
            horizontalGravity = Alignment.CenterHorizontally
        ) {
            Icon(
                tint = state[textColor], //dynamic text color
                asset = Icons.Default.FavoriteBorder,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            "ADD TO FAVORITES!",
            softWrap = false,
            color = state[textColor] //dynamic text color
        )
    }
}