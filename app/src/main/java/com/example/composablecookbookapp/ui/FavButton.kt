package com.example.composablecookbookapp.ui

import androidx.compose.animation.core.TransitionState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composablecookbookapp.properties.backgroundColor
import com.example.composablecookbookapp.properties.purple500
import com.example.composablecookbookapp.properties.roundedCorners
import com.example.composablecookbookapp.properties.width


@Composable
fun FavButton(buttonState: MutableState<ButtonState>, state: TransitionState) {
    Button(
        border = BorderStroke(1.dp, purple500),
        backgroundColor = state[backgroundColor], //dynamic background color
        shape = RoundedCornerShape(state[roundedCorners]), //dynamic rounded corners on from IntPropKey
        modifier = Modifier.size(state[width], 50.dp), //dynamic width based from DpPRopKey
        onClick = {
            //Toggles the button state value
            buttonState.value = if (buttonState.value == ButtonState.IDLE) {
                ButtonState.PRESSED
            } else {
                ButtonState.IDLE
            }
        }
    ) {
        ButtonContent(buttonState = buttonState, state = state)
    }
}
