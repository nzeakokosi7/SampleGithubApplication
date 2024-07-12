package com.example.samplegithubapp.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplegithubapp.ui.theme.GithubNameTextColor
import com.example.samplegithubapp.ui.theme.CardBorderColor
import com.example.samplegithubapp.ui.theme.Manrope

@Composable
fun UserCard(
    username: String,
    fullName: String?,
    avatarUrl: String,
    bio: String?,
    location: String?,
    email: String?,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth(),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(0.5.dp, CardBorderColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        onClick = onClick
    ) {
        Row (
            modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.Start
        ){
            CircularNetworkImage(
                imageUrl = avatarUrl,
                contentDescription = "Github User Avatar",
                size = 20.dp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(
                    text = fullName ?: "Not available",
                    fontWeight = FontWeight.W600,
                    fontSize = 12.sp,
                    color = GithubNameTextColor,
                    lineHeight = 16.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = username,
                    fontWeight = FontWeight.W400,
                    fontFamily = Manrope,
                    fontSize = 10.sp,
                    lineHeight = 13.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                if(!bio.isNullOrBlank()) {
                    Text(
                        text = bio,
                        fontSize = 10.sp,
                        lineHeight = 16.sp
                    )
                }

                if(!location.isNullOrBlank() && !email.isNullOrBlank()) {
                    Spacer(modifier = Modifier.height(8.dp))
                }

                Row {
                    if(!location.isNullOrBlank()) {
                        Text(
                            text = location,
                            fontSize = 8.sp,
                            lineHeight = 11.sp,
                            color = Color.Gray
                        )
                    }
                    if(!email.isNullOrBlank()) {
                        Text(
                            text = email,
                            fontSize = 8.sp,
                            lineHeight = 11.sp,
                            color = Color.Gray
                        )
                    }

                }
            }

        }

    }
}