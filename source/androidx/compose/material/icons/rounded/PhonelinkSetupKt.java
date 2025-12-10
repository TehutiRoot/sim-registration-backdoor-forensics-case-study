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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_phonelinkSetup", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhonelinkSetup", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "PhonelinkSetup", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhonelinkSetup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhonelinkSetup.kt\nandroidx/compose/material/icons/rounded/PhonelinkSetupKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n122#2:112\n116#2,3:113\n119#2,3:117\n132#2,18:120\n152#2:157\n174#3:116\n694#4,2:138\n706#4,2:140\n708#4,11:146\n64#5,4:142\n*S KotlinDebug\n*F\n+ 1 PhonelinkSetup.kt\nandroidx/compose/material/icons/rounded/PhonelinkSetupKt\n*L\n29#1:112\n29#1:113,3\n29#1:117,3\n30#1:120,18\n30#1:157\n29#1:116\n30#1:138,2\n30#1:140,2\n30#1:146,11\n30#1:142,4\n*E\n"})
/* loaded from: classes.dex */
public final class PhonelinkSetupKt {

    /* renamed from: a */
    public static ImageVector f20369a;

    @NotNull
    public static final ImageVector getPhonelinkSetup(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20369a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhonelinkSetup", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.lineTo(9.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(9.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(9.0f, 1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 15.5f);
        pathBuilder.curveToRelative(0.29f, -0.12f, 0.55f, -0.29f, 0.8f, -0.48f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder.lineToRelative(1.01f, 0.39f);
        pathBuilder.curveToRelative(0.23f, 0.09f, 0.49f, 0.0f, 0.61f, -0.22f);
        pathBuilder.lineToRelative(0.84f, -1.46f);
        pathBuilder.curveToRelative(0.12f, -0.21f, 0.07f, -0.49f, -0.12f, -0.64f);
        pathBuilder.lineToRelative(-0.85f, -0.68f);
        pathBuilder.lineToRelative(-0.02f, 0.03f);
        pathBuilder.curveToRelative(0.02f, -0.16f, 0.05f, -0.32f, 0.05f, -0.48f);
        pathBuilder.reflectiveCurveToRelative(-0.03f, -0.32f, -0.05f, -0.48f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.lineToRelative(0.85f, -0.68f);
        pathBuilder.curveToRelative(0.19f, -0.15f, 0.24f, -0.43f, 0.12f, -0.64f);
        pathBuilder.lineToRelative(-0.84f, -1.46f);
        pathBuilder.curveToRelative(-0.12f, -0.21f, -0.38f, -0.31f, -0.61f, -0.22f);
        pathBuilder.lineToRelative(-1.01f, 0.39f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.curveToRelative(-0.25f, -0.17f, -0.51f, -0.34f, -0.8f, -0.46f);
        pathBuilder.lineToRelative(-0.17f, -1.08f);
        pathBuilder.curveTo(9.3f, 7.18f, 9.09f, 7.0f, 8.84f, 7.0f);
        pathBuilder.lineTo(7.16f, 7.0f);
        pathBuilder.curveToRelative(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        pathBuilder.lineTo(6.5f, 8.5f);
        pathBuilder.curveToRelative(-0.29f, 0.12f, -0.55f, 0.29f, -0.8f, 0.48f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.lineToRelative(-1.02f, -0.39f);
        pathBuilder.curveToRelative(-0.23f, -0.09f, -0.49f, 0.0f, -0.61f, 0.22f);
        pathBuilder.lineToRelative(-0.84f, 1.46f);
        pathBuilder.curveToRelative(-0.12f, 0.21f, -0.07f, 0.49f, 0.12f, 0.64f);
        pathBuilder.lineToRelative(0.85f, 0.68f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.curveToRelative(-0.02f, 0.15f, -0.05f, 0.31f, -0.05f, 0.47f);
        pathBuilder.reflectiveCurveToRelative(0.03f, 0.32f, 0.05f, 0.48f);
        pathBuilder.lineToRelative(-0.02f, -0.03f);
        pathBuilder.lineToRelative(-0.85f, 0.68f);
        pathBuilder.curveToRelative(-0.19f, 0.15f, -0.24f, 0.43f, -0.12f, 0.64f);
        pathBuilder.lineToRelative(0.84f, 1.46f);
        pathBuilder.curveToRelative(0.12f, 0.21f, 0.38f, 0.31f, 0.61f, 0.22f);
        pathBuilder.lineToRelative(1.01f, -0.39f);
        pathBuilder.lineToRelative(-0.01f, -0.04f);
        pathBuilder.curveToRelative(0.25f, 0.19f, 0.51f, 0.36f, 0.8f, 0.48f);
        pathBuilder.lineToRelative(0.17f, 1.07f);
        pathBuilder.curveToRelative(0.03f, 0.25f, 0.24f, 0.43f, 0.49f, 0.43f);
        pathBuilder.horizontalLineToRelative(1.68f);
        pathBuilder.curveToRelative(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        pathBuilder.lineToRelative(0.17f, -1.08f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20369a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
