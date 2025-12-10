package androidx.compose.material.icons.outlined;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_strikethroughS", "Landroidx/compose/material/icons/Icons$Outlined;", "getStrikethroughS", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "StrikethroughS", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStrikethroughS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrikethroughS.kt\nandroidx/compose/material/icons/outlined/StrikethroughSKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n122#2:95\n116#2,3:96\n119#2,3:100\n132#2,18:103\n152#2:140\n174#3:99\n694#4,2:121\n706#4,2:123\n708#4,11:129\n64#5,4:125\n*S KotlinDebug\n*F\n+ 1 StrikethroughS.kt\nandroidx/compose/material/icons/outlined/StrikethroughSKt\n*L\n29#1:95\n29#1:96,3\n29#1:100,3\n30#1:103,18\n30#1:140\n29#1:99\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"})
/* loaded from: classes.dex */
public final class StrikethroughSKt {

    /* renamed from: a */
    public static ImageVector f18736a;

    @NotNull
    public static final ImageVector getStrikethroughS(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f18736a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.StrikethroughS", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.24f, 8.75f);
        pathBuilder.curveToRelative(-0.26f, -0.48f, -0.39f, -1.03f, -0.39f, -1.67f);
        pathBuilder.curveToRelative(0.0f, -0.61f, 0.13f, -1.16f, 0.4f, -1.67f);
        pathBuilder.curveToRelative(0.26f, -0.5f, 0.63f, -0.93f, 1.11f, -1.29f);
        pathBuilder.curveToRelative(0.48f, -0.35f, 1.05f, -0.63f, 1.7f, -0.83f);
        pathBuilder.curveToRelative(0.66f, -0.19f, 1.39f, -0.29f, 2.18f, -0.29f);
        pathBuilder.curveToRelative(0.81f, 0.0f, 1.54f, 0.11f, 2.21f, 0.34f);
        pathBuilder.curveToRelative(0.66f, 0.22f, 1.23f, 0.54f, 1.69f, 0.94f);
        pathBuilder.curveToRelative(0.47f, 0.4f, 0.83f, 0.88f, 1.08f, 1.43f);
        pathBuilder.reflectiveCurveToRelative(0.38f, 1.15f, 0.38f, 1.81f);
        pathBuilder.horizontalLineToRelative(-3.01f);
        pathBuilder.curveToRelative(0.0f, -0.31f, -0.05f, -0.59f, -0.15f, -0.85f);
        pathBuilder.curveToRelative(-0.09f, -0.27f, -0.24f, -0.49f, -0.44f, -0.68f);
        pathBuilder.curveToRelative(-0.2f, -0.19f, -0.45f, -0.33f, -0.75f, -0.44f);
        pathBuilder.curveToRelative(-0.3f, -0.1f, -0.66f, -0.16f, -1.06f, -0.16f);
        pathBuilder.curveToRelative(-0.39f, 0.0f, -0.74f, 0.04f, -1.03f, 0.13f);
        pathBuilder.reflectiveCurveToRelative(-0.53f, 0.21f, -0.72f, 0.36f);
        pathBuilder.curveToRelative(-0.19f, 0.16f, -0.34f, 0.34f, -0.44f, 0.55f);
        pathBuilder.curveToRelative(-0.1f, 0.21f, -0.15f, 0.43f, -0.15f, 0.66f);
        pathBuilder.curveToRelative(0.0f, 0.48f, 0.25f, 0.88f, 0.74f, 1.21f);
        pathBuilder.curveToRelative(0.38f, 0.25f, 0.77f, 0.48f, 1.41f, 0.7f);
        pathBuilder.horizontalLineTo(7.39f);
        pathBuilder.curveToRelative(-0.05f, -0.08f, -0.11f, -0.17f, -0.15f, -0.25f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.62f);
        pathBuilder.curveToRelative(0.18f, 0.07f, 0.4f, 0.14f, 0.55f, 0.2f);
        pathBuilder.curveToRelative(0.37f, 0.17f, 0.66f, 0.34f, 0.87f, 0.51f);
        pathBuilder.reflectiveCurveToRelative(0.35f, 0.36f, 0.43f, 0.57f);
        pathBuilder.curveToRelative(0.07f, 0.2f, 0.11f, 0.43f, 0.11f, 0.69f);
        pathBuilder.curveToRelative(0.0f, 0.23f, -0.05f, 0.45f, -0.14f, 0.66f);
        pathBuilder.curveToRelative(-0.09f, 0.2f, -0.23f, 0.38f, -0.42f, 0.53f);
        pathBuilder.curveToRelative(-0.19f, 0.15f, -0.42f, 0.26f, -0.71f, 0.35f);
        pathBuilder.curveToRelative(-0.29f, 0.08f, -0.63f, 0.13f, -1.01f, 0.13f);
        pathBuilder.curveToRelative(-0.43f, 0.0f, -0.83f, -0.04f, -1.18f, -0.13f);
        pathBuilder.reflectiveCurveToRelative(-0.66f, -0.23f, -0.91f, -0.42f);
        pathBuilder.curveToRelative(-0.25f, -0.19f, -0.45f, -0.44f, -0.59f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.25f, -0.76f, -0.25f, -1.21f);
        pathBuilder.horizontalLineTo(6.4f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.08f, 1.13f, 0.24f, 1.58f);
        pathBuilder.reflectiveCurveToRelative(0.37f, 0.85f, 0.65f, 1.21f);
        pathBuilder.curveToRelative(0.28f, 0.35f, 0.6f, 0.66f, 0.98f, 0.92f);
        pathBuilder.curveToRelative(0.37f, 0.26f, 0.78f, 0.48f, 1.22f, 0.65f);
        pathBuilder.curveToRelative(0.44f, 0.17f, 0.9f, 0.3f, 1.38f, 0.39f);
        pathBuilder.curveToRelative(0.48f, 0.08f, 0.96f, 0.13f, 1.44f, 0.13f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.53f, -0.09f, 2.18f, -0.28f);
        pathBuilder.reflectiveCurveToRelative(1.21f, -0.45f, 1.67f, -0.79f);
        pathBuilder.curveToRelative(0.46f, -0.34f, 0.82f, -0.77f, 1.07f, -1.27f);
        pathBuilder.reflectiveCurveToRelative(0.38f, -1.07f, 0.38f, -1.71f);
        pathBuilder.curveToRelative(0.0f, -0.6f, -0.1f, -1.14f, -0.31f, -1.61f);
        pathBuilder.curveToRelative(-0.05f, -0.11f, -0.11f, -0.23f, -0.17f, -0.33f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f18736a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}