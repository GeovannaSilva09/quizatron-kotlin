package com.aulasandroid.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.aulasandroid.quiz.screens.FinalScreen
import com.aulasandroid.quiz.screens.PerguntasScreen
import com.aulasandroid.quiz.screens.QuizHomeScreen
import com.aulasandroid.quiz.ui.theme.QuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   //QuizHomeScreen(modifier = Modifier.padding(innerPadding))
//                     PerguntasScreen(modifier = Modifier.padding(innerPadding))
                    FinalScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

