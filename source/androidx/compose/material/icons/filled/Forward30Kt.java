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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_forward30", "Landroidx/compose/material/icons/Icons$Filled;", "getForward30", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Forward30", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nForward30.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forward30.kt\nandroidx/compose/material/icons/filled/Forward30Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n122#2:90\n116#2,3:91\n119#2,3:95\n132#2,18:98\n152#2:135\n132#2,18:136\n152#2:173\n132#2,18:174\n152#2:211\n174#3:94\n694#4,2:116\n706#4,2:118\n708#4,11:124\n694#4,2:154\n706#4,2:156\n708#4,11:162\n694#4,2:192\n706#4,2:194\n708#4,11:200\n64#5,4:120\n64#5,4:158\n64#5,4:196\n*S KotlinDebug\n*F\n+ 1 Forward30.kt\nandroidx/compose/material/icons/filled/Forward30Kt\n*L\n29#1:90\n29#1:91,3\n29#1:95,3\n30#1:98,18\n30#1:135\n45#1:136,18\n45#1:173\n66#1:174,18\n66#1:211\n29#1:94\n30#1:116,2\n30#1:118,2\n30#1:124,11\n45#1:154,2\n45#1:156,2\n45#1:162,11\n66#1:192,2\n66#1:194,2\n66#1:200,11\n30#1:120,4\n45#1:158,4\n66#1:196,4\n*E\n"})
/* loaded from: classes.dex */
public final class Forward30Kt {

    /* renamed from: a */
    public static ImageVector f15532a;

    @NotNull
    public static final ImageVector getForward30(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f15532a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Forward30", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        pathBuilder2.moveTo(10.06f, 15.38f);
        pathBuilder2.curveToRelative(-0.29f, 0.0f, -0.62f, -0.17f, -0.62f, -0.54f);
        pathBuilder2.horizontalLineTo(8.59f);
        pathBuilder2.curveToRelative(0.0f, 0.97f, 0.9f, 1.23f, 1.45f, 1.23f);
        pathBuilder2.curveToRelative(0.87f, 0.0f, 1.51f, -0.46f, 1.51f, -1.25f);
        pathBuilder2.curveToRelative(0.0f, -0.66f, -0.45f, -0.9f, -0.71f, -1.0f);
        pathBuilder2.curveToRelative(0.11f, -0.05f, 0.65f, -0.32f, 0.65f, -0.92f);
        pathBuilder2.curveToRelative(0.0f, -0.21f, -0.05f, -1.22f, -1.44f, -1.22f);
        pathBuilder2.curveToRelative(-0.62f, 0.0f, -1.4f, 0.35f, -1.4f, 1.16f);
        pathBuilder2.horizontalLineToRelative(0.85f);
        pathBuilder2.curveToRelative(0.0f, -0.34f, 0.31f, -0.48f, 0.57f, -0.48f);
        pathBuilder2.curveToRelative(0.59f, 0.0f, 0.58f, 0.5f, 0.58f, 0.54f);
        pathBuilder2.curveToRelative(0.0f, 0.52f, -0.41f, 0.59f, -0.63f, 0.59f);
        pathBuilder2.horizontalLineTo(9.56f);
        pathBuilder2.verticalLineToRelative(0.66f);
        pathBuilder2.horizontalLineToRelative(0.45f);
        pathBuilder2.curveToRelative(0.65f, 0.0f, 0.7f, 0.42f, 0.7f, 0.64f);
        pathBuilder2.curveTo(10.71f, 15.11f, 10.5f, 15.38f, 10.06f, 15.38f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(13.85f, 11.68f);
        pathBuilder3.curveToRelative(-0.14f, 0.0f, -1.44f, -0.08f, -1.44f, 1.82f);
        pathBuilder3.verticalLineToRelative(0.74f);
        pathBuilder3.curveToRelative(0.0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f);
        pathBuilder3.curveToRelative(0.14f, 0.0f, 1.44f, 0.09f, 1.44f, -1.82f);
        pathBuilder3.verticalLineTo(13.5f);
        pathBuilder3.curveTo(15.3f, 11.59f, 13.99f, 11.68f, 13.85f, 11.68f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.45f, 14.35f);
        pathBuilder3.curveToRelative(0.0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f);
        pathBuilder3.curveToRelative(-0.38f, 0.0f, -0.6f, -0.26f, -0.6f, -1.03f);
        pathBuilder3.verticalLineToRelative(-0.97f);
        pathBuilder3.curveToRelative(0.0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f);
        pathBuilder3.curveToRelative(0.38f, 0.0f, 0.6f, 0.26f, 0.6f, 1.01f);
        pathBuilder3.verticalLineTo(14.35f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f15532a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
