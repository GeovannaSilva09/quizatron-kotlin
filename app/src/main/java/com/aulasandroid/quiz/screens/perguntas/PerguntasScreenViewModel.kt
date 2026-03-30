package com.aulasandroid.quiz.screens.perguntas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aulasandroid.quiz.logica.QuizUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class PerguntasScreenViewModel : ViewModel() {

   private val _numeroAcertos = MutableLiveData<Int>()
    var numeroAcertos: LiveData<Int> = _numeroAcertos

    // Estado interno mutável
     val _quizUiState = MutableStateFlow(QuizUiState())

    // Estado exposto imutável
    val perguntasUiState: StateFlow<QuizUiState> = _quizUiState.asStateFlow()

     val questions = listOf(
        "Qual é a capital da França?" to listOf("Londres", "Paris", "Berlim", "Itapevi"),
        "Quanto é 2 + 2?" to listOf("3", "4", "5", "6"),
        "Qual é o melhor jogo do mundo?" to listOf("Roblox", "Minecraft", "Valorant", "Free Fire")
    )

    init {
        loadQuestion(0)
    }

    fun nextQuestion() {
        _quizUiState.update { estadoAtual ->
            val proximoIndex = estadoAtual.indexPerguntaAtual + 1

            if (proximoIndex < questions.size) {

                val proximaP = questions[proximoIndex]
                estadoAtual.copy(

                    pergunta = proximaP.first,
                    respostas = proximaP.second,
                    indexPerguntaAtual = proximoIndex

                )

            } else {
               estadoAtual // Quiz finalizado
            }
        }
    }


     fun loadQuestion(index: Int) {
        val p = questions[index]
        _quizUiState.value = QuizUiState(p.first, p.second, index)
    }
}







