package androidx.compose.material.icons.rounded;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_rotateLeft", "Landroidx/compose/material/icons/Icons$Rounded;", "getRotateLeft", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "RotateLeft", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRotateLeft.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotateLeft.kt\nandroidx/compose/material/icons/rounded/RotateLeftKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n122#2:82\n116#2,3:83\n119#2,3:87\n132#2,18:90\n152#2:127\n174#3:86\n694#4,2:108\n706#4,2:110\n708#4,11:116\n64#5,4:112\n*S KotlinDebug\n*F\n+ 1 RotateLeft.kt\nandroidx/compose/material/icons/rounded/RotateLeftKt\n*L\n29#1:82\n29#1:83,3\n29#1:87,3\n30#1:90,18\n30#1:127\n29#1:86\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"})
/* loaded from: classes.dex */
public final class RotateLeftKt {

    /* renamed from: a */
    public static ImageVector f20623a;

    @NotNull
    public static final ImageVector getRotateLeft(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20623a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RotateLeft", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.56f, 7.98f);
        pathBuilder.curveTo(6.1f, 7.52f, 5.31f, 7.6f, 5.0f, 8.17f);
        pathBuilder.curveToRelative(-0.28f, 0.51f, -0.5f, 1.03f, -0.67f, 1.58f);
        pathBuilder.curveToRelative(-0.19f, 0.63f, 0.31f, 1.25f, 0.96f, 1.25f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.43f, 0.0f, 0.82f, -0.28f, 0.94f, -0.7f);
        pathBuilder.curveToRelative(0.12f, -0.4f, 0.28f, -0.79f, 0.48f, -1.17f);
        pathBuilder.curveToRelative(0.22f, -0.37f, 0.15f, -0.84f, -0.16f, -1.15f);
        pathBuilder.close();
        pathBuilder.moveTo(5.31f, 13.0f);
        pathBuilder.horizontalLineToRelative(-0.02f);
        pathBuilder.curveToRelative(-0.65f, 0.0f, -1.15f, 0.62f, -0.96f, 1.25f);
        pathBuilder.curveToRelative(0.16f, 0.54f, 0.38f, 1.07f, 0.66f, 1.58f);
        pathBuilder.curveToRelative(0.31f, 0.57f, 1.11f, 0.66f, 1.57f, 0.2f);
        pathBuilder.curveToRelative(0.3f, -0.31f, 0.38f, -0.77f, 0.17f, -1.15f);
        pathBuilder.curveToRelative(-0.2f, -0.37f, -0.36f, -0.76f, -0.48f, -1.16f);
        pathBuilder.curveToRelative(-0.12f, -0.44f, -0.51f, -0.72f, -0.94f, -0.72f);
        pathBuilder.close();
        pathBuilder.moveTo(8.16f, 19.02f);
        pathBuilder.curveToRelative(0.51f, 0.28f, 1.04f, 0.5f, 1.59f, 0.66f);
        pathBuilder.curveToRelative(0.62f, 0.18f, 1.24f, -0.32f, 1.24f, -0.96f);
        pathBuilder.verticalLineToRelative(-0.03f);
        pathBuilder.curveToRelative(0.0f, -0.43f, -0.28f, -0.82f, -0.7f, -0.94f);
        pathBuilder.curveToRelative(-0.4f, -0.12f, -0.78f, -0.28f, -1.15f, -0.48f);
        pathBuilder.curveToRelative(-0.38f, -0.21f, -0.86f, -0.14f, -1.16f, 0.17f);
        pathBuilder.lineToRelative(-0.03f, 0.03f);
        pathBuilder.curveToRelative(-0.45f, 0.45f, -0.36f, 1.24f, 0.21f, 1.55f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.07f);
        pathBuilder.verticalLineToRelative(-0.66f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(9.17f, 4.83f);
        pathBuilder.curveToRelative(-0.4f, 0.4f, -0.4f, 1.04f, 0.0f, 1.43f);
        pathBuilder.lineToRelative(2.13f, 2.08f);
        pathBuilder.curveToRelative(0.63f, 0.62f, 1.7f, 0.17f, 1.7f, -0.72f);
        pathBuilder.lineTo(13.0f, 6.09f);
        pathBuilder.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
        pathBuilder.curveToRelative(0.0f, 2.73f, -1.82f, 5.02f, -4.32f, 5.75f);
        pathBuilder.curveToRelative(-0.41f, 0.12f, -0.68f, 0.51f, -0.68f, 0.94f);
        pathBuilder.verticalLineToRelative(0.02f);
        pathBuilder.curveToRelative(0.0f, 0.65f, 0.61f, 1.14f, 1.23f, 0.96f);
        pathBuilder.curveTo(17.57f, 18.71f, 20.0f, 15.64f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.08f, -3.05f, -7.44f, -7.0f, -7.93f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20623a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}