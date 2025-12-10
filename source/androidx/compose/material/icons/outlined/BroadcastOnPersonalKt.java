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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_broadcastOnPersonal", "Landroidx/compose/material/icons/Icons$Outlined;", "getBroadcastOnPersonal", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "BroadcastOnPersonal", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBroadcastOnPersonal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastOnPersonal.kt\nandroidx/compose/material/icons/outlined/BroadcastOnPersonalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n122#2:89\n116#2,3:90\n119#2,3:94\n132#2,18:97\n152#2:134\n132#2,18:135\n152#2:172\n132#2,18:173\n152#2:210\n132#2,18:211\n152#2:248\n174#3:93\n694#4,2:115\n706#4,2:117\n708#4,11:123\n694#4,2:153\n706#4,2:155\n708#4,11:161\n694#4,2:191\n706#4,2:193\n708#4,11:199\n694#4,2:229\n706#4,2:231\n708#4,11:237\n64#5,4:119\n64#5,4:157\n64#5,4:195\n64#5,4:233\n*S KotlinDebug\n*F\n+ 1 BroadcastOnPersonal.kt\nandroidx/compose/material/icons/outlined/BroadcastOnPersonalKt\n*L\n29#1:89\n29#1:90,3\n29#1:94,3\n30#1:97,18\n30#1:134\n44#1:135,18\n44#1:172\n55#1:173,18\n55#1:210\n69#1:211,18\n69#1:248\n29#1:93\n30#1:115,2\n30#1:117,2\n30#1:123,11\n44#1:153,2\n44#1:155,2\n44#1:161,11\n55#1:191,2\n55#1:193,2\n55#1:199,11\n69#1:229,2\n69#1:231,2\n69#1:237,11\n30#1:119,4\n44#1:157,4\n55#1:195,4\n69#1:233,4\n*E\n"})
/* loaded from: classes.dex */
public final class BroadcastOnPersonalKt {

    /* renamed from: a */
    public static ImageVector f17131a;

    @NotNull
    public static final ImageVector getBroadcastOnPersonal(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f17131a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BroadcastOnPersonal", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.lineToRelative(6.0f, -4.5f);
        pathBuilder.lineToRelative(4.08f, 3.06f);
        pathBuilder.curveToRelative(0.81f, -0.32f, 1.69f, -0.51f, 2.61f, -0.54f);
        pathBuilder.lineTo(10.0f, 3.0f);
        pathBuilder.lineTo(2.0f, 9.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(8.76f);
        pathBuilder.curveToRelative(-0.48f, -0.6f, -0.88f, -1.27f, -1.17f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 14.75f);
        pathBuilder2.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        pathBuilder2.curveToRelative(0.0f, 0.4f, 0.2f, 0.75f, 0.5f, 0.97f);
        pathBuilder2.verticalLineTo(22.0f);
        pathBuilder2.horizontalLineToRelative(1.5f);
        pathBuilder2.verticalLineToRelative(-5.03f);
        pathBuilder2.curveToRelative(0.3f, -0.23f, 0.5f, -0.57f, 0.5f, -0.97f);
        pathBuilder2.curveTo(18.25f, 15.31f, 17.69f, 14.75f, 17.0f, 14.75f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.0f, 12.0f);
        pathBuilder3.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        pathBuilder3.lineToRelative(1.06f, -1.06f);
        pathBuilder3.curveToRelative(-0.45f, -0.45f, -0.73f, -1.08f, -0.73f, -1.77f);
        pathBuilder3.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder3.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder3.curveToRelative(0.0f, 0.69f, -0.28f, 1.31f, -0.73f, 1.76f);
        pathBuilder3.lineToRelative(1.06f, 1.06f);
        pathBuilder3.curveTo(20.55f, 18.1f, 21.0f, 17.1f, 21.0f, 16.0f);
        pathBuilder3.curveTo(21.0f, 13.79f, 19.21f, 12.0f, 17.0f, 12.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.0f, 9.5f);
        pathBuilder4.curveToRelative(-3.59f, 0.0f, -6.5f, 2.91f, -6.5f, 6.5f);
        pathBuilder4.curveToRelative(0.0f, 1.79f, 0.73f, 3.42f, 1.9f, 4.6f);
        pathBuilder4.lineToRelative(1.06f, -1.06f);
        pathBuilder4.curveTo(12.56f, 18.63f, 12.0f, 17.38f, 12.0f, 16.0f);
        pathBuilder4.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder4.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder4.curveToRelative(0.0f, 1.37f, -0.56f, 2.62f, -1.46f, 3.52f);
        pathBuilder4.lineToRelative(1.07f, 1.06f);
        pathBuilder4.curveToRelative(1.17f, -1.18f, 1.89f, -2.8f, 1.89f, -4.58f);
        pathBuilder4.curveTo(23.5f, 12.41f, 20.59f, 9.5f, 17.0f, 9.5f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f17131a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
