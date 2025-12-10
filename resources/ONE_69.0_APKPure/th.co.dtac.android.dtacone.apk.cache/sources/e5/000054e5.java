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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_shutterSpeed", "Landroidx/compose/material/icons/Icons$TwoTone;", "getShutterSpeed", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ShutterSpeed", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShutterSpeed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShutterSpeed.kt\nandroidx/compose/material/icons/twotone/ShutterSpeedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,136:1\n122#2:137\n116#2,3:138\n119#2,3:142\n132#2,18:145\n152#2:182\n132#2,18:183\n152#2:220\n174#3:141\n694#4,2:163\n706#4,2:165\n708#4,11:171\n694#4,2:201\n706#4,2:203\n708#4,11:209\n64#5,4:167\n64#5,4:205\n*S KotlinDebug\n*F\n+ 1 ShutterSpeed.kt\nandroidx/compose/material/icons/twotone/ShutterSpeedKt\n*L\n29#1:137\n29#1:138,3\n29#1:142,3\n30#1:145,18\n30#1:182\n73#1:183,18\n73#1:220\n29#1:141\n30#1:163,2\n30#1:165,2\n30#1:171,11\n73#1:201,2\n73#1:203,2\n73#1:209,11\n30#1:167,4\n73#1:205,4\n*E\n"})
/* loaded from: classes.dex */
public final class ShutterSpeedKt {

    /* renamed from: a */
    public static ImageVector f25003a;

    @NotNull
    public static final ImageVector getShutterSpeed(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25003a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShutterSpeed", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 0.9f, 0.06f, 1.33f, 0.15f);
        pathBuilder.lineToRelative(-2.72f, 4.7f);
        pathBuilder.lineToRelative(-2.32f, -3.56f);
        pathBuilder.curveTo(9.31f, 7.49f, 10.6f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -1.54f, 0.59f, -2.95f, 1.55f, -4.01f);
        pathBuilder.lineTo(10.81f, 14.0f);
        pathBuilder.lineTo(6.09f, 14.0f);
        pathBuilder.curveToRelative(-0.05f, -0.33f, -0.09f, -0.66f, -0.09f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.35f, 15.0f);
        pathBuilder.horizontalLineToRelative(5.33f);
        pathBuilder.lineToRelative(-2.03f, 3.5f);
        pathBuilder.lineToRelative(0.11f, 0.06f);
        pathBuilder.curveToRelative(-1.59f, -0.64f, -2.84f, -1.94f, -3.41f, -3.56f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-0.48f, 0.0f, -0.94f, -0.06f, -1.39f, -0.17f);
        pathBuilder.lineToRelative(2.85f, -4.92f);
        pathBuilder.lineToRelative(2.11f, 3.9f);
        pathBuilder.curveToRelative(-1.0f, 0.74f, -2.23f, 1.19f, -3.57f, 1.19f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 1.6f, -0.63f, 3.06f, -1.66f, 4.13f);
        pathBuilder.lineTo(13.57f, 12.0f);
        pathBuilder.horizontalLineToRelative(4.34f);
        pathBuilder.curveToRelative(0.05f, 0.33f, 0.09f, 0.66f, 0.09f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.26f, 11.0f);
        pathBuilder.lineToRelative(2.05f, -3.54f);
        pathBuilder.curveToRelative(1.56f, 0.65f, 2.77f, 1.94f, 3.34f, 3.54f);
        pathBuilder.horizontalLineToRelative(-5.39f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.55f, 8.99f);
        pathBuilder2.curveTo(6.59f, 10.05f, 6.0f, 11.46f, 6.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        pathBuilder2.horizontalLineToRelative(4.72f);
        pathBuilder2.lineTo(7.55f, 8.99f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.31f, 7.46f);
        pathBuilder2.lineTo(12.26f, 11.0f);
        pathBuilder2.horizontalLineToRelative(5.39f);
        pathBuilder2.curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.33f, 7.15f);
        pathBuilder2.curveTo(12.9f, 7.06f, 12.46f, 7.0f, 12.0f, 7.0f);
        pathBuilder2.curveToRelative(-1.4f, 0.0f, -2.69f, 0.49f, -3.71f, 1.29f);
        pathBuilder2.lineToRelative(2.32f, 3.56f);
        pathBuilder2.lineToRelative(2.72f, -4.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.68f, 15.0f);
        pathBuilder2.lineTo(6.35f, 15.0f);
        pathBuilder2.curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f);
        pathBuilder2.lineToRelative(-0.11f, -0.06f);
        pathBuilder2.lineToRelative(2.03f, -3.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.03f, 7.39f);
        pathBuilder2.lineToRelative(1.42f, -1.42f);
        pathBuilder2.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        pathBuilder2.lineToRelative(-1.42f, 1.42f);
        pathBuilder2.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder2.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder2.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder2.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilder2.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(9.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.34f, 17.13f);
        pathBuilder2.curveTo(17.37f, 16.06f, 18.0f, 14.6f, 18.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        pathBuilder2.horizontalLineToRelative(-4.34f);
        pathBuilder2.lineToRelative(2.77f, 5.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.61f, 18.83f);
        pathBuilder2.curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f);
        pathBuilder2.curveToRelative(1.34f, 0.0f, 2.57f, -0.45f, 3.57f, -1.19f);
        pathBuilder2.lineToRelative(-2.11f, -3.9f);
        pathBuilder2.lineToRelative(-2.85f, 4.92f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25003a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}