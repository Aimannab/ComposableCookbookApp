package com.example.composablecookbookapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

import com.example.composablecookbookapp.ui.ComposableCookbookAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "ComposableCookBook") },
                            backgroundColor = Color.Blue,
                            contentColor = Color.White,
                            elevation = 12.dp
                        )
                    }, bodyContent = {
                        RecipeList(recipes = defaultRecipes)
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposableCookbookAppTheme {
        MaterialTheme {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = "ComposableCookBook") },
                        backgroundColor = Color.Blue,
                        contentColor = Color.White,
                        elevation = 12.dp
                    )
                }, bodyContent = {
                    RecipeList(recipes = defaultRecipes)
                }
            )
        }
    }
}