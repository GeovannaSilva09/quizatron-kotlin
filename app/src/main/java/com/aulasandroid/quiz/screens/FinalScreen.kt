package com.aulasandroid.quiz.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.aulasandroid.quiz.R
import com.aulasandroid.quiz.components.BotaoRestart

@Composable
fun FinalScreen ( navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
            .padding(top = 50.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(25.dp)
        ) {
            //Imagem
            Image(
                painter = painterResource(R.drawable.quiz),
                contentDescription = "Quiz Logo",
                modifier = Modifier.size(100.dp)
                    .padding(vertical = 16.dp)
            )
            Column (
                modifier = Modifier.fillMaxWidth()
                    .background(colorResource(R.color.cor_tela_inicial))
                    .padding(16.dp)
                    .height(120.dp)
                    .align(Alignment.CenterHorizontally),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
               OutlinedCard(
                   modifier = Modifier
                       .padding(top = 20.dp)
                       .height(50.dp)
                       .width(230.dp),
                   colors = CardDefaults.cardColors(
                       containerColor = colorResource(R.color.cor_caixa_pergunta)
                   ),
                   border = BorderStroke(1.dp, Color.Black),
                ) {
                   Box(
                       modifier = Modifier.fillMaxSize(),
                       contentAlignment = Alignment.Center
                   ) {
                       Text(
                           modifier = Modifier.fillMaxWidth(),
                           textAlign = TextAlign.Center,
                           text = "Bom trabalho!",
                           fontSize = 20.sp

                       )
                   }

               }

                Text(
                    text = "Você acertou 1 de 3 perguntas"
                )
            }

            BotaoRestart(text = "JOGAR NOVAMENTE", onClick = {navController.navigate(route = "perguntas")})

        }
    }
}