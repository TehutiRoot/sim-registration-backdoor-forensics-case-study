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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_sportsBaseball", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSportsBaseball", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsBaseball", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportsBaseball.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsBaseball.kt\nandroidx/compose/material/icons/twotone/SportsBaseballKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n122#2:94\n116#2,3:95\n119#2,3:99\n132#2,18:102\n152#2:139\n132#2,18:140\n152#2:177\n132#2,18:178\n152#2:215\n132#2,18:216\n152#2:253\n174#3:98\n694#4,2:120\n706#4,2:122\n708#4,11:128\n694#4,2:158\n706#4,2:160\n708#4,11:166\n694#4,2:196\n706#4,2:198\n708#4,11:204\n694#4,2:234\n706#4,2:236\n708#4,11:242\n64#5,4:124\n64#5,4:162\n64#5,4:200\n64#5,4:238\n*S KotlinDebug\n*F\n+ 1 SportsBaseball.kt\nandroidx/compose/material/icons/twotone/SportsBaseballKt\n*L\n29#1:94\n29#1:95,3\n29#1:99,3\n30#1:102,18\n30#1:139\n38#1:140,18\n38#1:177\n50#1:178,18\n50#1:215\n58#1:216,18\n58#1:253\n29#1:98\n30#1:120,2\n30#1:122,2\n30#1:128,11\n38#1:158,2\n38#1:160,2\n38#1:166,11\n50#1:196,2\n50#1:198,2\n50#1:204,11\n58#1:234,2\n58#1:236,2\n58#1:242,11\n30#1:124,4\n38#1:162,4\n50#1:200,4\n58#1:238,4\n*E\n"})
/* loaded from: classes.dex */
public final class SportsBaseballKt {

    /* renamed from: a */
    public static ImageVector f24992a;

    @NotNull
    public static final ImageVector getSportsBaseball(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24992a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SportsBaseball", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.61f, 7.22f);
        pathBuilder.curveTo(4.6f, 8.55f, 4.0f, 10.2f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.6f, 3.45f, 1.61f, 4.78f);
        pathBuilder.curveTo(7.06f, 15.69f, 8.0f, 13.95f, 8.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(7.06f, 8.31f, 5.61f, 7.22f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -2.52f, 1.17f, -4.77f, 3.0f, -6.24f);
        pathBuilder2.curveTo(15.63f, 4.66f, 13.89f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.reflectiveCurveTo(8.37f, 4.66f, 7.0f, 5.76f);
        pathBuilder2.curveToRelative(1.83f, 1.47f, 3.0f, 3.71f, 3.0f, 6.24f);
        pathBuilder2.reflectiveCurveToRelative(-1.17f, 4.77f, -3.0f, 6.24f);
        pathBuilder2.curveToRelative(1.37f, 1.1f, 3.11f, 1.76f, 5.0f, 1.76f);
        pathBuilder2.reflectiveCurveToRelative(3.63f, -0.66f, 5.0f, -1.76f);
        pathBuilder2.curveTo(15.17f, 16.77f, 14.0f, 14.52f, 14.0f, 12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.39f, 7.22f);
        pathBuilder3.curveTo(16.94f, 8.31f, 16.0f, 10.05f, 16.0f, 12.0f);
        pathBuilder3.reflectiveCurveToRelative(0.94f, 3.69f, 2.39f, 4.78f);
        pathBuilder3.curveTo(19.4f, 15.45f, 20.0f, 13.8f, 20.0f, 12.0f);
        pathBuilder3.reflectiveCurveTo(19.4f, 8.55f, 18.39f, 7.22f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 2.0f);
        pathBuilder4.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder4.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder4.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder4.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(5.61f, 16.78f);
        pathBuilder4.curveTo(4.6f, 15.45f, 4.0f, 13.8f, 4.0f, 12.0f);
        pathBuilder4.reflectiveCurveToRelative(0.6f, -3.45f, 1.61f, -4.78f);
        pathBuilder4.curveTo(7.06f, 8.31f, 8.0f, 10.05f, 8.0f, 12.0f);
        pathBuilder4.reflectiveCurveTo(7.06f, 15.69f, 5.61f, 16.78f);
        pathBuilder4.close();
        pathBuilder4.moveTo(12.0f, 20.0f);
        pathBuilder4.curveToRelative(-1.89f, 0.0f, -3.63f, -0.66f, -5.0f, -1.76f);
        pathBuilder4.curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.24f);
        pathBuilder4.reflectiveCurveTo(8.83f, 7.23f, 7.0f, 5.76f);
        pathBuilder4.curveTo(8.37f, 4.66f, 10.11f, 4.0f, 12.0f, 4.0f);
        pathBuilder4.reflectiveCurveToRelative(3.63f, 0.66f, 5.0f, 1.76f);
        pathBuilder4.curveToRelative(-1.83f, 1.47f, -3.0f, 3.71f, -3.0f, 6.24f);
        pathBuilder4.reflectiveCurveToRelative(1.17f, 4.77f, 3.0f, 6.24f);
        pathBuilder4.curveTo(15.63f, 19.34f, 13.89f, 20.0f, 12.0f, 20.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.39f, 16.78f);
        pathBuilder4.curveTo(16.94f, 15.69f, 16.0f, 13.95f, 16.0f, 12.0f);
        pathBuilder4.reflectiveCurveToRelative(0.94f, -3.69f, 2.39f, -4.78f);
        pathBuilder4.curveTo(19.4f, 8.55f, 20.0f, 10.2f, 20.0f, 12.0f);
        pathBuilder4.reflectiveCurveTo(19.4f, 15.45f, 18.39f, 16.78f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24992a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
