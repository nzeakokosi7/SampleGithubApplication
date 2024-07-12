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

public val AppIcon.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0xFF1A1A1A)), stroke = null, fillAlpha = 0.55f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4999f, 8.8562f)
                curveTo(6.1687f, 8.8562f, 5.0812f, 7.775f, 5.0812f, 6.4375f)
                curveTo(5.0812f, 5.1f, 6.1687f, 4.025f, 7.4999f, 4.025f)
                curveTo(8.8312f, 4.025f, 9.9187f, 5.1062f, 9.9187f, 6.4437f)
                curveTo(9.9187f, 7.7813f, 8.8312f, 8.8562f, 7.4999f, 8.8562f)
                close()
                moveTo(7.4999f, 4.9625f)
                curveTo(6.6874f, 4.9625f, 6.0187f, 5.625f, 6.0187f, 6.4437f)
                curveTo(6.0187f, 7.2625f, 6.6812f, 7.925f, 7.4999f, 7.925f)
                curveTo(8.3187f, 7.925f, 8.9812f, 7.2625f, 8.9812f, 6.4437f)
                curveTo(8.9812f, 5.625f, 8.3124f, 4.9625f, 7.4999f, 4.9625f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1A1A1A)), stroke = null, fillAlpha = 0.55f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4999f, 14.225f)
                curveTo(6.5749f, 14.225f, 5.6437f, 13.875f, 4.9187f, 13.1812f)
                curveTo(3.0749f, 11.4062f, 1.0374f, 8.575f, 1.8062f, 5.2063f)
                curveTo(2.4999f, 2.15f, 5.1687f, 0.7813f, 7.4999f, 0.7813f)
                curveTo(7.4999f, 0.7813f, 7.4999f, 0.7813f, 7.5062f, 0.7813f)
                curveTo(9.8374f, 0.7813f, 12.5062f, 2.15f, 13.1999f, 5.2125f)
                curveTo(13.9624f, 8.5813f, 11.9249f, 11.4062f, 10.0812f, 13.1812f)
                curveTo(9.3562f, 13.875f, 8.4249f, 14.225f, 7.4999f, 14.225f)
                close()
                moveTo(7.4999f, 1.7188f)
                curveTo(5.6812f, 1.7188f, 3.3437f, 2.6875f, 2.7249f, 5.4125f)
                curveTo(2.0499f, 8.3562f, 3.8999f, 10.8937f, 5.5749f, 12.5f)
                curveTo(6.6562f, 13.5437f, 8.3499f, 13.5437f, 9.4312f, 12.5f)
                curveTo(11.0999f, 10.8937f, 12.9499f, 8.3562f, 12.2874f, 5.4125f)
                curveTo(11.6624f, 2.6875f, 9.3187f, 1.7188f, 7.4999f, 1.7188f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
