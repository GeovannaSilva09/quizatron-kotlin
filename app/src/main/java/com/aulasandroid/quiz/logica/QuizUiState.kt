package com.aulasandroid.quiz.logica

data class QuizUiState(
    val pergunta: String = "",
    val respostas: List<String> = emptyList(),
    val indexPerguntaAtual: Int = 0
)
