package com.example.samplegithubapp.ui.theme

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.samplegithubapp.ui.theme.appicon.ArrowLeft
import kotlin.collections.List as ____KtList

public object AppIcon

private var __AppIcon: ____KtList<ImageVector>? = null

public val AppIcon.AppIcon: ____KtList<ImageVector>
  get() {
    if (__AppIcon != null) {
      return __AppIcon!!
    }
    __AppIcon= listOf(ArrowLeft)
    return __AppIcon!!
  }
