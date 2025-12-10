package androidx.compose.material.icons.twotone;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_changeCircle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getChangeCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ChangeCircle", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChangeCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeCircle.kt\nandroidx/compose/material/icons/twotone/ChangeCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n122#2:105\n116#2,3:106\n119#2,3:110\n132#2,18:113\n152#2:150\n132#2,18:151\n152#2:188\n174#3:109\n694#4,2:131\n706#4,2:133\n708#4,11:139\n694#4,2:169\n706#4,2:171\n708#4,11:177\n64#5,4:135\n64#5,4:173\n*S KotlinDebug\n*F\n+ 1 ChangeCircle.kt\nandroidx/compose/material/icons/twotone/ChangeCircleKt\n*L\n29#1:105\n29#1:106,3\n29#1:110,3\n30#1:113,18\n30#1:150\n61#1:151,18\n61#1:188\n29#1:109\n30#1:131,2\n30#1:133,2\n30#1:139,11\n61#1:169,2\n61#1:171,2\n61#1:177,11\n30#1:135,4\n61#1:173,4\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeCircleKt {

    /* renamed from: a */
    public static ImageVector f23599a;

    @NotNull
    public static final ImageVector getChangeCircle(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23599a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ChangeCircle", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f);
        pathBuilder.moveTo(12.06f, 13.34f);
        pathBuilder.verticalLineToRelative(2.14f);
        pathBuilder.curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f);
        pathBuilder.curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f);
        pathBuilder.lineToRelative(-1.1f, -1.1f);
        pathBuilder.curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f);
        pathBuilder.curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f);
        pathBuilder.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.lineToRelative(2.83f, -2.83f);
        pathBuilder.lineTo(12.06f, 13.34f);
        pathBuilder.close();
        pathBuilder.moveTo(15.54f, 8.46f);
        pathBuilder.curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineTo(9.11f, 7.83f);
        pathBuilder.lineToRelative(2.83f, 2.83f);
        pathBuilder.verticalLineTo(8.51f);
        pathBuilder.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f);
        pathBuilder.curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f);
        pathBuilder.lineToRelative(1.1f, 1.1f);
        pathBuilder.curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 4.0f);
        pathBuilder2.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder2.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.lineTo(12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.06f, 13.34f);
        pathBuilder2.verticalLineToRelative(2.14f);
        pathBuilder2.curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f);
        pathBuilder2.curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f);
        pathBuilder2.lineToRelative(-1.1f, -1.1f);
        pathBuilder2.curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f);
        pathBuilder2.curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f);
        pathBuilder2.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.lineToRelative(2.83f, -2.83f);
        pathBuilder2.lineTo(12.06f, 13.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.54f, 8.46f);
        pathBuilder2.curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.lineTo(9.11f, 7.83f);
        pathBuilder2.lineToRelative(2.83f, 2.83f);
        pathBuilder2.verticalLineTo(8.51f);
        pathBuilder2.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilder2.curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f);
        pathBuilder2.curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f);
        pathBuilder2.lineToRelative(1.1f, 1.1f);
        pathBuilder2.curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23599a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
