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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_bedroomParent", "Landroidx/compose/material/icons/Icons$Rounded;", "getBedroomParent", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "BedroomParent", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBedroomParent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BedroomParent.kt\nandroidx/compose/material/icons/rounded/BedroomParentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n122#2:95\n116#2,3:96\n119#2,3:100\n132#2,18:103\n152#2:140\n132#2,18:141\n152#2:178\n132#2,18:179\n152#2:216\n132#2,18:217\n152#2:254\n174#3:99\n694#4,2:121\n706#4,2:123\n708#4,11:129\n694#4,2:159\n706#4,2:161\n708#4,11:167\n694#4,2:197\n706#4,2:199\n708#4,11:205\n694#4,2:235\n706#4,2:237\n708#4,11:243\n64#5,4:125\n64#5,4:163\n64#5,4:201\n64#5,4:239\n*S KotlinDebug\n*F\n+ 1 BedroomParent.kt\nandroidx/compose/material/icons/rounded/BedroomParentKt\n*L\n29#1:95\n29#1:96,3\n29#1:100,3\n30#1:103,18\n30#1:140\n40#1:141,18\n40#1:178\n47#1:179,18\n47#1:216\n54#1:217,18\n54#1:254\n29#1:99\n30#1:121,2\n30#1:123,2\n30#1:129,11\n40#1:159,2\n40#1:161,2\n40#1:167,11\n47#1:197,2\n47#1:199,2\n47#1:205,11\n54#1:235,2\n54#1:237,2\n54#1:243,11\n30#1:125,4\n40#1:163,4\n47#1:201,4\n54#1:239,4\n*E\n"})
/* loaded from: classes.dex */
public final class BedroomParentKt {

    /* renamed from: a */
    public static ImageVector f19204a;

    @NotNull
    public static final ImageVector getBedroomParent(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19204a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BedroomParent", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 12.0f);
        pathBuilder.horizontalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveTo(17.5f, 12.45f, 17.05f, 12.0f, 16.5f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.25f, 8.5f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.75f, 8.5f);
        pathBuilder3.horizontalLineToRelative(4.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(-4.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(20.0f, 2.0f);
        pathBuilder4.horizontalLineTo(4.0f);
        pathBuilder4.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder4.verticalLineToRelative(16.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder4.horizontalLineToRelative(16.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder4.verticalLineTo(4.0f);
        pathBuilder4.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(18.25f, 17.0f);
        pathBuilder4.lineTo(18.25f, 17.0f);
        pathBuilder4.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder4.verticalLineTo(15.5f);
        pathBuilder4.horizontalLineToRelative(-11.0f);
        pathBuilder4.verticalLineToRelative(0.75f);
        pathBuilder4.curveTo(6.5f, 16.66f, 6.16f, 17.0f, 5.75f, 17.0f);
        pathBuilder4.horizontalLineToRelative(0.0f);
        pathBuilder4.curveTo(5.34f, 17.0f, 5.0f, 16.66f, 5.0f, 16.25f);
        pathBuilder4.verticalLineToRelative(-3.08f);
        pathBuilder4.curveToRelative(0.0f, -0.66f, 0.25f, -1.26f, 0.65f, -1.72f);
        pathBuilder4.verticalLineTo(9.0f);
        pathBuilder4.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder4.horizontalLineTo(11.0f);
        pathBuilder4.curveToRelative(0.37f, 0.0f, 0.72f, 0.12f, 1.0f, 0.32f);
        pathBuilder4.curveTo(12.28f, 7.12f, 12.63f, 7.0f, 13.0f, 7.0f);
        pathBuilder4.horizontalLineToRelative(3.35f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder4.verticalLineToRelative(2.45f);
        pathBuilder4.curveToRelative(0.4f, 0.46f, 0.65f, 1.06f, 0.65f, 1.72f);
        pathBuilder4.verticalLineToRelative(3.08f);
        pathBuilder4.curveTo(19.0f, 16.66f, 18.66f, 17.0f, 18.25f, 17.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19204a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
