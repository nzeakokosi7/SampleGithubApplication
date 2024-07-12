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

public val AppIcon.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 12.0.dp, defaultHeight = 12.0.dp,
                viewportWidth = 12.0f, viewportHeight = 12.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.83f, 11.335f)
                curveTo(8.565f, 11.335f, 8.225f, 11.25f, 7.8f, 11.0f)
                lineTo(6.305f, 10.115f)
                curveTo(6.15f, 10.025f, 5.85f, 10.025f, 5.7f, 10.115f)
                lineTo(4.2f, 11.0f)
                curveTo(3.315f, 11.525f, 2.795f, 11.315f, 2.56f, 11.145f)
                curveTo(2.33f, 10.975f, 1.97f, 10.54f, 2.205f, 9.54f)
                lineTo(2.56f, 8.005f)
                curveTo(2.6f, 7.845f, 2.52f, 7.57f, 2.4f, 7.45f)
                lineTo(1.16f, 6.21f)
                curveTo(0.54f, 5.59f, 0.59f, 5.06f, 0.675f, 4.8f)
                curveTo(0.76f, 4.54f, 1.03f, 4.08f, 1.89f, 3.935f)
                lineTo(3.485f, 3.67f)
                curveTo(3.635f, 3.645f, 3.85f, 3.485f, 3.915f, 3.35f)
                lineTo(4.8f, 1.585f)
                curveTo(5.2f, 0.78f, 5.725f, 0.66f, 6.0f, 0.66f)
                curveTo(6.275f, 0.66f, 6.8f, 0.78f, 7.2f, 1.585f)
                lineTo(8.08f, 3.345f)
                curveTo(8.15f, 3.48f, 8.365f, 3.64f, 8.515f, 3.665f)
                lineTo(10.11f, 3.93f)
                curveTo(10.975f, 4.075f, 11.245f, 4.535f, 11.325f, 4.795f)
                curveTo(11.405f, 5.055f, 11.455f, 5.585f, 10.84f, 6.205f)
                lineTo(9.6f, 7.45f)
                curveTo(9.48f, 7.57f, 9.405f, 7.84f, 9.44f, 8.005f)
                lineTo(9.795f, 9.54f)
                curveTo(10.025f, 10.54f, 9.67f, 10.975f, 9.44f, 11.145f)
                curveTo(9.315f, 11.235f, 9.115f, 11.335f, 8.83f, 11.335f)
                close()
                moveTo(6.0f, 9.295f)
                curveTo(6.245f, 9.295f, 6.49f, 9.355f, 6.685f, 9.47f)
                lineTo(8.18f, 10.355f)
                curveTo(8.615f, 10.615f, 8.89f, 10.615f, 8.995f, 10.54f)
                curveTo(9.1f, 10.465f, 9.175f, 10.2f, 9.065f, 9.71f)
                lineTo(8.71f, 8.175f)
                curveTo(8.615f, 7.76f, 8.77f, 7.225f, 9.07f, 6.92f)
                lineTo(10.31f, 5.68f)
                curveTo(10.555f, 5.435f, 10.665f, 5.195f, 10.615f, 5.03f)
                curveTo(10.56f, 4.865f, 10.33f, 4.73f, 9.99f, 4.675f)
                lineTo(8.395f, 4.41f)
                curveTo(8.01f, 4.345f, 7.59f, 4.035f, 7.415f, 3.685f)
                lineTo(6.535f, 1.925f)
                curveTo(6.375f, 1.605f, 6.175f, 1.415f, 6.0f, 1.415f)
                curveTo(5.825f, 1.415f, 5.625f, 1.605f, 5.47f, 1.925f)
                lineTo(4.585f, 3.685f)
                curveTo(4.41f, 4.035f, 3.99f, 4.345f, 3.605f, 4.41f)
                lineTo(2.015f, 4.675f)
                curveTo(1.675f, 4.73f, 1.445f, 4.865f, 1.39f, 5.03f)
                curveTo(1.335f, 5.195f, 1.45f, 5.44f, 1.695f, 5.68f)
                lineTo(2.935f, 6.92f)
                curveTo(3.235f, 7.22f, 3.39f, 7.76f, 3.295f, 8.175f)
                lineTo(2.94f, 9.71f)
                curveTo(2.825f, 10.205f, 2.905f, 10.465f, 3.01f, 10.54f)
                curveTo(3.115f, 10.615f, 3.385f, 10.61f, 3.825f, 10.355f)
                lineTo(5.32f, 9.47f)
                curveTo(5.51f, 9.355f, 5.755f, 9.295f, 6.0f, 9.295f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
