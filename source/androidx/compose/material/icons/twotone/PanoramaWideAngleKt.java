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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_panoramaWideAngle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPanoramaWideAngle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaWideAngle", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPanoramaWideAngle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/twotone/PanoramaWideAngleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n122#2:78\n116#2,3:79\n119#2,3:83\n132#2,18:86\n152#2:123\n132#2,18:124\n152#2:161\n174#3:82\n694#4,2:104\n706#4,2:106\n708#4,11:112\n694#4,2:142\n706#4,2:144\n708#4,11:150\n64#5,4:108\n64#5,4:146\n*S KotlinDebug\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/twotone/PanoramaWideAngleKt\n*L\n29#1:78\n29#1:79,3\n29#1:83,3\n30#1:86,18\n30#1:123\n42#1:124,18\n42#1:161\n29#1:82\n30#1:104,2\n30#1:106,2\n30#1:112,11\n42#1:142,2\n42#1:144,2\n42#1:150,11\n30#1:108,4\n42#1:146,4\n*E\n"})
/* loaded from: classes.dex */
public final class PanoramaWideAngleKt {

    /* renamed from: a */
    public static ImageVector f24565a;

    @NotNull
    public static final ImageVector getPanoramaWideAngle(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24565a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanoramaWideAngle", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-2.45f, 0.0f, -4.71f, 0.2f, -7.29f, 0.64f);
        pathBuilder.curveTo(4.24f, 8.42f, 4.0f, 10.22f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.78f, 0.24f, 3.58f, 0.71f, 5.36f);
        pathBuilder.curveToRelative(2.58f, 0.44f, 4.84f, 0.64f, 7.29f, 0.64f);
        pathBuilder.reflectiveCurveToRelative(4.71f, -0.2f, 7.29f, -0.64f);
        pathBuilder.curveToRelative(0.47f, -1.78f, 0.71f, -3.58f, 0.71f, -5.36f);
        pathBuilder.curveToRelative(0.0f, -1.78f, -0.24f, -3.58f, -0.71f, -5.36f);
        pathBuilder.curveTo(16.71f, 6.2f, 14.45f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.13f, 5.78f);
        pathBuilder2.lineToRelative(-0.25f, -0.89f);
        pathBuilder2.lineToRelative(-0.93f, -0.16f);
        pathBuilder2.curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(-5.22f, 0.24f, -7.95f, 0.72f);
        pathBuilder2.lineToRelative(-0.93f, 0.16f);
        pathBuilder2.lineToRelative(-0.25f, 0.9f);
        pathBuilder2.curveTo(2.29f, 7.85f, 2.0f, 9.93f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(0.29f, 4.15f, 0.87f, 6.22f);
        pathBuilder2.lineToRelative(0.25f, 0.89f);
        pathBuilder2.lineToRelative(0.93f, 0.16f);
        pathBuilder2.curveToRelative(2.73f, 0.49f, 5.22f, 0.73f, 7.95f, 0.73f);
        pathBuilder2.reflectiveCurveToRelative(5.22f, -0.24f, 7.95f, -0.72f);
        pathBuilder2.lineToRelative(0.93f, -0.16f);
        pathBuilder2.lineToRelative(0.25f, -0.89f);
        pathBuilder2.curveToRelative(0.58f, -2.08f, 0.87f, -4.16f, 0.87f, -6.23f);
        pathBuilder2.reflectiveCurveToRelative(-0.29f, -4.15f, -0.87f, -6.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.29f, 17.36f);
        pathBuilder2.curveToRelative(-2.58f, 0.44f, -4.84f, 0.64f, -7.29f, 0.64f);
        pathBuilder2.reflectiveCurveToRelative(-4.71f, -0.2f, -7.29f, -0.64f);
        pathBuilder2.curveTo(4.24f, 15.58f, 4.0f, 13.78f, 4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.78f, 0.24f, -3.58f, 0.71f, -5.36f);
        pathBuilder2.curveTo(7.29f, 6.2f, 9.55f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(4.71f, 0.2f, 7.29f, 0.64f);
        pathBuilder2.curveToRelative(0.47f, 1.78f, 0.71f, 3.58f, 0.71f, 5.36f);
        pathBuilder2.curveToRelative(0.0f, 1.78f, -0.24f, 3.58f, -0.71f, 5.36f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24565a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
