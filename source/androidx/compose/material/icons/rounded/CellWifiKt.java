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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_cellWifi", "Landroidx/compose/material/icons/Icons$Rounded;", "getCellWifi", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "CellWifi", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCellWifi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellWifi.kt\nandroidx/compose/material/icons/rounded/CellWifiKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n122#2:83\n116#2,3:84\n119#2,3:88\n132#2,18:91\n152#2:128\n132#2,18:129\n152#2:166\n132#2,18:167\n152#2:204\n132#2,18:205\n152#2:242\n174#3:87\n694#4,2:109\n706#4,2:111\n708#4,11:117\n694#4,2:147\n706#4,2:149\n708#4,11:155\n694#4,2:185\n706#4,2:187\n708#4,11:193\n694#4,2:223\n706#4,2:225\n708#4,11:231\n64#5,4:113\n64#5,4:151\n64#5,4:189\n64#5,4:227\n*S KotlinDebug\n*F\n+ 1 CellWifi.kt\nandroidx/compose/material/icons/rounded/CellWifiKt\n*L\n29#1:83\n29#1:84,3\n29#1:88,3\n30#1:91,18\n30#1:128\n46#1:129,18\n46#1:166\n56#1:167,18\n56#1:204\n66#1:205,18\n66#1:242\n29#1:87\n30#1:109,2\n30#1:111,2\n30#1:117,11\n46#1:147,2\n46#1:149,2\n46#1:155,11\n56#1:185,2\n56#1:187,2\n56#1:193,11\n66#1:223,2\n66#1:225,2\n66#1:231,11\n30#1:113,4\n46#1:151,4\n56#1:189,4\n66#1:227,4\n*E\n"})
/* loaded from: classes.dex */
public final class CellWifiKt {

    /* renamed from: a */
    public static ImageVector f19329a;

    @NotNull
    public static final ImageVector getCellWifi(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19329a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CellWifi", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.29f, 7.68f);
        pathBuilder.lineTo(7.7f, 20.29f);
        pathBuilder.curveTo(7.07f, 20.92f, 7.52f, 22.0f, 8.41f, 22.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(8.39f);
        pathBuilder.curveTo(22.0f, 7.5f, 20.92f, 7.05f, 20.29f, 7.68f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-7.22f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.61f, 10.68f);
        pathBuilder2.curveToRelative(-0.28f, 0.17f, -0.32f, 0.56f, -0.09f, 0.79f);
        pathBuilder2.lineToRelative(0.82f, 0.82f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder2.lineToRelative(0.82f, -0.82f);
        pathBuilder2.curveToRelative(0.23f, -0.23f, 0.18f, -0.62f, -0.09f, -0.79f);
        pathBuilder2.curveTo(11.61f, 10.14f, 10.49f, 10.14f, 9.61f, 10.68f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.42f, 9.3f);
        pathBuilder3.curveToRelative(1.57f, -1.12f, 3.7f, -1.12f, 5.27f, 0.0f);
        pathBuilder3.curveToRelative(0.36f, 0.26f, 0.85f, 0.22f, 1.16f, -0.1f);
        pathBuilder3.curveToRelative(0.39f, -0.39f, 0.35f, -1.06f, -0.1f, -1.38f);
        pathBuilder3.curveToRelative(-2.2f, -1.57f, -5.19f, -1.57f, -7.4f, 0.0f);
        pathBuilder3.curveTo(6.9f, 8.14f, 6.85f, 8.81f, 7.25f, 9.2f);
        pathBuilder3.curveTo(7.57f, 9.52f, 8.06f, 9.56f, 8.42f, 9.3f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.26f, 6.69f);
        pathBuilder4.curveToRelative(0.34f, 0.28f, 0.83f, 0.28f, 1.14f, -0.03f);
        pathBuilder4.lineToRelative(0.12f, -0.12f);
        pathBuilder4.curveToRelative(0.35f, -0.35f, 0.31f, -0.92f, -0.08f, -1.24f);
        pathBuilder4.curveToRelative(-3.67f, -3.05f, -9.02f, -3.07f, -12.7f, -0.06f);
        pathBuilder4.curveTo(4.31f, 5.59f, 4.27f, 6.23f, 4.66f, 6.61f);
        pathBuilder4.curveTo(4.98f, 6.94f, 5.5f, 6.98f, 5.85f, 6.69f);
        pathBuilder4.curveTo(8.86f, 4.21f, 13.25f, 4.21f, 16.26f, 6.69f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19329a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
