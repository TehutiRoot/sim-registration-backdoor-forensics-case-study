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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_fiberNew", "Landroidx/compose/material/icons/Icons$Rounded;", "getFiberNew", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberNew", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFiberNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiberNew.kt\nandroidx/compose/material/icons/rounded/FiberNewKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n122#2:105\n116#2,3:106\n119#2,3:110\n132#2,18:113\n152#2:150\n174#3:109\n694#4,2:131\n706#4,2:133\n708#4,11:139\n64#5,4:135\n*S KotlinDebug\n*F\n+ 1 FiberNew.kt\nandroidx/compose/material/icons/rounded/FiberNewKt\n*L\n29#1:105\n29#1:106,3\n29#1:110,3\n30#1:113,18\n30#1:150\n29#1:109\n30#1:131,2\n30#1:133,2\n30#1:139,11\n30#1:135,4\n*E\n"})
/* loaded from: classes.dex */
public final class FiberNewKt {

    /* renamed from: a */
    public static ImageVector f19684a;

    @NotNull
    public static final ImageVector getFiberNew(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19684a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberNew", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 14.21f);
        pathBuilder.curveToRelative(0.0f, 0.43f, -0.36f, 0.79f, -0.79f, 0.79f);
        pathBuilder.curveToRelative(-0.25f, 0.0f, -0.49f, -0.12f, -0.64f, -0.33f);
        pathBuilder.lineTo(4.75f, 11.5f);
        pathBuilder.verticalLineToRelative(2.88f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.reflectiveCurveToRelative(-0.63f, -0.28f, -0.63f, -0.62f);
        pathBuilder.lineTo(3.5f, 9.79f);
        pathBuilder.curveToRelative(0.0f, -0.43f, 0.36f, -0.79f, 0.79f, -0.79f);
        pathBuilder.horizontalLineToRelative(0.05f);
        pathBuilder.curveToRelative(0.26f, 0.0f, 0.5f, 0.12f, 0.65f, 0.33f);
        pathBuilder.lineToRelative(2.26f, 3.17f);
        pathBuilder.lineTo(7.25f, 9.62f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.63f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(4.59f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 9.64f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.lineTo(11.0f, 10.26f);
        pathBuilder.verticalLineToRelative(1.12f);
        pathBuilder.horizontalLineToRelative(1.88f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.lineTo(11.0f, 12.63f);
        pathBuilder.verticalLineToRelative(1.11f);
        pathBuilder.horizontalLineToRelative(1.88f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.curveToRelative(0.0f, 0.35f, -0.28f, 0.62f, -0.62f, 0.62f);
        pathBuilder.horizontalLineToRelative(-2.53f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.85f, -0.38f, -0.85f, -0.85f);
        pathBuilder.verticalLineToRelative(-4.3f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.38f, -0.83f, 0.85f, -0.83f);
        pathBuilder.horizontalLineToRelative(2.53f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(0.02f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.lineTo(14.5f, 9.62f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.28f, -0.62f, 0.62f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(3.89f);
        pathBuilder.horizontalLineToRelative(1.13f);
        pathBuilder.verticalLineToRelative(-2.9f);
        pathBuilder.curveToRelative(0.0f, -0.35f, 0.28f, -0.62f, 0.62f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.verticalLineToRelative(2.89f);
        pathBuilder.horizontalLineToRelative(1.12f);
        pathBuilder.lineTo(19.23f, 9.62f);
        pathBuilder.curveToRelative(0.0f, -0.35f, 0.28f, -0.62f, 0.62f, -0.62f);
        pathBuilder.reflectiveCurveToRelative(0.62f, 0.28f, 0.62f, 0.62f);
        pathBuilder.lineTo(20.47f, 14.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19684a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
