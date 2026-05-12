package com.example.androidbasicclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.androidbasicclass.ui.login.view.LoginView
import com.example.androidbasicclass.ui.navigation.AppNavigation
import com.example.androidbasicclass.ui.theme.AndroidBasicClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicClassTheme {
                LoginView()
            }
        }
    }
}
