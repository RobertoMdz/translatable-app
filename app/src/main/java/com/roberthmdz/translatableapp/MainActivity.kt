package com.roberthmdz.translatableapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.roberthmdz.translatableapp.ui.theme.TranslatableAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TranslatableAppTheme {
              Column(
                  modifier = Modifier
                      .fillMaxSize()
                      .padding(16.dp)
              ) {

                  Text(text = "Hello world")
                  Spacer(modifier = Modifier.height(16.dp))
                  Text(text = "This text should be translated")
                  


              }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TranslatableAppTheme {
        Greeting("Android")
    }
}