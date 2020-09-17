package com.example.composablecookbookapp

import androidx.compose.animation.core.TransitionState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.composablecookbookapp.ui.purple500
import com.example.composablecookbookapp.ui.roundedCorners
import com.example.composablecookbookapp.ui.width


@Composable
fun FavButton(buttonState: MutableState<ButtonState>, state: TransitionState) {
    Button(
        border = BorderStroke(1.dp, purple500),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(state[roundedCorners]), //dynamic rounded corners on from IntPropKey
        modifier = Modifier.size(state[width], 60.dp), //dynamic width based from DpPRopKey
        onClick = {
            //Toggles the button state value
            buttonState.value = if (buttonState.value == ButtonState.IDLE) {
                ButtonState.PRESSED
            } else {
                ButtonState.IDLE
            }
        }
    ) {
        ButtonContent()
    }
}