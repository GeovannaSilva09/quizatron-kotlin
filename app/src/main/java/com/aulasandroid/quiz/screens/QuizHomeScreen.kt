package com.aulasandroid.quiz.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.quiz.R
import com.aulasandroid.quiz.R.color.cor_tela_inicial
import com.aulasandroid.quiz.components.BotaoStart
import com.aulasandroid.quiz.components.LogoQuiz


@Composable
fun QuizHomeScreen(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = colorResource(cor_tela_inicial))
            .padding(16.dp)

    ) {

        Column(
            modifier = Modifier.align(Alignment.Center)
                .fillMaxWidth()
                .padding(50.dp)
                .background(color = colorResource(cor_tela_inicial)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(50.dp)
        ) {

           LogoQuiz(size =  150.dp)

            Text(
                text = "QUIZATRON 3000",
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp,
                color = Color.Black
            )

            BotaoStart(onClick = {},  text = "COMEÇAR")
        }
    }
}