package androidx.compose.material.icons.filled;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_carRental", "Landroidx/compose/material/icons/Icons$Filled;", "getCarRental", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "CarRental", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarRental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarRental.kt\nandroidx/compose/material/icons/filled/CarRentalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n122#2:95\n116#2,3:96\n119#2,3:100\n132#2,18:103\n152#2:140\n132#2,18:141\n152#2:178\n174#3:99\n694#4,2:121\n706#4,2:123\n708#4,11:129\n694#4,2:159\n706#4,2:161\n708#4,11:167\n64#5,4:125\n64#5,4:163\n*S KotlinDebug\n*F\n+ 1 CarRental.kt\nandroidx/compose/material/icons/filled/CarRentalKt\n*L\n29#1:95\n29#1:96,3\n29#1:100,3\n30#1:103,18\n30#1:140\n68#1:141,18\n68#1:178\n29#1:99\n30#1:121,2\n30#1:123,2\n30#1:129,11\n68#1:159,2\n68#1:161,2\n68#1:167,11\n30#1:125,4\n68#1:163,4\n*E\n"})
/* loaded from: classes.dex */
public final class CarRentalKt {

    /* renamed from: a */
    public static ImageVector f15049a;

    @NotNull
    public static final ImageVector getCarRental(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f15049a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CarRental", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.39f, 9.0f);
        pathBuilder.horizontalLineTo(7.61f);
        pathBuilder.curveTo(7.18f, 9.0f, 6.8f, 9.28f, 6.66f, 9.68f);
        pathBuilder.lineToRelative(-1.66f, 5.0f);
        pathBuilder.verticalLineToRelative(6.81f);
        pathBuilder.curveTo(5.0f, 21.78f, 5.23f, 22.0f, 5.5f, 22.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveTo(6.78f, 22.0f, 7.0f, 21.78f, 7.0f, 21.5f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-6.81f);
        pathBuilder.lineToRelative(-1.66f, -5.0f);
        pathBuilder.curveTo(17.2f, 9.28f, 16.82f, 9.0f, 16.39f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.78f, 18.0f);
        pathBuilder.curveToRelative(-0.68f, 0.0f, -1.22f, -0.54f, -1.22f, -1.22f);
        pathBuilder.reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f);
        pathBuilder.reflectiveCurveTo(9.0f, 16.11f, 9.0f, 16.78f);
        pathBuilder.reflectiveCurveTo(8.46f, 18.0f, 7.78f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.22f, 18.0f);
        pathBuilder.curveTo(15.55f, 18.0f, 15.0f, 17.46f, 15.0f, 16.78f);
        pathBuilder.reflectiveCurveToRelative(0.54f, -1.22f, 1.22f, -1.22f);
        pathBuilder.reflectiveCurveToRelative(1.22f, 0.54f, 1.22f, 1.22f);
        pathBuilder.reflectiveCurveTo(16.9f, 18.0f, 16.22f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.29f, 14.0f);
        pathBuilder.lineToRelative(1.33f, -4.0f);
        pathBuilder.horizontalLineToRelative(8.78f);
        pathBuilder.lineToRelative(1.33f, 4.0f);
        pathBuilder.horizontalLineTo(6.29f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.83f, 3.0f);
        pathBuilder2.curveTo(10.41f, 1.83f, 9.3f, 1.0f, 8.0f, 1.0f);
        pathBuilder2.curveTo(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.83f, -2.0f);
        pathBuilder2.horizontalLineTo(16.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineTo(3.0f);
        pathBuilder2.horizontalLineTo(10.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.0f, 5.0f);
        pathBuilder2.curveTo(7.45f, 5.0f, 7.0f, 4.55f, 7.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveTo(8.55f, 5.0f, 8.0f, 5.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f15049a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
