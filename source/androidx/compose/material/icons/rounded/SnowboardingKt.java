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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_snowboarding", "Landroidx/compose/material/icons/Icons$Rounded;", "getSnowboarding", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Snowboarding", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnowboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snowboarding.kt\nandroidx/compose/material/icons/rounded/SnowboardingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n122#2:88\n116#2,3:89\n119#2,3:93\n132#2,18:96\n152#2:133\n174#3:92\n694#4,2:114\n706#4,2:116\n708#4,11:122\n64#5,4:118\n*S KotlinDebug\n*F\n+ 1 Snowboarding.kt\nandroidx/compose/material/icons/rounded/SnowboardingKt\n*L\n29#1:88\n29#1:89,3\n29#1:93,3\n30#1:96,18\n30#1:133\n29#1:92\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnowboardingKt {

    /* renamed from: a */
    public static ImageVector f20697a;

    @NotNull
    public static final ImageVector getSnowboarding(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20697a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Snowboarding", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        pathBuilder.moveTo(6.35f, 9.53f);
        pathBuilder.curveToRelative(0.47f, 0.29f, 1.09f, 0.15f, 1.38f, -0.32f);
        pathBuilder.lineTo(9.1f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.35f);
        pathBuilder.lineToRelative(-2.51f, 3.99f);
        pathBuilder.curveToRelative(-0.28f, 0.45f, -0.37f, 1.0f, -0.25f, 1.52f);
        pathBuilder.lineTo(9.5f, 16.0f);
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
        pathBuilder.curveToRelative(0.08f, -0.38f, -0.16f, -0.8f, -0.59f, -0.89f);
        pathBuilder.curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f);
        pathBuilder.curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f);
        pathBuilder.lineTo(17.0f, 20.69f);
        pathBuilder.lineToRelative(-0.88f, -5.43f);
        pathBuilder.curveToRelative(-0.08f, -0.49f, -0.34f, -0.93f, -0.72f, -1.24f);
        pathBuilder.lineToRelative(-2.72f, -2.19f);
        pathBuilder.lineToRelative(1.8f, -2.89f);
        pathBuilder.curveToRelative(0.96f, 1.53f, 2.54f, 2.64f, 4.39f, 2.96f);
        pathBuilder.curveToRelative(0.6f, 0.11f, 1.13f, -0.39f, 1.13f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.48f, -0.35f, -0.89f, -0.83f, -0.98f);
        pathBuilder.curveToRelative(-1.49f, -0.28f, -2.72f, -1.29f, -3.3f, -2.64f);
        pathBuilder.lineToRelative(-0.52f, -1.21f);
        pathBuilder.curveTo(15.16f, 5.64f, 14.61f, 5.0f, 13.7f, 5.0f);
        pathBuilder.horizontalLineTo(9.11f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.33f, 0.36f, -1.7f, 0.94f);
        pathBuilder.lineTo(6.03f, 8.15f);
        pathBuilder.curveTo(5.74f, 8.62f, 5.88f, 9.24f, 6.35f, 9.53f);
        pathBuilder.close();
        pathBuilder.moveTo(8.73f, 18.93f);
        pathBuilder.lineToRelative(2.25f, -1.51f);
        pathBuilder.curveToRelative(0.47f, -0.32f, 0.73f, -0.88f, 0.65f, -1.44f);
        pathBuilder.lineToRelative(-0.32f, -2.4f);
        pathBuilder.lineToRelative(2.84f, 2.02f);
        pathBuilder.lineToRelative(0.75f, 4.64f);
        pathBuilder.lineTo(8.73f, 18.93f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20697a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
