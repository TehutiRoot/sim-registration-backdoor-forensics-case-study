package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_surfing", "Landroidx/compose/material/icons/Icons$Outlined;", "getSurfing", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Surfing", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSurfing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/outlined/SurfingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n122#2:93\n116#2,3:94\n119#2,3:98\n132#2,18:101\n152#2:138\n174#3:97\n694#4,2:119\n706#4,2:121\n708#4,11:127\n64#5,4:123\n*S KotlinDebug\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/outlined/SurfingKt\n*L\n29#1:93\n29#1:94,3\n29#1:98,3\n30#1:101,18\n30#1:138\n29#1:97\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"})
/* loaded from: classes.dex */
public final class SurfingKt {

    /* renamed from: a */
    public static ImageVector f18665a;

    @NotNull
    public static final ImageVector getSurfing(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f18665a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Surfing", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 23.0f);
        pathBuilder.curveToRelative(-1.03f, 0.0f, -2.06f, -0.25f, -3.0f, -0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f);
        pathBuilder.curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f);
        pathBuilder.curveTo(5.05f, 22.75f, 4.03f, 23.0f, 3.0f, 23.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.lineToRelative(0.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(1.04f, 0.0f, 2.08f, -0.35f, 3.0f, -1.0f);
        pathBuilder.curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f);
        pathBuilder.curveToRelative(0.91f, 0.65f, 1.96f, 1.0f, 3.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 1.5f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(18.1f, 1.5f, 17.0f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(14.43f, 8.48f);
        pathBuilder.lineTo(12.18f, 10.0f);
        pathBuilder.lineTo(16.0f, 13.0f);
        pathBuilder.verticalLineToRelative(3.84f);
        pathBuilder.curveToRelative(0.53f, 0.38f, 1.03f, 0.78f, 1.49f, 1.17f);
        pathBuilder.curveTo(16.81f, 18.59f, 15.94f, 19.0f, 15.0f, 19.0f);
        pathBuilder.curveToRelative(-1.2f, 0.0f, -2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilder.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.65f, -0.05f, -0.96f, -0.14f);
        pathBuilder.curveTo(5.19f, 16.9f, 3.0f, 14.72f, 3.0f, 13.28f);
        pathBuilder.curveTo(3.0f, 12.25f, 4.01f, 12.0f, 4.85f, 12.0f);
        pathBuilder.curveToRelative(0.98f, 0.0f, 2.28f, 0.31f, 3.7f, 0.83f);
        pathBuilder.lineToRelative(-0.53f, -3.1f);
        pathBuilder.curveTo(7.91f, 9.06f, 8.2f, 8.35f, 8.8f, 7.94f);
        pathBuilder.lineToRelative(2.15f, -1.45f);
        pathBuilder.lineToRelative(-2.0f, -0.37f);
        pathBuilder.lineTo(6.13f, 8.05f);
        pathBuilder.lineTo(5.0f, 6.4f);
        pathBuilder.lineTo(8.5f, 4.0f);
        pathBuilder.lineToRelative(5.55f, 1.03f);
        pathBuilder.curveToRelative(0.45f, 0.09f, 0.93f, 0.37f, 1.22f, 0.89f);
        pathBuilder.lineToRelative(0.88f, 1.55f);
        pathBuilder.curveTo(17.01f, 8.98f, 18.64f, 10.0f, 20.5f, 10.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveTo(17.91f, 12.0f, 15.64f, 10.58f, 14.43f, 8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(10.3f, 11.1f);
        pathBuilder.lineToRelative(0.44f, 2.65f);
        pathBuilder.curveToRelative(0.92f, 0.42f, 2.48f, 1.27f, 3.26f, 1.75f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.lineTo(10.3f, 11.1f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f18665a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
