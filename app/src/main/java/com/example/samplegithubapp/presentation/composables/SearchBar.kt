package com.example.samplegithubapp.presentation.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.samplegithubapp.ui.theme.AppIcon
import com.example.samplegithubapp.ui.theme.ButtonColor
import com.example.samplegithubapp.ui.theme.CardBorderColor
import com.example.samplegithubapp.ui.theme.PlaceHolderTextColor
import com.example.samplegithubapp.ui.theme.appicon.SearchOutline


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    text: String,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit,
    modifier: Modifier = Modifier,
    placeholderText: String = "Search",
    isError: Boolean = false
) {
    val interactionSource = remember { MutableInteractionSource() }
    var hasFocus by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .height(41.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(0.5.dp, if (hasFocus) ButtonColor else CardBorderColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    ) {
        Row(
            modifier = modifier
                .padding(start = 12.dp, top = 4.dp, bottom = 4.dp, end = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Icon(
                modifier = Modifier.size(12.dp),
                imageVector = AppIcon.SearchOutline,
                tint = Color.Gray,
                contentDescription = " Search Icon"
            )
            Spacer(modifier = Modifier.width(8.dp))
            BasicTextField(
                value = text,
                onValueChange = onValueChange,
                modifier = Modifier
                    .weight(0.7f)
                    .indicatorLine(
                        enabled = false,
                        isError = false,
                        colors = TextFieldDefaults.colors(focusedIndicatorColor = Color.Transparent),
                        interactionSource = interactionSource,
                        focusedIndicatorLineThickness = 0.dp,
                        unfocusedIndicatorLineThickness = 0.dp
                    )
                    .onFocusChanged { focusState ->
                        hasFocus = focusState.isFocused
                    },

                singleLine = true,
                interactionSource = interactionSource,
                decorationBox = @Composable { innerTextField ->
                    TextFieldDefaults.DecorationBox(
                        value = text,
                        visualTransformation = VisualTransformation.None,
                        innerTextField = innerTextField,
                        placeholder = {
                            Text(
                                text = placeholderText,
                                fontWeight = FontWeight.W500,
                                color = PlaceHolderTextColor,
                                fontSize = 10.sp
                            )
                        },
                        label = null,
                        leadingIcon = null,
                        trailingIcon = null,
                        prefix = null,
                        suffix = null,
                        supportingText = null,
                        shape = TextFieldDefaults.shape,
                        singleLine = true,
                        enabled = true,
                        isError = isError,
                        interactionSource = interactionSource,
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent
                        ),
                        contentPadding = PaddingValues(all = 0.dp)
                    )
                }
            )
            Spacer(modifier = Modifier.width(4.dp))
            Button(
                modifier = Modifier
                    .height(32.dp)
                    .weight(0.2f),
                colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
                contentPadding = PaddingValues(all = 0.dp),
                shape = RoundedCornerShape(5.dp),
                onClick = onSearch
            ) {
                Text(
                    "Search",
                    fontSize = 10.sp,
                    lineHeight = 13.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.White
                )
            }
        }

    }

}
