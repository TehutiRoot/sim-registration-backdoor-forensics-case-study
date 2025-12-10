package androidx.compose.material.icons.filled;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_gTranslate", "Landroidx/compose/material/icons/Icons$Filled;", "getGTranslate", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "GTranslate", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGTranslate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GTranslate.kt\nandroidx/compose/material/icons/filled/GTranslateKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n122#2:95\n116#2,3:96\n119#2,3:100\n132#2,18:103\n152#2:140\n174#3:99\n694#4,2:121\n706#4,2:123\n708#4,11:129\n64#5,4:125\n*S KotlinDebug\n*F\n+ 1 GTranslate.kt\nandroidx/compose/material/icons/filled/GTranslateKt\n*L\n29#1:95\n29#1:96,3\n29#1:100,3\n30#1:103,18\n30#1:140\n29#1:99\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"})
/* loaded from: classes.dex */
public final class GTranslateKt {

    /* renamed from: a */
    public static ImageVector f15544a;

    @NotNull
    public static final ImageVector getGTranslate(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f15544a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GTranslate", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 4.0f);
        pathBuilder.lineTo(11.0f, 4.0f);
        pathBuilder.lineToRelative(-1.0f, -3.0f);
        pathBuilder.lineTo(3.0f, 1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(15.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(1.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(23.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 16.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.curveToRelative(1.35f, 0.0f, 2.48f, 0.5f, 3.35f, 1.3f);
        pathBuilder.lineTo(9.03f, 8.57f);
        pathBuilder.curveToRelative(-0.38f, -0.36f, -1.04f, -0.78f, -2.03f, -0.78f);
        pathBuilder.curveToRelative(-1.74f, 0.0f, -3.15f, 1.44f, -3.15f, 3.21f);
        pathBuilder.reflectiveCurveTo(5.26f, 14.21f, 7.0f, 14.21f);
        pathBuilder.curveToRelative(2.01f, 0.0f, 2.84f, -1.44f, 2.92f, -2.41f);
        pathBuilder.lineTo(7.0f, 11.8f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.horizontalLineToRelative(4.68f);
        pathBuilder.curveToRelative(0.07f, 0.31f, 0.12f, 0.61f, 0.12f, 1.02f);
        pathBuilder.curveTo(11.8f, 13.97f, 9.89f, 16.0f, 7.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.17f, 10.58f);
        pathBuilder.horizontalLineToRelative(3.7f);
        pathBuilder.curveToRelative(-0.43f, 1.25f, -1.11f, 2.43f, -2.05f, 3.47f);
        pathBuilder.curveToRelative(-0.31f, -0.35f, -0.6f, -0.72f, -0.86f, -1.1f);
        pathBuilder.lineToRelative(-0.79f, -2.37f);
        pathBuilder.close();
        pathBuilder.moveTo(21.5f, 20.5f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineTo(14.0f, 21.5f);
        pathBuilder.lineToRelative(2.0f, -2.5f);
        pathBuilder.lineToRelative(-1.04f, -3.1f);
        pathBuilder.lineToRelative(3.1f, 3.1f);
        pathBuilder.lineToRelative(0.92f, -0.92f);
        pathBuilder.lineToRelative(-3.3f, -3.25f);
        pathBuilder.lineToRelative(0.02f, -0.02f);
        pathBuilder.curveToRelative(1.13f, -1.25f, 1.93f, -2.69f, 2.4f, -4.22f);
        pathBuilder.lineTo(20.0f, 10.59f);
        pathBuilder.verticalLineToRelative(-1.3f);
        pathBuilder.horizontalLineToRelative(-4.53f);
        pathBuilder.lineTo(15.47f, 8.0f);
        pathBuilder.horizontalLineToRelative(-1.29f);
        pathBuilder.verticalLineToRelative(1.29f);
        pathBuilder.horizontalLineToRelative(-1.44f);
        pathBuilder.lineTo(11.46f, 5.5f);
        pathBuilder.horizontalLineToRelative(9.04f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f15544a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
