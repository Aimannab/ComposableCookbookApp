package com.example.composablecookbookapp

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Color.Companion.Red
import androidx.ui.graphics.drawscope.Stroke
import androidx.ui.layout.Column
import androidx.ui.layout.preferredSize
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        Column {
            Box(backgroundColor = Red) {
                Image(
                        asset = imageResource(id = recipe.imageResource),
                        modifier = Modifier.drawBackground(
                                color = Color.Black,
                                style = Stroke(4f)
                        ).preferredSize(120.dp)
                                .gravity(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop
                )
            }

            Text(recipe.title)
            for (ingredients in recipe.ingredients) {
                Text(text = ingredients)
            }
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