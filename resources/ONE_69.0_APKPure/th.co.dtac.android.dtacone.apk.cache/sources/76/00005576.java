package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3623Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_support", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSupport", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Support", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Support.kt\nandroidx/compose/material/icons/twotone/SupportKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n122#2:106\n116#2,3:107\n119#2,3:111\n132#2,18:114\n152#2:151\n132#2,18:152\n152#2:189\n132#2,18:190\n152#2:227\n132#2,18:228\n152#2:265\n132#2,18:266\n152#2:303\n174#3:110\n694#4,2:132\n706#4,2:134\n708#4,11:140\n694#4,2:170\n706#4,2:172\n708#4,11:178\n694#4,2:208\n706#4,2:210\n708#4,11:216\n694#4,2:246\n706#4,2:248\n708#4,11:254\n694#4,2:284\n706#4,2:286\n708#4,11:292\n64#5,4:136\n64#5,4:174\n64#5,4:212\n64#5,4:250\n64#5,4:288\n*S KotlinDebug\n*F\n+ 1 Support.kt\nandroidx/compose/material/icons/twotone/SupportKt\n*L\n29#1:106\n29#1:107,3\n29#1:111,3\n30#1:114,18\n30#1:151\n38#1:152,18\n38#1:189\n46#1:190,18\n46#1:227\n54#1:228,18\n54#1:265\n62#1:266,18\n62#1:303\n29#1:110\n30#1:132,2\n30#1:134,2\n30#1:140,11\n38#1:170,2\n38#1:172,2\n38#1:178,11\n46#1:208,2\n46#1:210,2\n46#1:216,11\n54#1:246,2\n54#1:248,2\n54#1:254,11\n62#1:284,2\n62#1:286,2\n62#1:292,11\n30#1:136,4\n38#1:174,4\n46#1:212,4\n54#1:250,4\n62#1:288,4\n*E\n"})
/* loaded from: classes.dex */
public final class SupportKt {

    /* renamed from: a */
    public static ImageVector f25148a;

    @NotNull
    public static final ImageVector getSupport(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25148a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Support", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.3f, 7.32f);
        pathBuilder.lineTo(9.13f, 4.54f);
        pathBuilder.curveTo(7.02f, 5.35f, 5.35f, 7.02f, 4.54f, 9.13f);
        pathBuilder.lineToRelative(2.78f, 1.15f);
        pathBuilder.curveTo(7.83f, 8.9f, 8.92f, 7.82f, 10.3f, 7.32f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.32f, 13.72f);
        pathBuilder2.lineToRelative(-2.78f, 1.15f);
        pathBuilder2.curveToRelative(0.81f, 2.1f, 2.48f, 3.78f, 4.59f, 4.59f);
        pathBuilder2.lineToRelative(1.17f, -2.78f);
        pathBuilder2.curveTo(8.91f, 16.18f, 7.83f, 15.09f, 7.32f, 13.72f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.67f, 10.27f);
        pathBuilder3.lineToRelative(2.78f, -1.15f);
        pathBuilder3.curveToRelative(-0.81f, -2.1f, -2.48f, -3.77f, -4.58f, -4.58f);
        pathBuilder3.lineToRelative(-1.15f, 2.78f);
        pathBuilder3.curveTo(15.09f, 7.83f, 16.17f, 8.9f, 16.67f, 10.27f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.68f, 13.71f);
        pathBuilder4.curveToRelative(-0.5f, 1.37f, -1.58f, 2.46f, -2.95f, 2.97f);
        pathBuilder4.lineToRelative(1.15f, 2.78f);
        pathBuilder4.curveToRelative(2.1f, -0.81f, 3.77f, -2.48f, 4.58f, -4.58f);
        pathBuilder4.lineTo(16.68f, 13.71f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 2.0f);
        pathBuilder5.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder5.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder5.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(14.87f, 4.54f);
        pathBuilder5.curveToRelative(2.1f, 0.81f, 3.77f, 2.48f, 4.58f, 4.58f);
        pathBuilder5.lineToRelative(-2.78f, 1.15f);
        pathBuilder5.curveToRelative(-0.51f, -1.36f, -1.58f, -2.44f, -2.95f, -2.94f);
        pathBuilder5.lineTo(14.87f, 4.54f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.13f, 4.54f);
        pathBuilder5.lineToRelative(1.17f, 2.78f);
        pathBuilder5.curveToRelative(-1.38f, 0.5f, -2.47f, 1.59f, -2.98f, 2.97f);
        pathBuilder5.lineTo(4.54f, 9.13f);
        pathBuilder5.curveTo(5.35f, 7.02f, 7.02f, 5.35f, 9.13f, 4.54f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.13f, 19.46f);
        pathBuilder5.curveToRelative(-2.1f, -0.81f, -3.78f, -2.48f, -4.59f, -4.59f);
        pathBuilder5.lineToRelative(2.78f, -1.15f);
        pathBuilder5.curveToRelative(0.51f, 1.38f, 1.59f, 2.46f, 2.97f, 2.96f);
        pathBuilder5.lineTo(9.13f, 19.46f);
        pathBuilder5.close();
        pathBuilder5.moveTo(9.0f, 12.0f);
        pathBuilder5.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder5.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder5.reflectiveCurveTo(9.0f, 13.66f, 9.0f, 12.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(14.88f, 19.46f);
        pathBuilder5.lineToRelative(-1.15f, -2.78f);
        pathBuilder5.curveToRelative(1.37f, -0.51f, 2.45f, -1.59f, 2.95f, -2.97f);
        pathBuilder5.lineToRelative(2.78f, 1.17f);
        pathBuilder5.curveTo(18.65f, 16.98f, 16.98f, 18.65f, 14.88f, 19.46f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25148a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}