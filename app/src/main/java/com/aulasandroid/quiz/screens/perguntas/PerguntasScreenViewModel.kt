package com.aulasandroid.quiz.screens.perguntas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class PerguntasScreenViewModel : ViewModel() {

   private val _acertos = MutableLiveData<Int>(0)
    var acertos: LiveData<Int> = _acertos

    private val  _alternativaSelecionada = MutableLiveData<String>("")
    val alternativaSelecionada: LiveData<String> =  _alternativaSelecionada


    fun incrementarPontuacao(alternativaCorreta: String) {

        if (_alternativaSelecionada.value ==  alternativaCorreta){
            _acertos.value = _acertos.value!!.plus(1)
        }
    }

      fun AlterarAlternativaSelecionada(alternativa: String){
        _alternativaSelecionada.value = alternativa
    }
}






