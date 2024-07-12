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

public val AppIcon.HomeOutline: ImageVector
    get() {
        if (_homeOutline != null) {
            return _homeOutline!!
        }
        _homeOutline = Builder(name = "HomeOutline", defaultWidth = 20.0.dp, defaultHeight =
                20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 15.625f)
                curveTo(9.6583f, 15.625f, 9.375f, 15.3417f, 9.375f, 15.0f)
                verticalLineTo(12.5f)
                curveTo(9.375f, 12.1583f, 9.6583f, 11.875f, 10.0f, 11.875f)
                curveTo(10.3417f, 11.875f, 10.625f, 12.1583f, 10.625f, 12.5f)
                verticalLineTo(15.0f)
                curveTo(10.625f, 15.3417f, 10.3417f, 15.625f, 10.0f, 15.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6666f, 18.8f)
                horizontalLineTo(5.3333f)
                curveTo(3.8166f, 18.8f, 2.4333f, 17.6333f, 2.1833f, 16.1417f)
                lineTo(1.075f, 9.5f)
                curveTo(0.8916f, 8.4667f, 1.4f, 7.1417f, 2.225f, 6.4833f)
                lineTo(8.0f, 1.8584f)
                curveTo(9.1166f, 0.9583f, 10.875f, 0.9667f, 12.0f, 1.8667f)
                lineTo(17.775f, 6.4833f)
                curveTo(18.5916f, 7.1417f, 19.0916f, 8.4667f, 18.925f, 9.5f)
                lineTo(17.8166f, 16.1333f)
                curveTo(17.5666f, 17.6083f, 16.15f, 18.8f, 14.6666f, 18.8f)
                close()
                moveTo(9.9916f, 2.4417f)
                curveTo(9.55f, 2.4417f, 9.1083f, 2.575f, 8.7833f, 2.8333f)
                lineTo(3.0083f, 7.4667f)
                curveTo(2.5416f, 7.8417f, 2.2083f, 8.7084f, 2.3083f, 9.3f)
                lineTo(3.4166f, 15.9333f)
                curveTo(3.5666f, 16.8083f, 4.4416f, 17.55f, 5.3333f, 17.55f)
                horizontalLineTo(14.6666f)
                curveTo(15.5583f, 17.55f, 16.4333f, 16.8083f, 16.5833f, 15.925f)
                lineTo(17.6916f, 9.2917f)
                curveTo(17.7833f, 8.7084f, 17.45f, 7.825f, 16.9916f, 7.4584f)
                lineTo(11.2166f, 2.8417f)
                curveTo(10.8833f, 2.575f, 10.4333f, 2.4417f, 9.9916f, 2.4417f)
                close()
            }
        }
        .build()
        return _homeOutline!!
    }

private var _homeOutline: ImageVector? = null
