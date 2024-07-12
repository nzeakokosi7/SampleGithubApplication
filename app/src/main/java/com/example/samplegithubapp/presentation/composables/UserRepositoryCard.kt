package com.example.samplegithubapp.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplegithubapp.ui.theme.AppIcon
import com.example.samplegithubapp.ui.theme.GithubUserNameTextColor
import com.example.samplegithubapp.ui.theme.CardBorderColor
import com.example.samplegithubapp.ui.theme.appicon.Star
import com.example.samplegithubapp.ui.theme.shadowCustom

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UserRepositoryCard(
    githubUsername: String,
    repository: String,
    mainStack: String,
    description: String,
    githubStarCount: Int,
    lastUpdated: String
) {
    Card(
        modifier = Modifier
            .height(107.dp)
            .fillMaxWidth()
            .shadowCustom(
                color = CardBorderColor.copy(0.5f),
                offsetX = 0.dp,
                offsetY = 2.dp,
                blurRadius = 2.dp,
            ),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(0.5.dp, CardBorderColor),
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
        ) {
            Row(
                modifier = Modifier.height(21.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier
                        .height(21.dp)
                        .width(240.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier
                            .height(21.dp)
                            .width(120.dp)
                            .basicMarquee(delayMillis = 1000),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${githubUsername}/",
                            fontSize = 12.sp,
                            color = GithubUserNameTextColor
                        )
                        Box(modifier = Modifier.width(150.dp)) {
                            Text(
                                text = repository,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Box(
                        modifier = Modifier
                            .width(39.dp)
                            .height(17.dp)
                            .border(1.dp, color = CardBorderColor, shape = RoundedCornerShape(5.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Public",
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            fontSize = 8.sp,
                            lineHeight = 13.sp,
                            fontWeight = FontWeight.W400
                        )
                    }

                }
                Spacer(modifier = Modifier.weight(1.0f))
                Icon(
                    modifier = Modifier.size(12.dp),
                    imageVector = AppIcon.Star,
                    contentDescription = "Github Stars"
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = githubStarCount.toString(),
                    fontSize = 10.sp,
                    lineHeight = 13.sp,
                    fontWeight = FontWeight.W400
                )
                Spacer(modifier = Modifier.width(10.dp))
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .background(Color.Green, CircleShape),
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = mainStack,
                    fontSize = 10.sp,
                    lineHeight = 13.sp,
                    fontWeight = FontWeight.W400
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                modifier = Modifier.weight(0.8f),
                text = description,
                fontSize = 12.sp,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            TimeAgo(lastUpdated)
        }
    }
}