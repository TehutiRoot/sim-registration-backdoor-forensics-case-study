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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_camera", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCamera", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCamera.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera.kt\nandroidx/compose/material/icons/twotone/CameraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,122:1\n122#2:123\n116#2,3:124\n119#2,3:128\n132#2,18:131\n152#2:168\n132#2,18:169\n152#2:206\n174#3:127\n694#4,2:149\n706#4,2:151\n708#4,11:157\n694#4,2:187\n706#4,2:189\n708#4,11:195\n64#5,4:153\n64#5,4:191\n*S KotlinDebug\n*F\n+ 1 Camera.kt\nandroidx/compose/material/icons/twotone/CameraKt\n*L\n29#1:123\n29#1:124,3\n29#1:128,3\n30#1:131,18\n30#1:168\n69#1:169,18\n69#1:206\n29#1:127\n30#1:149,2\n30#1:151,2\n30#1:157,11\n69#1:187,2\n69#1:189,2\n69#1:195,11\n30#1:153,4\n69#1:191,4\n*E\n"})
/* loaded from: classes.dex */
public final class CameraKt {

    /* renamed from: a */
    public static ImageVector f23654a;

    @NotNull
    public static final ImageVector getCamera(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23654a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Camera", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.9f, 19.91f);
        pathBuilder.curveToRelative(0.36f, 0.05f, 0.72f, 0.09f, 1.1f, 0.09f);
        pathBuilder.curveToRelative(2.18f, 0.0f, 4.16f, -0.88f, 5.61f, -2.3f);
        pathBuilder.lineTo(14.89f, 13.0f);
        pathBuilder.lineToRelative(-3.99f, 6.91f);
        pathBuilder.close();
        pathBuilder.moveTo(9.86f, 19.7f);
        pathBuilder.lineToRelative(2.71f, -4.7f);
        pathBuilder.lineTo(4.59f, 15.0f);
        pathBuilder.curveToRelative(0.93f, 2.28f, 2.87f, 4.03f, 5.27f, 4.7f);
        pathBuilder.close();
        pathBuilder.moveTo(8.54f, 12.0f);
        pathBuilder.lineTo(5.7f, 7.09f);
        pathBuilder.curveTo(4.64f, 8.45f, 4.0f, 10.15f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.69f, 0.1f, 1.36f, 0.26f, 2.0f);
        pathBuilder.horizontalLineToRelative(5.43f);
        pathBuilder.lineToRelative(-1.15f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.3f, 16.91f);
        pathBuilder.curveTo(19.36f, 15.55f, 20.0f, 13.85f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.1f, -1.36f, -0.26f, -2.0f);
        pathBuilder.horizontalLineToRelative(-5.43f);
        pathBuilder.lineToRelative(3.99f, 6.91f);
        pathBuilder.close();
        pathBuilder.moveTo(13.73f, 9.0f);
        pathBuilder.horizontalLineToRelative(5.68f);
        pathBuilder.curveToRelative(-0.93f, -2.28f, -2.88f, -4.04f, -5.28f, -4.7f);
        pathBuilder.lineTo(11.42f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.31f);
        pathBuilder.close();
        pathBuilder.moveTo(10.27f, 9.0f);
        pathBuilder.lineToRelative(2.83f, -4.92f);
        pathBuilder.curveTo(12.74f, 4.03f, 12.37f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-2.18f, 0.0f, -4.16f, 0.88f, -5.6f, 2.3f);
        pathBuilder.lineTo(9.12f, 11.0f);
        pathBuilder.lineToRelative(1.15f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 22.0f);
        pathBuilder2.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f);
        pathBuilder2.lineToRelative(-0.08f, -0.04f);
        pathBuilder2.lineToRelative(-0.01f, 0.02f);
        pathBuilder2.curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder2.curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f);
        pathBuilder2.lineTo(14.89f, 13.0f);
        pathBuilder2.lineToRelative(2.72f, 4.7f);
        pathBuilder2.curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f);
        pathBuilder2.lineToRelative(-4.0f, -6.91f);
        pathBuilder2.horizontalLineToRelative(5.43f);
        pathBuilder2.curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.41f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-7.99f);
        pathBuilder2.lineToRelative(2.71f, -4.7f);
        pathBuilder2.curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.0f);
        pathBuilder2.curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f);
        pathBuilder2.lineTo(10.27f, 9.0f);
        pathBuilder2.lineToRelative(-1.15f, 2.0f);
        pathBuilder2.lineTo(6.4f, 6.3f);
        pathBuilder2.curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f);
        pathBuilder2.lineTo(8.54f, 12.0f);
        pathBuilder2.lineToRelative(1.15f, 2.0f);
        pathBuilder2.lineTo(4.26f, 14.0f);
        pathBuilder2.curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.27f, 15.0f);
        pathBuilder2.horizontalLineToRelative(2.3f);
        pathBuilder2.lineToRelative(-2.71f, 4.7f);
        pathBuilder2.curveToRelative(-2.4f, -0.67f, -4.35f, -2.42f, -5.28f, -4.7f);
        pathBuilder2.horizontalLineToRelative(5.69f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23654a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}