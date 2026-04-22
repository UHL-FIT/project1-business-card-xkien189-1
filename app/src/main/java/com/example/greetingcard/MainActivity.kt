package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column // Import thêm Column để xếp dọc
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight // Import để in đậm chữ
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp // Import sp cho kích thước chữ
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
    // Surface tạo nền màu Cyan
    Surface(
        color = Color.Cyan,
        modifier = modifier.padding(16.dp) // Cách lề ngoài của khối nền 16dp
    ) {
        // Column giúp sắp xếp các thành phần Text thẳng hàng từ trên xuống dưới
        Column(modifier = Modifier.padding(16.dp)) { // Cách lề trong (padding) 16dp
            Text(
                text = "Xin chào!",
                fontSize = 28.sp, // Kích thước chữ dùng sp
                fontWeight = FontWeight.Bold // Chữ in đậm
            )
            Text(
                text = "Mình là $name.",
                fontSize = 20.sp,
                color = Color.DarkGray // Đổi màu chữ thành xám đậm
            )
            Text(
                text = "Đây là ứng dụng Jetpack Compose đầu tiên!",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp) // Đẩy dòng chữ này cách dòng trên 8dp
            )
        }
    }
}

// Bật showBackground = true để dễ nhìn thấy kết quả trong Preview
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Android")
    }
}