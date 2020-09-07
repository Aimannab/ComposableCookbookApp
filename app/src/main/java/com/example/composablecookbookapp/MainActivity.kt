package com.example.composablecookbookapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview

import com.example.composablecookbookapp.ui.ComposableCookbookAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                RecipeList(recipes = defaultRecipes)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposableCookbookAppTheme {
        MaterialTheme {
            TopAppBar(
                title = {Text(text = "ComposableCookBook")}
            )
            RecipeList(recipes = defaultRecipes)
        }
    }
}