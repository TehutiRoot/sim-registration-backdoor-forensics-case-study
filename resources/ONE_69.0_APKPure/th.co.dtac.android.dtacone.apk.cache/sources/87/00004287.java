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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_networkWifi3Bar", "Landroidx/compose/material/icons/Icons$Rounded;", "getNetworkWifi3Bar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "NetworkWifi3Bar", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetworkWifi3Bar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkWifi3Bar.kt\nandroidx/compose/material/icons/rounded/NetworkWifi3BarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,54:1\n122#2:55\n116#2,3:56\n119#2,3:60\n132#2,18:63\n152#2:100\n174#3:59\n694#4,2:81\n706#4,2:83\n708#4,11:89\n64#5,4:85\n*S KotlinDebug\n*F\n+ 1 NetworkWifi3Bar.kt\nandroidx/compose/material/icons/rounded/NetworkWifi3BarKt\n*L\n29#1:55\n29#1:56,3\n29#1:60,3\n30#1:63,18\n30#1:100\n29#1:59\n30#1:81,2\n30#1:83,2\n30#1:89,11\n30#1:85,4\n*E\n"})
/* loaded from: classes.dex */
public final class NetworkWifi3BarKt {

    /* renamed from: a */
    public static ImageVector f20301a;

    @NotNull
    public static final ImageVector getNetworkWifi3Bar(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20301a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NetworkWifi3Bar", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveTo(7.7f, 4.0f, 3.78f, 5.6f, 0.79f, 8.24f);
        pathBuilder.curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f);
        pathBuilder.lineToRelative(10.56f, 10.58f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineTo(23.27f, 9.71f);
        pathBuilder.curveToRelative(0.41f, -0.41f, 0.38f, -1.08f, -0.06f, -1.47f);
        pathBuilder.curveTo(20.22f, 5.6f, 16.3f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.92f, 9.07f);
        pathBuilder.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        pathBuilder.lineToRelative(-2.85f, 2.86f);
        pathBuilder.curveTo(16.46f, 10.71f, 14.31f, 10.0f, 12.0f, 10.0f);
        pathBuilder.curveToRelative(-2.31f, 0.0f, -4.46f, 0.71f, -6.23f, 1.93f);
        pathBuilder.lineTo(2.92f, 9.07f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20301a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}