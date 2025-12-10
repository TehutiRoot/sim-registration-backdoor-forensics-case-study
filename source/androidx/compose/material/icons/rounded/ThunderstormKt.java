package androidx.compose.material.icons.rounded;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_thunderstorm", "Landroidx/compose/material/icons/Icons$Rounded;", "getThunderstorm", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Thunderstorm", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThunderstorm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thunderstorm.kt\nandroidx/compose/material/icons/rounded/ThunderstormKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n122#2:85\n116#2,3:86\n119#2,3:90\n132#2,18:93\n152#2:130\n132#2,18:131\n152#2:168\n132#2,18:169\n152#2:206\n174#3:89\n694#4,2:111\n706#4,2:113\n708#4,11:119\n694#4,2:149\n706#4,2:151\n708#4,11:157\n694#4,2:187\n706#4,2:189\n708#4,11:195\n64#5,4:115\n64#5,4:153\n64#5,4:191\n*S KotlinDebug\n*F\n+ 1 Thunderstorm.kt\nandroidx/compose/material/icons/rounded/ThunderstormKt\n*L\n29#1:85\n29#1:86,3\n29#1:90,3\n30#1:93,18\n30#1:130\n41#1:131,18\n41#1:168\n60#1:169,18\n60#1:206\n29#1:89\n30#1:111,2\n30#1:113,2\n30#1:119,11\n41#1:149,2\n41#1:151,2\n41#1:157,11\n60#1:187,2\n60#1:189,2\n60#1:195,11\n30#1:115,4\n41#1:153,4\n60#1:191,4\n*E\n"})
/* loaded from: classes.dex */
public final class ThunderstormKt {

    /* renamed from: a */
    public static ImageVector f20878a;

    @NotNull
    public static final ImageVector getThunderstorm(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20878a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Thunderstorm", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.92f, 7.02f);
        pathBuilder.curveTo(17.45f, 4.18f, 14.97f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveTo(9.82f, 2.0f, 7.83f, 3.18f, 6.78f, 5.06f);
        pathBuilder.curveTo(4.09f, 5.41f, 2.0f, 7.74f, 2.0f, 10.5f);
        pathBuilder.curveTo(2.0f, 13.53f, 4.47f, 16.0f, 7.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder.curveTo(22.0f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.95f, 20.11f);
        pathBuilder2.lineToRelative(-0.84f, -0.42f);
        pathBuilder2.lineToRelative(0.9f, -1.03f);
        pathBuilder2.curveToRelative(0.36f, -0.42f, 0.32f, -1.05f, -0.09f, -1.41f);
        pathBuilder2.curveToRelative(-0.42f, -0.36f, -1.05f, -0.32f, -1.41f, 0.09f);
        pathBuilder2.lineToRelative(-1.75f, 2.0f);
        pathBuilder2.curveToRelative(-0.2f, 0.23f, -0.29f, 0.55f, -0.23f, 0.85f);
        pathBuilder2.curveToRelative(0.06f, 0.3f, 0.26f, 0.56f, 0.53f, 0.7f);
        pathBuilder2.lineToRelative(0.84f, 0.42f);
        pathBuilder2.lineTo(13.0f, 22.34f);
        pathBuilder2.curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.09f, 1.41f);
        pathBuilder2.curveToRelative(0.19f, 0.17f, 0.42f, 0.25f, 0.66f, 0.25f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.55f, -0.12f, 0.75f, -0.34f);
        pathBuilder2.lineToRelative(1.75f, -2.0f);
        pathBuilder2.curveToRelative(0.2f, -0.23f, 0.29f, -0.55f, 0.23f, -0.85f);
        pathBuilder2.curveTo(16.42f, 20.5f, 16.22f, 20.24f, 15.95f, 20.11f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(9.95f, 20.11f);
        pathBuilder3.lineTo(9.1f, 19.68f);
        pathBuilder3.lineToRelative(0.9f, -1.03f);
        pathBuilder3.curveToRelative(0.36f, -0.42f, 0.32f, -1.05f, -0.09f, -1.41f);
        pathBuilder3.curveToRelative(-0.42f, -0.36f, -1.05f, -0.32f, -1.41f, 0.09f);
        pathBuilder3.lineToRelative(-1.75f, 2.0f);
        pathBuilder3.curveToRelative(-0.2f, 0.23f, -0.29f, 0.55f, -0.23f, 0.85f);
        pathBuilder3.curveToRelative(0.06f, 0.3f, 0.26f, 0.56f, 0.53f, 0.7f);
        pathBuilder3.lineToRelative(0.84f, 0.42f);
        pathBuilder3.lineTo(7.0f, 22.34f);
        pathBuilder3.curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.09f, 1.41f);
        pathBuilder3.curveTo(7.28f, 23.92f, 7.52f, 24.0f, 7.75f, 24.0f);
        pathBuilder3.curveToRelative(0.28f, 0.0f, 0.55f, -0.12f, 0.75f, -0.34f);
        pathBuilder3.lineToRelative(1.75f, -2.0f);
        pathBuilder3.curveToRelative(0.2f, -0.23f, 0.29f, -0.55f, 0.23f, -0.85f);
        pathBuilder3.curveTo(10.42f, 20.5f, 10.22f, 20.24f, 9.95f, 20.11f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20878a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
