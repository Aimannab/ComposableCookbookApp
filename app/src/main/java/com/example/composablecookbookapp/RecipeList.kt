package com.example.composablecookbookapp

import androidx.compose.foundation.Box
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun RecipeList(recipes: List<Recipe>) {
    ScrollableColumn {
        Column {
            for (recipe in recipes) {
                Box(padding = 16.dp) {
                    RecipeCard(recipe = recipe)
                }
            }
        }
    }
}