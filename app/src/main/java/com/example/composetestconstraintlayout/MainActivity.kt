package com.example.composetestconstraintlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.composetestconstraintlayout.ui.theme.ComposeTestConstraintLayoutTheme
import com.example.composetestconstraintlayout.ui.theme.MyConstraintLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTestConstraintLayoutTheme {
                MyConstraintLayout()
            }
        }
    }
}


