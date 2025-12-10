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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_fiberDvr", "Landroidx/compose/material/icons/Icons$Rounded;", "getFiberDvr", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberDvr", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFiberDvr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiberDvr.kt\nandroidx/compose/material/icons/rounded/FiberDvrKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n122#2:97\n116#2,3:98\n119#2,3:102\n132#2,18:105\n152#2:142\n174#3:101\n694#4,2:123\n706#4,2:125\n708#4,11:131\n64#5,4:127\n*S KotlinDebug\n*F\n+ 1 FiberDvr.kt\nandroidx/compose/material/icons/rounded/FiberDvrKt\n*L\n29#1:97\n29#1:98,3\n29#1:102,3\n30#1:105,18\n30#1:142\n29#1:101\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"})
/* loaded from: classes.dex */
public final class FiberDvrKt {

    /* renamed from: a */
    public static ImageVector f19682a;

    @NotNull
    public static final ImageVector getFiberDvr(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19682a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberDvr", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.lineTo(3.0f, 3.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(23.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 13.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.1f, 9.92f);
        pathBuilder.lineToRelative(-1.27f, 4.36f);
        pathBuilder.curveToRelative(-0.12f, 0.43f, -0.52f, 0.72f, -0.96f, 0.72f);
        pathBuilder.reflectiveCurveToRelative(-0.84f, -0.29f, -0.96f, -0.72f);
        pathBuilder.lineTo(9.64f, 9.92f);
        pathBuilder.curveToRelative(-0.14f, -0.46f, 0.21f, -0.92f, 0.69f, -0.92f);
        pathBuilder.curveToRelative(0.32f, 0.0f, 0.6f, 0.21f, 0.69f, 0.52f);
        pathBuilder.lineToRelative(0.85f, 2.91f);
        pathBuilder.lineToRelative(0.85f, -2.91f);
        pathBuilder.curveToRelative(0.09f, -0.31f, 0.37f, -0.52f, 0.69f, -0.52f);
        pathBuilder.curveToRelative(0.48f, 0.0f, 0.83f, 0.46f, 0.69f, 0.92f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 11.5f);
        pathBuilder.curveToRelative(0.0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f);
        pathBuilder.lineToRelative(0.63f, 1.48f);
        pathBuilder.curveToRelative(0.19f, 0.45f, -0.14f, 0.96f, -0.63f, 0.96f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.53f, -0.16f, -0.63f, -0.42f);
        pathBuilder.lineTo(18.65f, 13.0f);
        pathBuilder.lineTo(17.5f, 13.0f);
        pathBuilder.verticalLineToRelative(1.31f);
        pathBuilder.curveToRelative(0.0f, 0.38f, -0.31f, 0.69f, -0.69f, 0.69f);
        pathBuilder.horizontalLineToRelative(-0.12f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.69f, -0.31f, -0.69f, -0.69f);
        pathBuilder.lineTo(16.0f, 9.64f);
        pathBuilder.curveToRelative(0.0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f);
        pathBuilder.horizontalLineToRelative(2.86f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19682a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
