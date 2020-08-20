package com.example.composablecookbookapp

import androidx.compose.Composable
import androidx.ui.foundation.Box
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.unit.dp

@Composable
fun RecipeList(recipes: List<Recipe>) {
    VerticalScroller {
        Column {
            for (recipe in recipes) {
                Box(padding = 5.dp) {
                RecipeCard(recipe = recipe)
                }
            }
        }
    }
}