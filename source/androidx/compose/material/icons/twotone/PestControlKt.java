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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_pestControl", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPestControl", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "PestControl", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPestControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/twotone/PestControlKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n122#2:116\n116#2,3:117\n119#2,3:121\n132#2,18:124\n152#2:161\n132#2,18:162\n152#2:199\n132#2,18:200\n152#2:237\n132#2,18:238\n152#2:275\n174#3:120\n694#4,2:142\n706#4,2:144\n708#4,11:150\n694#4,2:180\n706#4,2:182\n708#4,11:188\n694#4,2:218\n706#4,2:220\n708#4,11:226\n694#4,2:256\n706#4,2:258\n708#4,11:264\n64#5,4:146\n64#5,4:184\n64#5,4:222\n64#5,4:260\n*S KotlinDebug\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/twotone/PestControlKt\n*L\n29#1:116\n29#1:117,3\n29#1:121,3\n30#1:124,18\n30#1:161\n44#1:162,18\n44#1:199\n52#1:200,18\n52#1:237\n103#1:238,18\n103#1:275\n29#1:120\n30#1:142,2\n30#1:144,2\n30#1:150,11\n44#1:180,2\n44#1:182,2\n44#1:188,11\n52#1:218,2\n52#1:220,2\n52#1:226,11\n103#1:256,2\n103#1:258,2\n103#1:264,11\n30#1:146,4\n44#1:184,4\n52#1:222,4\n103#1:260,4\n*E\n"})
/* loaded from: classes.dex */
public final class PestControlKt {

    /* renamed from: a */
    public static ImageVector f24612a;

    @NotNull
    public static final ImageVector getPestControl(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24612a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PestControl", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 2.24f, -4.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 5.0f, 4.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -2.24f, 4.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(14.21f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.88f, 7.36f);
        pathBuilder2.curveTo(13.62f, 6.57f, 12.88f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.62f, 0.57f, -1.88f, 1.36f);
        pathBuilder2.curveTo(10.71f, 7.13f, 11.34f, 7.0f, 12.0f, 7.0f);
        pathBuilder2.reflectiveCurveTo(13.29f, 7.13f, 13.88f, 7.36f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.0f, 15.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(-3.07f);
        pathBuilder3.curveToRelative(-0.05f, -0.39f, -0.12f, -0.77f, -0.22f, -1.14f);
        pathBuilder3.lineToRelative(2.58f, -1.49f);
        pathBuilder3.lineToRelative(-1.0f, -1.73f);
        pathBuilder3.lineTo(16.92f, 10.0f);
        pathBuilder3.curveToRelative(-0.28f, -0.48f, -0.62f, -0.91f, -0.99f, -1.29f);
        pathBuilder3.curveToRelative(0.1f, -0.56f, 0.2f, -1.69f, -0.58f, -2.89f);
        pathBuilder3.lineTo(17.0f, 4.17f);
        pathBuilder3.lineToRelative(-1.41f, -1.41f);
        pathBuilder3.lineToRelative(-1.72f, 1.72f);
        pathBuilder3.curveToRelative(-1.68f, -0.89f, -3.1f, -0.33f, -3.73f, 0.0f);
        pathBuilder3.lineTo(8.41f, 2.76f);
        pathBuilder3.lineTo(7.0f, 4.17f);
        pathBuilder3.lineToRelative(1.65f, 1.65f);
        pathBuilder3.curveToRelative(-0.78f, 1.2f, -0.68f, 2.34f, -0.58f, 2.89f);
        pathBuilder3.curveTo(7.7f, 9.1f, 7.36f, 9.53f, 7.08f, 10.0f);
        pathBuilder3.lineTo(4.71f, 8.63f);
        pathBuilder3.lineToRelative(-1.0f, 1.73f);
        pathBuilder3.lineToRelative(2.58f, 1.49f);
        pathBuilder3.curveToRelative(-0.1f, 0.37f, -0.17f, 0.75f, -0.22f, 1.14f);
        pathBuilder3.horizontalLineTo(3.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(3.07f);
        pathBuilder3.curveToRelative(0.05f, 0.39f, 0.12f, 0.77f, 0.22f, 1.14f);
        pathBuilder3.lineToRelative(-2.58f, 1.49f);
        pathBuilder3.lineToRelative(1.0f, 1.73f);
        pathBuilder3.lineTo(7.08f, 18.0f);
        pathBuilder3.curveToRelative(1.08f, 1.81f, 2.88f, 3.0f, 4.92f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.84f, -1.19f, 4.92f, -3.0f);
        pathBuilder3.lineToRelative(2.37f, 1.37f);
        pathBuilder3.lineToRelative(1.0f, -1.73f);
        pathBuilder3.lineToRelative(-2.58f, -1.49f);
        pathBuilder3.curveToRelative(0.1f, -0.37f, 0.17f, -0.75f, 0.22f, -1.14f);
        pathBuilder3.horizontalLineTo(21.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 6.0f);
        pathBuilder3.curveToRelative(0.88f, 0.0f, 1.62f, 0.57f, 1.88f, 1.36f);
        pathBuilder3.curveTo(13.29f, 7.13f, 12.66f, 7.0f, 12.0f, 7.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.29f, 0.13f, -1.88f, 0.36f);
        pathBuilder3.curveTo(10.38f, 6.57f, 11.12f, 6.0f, 12.0f, 6.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 19.0f);
        pathBuilder3.curveToRelative(-2.21f, 0.0f, -4.0f, -2.24f, -4.0f, -5.0f);
        pathBuilder3.reflectiveCurveToRelative(1.79f, -5.0f, 4.0f, -5.0f);
        pathBuilder3.reflectiveCurveToRelative(4.0f, 2.24f, 4.0f, 5.0f);
        pathBuilder3.reflectiveCurveTo(14.21f, 19.0f, 12.0f, 19.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(11.0f, 11.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(6.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24612a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
