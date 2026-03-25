package com.aulasandroid.quiz.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.aulasandroid.quiz.R

@Composable
fun LogoQuiz(size: Dp) {

    Image(
        painter = painterResource(R.drawable.quiz),
        contentDescription = "Quiz Logo",
        modifier = Modifier.size(size)
            .padding(vertical = 16.dp)
    )
}