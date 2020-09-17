package com.example.composablecookbookapp

import androidx.compose.animation.core.transitionDefinition
import androidx.compose.animation.core.tween
import androidx.compose.animation.transition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composablecookbookapp.ui.width

enum class ButtonState {
    IDLE, PRESSED
}

@Preview
@Composable
fun AnimatedFavButton() {
    //Initial state of the button, whcih it remembers even if the UI component is drawn again
    val buttonState = remember { mutableStateOf(ButtonState.IDLE) }

    val transitionDefinition = transitionDefinition<ButtonState> {

        //Declaring initial state
        state(ButtonState.IDLE) {
            this[width] = 250.dp
        }

        //Declaring final state
        state(ButtonState.PRESSED) {
            this[width] = 60.dp
        }

        //Build animation from one state to another using tween with duration of 1500 mills
        transition(fromState = ButtonState.IDLE, toState = ButtonState.PRESSED) {
            width using tween(durationMillis = 1500)
        }

        //Reversing animation state
        transition(fromState = ButtonState.PRESSED, toState = ButtonState.IDLE) {
            width using tween(durationMillis = 1500)
        }
    }

    //Store the appropriate state based on the initial buttonState
    val toState = if (buttonState.value == ButtonState.IDLE) {
        ButtonState.PRESSED
    } else {
        ButtonState.IDLE
    }

    //Current button state, takes transitionDefiniton, target state and builds a TransitionState
    val state = transition(
        definition = transitionDefinition,
        initState = buttonState.value,
        toState = toState
    )

    //State is then used to read the value you animate, such as the button with width
    FavButton(buttonState = buttonState, state = state)
}