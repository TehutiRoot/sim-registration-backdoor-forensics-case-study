package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3623Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_breakfastDining", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBreakfastDining", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "BreakfastDining", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBreakfastDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BreakfastDining.kt\nandroidx/compose/material/icons/twotone/BreakfastDiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n122#2:108\n116#2,3:109\n119#2,3:113\n132#2,18:116\n152#2:153\n132#2,18:154\n152#2:191\n132#2,18:192\n152#2:229\n174#3:112\n694#4,2:134\n706#4,2:136\n708#4,11:142\n694#4,2:172\n706#4,2:174\n708#4,11:180\n694#4,2:210\n706#4,2:212\n708#4,11:218\n64#5,4:138\n64#5,4:176\n64#5,4:214\n*S KotlinDebug\n*F\n+ 1 BreakfastDining.kt\nandroidx/compose/material/icons/twotone/BreakfastDiningKt\n*L\n29#1:108\n29#1:109,3\n29#1:113,3\n30#1:116,18\n30#1:153\n56#1:154,18\n56#1:191\n82#1:192,18\n82#1:229\n29#1:112\n30#1:134,2\n30#1:136,2\n30#1:142,11\n56#1:172,2\n56#1:174,2\n56#1:180,11\n82#1:210,2\n82#1:212,2\n82#1:218,11\n30#1:138,4\n56#1:176,4\n82#1:214,4\n*E\n"})
/* loaded from: classes.dex */
public final class BreakfastDiningKt {

    /* renamed from: a */
    public static ImageVector f23602a;

    @NotNull
    public static final ImageVector getBreakfastDining(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23602a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BreakfastDining", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 5.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.71f, 0.38f, 1.35f, 1.01f, 1.73f);
        pathBuilder.lineTo(6.0f, 9.31f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineTo(9.3f);
        pathBuilder.lineToRelative(1.0f, -0.58f);
        pathBuilder.curveToRelative(0.63f, -0.36f, 1.0f, -1.01f, 1.0f, -1.72f);
        pathBuilder.curveTo(20.0f, 5.9f, 19.1f, 5.0f, 18.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.71f, 13.7f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.curveTo(12.51f, 16.9f, 12.26f, 17.0f, 12.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.curveTo(11.49f, 9.1f, 11.74f, 9.0f, 12.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(0.51f, 0.1f, 0.71f, 0.29f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.curveTo(16.1f, 12.68f, 16.1f, 13.31f, 15.71f, 13.7f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.0f, 3.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.curveTo(3.79f, 3.0f, 2.0f, 4.79f, 2.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, 1.48f, 0.81f, 2.75f, 2.0f, 3.45f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(-8.55f);
        pathBuilder2.curveToRelative(1.19f, -0.69f, 2.0f, -1.97f, 2.0f, -3.45f);
        pathBuilder2.curveTo(22.0f, 4.79f, 20.21f, 3.0f, 18.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 8.72f);
        pathBuilder2.lineTo(18.0f, 9.3f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineTo(9.31f);
        pathBuilder2.lineTo(5.01f, 8.73f);
        pathBuilder2.curveTo(4.38f, 8.35f, 4.0f, 7.71f, 4.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.curveTo(20.0f, 7.71f, 19.62f, 8.36f, 19.0f, 8.72f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.71f, 9.29f);
        pathBuilder3.curveTo(12.51f, 9.1f, 12.26f, 9.0f, 12.0f, 9.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilder3.lineToRelative(-3.0f, 3.0f);
        pathBuilder3.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder3.lineToRelative(3.0f, 3.0f);
        pathBuilder3.curveTo(11.49f, 16.9f, 11.74f, 17.0f, 12.0f, 17.0f);
        pathBuilder3.reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f);
        pathBuilder3.lineToRelative(3.0f, -3.0f);
        pathBuilder3.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder3.lineTo(12.71f, 9.29f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 14.58f);
        pathBuilder3.lineTo(10.41f, 13.0f);
        pathBuilder3.lineTo(12.0f, 11.41f);
        pathBuilder3.lineTo(13.59f, 13.0f);
        pathBuilder3.lineTo(12.0f, 14.58f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23602a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}