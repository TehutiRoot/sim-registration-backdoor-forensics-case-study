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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_waves", "Landroidx/compose/material/icons/Icons$Rounded;", "getWaves", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Waves", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWaves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Waves.kt\nandroidx/compose/material/icons/rounded/WavesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,133:1\n122#2:134\n116#2,3:135\n119#2,3:139\n132#2,18:142\n152#2:179\n174#3:138\n694#4,2:160\n706#4,2:162\n708#4,11:168\n64#5,4:164\n*S KotlinDebug\n*F\n+ 1 Waves.kt\nandroidx/compose/material/icons/rounded/WavesKt\n*L\n29#1:134\n29#1:135,3\n29#1:139,3\n30#1:142,18\n30#1:179\n29#1:138\n30#1:160,2\n30#1:162,2\n30#1:168,11\n30#1:164,4\n*E\n"})
/* loaded from: classes.dex */
public final class WavesKt {

    /* renamed from: a */
    public static ImageVector f21119a;

    @NotNull
    public static final ImageVector getWaves(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f21119a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Waves", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 16.99f);
        pathBuilder.curveToRelative(-1.35f, 0.0f, -2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.33f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.43f, 0.22f, -0.81f, 0.41f, -1.27f, 0.52f);
        pathBuilder.curveToRelative(-0.45f, 0.1f, -0.78f, 0.46f, -0.78f, 0.91f);
        pathBuilder.verticalLineToRelative(0.1f);
        pathBuilder.curveToRelative(0.0f, 0.6f, 0.56f, 1.03f, 1.14f, 0.91f);
        pathBuilder.curveToRelative(0.74f, -0.15f, 1.3f, -0.43f, 1.81f, -0.69f);
        pathBuilder.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.42f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.33f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f);
        pathBuilder.curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.91f);
        pathBuilder.verticalLineToRelative(-0.09f);
        pathBuilder.curveToRelative(0.0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f);
        pathBuilder.curveToRelative(-0.46f, -0.1f, -0.83f, -0.29f, -1.26f, -0.52f);
        pathBuilder.curveToRelative(-0.75f, -0.39f, -1.6f, -0.81f, -2.95f, -0.81f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 12.54f);
        pathBuilder.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.43f, 0.21f, -0.81f, 0.41f, -1.28f, 0.52f);
        pathBuilder.curveToRelative(-0.44f, 0.1f, -0.77f, 0.46f, -0.77f, 0.91f);
        pathBuilder.verticalLineToRelative(0.1f);
        pathBuilder.curveToRelative(0.0f, 0.59f, 0.54f, 1.03f, 1.12f, 0.91f);
        pathBuilder.curveToRelative(0.75f, -0.15f, 1.31f, -0.44f, 1.83f, -0.69f);
        pathBuilder.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f);
        pathBuilder.curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.92f);
        pathBuilder.verticalLineToRelative(-0.09f);
        pathBuilder.curveToRelative(0.0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f);
        pathBuilder.curveToRelative(-0.46f, -0.1f, -0.83f, -0.29f, -1.26f, -0.52f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        pathBuilder.close();
        pathBuilder.moveTo(19.95f, 4.46f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.58f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.37f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.43f, 0.22f, -0.81f, 0.41f, -1.27f, 0.52f);
        pathBuilder.curveToRelative(-0.45f, 0.1f, -0.78f, 0.46f, -0.78f, 0.91f);
        pathBuilder.verticalLineToRelative(0.07f);
        pathBuilder.curveToRelative(0.0f, 0.6f, 0.54f, 1.04f, 1.12f, 0.92f);
        pathBuilder.curveToRelative(0.75f, -0.15f, 1.31f, -0.44f, 1.83f, -0.69f);
        pathBuilder.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f);
        pathBuilder.curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.92f);
        pathBuilder.verticalLineToRelative(-0.09f);
        pathBuilder.curveToRelative(0.0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f);
        pathBuilder.curveToRelative(-0.46f, -0.1f, -0.83f, -0.28f, -1.26f, -0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 8.09f);
        pathBuilder.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f);
        pathBuilder.reflectiveCurveToRelative(-1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilder.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilder.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilder.curveToRelative(-0.43f, 0.23f, -0.8f, 0.42f, -1.26f, 0.52f);
        pathBuilder.curveToRelative(-0.45f, 0.1f, -0.79f, 0.46f, -0.79f, 0.92f);
        pathBuilder.verticalLineToRelative(0.09f);
        pathBuilder.curveToRelative(0.0f, 0.59f, 0.54f, 1.03f, 1.12f, 0.91f);
        pathBuilder.curveToRelative(0.75f, -0.15f, 1.31f, -0.44f, 1.83f, -0.69f);
        pathBuilder.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilder.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilder.curveToRelative(0.52f, 0.26f, 1.08f, 0.55f, 1.83f, 0.7f);
        pathBuilder.curveToRelative(0.58f, 0.11f, 1.12f, -0.33f, 1.12f, -0.91f);
        pathBuilder.verticalLineToRelative(-0.09f);
        pathBuilder.curveToRelative(0.0f, -0.46f, -0.34f, -0.82f, -0.79f, -0.92f);
        pathBuilder.curveToRelative(-0.46f, -0.1f, -0.83f, -0.29f, -1.26f, -0.52f);
        pathBuilder.curveToRelative(-0.75f, -0.39f, -1.6f, -0.81f, -2.95f, -0.81f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f21119a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}