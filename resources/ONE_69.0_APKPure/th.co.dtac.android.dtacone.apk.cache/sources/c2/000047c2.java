package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_copyright", "Landroidx/compose/material/icons/Icons$Sharp;", "getCopyright", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", ExifInterface.TAG_COPYRIGHT, "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCopyright.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Copyright.kt\nandroidx/compose/material/icons/sharp/CopyrightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n122#2:88\n116#2,3:89\n119#2,3:93\n132#2,18:96\n152#2:133\n174#3:92\n694#4,2:114\n706#4,2:116\n708#4,11:122\n64#5,4:118\n*S KotlinDebug\n*F\n+ 1 Copyright.kt\nandroidx/compose/material/icons/sharp/CopyrightKt\n*L\n29#1:88\n29#1:89,3\n29#1:93,3\n30#1:96,18\n30#1:133\n29#1:92\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"})
/* loaded from: classes.dex */
public final class CopyrightKt {

    /* renamed from: a */
    public static ImageVector f21640a;

    @NotNull
    public static final ImageVector getCopyright(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f21640a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Copyright", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.08f, 10.86f);
        pathBuilder.curveToRelative(0.05f, -0.33f, 0.16f, -0.62f, 0.3f, -0.87f);
        pathBuilder.reflectiveCurveToRelative(0.34f, -0.46f, 0.59f, -0.62f);
        pathBuilder.curveToRelative(0.24f, -0.15f, 0.54f, -0.22f, 0.91f, -0.23f);
        pathBuilder.curveToRelative(0.23f, 0.01f, 0.44f, 0.05f, 0.63f, 0.13f);
        pathBuilder.curveToRelative(0.2f, 0.09f, 0.38f, 0.21f, 0.52f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(0.25f, 0.33f, 0.34f, 0.53f);
        pathBuilder.reflectiveCurveToRelative(0.13f, 0.42f, 0.14f, 0.64f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(-0.02f, -0.47f, -0.11f, -0.9f, -0.28f, -1.29f);
        pathBuilder.reflectiveCurveToRelative(-0.4f, -0.73f, -0.7f, -1.01f);
        pathBuilder.reflectiveCurveToRelative(-0.66f, -0.5f, -1.08f, -0.66f);
        pathBuilder.reflectiveCurveToRelative(-0.88f, -0.23f, -1.39f, -0.23f);
        pathBuilder.curveToRelative(-0.65f, 0.0f, -1.22f, 0.11f, -1.7f, 0.34f);
        pathBuilder.reflectiveCurveToRelative(-0.88f, 0.53f, -1.2f, 0.92f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, 0.84f, -0.71f, 1.36f);
        pathBuilder.reflectiveCurveTo(8.0f, 11.29f, 8.0f, 11.87f);
        pathBuilder.verticalLineToRelative(0.27f);
        pathBuilder.curveToRelative(0.0f, 0.58f, 0.08f, 1.12f, 0.23f, 1.64f);
        pathBuilder.reflectiveCurveToRelative(0.39f, 0.97f, 0.71f, 1.35f);
        pathBuilder.reflectiveCurveToRelative(0.72f, 0.69f, 1.2f, 0.91f);
        pathBuilder.curveToRelative(0.48f, 0.22f, 1.05f, 0.34f, 1.7f, 0.34f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.91f, -0.08f, 1.32f, -0.23f);
        pathBuilder.reflectiveCurveToRelative(0.77f, -0.36f, 1.08f, -0.63f);
        pathBuilder.reflectiveCurveToRelative(0.56f, -0.58f, 0.74f, -0.94f);
        pathBuilder.reflectiveCurveToRelative(0.29f, -0.74f, 0.3f, -1.15f);
        pathBuilder.horizontalLineToRelative(-1.79f);
        pathBuilder.curveToRelative(-0.01f, 0.21f, -0.06f, 0.4f, -0.15f, 0.58f);
        pathBuilder.reflectiveCurveToRelative(-0.21f, 0.33f, -0.36f, 0.46f);
        pathBuilder.reflectiveCurveToRelative(-0.32f, 0.23f, -0.52f, 0.3f);
        pathBuilder.curveToRelative(-0.19f, 0.07f, -0.39f, 0.09f, -0.6f, 0.1f);
        pathBuilder.curveToRelative(-0.36f, -0.01f, -0.66f, -0.08f, -0.89f, -0.23f);
        pathBuilder.curveToRelative(-0.25f, -0.16f, -0.45f, -0.37f, -0.59f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(-0.25f, -0.55f, -0.3f, -0.88f);
        pathBuilder.reflectiveCurveToRelative(-0.08f, -0.67f, -0.08f, -1.0f);
        pathBuilder.verticalLineToRelative(-0.27f);
        pathBuilder.curveToRelative(0.0f, -0.35f, 0.03f, -0.68f, 0.08f, -1.01f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f21640a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}