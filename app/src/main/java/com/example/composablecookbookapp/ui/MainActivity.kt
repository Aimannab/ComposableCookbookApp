package com.example.composablecookbookapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ClickableText
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composablecookbookapp.properties.ComposableCookbookAppTheme
import com.example.composablecookbookapp.properties.purple500

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                setToolbarWithRecipeList()
            }
        }
    }
}

@Composable
fun setToolbarWithRecipeList() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "ComposableCookBook") },
                backgroundColor = purple500,
                contentColor = Color.White,
                elevation = 12.dp
            )
        }, bodyContent = {
            RecipeList(recipes = defaultRecipes)
        }
    )
    //setSnackbar()
}

@Composable
fun setSnackbar() {
    Snackbar(
        text = { Text(text = "This is a snackbar with a lot of text, that way it makes sense to use the new line!") },
        action = {
            ClickableText(
                text = AnnotatedString("Undo"),
                modifier = Modifier.padding(16.dp),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.Cyan
                ),
                onClick = {
                    //Handle action
                })
        },
        actionOnNewLine = true
    )
}

@Preview
@Composable
fun DefaultPreview() {
    ComposableCookbookAppTheme {
        MaterialTheme {
            setToolbarWithRecipeList()
        }
    }
}