package androidx.compose.material.icons.twotone;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_electricRickshaw", "Landroidx/compose/material/icons/Icons$TwoTone;", "getElectricRickshaw", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricRickshaw", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nElectricRickshaw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricRickshaw.kt\nandroidx/compose/material/icons/twotone/ElectricRickshawKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,130:1\n122#2:131\n116#2,3:132\n119#2,3:136\n132#2,18:139\n152#2:176\n132#2,18:177\n152#2:214\n132#2,18:215\n152#2:252\n132#2,18:253\n152#2:290\n174#3:135\n694#4,2:157\n706#4,2:159\n708#4,11:165\n694#4,2:195\n706#4,2:197\n708#4,11:203\n694#4,2:233\n706#4,2:235\n708#4,11:241\n694#4,2:271\n706#4,2:273\n708#4,11:279\n64#5,4:161\n64#5,4:199\n64#5,4:237\n64#5,4:275\n*S KotlinDebug\n*F\n+ 1 ElectricRickshaw.kt\nandroidx/compose/material/icons/twotone/ElectricRickshawKt\n*L\n29#1:131\n29#1:132,3\n29#1:136,3\n30#1:139,18\n30#1:176\n40#1:177,18\n40#1:214\n49#1:215,18\n49#1:252\n116#1:253,18\n116#1:290\n29#1:135\n30#1:157,2\n30#1:159,2\n30#1:165,11\n40#1:195,2\n40#1:197,2\n40#1:203,11\n49#1:233,2\n49#1:235,2\n49#1:241,11\n116#1:271,2\n116#1:273,2\n116#1:279,11\n30#1:161,4\n40#1:199,4\n49#1:237,4\n116#1:275,4\n*E\n"})
/* loaded from: classes.dex */
public final class ElectricRickshawKt {

    /* renamed from: a */
    public static ImageVector f23871a;

    @NotNull
    public static final ImageVector getElectricRickshaw(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23871a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ElectricRickshaw", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(0.17f);
        pathBuilder.curveTo(3.58f, 11.84f, 4.7f, 11.0f, 6.0f, 11.0f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 11.0f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(1.17f);
        pathBuilder2.curveToRelative(0.3f, -0.85f, 0.98f, -1.53f, 1.83f, -1.83f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.0f, 11.18f);
        pathBuilder3.verticalLineTo(9.72f);
        pathBuilder3.curveToRelative(0.0f, -0.47f, -0.16f, -0.92f, -0.46f, -1.28f);
        pathBuilder3.lineTo(16.6f, 3.72f);
        pathBuilder3.curveTo(16.22f, 3.26f, 15.66f, 3.0f, 15.06f, 3.0f);
        pathBuilder3.horizontalLineTo(3.0f);
        pathBuilder3.curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f);
        pathBuilder3.verticalLineToRelative(8.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(0.18f);
        pathBuilder3.curveTo(3.6f, 16.16f, 4.7f, 17.0f, 6.0f, 17.0f);
        pathBuilder3.reflectiveCurveToRelative(2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilder3.horizontalLineToRelative(8.37f);
        pathBuilder3.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        pathBuilder3.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder3.curveTo(23.0f, 12.7f, 22.16f, 11.6f, 21.0f, 11.18f);
        pathBuilder3.close();
        pathBuilder3.moveTo(6.0f, 15.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveTo(6.55f, 15.0f, 6.0f, 15.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.0f, 11.17f);
        pathBuilder3.curveTo(6.69f, 11.06f, 6.35f, 11.0f, 6.0f, 11.0f);
        pathBuilder3.curveToRelative(-1.3f, 0.0f, -2.42f, 0.84f, -2.83f, 2.0f);
        pathBuilder3.horizontalLineTo(3.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineTo(11.17f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.0f, 8.0f);
        pathBuilder3.horizontalLineTo(3.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.0f, 13.0f);
        pathBuilder3.horizontalLineTo(9.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.horizontalLineTo(9.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.verticalLineTo(13.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.0f, 6.12f);
        pathBuilder3.lineTo(18.4f, 9.0f);
        pathBuilder3.horizontalLineTo(16.0f);
        pathBuilder3.verticalLineTo(6.12f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.17f, 13.0f);
        pathBuilder3.horizontalLineTo(16.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(3.0f);
        pathBuilder3.verticalLineToRelative(0.17f);
        pathBuilder3.curveTo(18.15f, 11.47f, 17.47f, 12.15f, 17.17f, 13.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.0f, 15.0f);
        pathBuilder3.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder3.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.reflectiveCurveTo(20.55f, 15.0f, 20.0f, 15.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(7.0f, 20.0f);
        pathBuilder4.lineToRelative(4.0f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, -2.0f);
        pathBuilder4.lineToRelative(6.0f, 3.0f);
        pathBuilder4.lineToRelative(-4.0f, 0.0f);
        pathBuilder4.lineToRelative(0.0f, 2.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23871a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
