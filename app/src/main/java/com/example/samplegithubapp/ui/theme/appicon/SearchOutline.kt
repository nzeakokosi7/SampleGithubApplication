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

public val AppIcon.SearchOutline: ImageVector
    get() {
        if (_searchOutline != null) {
            return _searchOutline!!
        }
        _searchOutline = Builder(name = "SearchOutline", defaultWidth = 20.0.dp, defaultHeight =
                20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5833f, 18.125f)
                curveTo(4.875f, 18.125f, 1.0416f, 14.2917f, 1.0416f, 9.5834f)
                curveTo(1.0416f, 4.875f, 4.875f, 1.0417f, 9.5833f, 1.0417f)
                curveTo(14.2916f, 1.0417f, 18.125f, 4.875f, 18.125f, 9.5834f)
                curveTo(18.125f, 14.2917f, 14.2916f, 18.125f, 9.5833f, 18.125f)
                close()
                moveTo(9.5833f, 2.2917f)
                curveTo(5.5583f, 2.2917f, 2.2916f, 5.5667f, 2.2916f, 9.5834f)
                curveTo(2.2916f, 13.6f, 5.5583f, 16.875f, 9.5833f, 16.875f)
                curveTo(13.6083f, 16.875f, 16.875f, 13.6f, 16.875f, 9.5834f)
                curveTo(16.875f, 5.5667f, 13.6083f, 2.2917f, 9.5833f, 2.2917f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3333f, 18.9583f)
                curveTo(18.175f, 18.9583f, 18.0166f, 18.9f, 17.8916f, 18.775f)
                lineTo(16.225f, 17.1083f)
                curveTo(15.9833f, 16.8667f, 15.9833f, 16.4667f, 16.225f, 16.225f)
                curveTo(16.4666f, 15.9833f, 16.8666f, 15.9833f, 17.1083f, 16.225f)
                lineTo(18.775f, 17.8917f)
                curveTo(19.0166f, 18.1333f, 19.0166f, 18.5333f, 18.775f, 18.775f)
                curveTo(18.65f, 18.9f, 18.4916f, 18.9583f, 18.3333f, 18.9583f)
                close()
            }
        }
        .build()
        return _searchOutline!!
    }

private var _searchOutline: ImageVector? = null
