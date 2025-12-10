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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_hvac", "Landroidx/compose/material/icons/Icons$Filled;", "getHvac", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Hvac", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHvac.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hvac.kt\nandroidx/compose/material/icons/filled/HvacKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n122#2:84\n116#2,3:85\n119#2,3:89\n132#2,18:92\n152#2:129\n132#2,18:130\n152#2:167\n132#2,18:168\n152#2:205\n132#2,18:206\n152#2:243\n132#2,18:244\n152#2:281\n174#3:88\n694#4,2:110\n706#4,2:112\n708#4,11:118\n694#4,2:148\n706#4,2:150\n708#4,11:156\n694#4,2:186\n706#4,2:188\n708#4,11:194\n694#4,2:224\n706#4,2:226\n708#4,11:232\n694#4,2:262\n706#4,2:264\n708#4,11:270\n64#5,4:114\n64#5,4:152\n64#5,4:190\n64#5,4:228\n64#5,4:266\n*S KotlinDebug\n*F\n+ 1 Hvac.kt\nandroidx/compose/material/icons/filled/HvacKt\n*L\n29#1:84\n29#1:85,3\n29#1:89,3\n30#1:92,18\n30#1:129\n37#1:130,18\n37#1:167\n45#1:168,18\n45#1:205\n52#1:206,18\n52#1:243\n60#1:244,18\n60#1:281\n29#1:88\n30#1:110,2\n30#1:112,2\n30#1:118,11\n37#1:148,2\n37#1:150,2\n37#1:156,11\n45#1:186,2\n45#1:188,2\n45#1:194,11\n52#1:224,2\n52#1:226,2\n52#1:232,11\n60#1:262,2\n60#1:264,2\n60#1:270,11\n30#1:114,4\n37#1:152,4\n45#1:190,4\n52#1:228,4\n60#1:266,4\n*E\n"})
/* loaded from: classes.dex */
public final class HvacKt {

    /* renamed from: a */
    public static ImageVector f15657a;

    @NotNull
    public static final ImageVector getHvac(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f15657a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Hvac", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(1.01f, 0.0f, 1.91f, -0.39f, 2.62f, -1.0f);
        pathBuilder.horizontalLineTo(9.38f);
        pathBuilder.curveTo(10.09f, 15.61f, 10.99f, 16.0f, 12.0f, 16.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.56f, 14.0f);
        pathBuilder2.horizontalLineToRelative(6.89f);
        pathBuilder2.curveToRelative(0.26f, -0.45f, 0.44f, -0.96f, 0.51f, -1.5f);
        pathBuilder2.horizontalLineToRelative(-7.9f);
        pathBuilder2.curveTo(8.12f, 13.04f, 8.29f, 13.55f, 8.56f, 14.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 8.0f);
        pathBuilder3.curveToRelative(-1.01f, 0.0f, -1.91f, 0.39f, -2.62f, 1.0f);
        pathBuilder3.horizontalLineToRelative(5.24f);
        pathBuilder3.curveTo(13.91f, 8.39f, 13.01f, 8.0f, 12.0f, 8.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.56f, 10.0f);
        pathBuilder4.curveToRelative(-0.26f, 0.45f, -0.44f, 0.96f, -0.51f, 1.5f);
        pathBuilder4.horizontalLineToRelative(7.9f);
        pathBuilder4.curveToRelative(-0.07f, -0.54f, -0.24f, -1.05f, -0.51f, -1.5f);
        pathBuilder4.horizontalLineTo(8.56f);
        pathBuilder4.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw5 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk85 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(19.0f, 3.0f);
        pathBuilder5.horizontalLineTo(5.0f);
        pathBuilder5.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder5.verticalLineToRelative(14.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(14.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(12.0f, 18.0f);
        pathBuilder5.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder5.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder5.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder5.reflectiveCurveTo(15.31f, 18.0f, 12.0f, 18.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw5, m72053getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f15657a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
