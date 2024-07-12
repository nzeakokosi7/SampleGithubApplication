package com.example.samplegithubapp.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplegithubapp.ui.theme.AppIcon
import com.example.samplegithubapp.ui.theme.ChipColor
import com.example.samplegithubapp.ui.theme.ChipTextColor
import com.example.samplegithubapp.ui.theme.GithubUserNameTextColor
import com.example.samplegithubapp.ui.theme.CardBorderColor
import com.example.samplegithubapp.ui.theme.Typography
import com.example.samplegithubapp.ui.theme.appicon.Star
import com.example.samplegithubapp.ui.theme.shadowCustom

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RepositoryCard(
    githubUsername: String,
    repository: String,
    repoImageUrl: String,
    mainStack: String,
    description: String,
    githubStarCount: Int,
    tags: Set<String>,
) {
    Card(
        modifier = Modifier
            .height(132.dp)
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
                CircularNetworkImage(
                    imageUrl = repoImageUrl,
                    contentDescription = "Github Avatar"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Row(
                    modifier = Modifier
                        .height(21.dp)
                        .fillMaxWidth(0.5f)
                        .basicMarquee(delayMillis = 1000),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "${githubUsername}/",
                        fontSize = 12.sp,
                        color = GithubUserNameTextColor
                    )
                    Text(
                        text = repository,
                        fontSize = 12.sp
                    )
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
                    fontSize = 10.sp
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
                    fontSize = 10.sp
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                modifier = Modifier.weight(0.8f),
                text = description,
                style = Typography.bodySmall,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(22.dp)
                    .basicMarquee(delayMillis = 5000),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                tags.forEach {
                    InputChip(
                        modifier = Modifier.height(22.dp),
                        selected = true,
                        onClick = { /*TODO*/ },
                        label = {
                            Text(
                                text = it,
                                color = ChipTextColor,
                                fontSize = 10.sp
                            )
                        },
                        colors = InputChipDefaults.inputChipColors(selectedContainerColor = ChipColor)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                }
            }
        }
    }
}