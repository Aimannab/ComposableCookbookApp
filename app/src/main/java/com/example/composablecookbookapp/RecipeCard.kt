package com.example.composablecookbookapp

import androidx.compose.foundation.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeCard(recipe: Recipe) {
    Surface(shape = RoundedCornerShape(4.dp), elevation = 6.dp) {
        Column {
            Box(backgroundColor = Red, gravity = Alignment.Center) {
                Image(
                    asset = imageResource(id = recipe.imageResource),
                    modifier = Modifier.background(
                        color = Color.Black
                    ),
                    contentScale = ContentScale.FillWidth
                )
            }

            Text(recipe.title, style = MaterialTheme.typography.h4)
            for (ingredients in recipe.ingredients) {
                Text(text = ingredients)
            }
            AnimatedFavButton()
        }
    }
}

@Composable
@Preview
fun defaultRecipeCard() {
    MaterialTheme {
        RecipeCard(recipe = defaultRecipes[0])
    }
}