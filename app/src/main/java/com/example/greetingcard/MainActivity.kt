package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        color = Color.Cyan,
        modifier = modifier.padding(26.dp).fillMaxSize()
    ) {
        Column(modifier = Modifier.padding(26.dp)) {
            Text(
                text = "HAPPY",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold

            )
            Text(
                text = "BIRTHDAY",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "TO $name!",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )
            }
        }
    }

@Preview(
    showSystemUi = true,
    showBackground = true,
    name = "Ung dung dau tien cua toi !")

@Composable
fun BirthDayCardPreview() {
    GreetingCardTheme {
        Greeting("KIÊN")
    }
}