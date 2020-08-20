package com.example.composablecookbookapp

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.graphics.Color
import androidx.ui.graphics.Color.Companion.Red
import androidx.ui.graphics.drawscope.Stroke
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.layout.preferredSize
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe) {
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

        Surface(color = Color.Blue) {
            Text(recipe.title, modifier = Modifier.padding(38.dp))
        }
    }
}

@Composable
@Preview
fun defaultRecipeCard() {
    RecipeCard(recipe = defaultRecipes[0])
}