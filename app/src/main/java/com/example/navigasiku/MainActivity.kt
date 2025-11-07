package com.example.navigasiku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.navigasiku.view.TampilData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // langsung panggil TampilData
            TampilScreen()
        }
    }
}

@Composable
fun TampilScreen() {
    Scaffold { isiRuang ->
        TampilData(
            onBackBtnClick = {
                // jika back, bisa keluar activity
            }
        )
    }
}
