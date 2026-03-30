package com.aulasandroid.quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aulasandroid.quiz.screens.FinalScreen
import com.aulasandroid.quiz.screens.perguntas.PerguntasScreen
import com.aulasandroid.quiz.screens.QuizHomeScreen
import com.aulasandroid.quiz.ui.theme.QuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "start",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection
                                    .Start,
                                animationSpec = tween(1000)

                            ) + fadeOut(animationSpec = tween(1000))
                        }
                    ) {
                        composable(route = "start") {QuizHomeScreen(navController = navController) }
                        composable(route = "perguntas") { PerguntasScreen(
                            navController = navController,
                            perguntasScreenViewModel = viewModel()
                        ) }
                        composable(route = "final") { FinalScreen(navController = navController) }
                    }
                }
            }
        }
    }
}

