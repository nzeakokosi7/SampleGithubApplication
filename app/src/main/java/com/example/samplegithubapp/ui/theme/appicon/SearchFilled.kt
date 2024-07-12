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

public val AppIcon.SearchFilled: ImageVector
    get() {
        if (_searchFilled != null) {
            return _searchFilled!!
        }
        _searchFilled = Builder(name = "SearchFilled", defaultWidth = 20.0.dp, defaultHeight =
                20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5833f, 17.5f)
                curveTo(13.9555f, 17.5f, 17.5f, 13.9556f, 17.5f, 9.5833f)
                curveTo(17.5f, 5.2111f, 13.9555f, 1.6667f, 9.5833f, 1.6667f)
                curveTo(5.211f, 1.6667f, 1.6666f, 5.2111f, 1.6666f, 9.5833f)
                curveTo(1.6666f, 13.9556f, 5.211f, 17.5f, 9.5833f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 18.3333f)
                curveTo(17.6f, 18.3333f, 17.45f, 18.275f, 17.3417f, 18.1667f)
                lineTo(15.7917f, 16.6167f)
                curveTo(15.5667f, 16.3917f, 15.5667f, 16.025f, 15.7917f, 15.7917f)
                curveTo(16.0167f, 15.5667f, 16.3833f, 15.5667f, 16.6167f, 15.7917f)
                lineTo(18.1667f, 17.3417f)
                curveTo(18.3917f, 17.5667f, 18.3917f, 17.9333f, 18.1667f, 18.1667f)
                curveTo(18.05f, 18.275f, 17.9f, 18.3333f, 17.75f, 18.3333f)
                close()
            }
        }
        .build()
        return _searchFilled!!
    }

private var _searchFilled: ImageVector? = null
