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

public val AppIcon.UserFilled: ImageVector
    get() {
        if (_userFilled != null) {
            return _userFilled!!
        }
        _userFilled = Builder(name = "UserFilled", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                curveTo(12.3012f, 10.0f, 14.1667f, 8.1345f, 14.1667f, 5.8334f)
                curveTo(14.1667f, 3.5322f, 12.3012f, 1.6667f, 10.0f, 1.6667f)
                curveTo(7.6989f, 1.6667f, 5.8334f, 3.5322f, 5.8334f, 5.8334f)
                curveTo(5.8334f, 8.1345f, 7.6989f, 10.0f, 10.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0833f)
                curveTo(5.825f, 12.0833f, 2.4251f, 14.8833f, 2.4251f, 18.3333f)
                curveTo(2.4251f, 18.5666f, 2.6084f, 18.75f, 2.8417f, 18.75f)
                horizontalLineTo(17.1584f)
                curveTo(17.3917f, 18.75f, 17.575f, 18.5666f, 17.575f, 18.3333f)
                curveTo(17.575f, 14.8833f, 14.175f, 12.0833f, 10.0f, 12.0833f)
                close()
            }
        }
        .build()
        return _userFilled!!
    }

private var _userFilled: ImageVector? = null
