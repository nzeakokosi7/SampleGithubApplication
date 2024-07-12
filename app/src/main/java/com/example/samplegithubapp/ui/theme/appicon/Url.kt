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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.samplegithubapp.ui.theme.AppIcon

public val AppIcon.Url: ImageVector
    get() {
        if (_url != null) {
            return _url!!
        }
        _url = Builder(name = "Url", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp, viewportWidth
                = 15.0f, viewportHeight = 15.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1A1A1A)), stroke = null, fillAlpha = 0.55f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(7.3333f, 10.1333f)
                    lineTo(6.3083f, 11.15f)
                    curveTo(5.9964f, 11.4579f, 5.5758f, 11.6305f, 5.1375f, 11.6305f)
                    curveTo(4.6992f, 11.6305f, 4.2786f, 11.4579f, 3.9667f, 11.15f)
                    curveTo(3.8146f, 10.9983f, 3.694f, 10.8181f, 3.6116f, 10.6197f)
                    curveTo(3.5293f, 10.4212f, 3.487f, 10.2086f, 3.487f, 9.9937f)
                    curveTo(3.487f, 9.7789f, 3.5293f, 9.5662f, 3.6116f, 9.3679f)
                    curveTo(3.694f, 9.1694f, 3.8146f, 8.9892f, 3.9667f, 8.8375f)
                    lineTo(5.9208f, 6.9f)
                    curveTo(6.2327f, 6.5921f, 6.6534f, 6.4195f, 7.0917f, 6.4195f)
                    curveTo(7.53f, 6.4195f, 7.9506f, 6.5921f, 8.2625f, 6.9f)
                    curveTo(8.461f, 7.0972f, 8.6046f, 7.3428f, 8.6792f, 7.6125f)
                    curveTo(8.7202f, 7.5787f, 8.7578f, 7.541f, 8.7917f, 7.5f)
                    lineTo(9.3292f, 6.9667f)
                    curveTo(9.2088f, 6.7162f, 9.0468f, 6.4879f, 8.85f, 6.2917f)
                    curveTo(8.382f, 5.8286f, 7.7501f, 5.5688f, 7.0917f, 5.5688f)
                    curveTo(6.4332f, 5.5688f, 5.8014f, 5.8286f, 5.3333f, 6.2917f)
                    lineTo(3.375f, 8.2458f)
                    curveTo(3.1443f, 8.4747f, 2.9613f, 8.747f, 2.8363f, 9.047f)
                    curveTo(2.7114f, 9.347f, 2.6471f, 9.6688f, 2.6471f, 9.9937f)
                    curveTo(2.6471f, 10.3187f, 2.7114f, 10.6405f, 2.8363f, 10.9405f)
                    curveTo(2.9613f, 11.2405f, 3.1443f, 11.5128f, 3.375f, 11.7417f)
                    curveTo(3.8431f, 12.2048f, 4.4749f, 12.4645f, 5.1333f, 12.4645f)
                    curveTo(5.7918f, 12.4645f, 6.4236f, 12.2048f, 6.8917f, 11.7417f)
                    lineTo(8.4125f, 10.2333f)
                    horizontalLineTo(8.2042f)
                    curveTo(7.9108f, 10.2385f, 7.6179f, 10.2049f, 7.3333f, 10.1333f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1A1A1A)), stroke = null, fillAlpha = 0.55f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(11.9208f, 3.2583f)
                    curveTo(11.4528f, 2.7952f, 10.8209f, 2.5355f, 10.1625f, 2.5355f)
                    curveTo(9.5041f, 2.5355f, 8.8722f, 2.7952f, 8.4042f, 3.2583f)
                    lineTo(6.8833f, 4.7667f)
                    horizontalLineTo(7.0875f)
                    curveTo(7.383f, 4.7666f, 7.6773f, 4.8058f, 7.9625f, 4.8833f)
                    lineTo(8.9875f, 3.8667f)
                    curveTo(9.2994f, 3.5588f, 9.72f, 3.3861f, 10.1583f, 3.3861f)
                    curveTo(10.5966f, 3.3861f, 11.0172f, 3.5588f, 11.3292f, 3.8667f)
                    curveTo(11.4812f, 4.0184f, 11.6019f, 4.1986f, 11.6842f, 4.397f)
                    curveTo(11.7665f, 4.5954f, 11.8089f, 4.8081f, 11.8089f, 5.0229f)
                    curveTo(11.8089f, 5.2377f, 11.7665f, 5.4504f, 11.6842f, 5.6488f)
                    curveTo(11.6019f, 5.8472f, 11.4812f, 6.0275f, 11.3292f, 6.1792f)
                    lineTo(9.375f, 8.1167f)
                    curveTo(9.0631f, 8.4246f, 8.6424f, 8.5972f, 8.2042f, 8.5972f)
                    curveTo(7.7659f, 8.5972f, 7.3452f, 8.4246f, 7.0333f, 8.1167f)
                    curveTo(6.8348f, 7.9195f, 6.6912f, 7.6739f, 6.6167f, 7.4042f)
                    curveTo(6.575f, 7.4325f, 6.5359f, 7.4646f, 6.5f, 7.5f)
                    lineTo(5.9625f, 8.0333f)
                    curveTo(6.0828f, 8.2838f, 6.2449f, 8.5121f, 6.4417f, 8.7083f)
                    curveTo(6.9097f, 9.1714f, 7.5416f, 9.4312f, 8.2f, 9.4312f)
                    curveTo(8.8584f, 9.4312f, 9.4903f, 9.1714f, 9.9583f, 8.7083f)
                    lineTo(11.9125f, 6.7708f)
                    curveTo(12.1427f, 6.5416f, 12.3253f, 6.2693f, 12.4499f, 5.9693f)
                    curveTo(12.5745f, 5.6694f, 12.6387f, 5.3477f, 12.6387f, 5.0229f)
                    curveTo(12.6387f, 4.6981f, 12.5745f, 4.3765f, 12.4499f, 4.0765f)
                    curveTo(12.3253f, 3.7766f, 12.1427f, 3.5042f, 11.9125f, 3.275f)
                    lineTo(11.9208f, 3.2583f)
                    close()
                }
            }
        }
        .build()
        return _url!!
    }

private var _url: ImageVector? = null
