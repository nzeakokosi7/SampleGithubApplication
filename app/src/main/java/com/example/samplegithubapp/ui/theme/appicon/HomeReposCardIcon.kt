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

public val AppIcon.HomeReposCardIcon: ImageVector
    get() {
        if (_homeReposCardIcon != null) {
            return _homeReposCardIcon!!
        }
        _homeReposCardIcon = Builder(name = "HomeReposCardIcon", defaultWidth = 35.0.dp,
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
            path(fill = SolidColor(Color(0xFF5D2A6A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 11.7917f)
                horizontalLineTo(15.7333f)
                curveTo(14.7166f, 11.7917f, 13.875f, 10.9666f, 13.8583f, 9.95f)
                lineTo(13.8333f, 8.675f)
                curveTo(13.825f, 8.3333f, 14.1f, 8.0417f, 14.4416f, 8.0333f)
                curveTo(14.45f, 8.0333f, 14.45f, 8.0333f, 14.4583f, 8.0333f)
                curveTo(14.8f, 8.0333f, 15.075f, 8.3083f, 15.0833f, 8.6416f)
                lineTo(15.1083f, 9.9167f)
                curveTo(15.1166f, 10.25f, 15.4f, 10.5333f, 15.7333f, 10.5333f)
                horizontalLineTo(18.25f)
                curveTo(18.6f, 10.5333f, 18.875f, 10.25f, 18.875f, 9.9083f)
                verticalLineTo(8.6667f)
                curveTo(18.875f, 8.325f, 19.1583f, 8.0417f, 19.5f, 8.0417f)
                curveTo(19.8416f, 8.0417f, 20.125f, 8.325f, 20.125f, 8.6667f)
                verticalLineTo(9.9167f)
                curveTo(20.125f, 10.95f, 19.2833f, 11.7917f, 18.25f, 11.7917f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5D2A6A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1667f, 25.125f)
                curveTo(21.0083f, 25.125f, 20.85f, 25.0667f, 20.725f, 24.9417f)
                lineTo(19.0583f, 23.275f)
                curveTo(18.8167f, 23.0333f, 18.8167f, 22.6333f, 19.0583f, 22.3916f)
                lineTo(20.725f, 20.725f)
                curveTo(20.9667f, 20.4833f, 21.3667f, 20.4833f, 21.6083f, 20.725f)
                curveTo(21.85f, 20.9666f, 21.85f, 21.3667f, 21.6083f, 21.6083f)
                lineTo(20.3833f, 22.8333f)
                lineTo(21.6083f, 24.0583f)
                curveTo(21.85f, 24.3f, 21.85f, 24.7f, 21.6083f, 24.9417f)
                curveTo(21.4833f, 25.0667f, 21.325f, 25.125f, 21.1667f, 25.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5D2A6A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.6666f, 25.125f)
                curveTo(23.5083f, 25.125f, 23.35f, 25.0667f, 23.225f, 24.9417f)
                curveTo(22.9833f, 24.7f, 22.9833f, 24.3f, 23.225f, 24.0583f)
                lineTo(24.45f, 22.8333f)
                lineTo(23.225f, 21.6083f)
                curveTo(22.9833f, 21.3667f, 22.9833f, 20.9666f, 23.225f, 20.725f)
                curveTo(23.4666f, 20.4833f, 23.8666f, 20.4833f, 24.1083f, 20.725f)
                lineTo(25.7749f, 22.3916f)
                curveTo(26.0166f, 22.6333f, 26.0166f, 23.0333f, 25.7749f, 23.275f)
                lineTo(24.1083f, 24.9417f)
                curveTo(23.9833f, 25.0667f, 23.825f, 25.125f, 23.6666f, 25.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5D2A6A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8333f, 25.9583f)
                horizontalLineTo(13.6667f)
                curveTo(10.625f, 25.9583f, 8.875f, 24.2083f, 8.875f, 21.1667f)
                verticalLineTo(12.8333f)
                curveTo(8.875f, 9.7917f, 10.625f, 8.0417f, 13.6667f, 8.0417f)
                horizontalLineTo(20.3333f)
                curveTo(23.375f, 8.0417f, 25.125f, 9.7917f, 25.125f, 12.8333f)
                verticalLineTo(18.6667f)
                curveTo(25.125f, 19.0083f, 24.8417f, 19.2917f, 24.5f, 19.2917f)
                curveTo(24.1583f, 19.2917f, 23.875f, 19.0083f, 23.875f, 18.6667f)
                verticalLineTo(12.8333f)
                curveTo(23.875f, 10.45f, 22.7167f, 9.2917f, 20.3333f, 9.2917f)
                horizontalLineTo(13.6667f)
                curveTo(11.2833f, 9.2917f, 10.125f, 10.45f, 10.125f, 12.8333f)
                verticalLineTo(21.1667f)
                curveTo(10.125f, 23.55f, 11.2833f, 24.7083f, 13.6667f, 24.7083f)
                horizontalLineTo(17.8333f)
                curveTo(18.175f, 24.7083f, 18.4583f, 24.9917f, 18.4583f, 25.3333f)
                curveTo(18.4583f, 25.675f, 18.175f, 25.9583f, 17.8333f, 25.9583f)
                close()
            }
        }
        .build()
        return _homeReposCardIcon!!
    }

private var _homeReposCardIcon: ImageVector? = null
