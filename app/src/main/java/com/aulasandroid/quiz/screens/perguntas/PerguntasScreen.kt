package com.aulasandroid.quiz.screens.perguntas

import android.R.attr.text
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.aulasandroid.quiz.R
import com.aulasandroid.quiz.components.BotaoAlternativa
import com.aulasandroid.quiz.components.CardNomePergunta
import com.aulasandroid.quiz.components.LogoQuiz

@Composable
fun  PerguntasScreen ( navController: NavHostController, perguntasScreenViewModel: PerguntasScreenViewModel) {

    val acertos by perguntasScreenViewModel.acertos.observeAsState(0)
    val alternativaSelecionada by perguntasScreenViewModel.alternativaSelecionada.observeAsState("")

    var numeroPergunta = 1;

    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = colorResource(R.color.cor_fundo_puzzle))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            LogoQuiz(size = 100.dp)

            OutlinedCard(
                modifier = Modifier
                    .height(60.dp)
                    .width(250.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.cor_caixa_pergunta)
                ),
                border = BorderStroke(2.dp, Color.Black),
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 23.sp,
                        text = "Pergunta $numeroPergunta de 3",
                    )
                }

            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                   colors = CardDefaults.cardColors(
                       containerColor = colorResource(R.color.white)),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                )
            ) {

                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(25.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {

                    CardNomePergunta(text = "${uiState.pergunta}")

                    uiState.respostas.forEach { answer ->

                        BotaoAlternativa(
                            text = "$answer",
                            onClick = { navController.navigate(route = "final") })
                        BotaoAlternativa(
                            text = "$answer",
                            onClick = { navController.navigate(route = "final") })
                        BotaoAlternativa(
                            text = "$answer",
                            onClick = { navController.navigate(route = "final") })
                        BotaoAlternativa(
                            text = "$answer",
                            onClick = { navController.navigate(route = "final") })
                    }

                }

            }
        }
    }

}






