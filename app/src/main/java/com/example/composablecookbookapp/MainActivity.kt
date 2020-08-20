package com.example.composablecookbookapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.material.TopAppBar
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