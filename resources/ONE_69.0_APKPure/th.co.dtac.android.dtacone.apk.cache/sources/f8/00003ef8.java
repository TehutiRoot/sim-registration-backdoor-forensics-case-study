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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_camera", "Landroidx/compose/material/icons/Icons$Rounded;", "getCamera", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCamera.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera.kt\nandroidx/compose/material/icons/rounded/CameraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n122#2:86\n116#2,3:87\n119#2,3:91\n132#2,18:94\n152#2:131\n174#3:90\n694#4,2:112\n706#4,2:114\n708#4,11:120\n64#5,4:116\n*S KotlinDebug\n*F\n+ 1 Camera.kt\nandroidx/compose/material/icons/rounded/CameraKt\n*L\n29#1:86\n29#1:87,3\n29#1:91,3\n30#1:94,18\n30#1:131\n29#1:90\n30#1:112,2\n30#1:114,2\n30#1:120,11\n30#1:116,4\n*E\n"})
/* loaded from: classes.dex */
public final class CameraKt {

    /* renamed from: a */
    public static ImageVector f19390a;

    @NotNull
    public static final ImageVector getCamera(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19390a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Camera", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.81f, 2.86f);
        pathBuilder.curveToRelative(0.17f, -0.3f, 0.0f, -0.7f, -0.35f, -0.74f);
        pathBuilder.curveToRelative(-2.62f, -0.37f, -5.3f, 0.28f, -7.44f, 1.86f);
        pathBuilder.curveToRelative(-0.19f, 0.15f, -0.25f, 0.43f, -0.12f, 0.65f);
        pathBuilder.lineToRelative(3.01f, 5.22f);
        pathBuilder.curveToRelative(0.19f, 0.33f, 0.67f, 0.33f, 0.87f, 0.0f);
        pathBuilder.lineToRelative(4.03f, -6.99f);
        pathBuilder.close();
        pathBuilder.moveTo(21.3f, 8.33f);
        pathBuilder.curveToRelative(-0.98f, -2.47f, -2.92f, -4.46f, -5.35f, -5.5f);
        pathBuilder.curveToRelative(-0.23f, -0.1f, -0.5f, 0.0f, -0.63f, 0.22f);
        pathBuilder.lineToRelative(-3.01f, 5.21f);
        pathBuilder.curveToRelative(-0.19f, 0.32f, 0.05f, 0.74f, 0.44f, 0.74f);
        pathBuilder.horizontalLineToRelative(8.08f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.6f, -0.35f, 0.47f, -0.67f);
        pathBuilder.close();
        pathBuilder.moveTo(21.37f, 10.0f);
        pathBuilder.horizontalLineToRelative(-6.2f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.43f, 0.75f);
        pathBuilder.lineTo(19.0f, 18.14f);
        pathBuilder.curveToRelative(0.17f, 0.3f, 0.6f, 0.35f, 0.82f, 0.08f);
        pathBuilder.curveToRelative(1.74f, -2.18f, 2.48f, -5.03f, 2.05f, -7.79f);
        pathBuilder.curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f);
        pathBuilder.close();
        pathBuilder.moveTo(4.18f, 5.79f);
        pathBuilder.curveToRelative(-1.73f, 2.19f, -2.48f, 5.02f, -2.05f, 7.79f);
        pathBuilder.curveToRelative(0.03f, 0.24f, 0.25f, 0.42f, 0.5f, 0.42f);
        pathBuilder.horizontalLineToRelative(6.2f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.63f, -0.42f, 0.43f, -0.75f);
        pathBuilder.lineTo(5.0f, 5.87f);
        pathBuilder.curveToRelative(-0.18f, -0.3f, -0.61f, -0.35f, -0.82f, -0.08f);
        pathBuilder.close();
        pathBuilder.moveTo(2.7f, 15.67f);
        pathBuilder.curveToRelative(0.98f, 2.47f, 2.92f, 4.46f, 5.35f, 5.5f);
        pathBuilder.curveToRelative(0.23f, 0.1f, 0.5f, 0.0f, 0.63f, -0.22f);
        pathBuilder.lineToRelative(3.01f, -5.21f);
        pathBuilder.curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.43f, -0.75f);
        pathBuilder.lineTo(3.17f, 14.99f);
        pathBuilder.curveToRelative(-0.35f, 0.01f, -0.6f, 0.36f, -0.47f, 0.68f);
        pathBuilder.close();
        pathBuilder.moveTo(10.53f, 21.89f);
        pathBuilder.curveToRelative(2.62f, 0.37f, 5.3f, -0.28f, 7.44f, -1.86f);
        pathBuilder.curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f);
        pathBuilder.lineToRelative(-3.01f, -5.22f);
        pathBuilder.curveToRelative(-0.19f, -0.33f, -0.67f, -0.33f, -0.87f, 0.0f);
        pathBuilder.lineToRelative(-4.04f, 6.99f);
        pathBuilder.curveToRelative(-0.17f, 0.3f, 0.01f, 0.7f, 0.35f, 0.75f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19390a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}