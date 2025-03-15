package com.example.md2_lab02__retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.md2_lab02__retrofit.ui.theme.Lab_2Theme
import com.example.md2_lab02__retrofit.viewModel.CharacterViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab_2Theme(darkTheme = true) {
                CharacterScreen()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WeatherViewPreview() {
    Lab_2Theme(darkTheme = true) {
        CharacterScreen()
    }
}

