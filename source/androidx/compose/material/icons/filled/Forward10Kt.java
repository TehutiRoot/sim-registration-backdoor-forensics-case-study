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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_forward10", "Landroidx/compose/material/icons/Icons$Filled;", "getForward10", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Forward10", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nForward10.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forward10.kt\nandroidx/compose/material/icons/filled/Forward10Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n122#2:79\n116#2,3:80\n119#2,3:84\n132#2,18:87\n152#2:124\n132#2,18:125\n152#2:162\n132#2,18:163\n152#2:200\n174#3:83\n694#4,2:105\n706#4,2:107\n708#4,11:113\n694#4,2:143\n706#4,2:145\n708#4,11:151\n694#4,2:181\n706#4,2:183\n708#4,11:189\n64#5,4:109\n64#5,4:147\n64#5,4:185\n*S KotlinDebug\n*F\n+ 1 Forward10.kt\nandroidx/compose/material/icons/filled/Forward10Kt\n*L\n29#1:79\n29#1:80,3\n29#1:84,3\n30#1:87,18\n30#1:124\n45#1:125,18\n45#1:162\n55#1:163,18\n55#1:200\n29#1:83\n30#1:105,2\n30#1:107,2\n30#1:113,11\n45#1:143,2\n45#1:145,2\n45#1:151,11\n55#1:181,2\n55#1:183,2\n55#1:189,11\n30#1:109,4\n45#1:147,4\n55#1:185,4\n*E\n"})
/* loaded from: classes.dex */
public final class Forward10Kt {

    /* renamed from: a */
    public static ImageVector f15531a;

    @NotNull
    public static final ImageVector getForward10(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f15531a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Forward10", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.lineToRelative(-5.0f, -5.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.86f, 15.94f);
        pathBuilder2.lineToRelative(0.0f, -4.27f);
        pathBuilder2.lineToRelative(-0.09f, 0.0f);
        pathBuilder2.lineToRelative(-1.77f, 0.63f);
        pathBuilder2.lineToRelative(0.0f, 0.69f);
        pathBuilder2.lineToRelative(1.01f, -0.31f);
        pathBuilder2.lineToRelative(0.0f, 3.26f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.25f, 13.44f);
        pathBuilder3.verticalLineToRelative(0.74f);
        pathBuilder3.curveToRelative(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f);
        pathBuilder3.curveToRelative(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f);
        pathBuilder3.verticalLineToRelative(-0.74f);
        pathBuilder3.curveToRelative(0.0f, -1.9f, -1.31f, -1.82f, -1.44f, -1.82f);
        pathBuilder3.curveTo(13.55f, 11.62f, 12.25f, 11.53f, 12.25f, 13.44f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.29f, 13.32f);
        pathBuilder3.verticalLineToRelative(0.97f);
        pathBuilder3.curveToRelative(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f);
        pathBuilder3.curveToRelative(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f);
        pathBuilder3.verticalLineToRelative(-0.97f);
        pathBuilder3.curveToRelative(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f);
        pathBuilder3.curveTo(14.07f, 12.3f, 14.29f, 12.57f, 14.29f, 13.32f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f15531a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
