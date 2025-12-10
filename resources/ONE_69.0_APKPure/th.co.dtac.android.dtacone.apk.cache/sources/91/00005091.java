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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_doNotStep", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDoNotStep", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotStep", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDoNotStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/twotone/DoNotStepKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,114:1\n122#2:115\n116#2,3:116\n119#2,3:120\n132#2,18:123\n152#2:160\n132#2,18:161\n152#2:198\n174#3:119\n694#4,2:141\n706#4,2:143\n708#4,11:149\n694#4,2:179\n706#4,2:181\n708#4,11:187\n64#5,4:145\n64#5,4:183\n*S KotlinDebug\n*F\n+ 1 DoNotStep.kt\nandroidx/compose/material/icons/twotone/DoNotStepKt\n*L\n29#1:115\n29#1:116,3\n29#1:120,3\n30#1:123,18\n30#1:160\n50#1:161,18\n50#1:198\n29#1:119\n30#1:141,2\n30#1:143,2\n30#1:149,11\n50#1:179,2\n50#1:181,2\n50#1:187,11\n30#1:145,4\n50#1:183,4\n*E\n"})
/* loaded from: classes.dex */
public final class DoNotStepKt {

    /* renamed from: a */
    public static ImageVector f23895a;

    @NotNull
    public static final ImageVector getDoNotStep(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23895a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DoNotStep", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.98f, 12.15f);
        pathBuilder.moveTo(14.98f, 12.15f);
        pathBuilder.lineToRelative(3.07f, -3.07f);
        pathBuilder.lineTo(13.8f, 4.82f);
        pathBuilder.lineToRelative(-3.08f, 3.07f);
        pathBuilder.lineTo(14.98f, 12.15f);
        pathBuilder.close();
        pathBuilder.moveTo(12.42f, 15.26f);
        pathBuilder.lineToRelative(-1.67f, -1.68f);
        pathBuilder.lineTo(7.42f, 16.9f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, -0.01f);
        pathBuilder.lineTo(4.4f, 16.72f);
        pathBuilder.lineToRelative(-0.47f, 0.24f);
        pathBuilder.curveToRelative(-0.29f, 0.14f, -0.59f, 0.27f, -0.89f, 0.39f);
        pathBuilder.lineTo(3.03f, 18.0f);
        pathBuilder.horizontalLineToRelative(6.64f);
        pathBuilder.lineTo(12.42f, 15.26f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.51f, 15.68f);
        pathBuilder2.lineToRelative(-1.41f, -1.41f);
        pathBuilder2.lineToRelative(4.48f, -4.48f);
        pathBuilder2.lineTo(23.0f, 11.2f);
        pathBuilder2.lineTo(18.51f, 15.68f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.98f, 12.15f);
        pathBuilder2.moveTo(14.98f, 12.15f);
        pathBuilder2.lineToRelative(3.07f, -3.07f);
        pathBuilder2.lineTo(13.8f, 4.82f);
        pathBuilder2.lineToRelative(-3.08f, 3.07f);
        pathBuilder2.lineTo(9.3f, 6.47f);
        pathBuilder2.lineTo(13.8f, 2.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.lineToRelative(7.08f, 7.08f);
        pathBuilder2.lineToRelative(-4.48f, 4.48f);
        pathBuilder2.lineTo(14.98f, 12.15f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.18f, 21.2f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineToRelative(-5.94f, -5.94f);
        pathBuilder2.lineTo(10.5f, 20.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.verticalLineToRelative(-2.63f);
        pathBuilder2.curveToRelative(0.0f, -0.84f, 0.52f, -1.57f, 1.3f, -1.88f);
        pathBuilder2.curveToRelative(0.58f, -0.23f, 1.28f, -0.56f, 1.97f, -1.02f);
        pathBuilder2.lineToRelative(1.38f, 1.38f);
        pathBuilder2.curveTo(5.74f, 15.95f, 5.87f, 16.0f, 6.0f, 16.0f);
        pathBuilder2.reflectiveCurveToRelative(0.26f, -0.05f, 0.36f, -0.15f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder2.lineToRelative(-1.28f, -1.28f);
        pathBuilder2.curveToRelative(0.27f, -0.24f, 0.53f, -0.51f, 0.77f, -0.8f);
        pathBuilder2.lineToRelative(1.27f, 1.27f);
        pathBuilder2.curveToRelative(0.09f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f);
        pathBuilder2.reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.15f);
        pathBuilder2.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder2.lineToRelative(-1.4f, -1.4f);
        pathBuilder2.curveToRelative(0.19f, -0.34f, 0.34f, -0.72f, 0.45f, -1.12f);
        pathBuilder2.lineToRelative(1.71f, 1.72f);
        pathBuilder2.curveToRelative(0.09f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f);
        pathBuilder2.reflectiveCurveToRelative(0.25f, -0.05f, 0.35f, -0.15f);
        pathBuilder2.curveToRelative(0.19f, -0.2f, 0.19f, -0.5f, 0.01f, -0.7f);
        pathBuilder2.lineToRelative(-7.9f, -7.9f);
        pathBuilder2.lineToRelative(1.42f, -1.41f);
        pathBuilder2.lineTo(21.18f, 21.2f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.42f, 15.26f);
        pathBuilder2.lineToRelative(-1.67f, -1.68f);
        pathBuilder2.lineTo(7.42f, 16.9f);
        pathBuilder2.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, -0.01f);
        pathBuilder2.lineTo(4.4f, 16.72f);
        pathBuilder2.lineToRelative(-0.47f, 0.24f);
        pathBuilder2.curveToRelative(-0.29f, 0.14f, -0.59f, 0.27f, -0.89f, 0.39f);
        pathBuilder2.lineTo(3.03f, 18.0f);
        pathBuilder2.horizontalLineToRelative(6.64f);
        pathBuilder2.lineTo(12.42f, 15.26f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23895a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}