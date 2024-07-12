package com.example.samplegithubapp.presentation.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplegithubapp.ui.theme.AppIcon
import com.example.samplegithubapp.ui.theme.DimmedBlack
import com.example.samplegithubapp.ui.theme.Typography
import com.example.samplegithubapp.ui.theme.appicon.Location
import com.example.samplegithubapp.ui.theme.appicon.People
import com.example.samplegithubapp.ui.theme.appicon.Url
import com.example.samplegithubapp.ui.theme.plus

@Composable
fun UserProfileCard(
    avatarUrl: String,
    fullName: String,
    username: String,
    url: String,
    bio: String?,
    location: String?,
    followers: Int,
    following: Int,
    innerPadding: PaddingValues
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                innerPadding
                        + PaddingValues(start = 18.dp, end = 18.dp)
            )
    ) {
        Row {
            CircularNetworkImage(
                imageUrl = avatarUrl,
                contentDescription = "Github user avatar",
                size = 45.dp
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = fullName,
                    style = Typography.titleSmall
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = username,
                    fontWeight = FontWeight.W500,
                    fontSize = 14.sp,
                    lineHeight = 19.sp
                )
            }
        }
        if(!bio.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                modifier = Modifier.fillMaxWidth(0.9f),
                text = bio,
                color = Color.Black,
                fontSize = 12.sp,
                fontWeight = FontWeight.W500,
                lineHeight = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            if(!location.isNullOrBlank()) {
                Icon(
                    modifier = Modifier.size(15.dp),
                    imageVector = AppIcon.Location,
                    contentDescription = "Location",
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = location,
                    color = Color.Gray,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W500,
                    lineHeight = 13.sp
                )
                Spacer(modifier = Modifier.width(12.dp))
            }
            Icon(
                modifier = Modifier.size(15.dp),
                imageVector = AppIcon.Url,
                contentDescription = "Url",
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = url,
                color = DimmedBlack,
                fontSize = 10.sp,
                fontWeight = FontWeight.W600,
                lineHeight = 13.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.size(15.dp),
                imageVector = AppIcon.People,
                contentDescription = "Followers",
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "${followers} followers .    ${following}  following",
                color = Color.Gray,
                fontSize = 10.sp,
                fontWeight = FontWeight.W500,
                lineHeight = 13.sp
            )
        }
    }
}