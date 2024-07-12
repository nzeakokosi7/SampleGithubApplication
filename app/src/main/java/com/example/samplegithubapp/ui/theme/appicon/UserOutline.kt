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

public val AppIcon.UserOutline: ImageVector
    get() {
        if (_userOutline != null) {
            return _userOutline!!
        }
        _userOutline = Builder(name = "UserOutline", defaultWidth = 20.0.dp, defaultHeight =
                20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.625f)
                curveTo(7.3584f, 10.625f, 5.2084f, 8.475f, 5.2084f, 5.8333f)
                curveTo(5.2084f, 3.1917f, 7.3584f, 1.0417f, 10.0f, 1.0417f)
                curveTo(12.6417f, 1.0417f, 14.7917f, 3.1917f, 14.7917f, 5.8333f)
                curveTo(14.7917f, 8.475f, 12.6417f, 10.625f, 10.0f, 10.625f)
                close()
                moveTo(10.0f, 2.2917f)
                curveTo(8.05f, 2.2917f, 6.4584f, 3.8833f, 6.4584f, 5.8333f)
                curveTo(6.4584f, 7.7833f, 8.05f, 9.375f, 10.0f, 9.375f)
                curveTo(11.95f, 9.375f, 13.5417f, 7.7833f, 13.5417f, 5.8333f)
                curveTo(13.5417f, 3.8833f, 11.95f, 2.2917f, 10.0f, 2.2917f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1585f, 18.9583f)
                curveTo(16.8168f, 18.9583f, 16.5335f, 18.675f, 16.5335f, 18.3333f)
                curveTo(16.5335f, 15.4583f, 13.6001f, 13.125f, 10.0001f, 13.125f)
                curveTo(6.4001f, 13.125f, 3.4668f, 15.4583f, 3.4668f, 18.3333f)
                curveTo(3.4668f, 18.675f, 3.1835f, 18.9583f, 2.8418f, 18.9583f)
                curveTo(2.5001f, 18.9583f, 2.2168f, 18.675f, 2.2168f, 18.3333f)
                curveTo(2.2168f, 14.775f, 5.7085f, 11.875f, 10.0001f, 11.875f)
                curveTo(14.2918f, 11.875f, 17.7835f, 14.775f, 17.7835f, 18.3333f)
                curveTo(17.7835f, 18.675f, 17.5001f, 18.9583f, 17.1585f, 18.9583f)
                close()
            }
        }
        .build()
        return _userOutline!!
    }

private var _userOutline: ImageVector? = null
