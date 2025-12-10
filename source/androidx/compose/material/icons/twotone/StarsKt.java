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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_stars", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStars", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Stars", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStars.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stars.kt\nandroidx/compose/material/icons/twotone/StarsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,113:1\n122#2:114\n116#2,3:115\n119#2,3:119\n132#2,18:122\n152#2:159\n132#2,18:160\n152#2:197\n174#3:118\n694#4,2:140\n706#4,2:142\n708#4,11:148\n694#4,2:178\n706#4,2:180\n708#4,11:186\n64#5,4:144\n64#5,4:182\n*S KotlinDebug\n*F\n+ 1 Stars.kt\nandroidx/compose/material/icons/twotone/StarsKt\n*L\n29#1:114\n29#1:115,3\n29#1:119,3\n30#1:122,18\n30#1:159\n60#1:160,18\n60#1:197\n29#1:118\n30#1:140,2\n30#1:142,2\n30#1:148,11\n60#1:178,2\n60#1:180,2\n60#1:186,11\n30#1:144,4\n60#1:182,4\n*E\n"})
/* loaded from: classes.dex */
public final class StarsKt {

    /* renamed from: a */
    public static ImageVector f25025a;

    @NotNull
    public static final ImageVector getStars(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25025a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Stars", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.47f, 9.16f);
        pathBuilder.curveToRelative(-1.1f, -2.87f, -3.8f, -4.95f, -7.01f, -5.14f);
        pathBuilder.lineToRelative(2.0f, 4.71f);
        pathBuilder.lineToRelative(5.01f, 0.43f);
        pathBuilder.close();
        pathBuilder.moveTo(11.54f, 4.02f);
        pathBuilder.curveToRelative(-3.22f, 0.18f, -5.92f, 2.27f, -7.02f, 5.15f);
        pathBuilder.lineToRelative(5.02f, -0.43f);
        pathBuilder.lineToRelative(2.0f, -4.72f);
        pathBuilder.close();
        pathBuilder.moveTo(4.23f, 10.14f);
        pathBuilder.curveTo(4.08f, 10.74f, 4.0f, 11.36f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.48f, 1.14f, 4.7f, 2.91f, 6.17f);
        pathBuilder.lineToRelative(1.11f, -4.75f);
        pathBuilder.lineToRelative(-3.79f, -3.28f);
        pathBuilder.close();
        pathBuilder.moveTo(19.77f, 10.13f);
        pathBuilder.lineToRelative(-3.79f, 3.28f);
        pathBuilder.lineToRelative(1.1f, 4.76f);
        pathBuilder.curveTo(18.86f, 16.7f, 20.0f, 14.48f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.64f, -0.09f, -1.27f, -0.23f, -1.87f);
        pathBuilder.close();
        pathBuilder.moveTo(7.84f, 18.82f);
        pathBuilder.curveToRelative(1.21f, 0.74f, 2.63f, 1.18f, 4.15f, 1.18f);
        pathBuilder.curveToRelative(1.53f, 0.0f, 2.95f, -0.44f, 4.17f, -1.18f);
        pathBuilder.lineTo(12.0f, 16.31f);
        pathBuilder.lineToRelative(-4.16f, 2.51f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.99f, 2.0f);
        pathBuilder2.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder2.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder2.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.47f, 9.16f);
        pathBuilder2.lineToRelative(-5.01f, -0.43f);
        pathBuilder2.lineToRelative(-2.0f, -4.71f);
        pathBuilder2.curveToRelative(3.21f, 0.19f, 5.91f, 2.27f, 7.01f, 5.14f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 8.06f);
        pathBuilder2.lineToRelative(1.09f, 2.56f);
        pathBuilder2.lineToRelative(2.78f, 0.24f);
        pathBuilder2.lineToRelative(-2.11f, 1.83f);
        pathBuilder2.lineToRelative(0.63f, 2.73f);
        pathBuilder2.lineTo(12.0f, 13.98f);
        pathBuilder2.lineToRelative(-2.39f, 1.44f);
        pathBuilder2.lineToRelative(0.63f, -2.72f);
        pathBuilder2.lineToRelative(-2.11f, -1.83f);
        pathBuilder2.lineToRelative(2.78f, -0.24f);
        pathBuilder2.lineTo(12.0f, 8.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.54f, 4.02f);
        pathBuilder2.lineToRelative(-2.0f, 4.72f);
        pathBuilder2.lineToRelative(-5.02f, 0.43f);
        pathBuilder2.curveToRelative(1.1f, -2.88f, 3.8f, -4.97f, 7.02f, -5.15f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -0.64f, 0.08f, -1.26f, 0.23f, -1.86f);
        pathBuilder2.lineToRelative(3.79f, 3.28f);
        pathBuilder2.lineToRelative(-1.11f, 4.75f);
        pathBuilder2.curveTo(5.14f, 16.7f, 4.0f, 14.48f, 4.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.99f, 20.0f);
        pathBuilder2.curveToRelative(-1.52f, 0.0f, -2.94f, -0.44f, -4.15f, -1.18f);
        pathBuilder2.lineTo(12.0f, 16.31f);
        pathBuilder2.lineToRelative(4.16f, 2.51f);
        pathBuilder2.curveToRelative(-1.22f, 0.74f, -2.64f, 1.18f, -4.17f, 1.18f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.09f, 18.17f);
        pathBuilder2.lineToRelative(-1.1f, -4.76f);
        pathBuilder2.lineToRelative(3.79f, -3.28f);
        pathBuilder2.curveToRelative(0.13f, 0.6f, 0.22f, 1.23f, 0.22f, 1.87f);
        pathBuilder2.curveToRelative(0.0f, 2.48f, -1.14f, 4.7f, -2.91f, 6.17f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25025a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
