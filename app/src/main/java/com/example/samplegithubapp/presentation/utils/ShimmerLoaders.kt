package com.example.samplegithubapp.presentation.utils

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.samplegithubapp.ui.theme.CardBorderColor
import com.valentinilk.shimmer.shimmer

@Composable
fun RepositoryLoader(
    count: Int = 5
) {
    Column {
        repeat(count) {
            Card(
                modifier = Modifier
                    .height(132.dp)
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                shape = RoundedCornerShape(5.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(0.5.dp, CardBorderColor),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            ) {
                Row (
                    Modifier.padding(15.dp)
                ){
                    Box(
                        modifier = Modifier
                            .shimmer()
                            .size(20.dp)
                            .background(shape = CircleShape, color = CardBorderColor)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Box(
                            modifier = Modifier
                                .shimmer()
                                .height(20.dp)
                                .fillMaxWidth()
                                .background(CardBorderColor)
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Box(
                            modifier = Modifier
                                .shimmer()
                                .height(20.dp)
                                .width(100.dp)
                                .background(CardBorderColor)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Box(
                            modifier = Modifier
                                .shimmer()
                                .height(20.dp)
                                .width(200.dp)
                                .background(CardBorderColor)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun UserLoader(
    count: Int = 5
) {
    Column {
        repeat(count) {
            Card(
                modifier = Modifier
                    .height(62.dp)
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                shape = RoundedCornerShape(5.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                border = BorderStroke(0.5.dp, CardBorderColor),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            ) {
                Row (
                    Modifier.padding(15.dp)
                ){
                    Box(
                        modifier = Modifier
                            .shimmer()
                            .size(20.dp)
                            .background(shape = CircleShape, color = CardBorderColor)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Box(
                            modifier = Modifier
                                .shimmer()
                                .height(8.dp)
                                .fillMaxWidth()
                                .background(CardBorderColor)
                        )
                        Spacer(modifier = Modifier.height(15.dp))
                        Box(
                            modifier = Modifier
                                .shimmer()
                                .height(5.dp)
                                .width(150.dp)
                                .background(CardBorderColor)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}