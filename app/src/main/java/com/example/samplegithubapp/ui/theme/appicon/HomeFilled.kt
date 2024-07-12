package com.example.samplegithubapp.ui.theme.appicon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.samplegithubapp.ui.theme.AppIcon

public val AppIcon.HomeFilled: ImageVector
    get() {
        if (_homeFilled != null) {
            return _homeFilled!!
        }
        _homeFilled = Builder(name = "HomeFilled", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3584f, 6.675f)
                lineTo(11.9f, 2.3083f)
                curveTo(10.8334f, 1.4583f, 9.1667f, 1.45f, 8.1084f, 2.3f)
                lineTo(2.65f, 6.675f)
                curveTo(1.8667f, 7.3f, 1.3917f, 8.55f, 1.5584f, 9.5333f)
                lineTo(2.6084f, 15.8167f)
                curveTo(2.85f, 17.225f, 4.1584f, 18.3333f, 5.5834f, 18.3333f)
                horizontalLineTo(14.4167f)
                curveTo(15.825f, 18.3333f, 17.1584f, 17.2f, 17.4f, 15.8083f)
                lineTo(18.45f, 9.525f)
                curveTo(18.6f, 8.55f, 18.125f, 7.3f, 17.3584f, 6.675f)
                close()
                moveTo(10.625f, 15.0f)
                curveTo(10.625f, 15.3417f, 10.3417f, 15.625f, 10.0f, 15.625f)
                curveTo(9.6584f, 15.625f, 9.375f, 15.3417f, 9.375f, 15.0f)
                verticalLineTo(12.5f)
                curveTo(9.375f, 12.1583f, 9.6584f, 11.875f, 10.0f, 11.875f)
                curveTo(10.3417f, 11.875f, 10.625f, 12.1583f, 10.625f, 12.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _homeFilled!!
    }

private var _homeFilled: ImageVector? = null
