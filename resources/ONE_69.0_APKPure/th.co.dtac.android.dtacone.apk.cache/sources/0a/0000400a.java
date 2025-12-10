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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_dry", "Landroidx/compose/material/icons/Icons$Rounded;", "getDry", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Dry", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dry.kt\nandroidx/compose/material/icons/rounded/DryKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n122#2:106\n116#2,3:107\n119#2,3:111\n132#2,18:114\n152#2:151\n174#3:110\n694#4,2:132\n706#4,2:134\n708#4,11:140\n64#5,4:136\n*S KotlinDebug\n*F\n+ 1 Dry.kt\nandroidx/compose/material/icons/rounded/DryKt\n*L\n29#1:106\n29#1:107,3\n29#1:111,3\n30#1:114,18\n30#1:151\n29#1:110\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"})
/* loaded from: classes.dex */
public final class DryKt {

    /* renamed from: a */
    public static ImageVector f19664a;

    @NotNull
    public static final ImageVector getDry(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19664a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Dry", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.94f, 11.79f);
        pathBuilder.curveTo(1.34f, 12.36f, 1.0f, 13.14f, 1.0f, 13.97f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.lineToRelative(13.68f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(7.18f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(8.18f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.lineToRelative(6.18f, 0.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilder.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilder.horizontalLineTo(8.86f);
        pathBuilder.lineToRelative(1.49f, -2.61f);
        pathBuilder.curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f);
        pathBuilder.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilder.lineTo(9.81f, 5.71f);
        pathBuilder.curveTo(9.43f, 5.32f, 8.8f, 5.3f, 8.4f, 5.68f);
        pathBuilder.lineTo(1.94f, 11.79f);
        pathBuilder.close();
        pathBuilder.moveTo(16.99f, 8.07f);
        pathBuilder.curveToRelative(0.0f, 0.52f, -0.42f, 0.93f, -0.93f, 0.93f);
        pathBuilder.curveToRelative(-0.52f, 0.0f, -0.93f, -0.42f, -0.93f, -0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f);
        pathBuilder.lineToRelative(-0.07f, -0.06f);
        pathBuilder.curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(13.0f, 2.42f, 13.42f, 2.0f, 13.93f, 2.0f);
        pathBuilder.curveToRelative(0.51f, 0.0f, 0.93f, 0.42f, 0.93f, 0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f);
        pathBuilder.lineToRelative(0.07f, 0.07f);
        pathBuilder.curveTo(16.55f, 5.74f, 17.03f, 6.88f, 16.99f, 8.07f);
        pathBuilder.lineTo(16.99f, 8.07f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 8.07f);
        pathBuilder.curveTo(21.0f, 8.58f, 20.58f, 9.0f, 20.06f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(-0.93f, -0.42f, -0.93f, -0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f);
        pathBuilder.lineToRelative(-0.07f, -0.06f);
        pathBuilder.curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.51f, 0.42f, -0.93f, 0.93f, -0.93f);
        pathBuilder.reflectiveCurveToRelative(0.93f, 0.42f, 0.93f, 0.93f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f);
        pathBuilder.lineToRelative(0.07f, 0.07f);
        pathBuilder.curveTo(20.55f, 5.74f, 21.03f, 6.88f, 21.0f, 8.07f);
        pathBuilder.lineTo(21.0f, 8.07f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19664a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}