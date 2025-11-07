package com.example.navigasiku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigasiku.ui.theme.NavigasiKuTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Memungkinkan konten terbentang hingga ke tepi layar (di bawah status bar/navigation bar)
        enableEdgeToEdge()

        // Mengatur konten UI menggunakan Jetpack Compose
        setContent {
            // Membungkus seluruh aplikasi dalam Tema (Theme) yang sudah didefinisikan
            NavigasikuTheme {
                // Surface adalah wadah yang menerapkan warna latar belakang dan elevasi
                Surface(
                    modifier = Modifier.fillMaxSize(), // Mengisi seluruh ukuran layar
                    color = MaterialTheme.colorScheme.background // Menggunakan warna latar belakang tema
                ) {
                    // Panggil fungsi Composable utama aplikasi yang berisi NavHost, dll.
                    DataApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigasiKuTheme {
        Greeting("Android")
    }
}