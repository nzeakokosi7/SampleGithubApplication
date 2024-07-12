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

public val AppIcon.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.78f)
                curveTo(9.8733f, 13.78f, 9.7467f, 13.7333f, 9.6467f, 13.6333f)
                lineTo(5.3f, 9.2867f)
                curveTo(4.5933f, 8.58f, 4.5933f, 7.42f, 5.3f, 6.7133f)
                lineTo(9.6467f, 2.3667f)
                curveTo(9.84f, 2.1733f, 10.16f, 2.1733f, 10.3533f, 2.3667f)
                curveTo(10.5467f, 2.56f, 10.5467f, 2.88f, 10.3533f, 3.0733f)
                lineTo(6.0067f, 7.42f)
                curveTo(5.6867f, 7.74f, 5.6867f, 8.26f, 6.0067f, 8.58f)
                lineTo(10.3533f, 12.9267f)
                curveTo(10.5467f, 13.12f, 10.5467f, 13.44f, 10.3533f, 13.6333f)
                curveTo(10.2533f, 13.7267f, 10.1267f, 13.78f, 10.0f, 13.78f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
