package androidx.compose.material.icons.sharp;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_snowboarding", "Landroidx/compose/material/icons/Icons$Sharp;", "getSnowboarding", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Snowboarding", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnowboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snowboarding.kt\nandroidx/compose/material/icons/sharp/SnowboardingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n122#2:82\n116#2,3:83\n119#2,3:87\n132#2,18:90\n152#2:127\n174#3:86\n694#4,2:108\n706#4,2:110\n708#4,11:116\n64#5,4:112\n*S KotlinDebug\n*F\n+ 1 Snowboarding.kt\nandroidx/compose/material/icons/sharp/SnowboardingKt\n*L\n29#1:82\n29#1:83,3\n29#1:87,3\n30#1:90,18\n30#1:127\n29#1:86\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnowboardingKt {

    /* renamed from: a */
    public static ImageVector f22829a;

    @NotNull
    public static final ImageVector getSnowboarding(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f22829a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Snowboarding", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 4.1f, 14.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.4f, 20.09f);
        pathBuilder.curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f);
        pathBuilder.curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f);
        pathBuilder.lineTo(17.0f, 20.69f);
        pathBuilder.lineToRelative(-1.0f, -6.19f);
        pathBuilder.lineToRelative(-3.32f, -2.67f);
        pathBuilder.lineToRelative(1.8f, -2.89f);
        pathBuilder.curveTo(15.63f, 10.78f, 17.68f, 12.0f, 20.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-1.85f, 0.0f, -3.44f, -1.12f, -4.13f, -2.72f);
        pathBuilder.lineToRelative(-0.52f, -1.21f);
        pathBuilder.curveTo(15.16f, 5.64f, 14.61f, 5.0f, 13.7f, 5.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineTo(5.5f, 9.0f);
        pathBuilder.lineToRelative(1.7f, 1.06f);
        pathBuilder.lineTo(9.1f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.35f);
        pathBuilder.lineTo(8.5f, 11.7f);
        pathBuilder.lineToRelative(1.0f, 4.3f);
        pathBuilder.lineTo(6.0f, 18.35f);
        pathBuilder.lineToRelative(-0.47f, -0.1f);
        pathBuilder.curveToRelative(-0.96f, -0.2f, -1.71f, -0.85f, -2.1f, -1.67f);
        pathBuilder.curveToRelative(-0.1f, -0.21f, -0.28f, -0.37f, -0.51f, -0.42f);
        pathBuilder.curveToRelative(-0.43f, -0.09f, -0.82f, 0.2f, -0.9f, 0.58f);
        pathBuilder.curveTo(1.98f, 16.88f, 2.0f, 17.05f, 2.07f, 17.2f);
        pathBuilder.curveToRelative(0.58f, 1.24f, 1.71f, 2.2f, 3.15f, 2.51f);
        pathBuilder.lineToRelative(12.63f, 2.69f);
        pathBuilder.curveToRelative(1.44f, 0.31f, 2.86f, -0.11f, 3.9f, -1.01f);
        pathBuilder.curveToRelative(0.13f, -0.11f, 0.21f, -0.26f, 0.24f, -0.41f);
        pathBuilder.curveTo(22.06f, 20.6f, 21.83f, 20.18f, 21.4f, 20.09f);
        pathBuilder.close();
        pathBuilder.moveTo(8.73f, 18.93f);
        pathBuilder.lineToRelative(3.02f, -2.03f);
        pathBuilder.lineToRelative(-0.44f, -3.32f);
        pathBuilder.lineToRelative(2.84f, 2.02f);
        pathBuilder.lineToRelative(0.75f, 4.64f);
        pathBuilder.lineTo(8.73f, 18.93f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f22829a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
