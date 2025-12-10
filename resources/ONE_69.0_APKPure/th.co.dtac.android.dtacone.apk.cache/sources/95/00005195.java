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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_frontHand", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFrontHand", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FrontHand", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFrontHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/twotone/FrontHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n122#2:118\n116#2,3:119\n119#2,3:123\n132#2,18:126\n152#2:163\n132#2,18:164\n152#2:201\n174#3:122\n694#4,2:144\n706#4,2:146\n708#4,11:152\n694#4,2:182\n706#4,2:184\n708#4,11:190\n64#5,4:148\n64#5,4:186\n*S KotlinDebug\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/twotone/FrontHandKt\n*L\n29#1:118\n29#1:119,3\n29#1:123,3\n30#1:126,18\n30#1:163\n62#1:164,18\n62#1:201\n29#1:122\n30#1:144,2\n30#1:146,2\n30#1:152,11\n62#1:182,2\n62#1:184,2\n62#1:190,11\n30#1:148,4\n62#1:186,4\n*E\n"})
/* loaded from: classes.dex */
public final class FrontHandKt {

    /* renamed from: a */
    public static ImageVector f24155a;

    @NotNull
    public static final ImageVector getFrontHand(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24155a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FrontHand", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f);
        pathBuilder.reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(2.5f);
        pathBuilder.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f);
        pathBuilder.verticalLineToRelative(8.92f);
        pathBuilder.curveToRelative(-1.77f, 0.77f, -3.0f, 2.53f, -3.0f, 4.58f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineTo(15.5f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.5f, 8.0f);
        pathBuilder2.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        pathBuilder2.verticalLineTo(4.5f);
        pathBuilder2.curveTo(18.0f, 3.12f, 16.88f, 2.0f, 15.5f, 2.0f);
        pathBuilder2.curveToRelative(-0.19f, 0.0f, -0.37f, 0.02f, -0.54f, 0.06f);
        pathBuilder2.curveTo(14.75f, 0.89f, 13.73f, 0.0f, 12.5f, 0.0f);
        pathBuilder2.curveToRelative(-1.06f, 0.0f, -1.96f, 0.66f, -2.33f, 1.59f);
        pathBuilder2.curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f);
        pathBuilder2.curveTo(8.12f, 1.5f, 7.0f, 2.62f, 7.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(0.55f);
        pathBuilder2.curveTo(6.84f, 4.52f, 6.67f, 4.5f, 6.5f, 4.5f);
        pathBuilder2.curveTo(5.12f, 4.5f, 4.0f, 5.62f, 4.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(8.5f);
        pathBuilder2.curveToRelative(0.0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f);
        pathBuilder2.reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f);
        pathBuilder2.verticalLineToRelative(-5.0f);
        pathBuilder2.curveTo(21.0f, 9.12f, 19.88f, 8.0f, 18.5f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 15.5f);
        pathBuilder2.curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f);
        pathBuilder2.reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder2.reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder2.reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(2.5f);
        pathBuilder2.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        pathBuilder2.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(4.5f);
        pathBuilder2.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilder2.reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f);
        pathBuilder2.verticalLineToRelative(8.92f);
        pathBuilder2.curveToRelative(-1.77f, 0.77f, -3.0f, 2.53f, -3.0f, 4.58f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder2.verticalLineToRelative(-4.5f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder2.verticalLineTo(15.5f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24155a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}