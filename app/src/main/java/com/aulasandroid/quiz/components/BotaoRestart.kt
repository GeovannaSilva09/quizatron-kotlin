package com.aulasandroid.quiz.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.aulasandroid.quiz.R

@Composable
fun BotaoRestart(text: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier,
        border = BorderStroke(1.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(R.color.cor_botoes),
            contentColor = Color.Black
        ),
        onClick = onClick
    ) {
        Text(
            text = text
        )
    }
}