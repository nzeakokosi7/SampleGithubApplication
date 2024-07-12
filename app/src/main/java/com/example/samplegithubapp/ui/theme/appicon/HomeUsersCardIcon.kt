package com.example.samplegithubapp.ui.theme.appicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.samplegithubapp.ui.theme.AppIcon

public val AppIcon.HomeUsersCardIcon: ImageVector
    get() {
        if (_homeUsersCardIcon != null) {
            return _homeUsersCardIcon!!
        }
        _homeUsersCardIcon = Builder(name = "HomeUsersCardIcon", defaultWidth = 35.0.dp,
                defaultHeight = 35.0.dp, viewportWidth = 35.0f, viewportHeight = 35.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.6f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 0.0f)
                lineTo(33.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 35.0f, 2.0f)
                lineTo(35.0f, 33.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 33.0f, 35.0f)
                lineTo(2.0f, 35.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 33.0f)
                lineTo(0.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF408AAA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7391f, 17.4049f)
                curveTo(13.9251f, 17.4049f, 11.6349f, 15.1146f, 11.6349f, 12.3007f)
                curveTo(11.6349f, 9.4867f, 13.9251f, 7.1965f, 16.7391f, 7.1965f)
                curveTo(19.553f, 7.1965f, 21.8432f, 9.4867f, 21.8432f, 12.3007f)
                curveTo(21.8432f, 15.1146f, 19.553f, 17.4049f, 16.7391f, 17.4049f)
                close()
                moveTo(16.7391f, 8.5281f)
                curveTo(14.6619f, 8.5281f, 12.9664f, 10.2235f, 12.9664f, 12.3007f)
                curveTo(12.9664f, 14.3779f, 14.6619f, 16.0733f, 16.7391f, 16.0733f)
                curveTo(18.8162f, 16.0733f, 20.5117f, 14.3779f, 20.5117f, 12.3007f)
                curveTo(20.5117f, 10.2235f, 18.8162f, 8.5281f, 16.7391f, 8.5281f)
                close()
            }
            path(fill = SolidColor(Color(0xFF408AAA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.3644f, 26.2817f)
                curveTo(24.0004f, 26.2817f, 23.6986f, 25.9799f, 23.6986f, 25.6159f)
                curveTo(23.6986f, 22.5534f, 20.574f, 20.0679f, 16.7392f, 20.0679f)
                curveTo(12.9044f, 20.0679f, 9.7798f, 22.5534f, 9.7798f, 25.6159f)
                curveTo(9.7798f, 25.9799f, 9.478f, 26.2817f, 9.114f, 26.2817f)
                curveTo(8.75f, 26.2817f, 8.4482f, 25.9799f, 8.4482f, 25.6159f)
                curveTo(8.4482f, 21.8255f, 12.1676f, 18.7364f, 16.7392f, 18.7364f)
                curveTo(21.3107f, 18.7364f, 25.0301f, 21.8255f, 25.0301f, 25.6159f)
                curveTo(25.0301f, 25.9799f, 24.7283f, 26.2817f, 24.3644f, 26.2817f)
                close()
            }
        }
        .build()
        return _homeUsersCardIcon!!
    }

private var _homeUsersCardIcon: ImageVector? = null
