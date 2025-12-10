package androidx.compose.material.icons.outlined;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_badge", "Landroidx/compose/material/icons/Icons$Outlined;", "getBadge", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Badge", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/icons/outlined/BadgeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n122#2:103\n116#2,3:104\n119#2,3:108\n132#2,18:111\n152#2:148\n132#2,18:149\n152#2:186\n132#2,18:187\n152#2:224\n132#2,18:225\n152#2:262\n132#2,18:263\n152#2:300\n174#3:107\n694#4,2:129\n706#4,2:131\n708#4,11:137\n694#4,2:167\n706#4,2:169\n708#4,11:175\n694#4,2:205\n706#4,2:207\n708#4,11:213\n694#4,2:243\n706#4,2:245\n708#4,11:251\n694#4,2:281\n706#4,2:283\n708#4,11:289\n64#5,4:133\n64#5,4:171\n64#5,4:209\n64#5,4:247\n64#5,4:285\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/icons/outlined/BadgeKt\n*L\n29#1:103\n29#1:104,3\n29#1:108,3\n30#1:111,18\n30#1:148\n37#1:149,18\n37#1:186\n44#1:187,18\n44#1:224\n80#1:225,18\n80#1:262\n86#1:263,18\n86#1:300\n29#1:107\n30#1:129,2\n30#1:131,2\n30#1:137,11\n37#1:167,2\n37#1:169,2\n37#1:175,11\n44#1:205,2\n44#1:207,2\n44#1:213,11\n80#1:243,2\n80#1:245,2\n80#1:251,11\n86#1:281,2\n86#1:283,2\n86#1:289,11\n30#1:133,4\n37#1:171,4\n44#1:209,4\n80#1:247,4\n86#1:285,4\n*E\n"})
/* loaded from: classes.dex */
public final class BadgeKt {

    /* renamed from: a */
    public static ImageVector f17046a;

    @NotNull
    public static final ImageVector getBadge(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f17046a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Badge", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.0f, 15.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(1.5f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 7.0f);
        pathBuilder3.horizontalLineToRelative(-5.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        pathBuilder3.verticalLineToRelative(11.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineTo(9.0f);
        pathBuilder3.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.0f, 7.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineTo(7.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(20.0f, 20.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.verticalLineTo(9.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(5.0f);
        pathBuilder3.verticalLineTo(20.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(9.0f, 13.5f);
        pathBuilder4.moveToRelative(-1.5f, 0.0f);
        pathBuilder4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder4.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw5 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk85 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(11.08f, 16.18f);
        pathBuilder5.curveTo(10.44f, 15.9f, 9.74f, 15.75f, 9.0f, 15.75f);
        pathBuilder5.reflectiveCurveToRelative(-1.44f, 0.15f, -2.08f, 0.43f);
        pathBuilder5.curveTo(6.36f, 16.42f, 6.0f, 16.96f, 6.0f, 17.57f);
        pathBuilder5.verticalLineTo(18.0f);
        pathBuilder5.horizontalLineToRelative(6.0f);
        pathBuilder5.verticalLineToRelative(-0.43f);
        pathBuilder5.curveTo(12.0f, 16.96f, 11.64f, 16.42f, 11.08f, 16.18f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw5, m72053getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f17046a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
