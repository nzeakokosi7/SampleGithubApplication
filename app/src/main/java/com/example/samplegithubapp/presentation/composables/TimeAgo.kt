package com.example.samplegithubapp.presentation.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.time.Instant
import java.util.Locale
import java.util.TimeZone

@Composable
fun TimeAgo(timestamp: String) {
    var timeAgo by remember { mutableStateOf("") }

    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.UK)
    formatter.timeZone = TimeZone.getTimeZone("UTC")
    val date = formatter.parse(timestamp)

    val now = Instant.now()
    val diff = now.toEpochMilli() - date!!.time

    val seconds = diff / 1000
    val minutes = seconds / 60
    val hours = minutes / 60
    val days = hours / 24
    val weeks = days / 7
    val months = weeks / 4
    val years = months / 12

    val stringValue: String = when {
        years > 0 -> "$years years ago"
        months > 0 -> "$months months ago"
        weeks > 0 -> "$weeks weeks ago"
        days > 0 -> "$days days ago"
        hours > 0 -> "$hours hours ago"
        minutes > 0 -> "$minutes minutes ago"
        else -> "just now"
    }

    timeAgo = stringValue
    Text(
        text = "Updated $timeAgo",
        color = Color.Gray,
        fontSize = 10.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 13.sp
    )
}