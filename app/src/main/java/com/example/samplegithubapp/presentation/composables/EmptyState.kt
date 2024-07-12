package com.example.samplegithubapp.presentation.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplegithubapp.R
import com.example.samplegithubapp.ui.theme.EmptyStateTextColor

enum class Type {
    NO_RESULT,
    EMPTY_STATE
}

@Composable
fun EmptyState(
    message: String,
    type: Type = Type.EMPTY_STATE
) {
    val textPadding = if (type == Type.EMPTY_STATE) 250.dp else 320.dp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            modifier = Modifier.size(154.dp),
            painter = painterResource(id = R.drawable.no_result),
            contentDescription = "No result"
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            modifier = Modifier.width(textPadding),
            text = message,
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            lineHeight = 20.sp,
            color = EmptyStateTextColor
        )
    }
}