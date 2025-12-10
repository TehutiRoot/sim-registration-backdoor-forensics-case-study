package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_portableWifiOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getPortableWifiOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "PortableWifiOff", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPortableWifiOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PortableWifiOff.kt\nandroidx/compose/material/icons/rounded/PortableWifiOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n122#2:85\n116#2,3:86\n119#2,3:90\n132#2,18:93\n152#2:130\n174#3:89\n694#4,2:111\n706#4,2:113\n708#4,11:119\n64#5,4:115\n*S KotlinDebug\n*F\n+ 1 PortableWifiOff.kt\nandroidx/compose/material/icons/rounded/PortableWifiOffKt\n*L\n29#1:85\n29#1:86,3\n29#1:90,3\n30#1:93,18\n30#1:130\n29#1:89\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"})
/* loaded from: classes.dex */
public final class PortableWifiOffKt {

    /* renamed from: a */
    public static ImageVector f20419a;

    @NotNull
    public static final ImageVector getPortableWifiOff(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20419a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PortableWifiOff", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.71f, 3.07f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(4.1f, 5.87f);
        pathBuilder.curveTo(2.79f, 7.57f, 2.0f, 9.69f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.3f, 1.6f, 6.22f, 4.06f, 8.04f);
        pathBuilder.curveToRelative(0.48f, 0.35f, 1.16f, 0.21f, 1.46f, -0.31f);
        pathBuilder.curveToRelative(0.25f, -0.43f, 0.14f, -0.99f, -0.26f, -1.29f);
        pathBuilder.curveTo(5.29f, 16.98f, 4.0f, 14.65f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.76f, 0.57f, -3.38f, 1.53f, -4.69f);
        pathBuilder.lineToRelative(1.43f, 1.44f);
        pathBuilder.curveTo(6.36f, 9.68f, 6.0f, 10.8f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.8f, 0.8f, 3.41f, 2.06f, 4.51f);
        pathBuilder.curveToRelative(0.46f, 0.4f, 1.19f, 0.25f, 1.5f, -0.28f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.curveToRelative(0.24f, -0.42f, 0.13f, -0.94f, -0.23f, -1.26f);
        pathBuilder.curveTo(8.52f, 14.23f, 8.0f, 13.18f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.17f, -1.25f, 0.44f, -1.79f);
        pathBuilder.lineToRelative(1.58f, 1.58f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.lineToRelative(0.21f, -0.02f);
        pathBuilder.lineToRelative(6.81f, 6.81f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(4.13f, 3.07f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.71f, 13.82f);
        pathBuilder.curveToRelative(0.18f, -0.57f, 0.29f, -1.19f, 0.29f, -1.82f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.curveToRelative(-0.63f, 0.0f, -1.25f, 0.11f, -1.82f, 0.29f);
        pathBuilder.lineToRelative(1.72f, 1.72f);
        pathBuilder.curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.1f, -0.01f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.04f, -0.01f, 0.07f, -0.01f, 0.11f);
        pathBuilder.lineToRelative(1.72f, 1.71f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.2f, -0.29f, 2.32f, -0.77f, 3.35f);
        pathBuilder.lineToRelative(1.49f, 1.49f);
        pathBuilder.curveTo(21.53f, 15.4f, 22.0f, 13.76f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.curveToRelative(-1.76f, 0.0f, -3.4f, 0.48f, -4.84f, 1.28f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.curveTo(9.66f, 4.28f, 10.8f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20419a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
