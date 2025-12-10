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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_wifiCalling", "Landroidx/compose/material/icons/Icons$TwoTone;", "getWifiCalling", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiCalling", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWifiCalling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiCalling.kt\nandroidx/compose/material/icons/twotone/WifiCallingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n122#2:91\n116#2,3:92\n119#2,3:96\n132#2,18:99\n152#2:136\n132#2,18:137\n152#2:174\n132#2,18:175\n152#2:212\n132#2,18:213\n152#2:250\n174#3:95\n694#4,2:117\n706#4,2:119\n708#4,11:125\n694#4,2:155\n706#4,2:157\n708#4,11:163\n694#4,2:193\n706#4,2:195\n708#4,11:201\n694#4,2:231\n706#4,2:233\n708#4,11:239\n64#5,4:121\n64#5,4:159\n64#5,4:197\n64#5,4:235\n*S KotlinDebug\n*F\n+ 1 WifiCalling.kt\nandroidx/compose/material/icons/twotone/WifiCallingKt\n*L\n29#1:91\n29#1:92,3\n29#1:96,3\n30#1:99,18\n30#1:136\n38#1:137,18\n38#1:174\n46#1:175,18\n46#1:212\n77#1:213,18\n77#1:250\n29#1:95\n30#1:117,2\n30#1:119,2\n30#1:125,11\n38#1:155,2\n38#1:157,2\n38#1:163,11\n46#1:193,2\n46#1:195,2\n46#1:201,11\n77#1:231,2\n77#1:233,2\n77#1:239,11\n30#1:121,4\n38#1:159,4\n46#1:197,4\n77#1:235,4\n*E\n"})
/* loaded from: classes.dex */
public final class WifiCallingKt {

    /* renamed from: a */
    public static ImageVector f25323a;

    @NotNull
    public static final ImageVector getWifiCalling(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25323a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WifiCalling", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.2f, 18.21f);
        pathBuilder.curveToRelative(1.2f, 0.41f, 2.48f, 0.67f, 3.8f, 0.75f);
        pathBuilder.verticalLineToRelative(-1.49f);
        pathBuilder.curveToRelative(-0.88f, -0.07f, -1.75f, -0.22f, -2.6f, -0.45f);
        pathBuilder.lineTo(15.2f, 18.21f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.54f, 5.0f);
        pathBuilder2.horizontalLineToRelative(-1.5f);
        pathBuilder2.curveToRelative(0.09f, 1.32f, 0.35f, 2.59f, 0.75f, 3.8f);
        pathBuilder2.lineToRelative(1.2f, -1.2f);
        pathBuilder2.curveTo(6.75f, 6.76f, 6.6f, 5.89f, 6.54f, 5.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 15.51f);
        pathBuilder3.curveToRelative(-1.24f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        pathBuilder3.curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f);
        pathBuilder3.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        pathBuilder3.lineToRelative(-2.2f, 2.2f);
        pathBuilder3.curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f);
        pathBuilder3.lineToRelative(2.2f, -2.2f);
        pathBuilder3.curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f);
        pathBuilder3.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        pathBuilder3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.curveTo(3.45f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f);
        pathBuilder3.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(-3.49f);
        pathBuilder3.curveTo(21.0f, 15.96f, 20.55f, 15.51f, 20.0f, 15.51f);
        pathBuilder3.close();
        pathBuilder3.moveTo(5.03f, 5.0f);
        pathBuilder3.horizontalLineToRelative(1.5f);
        pathBuilder3.curveTo(6.6f, 5.89f, 6.75f, 6.76f, 6.99f, 7.59f);
        pathBuilder3.lineToRelative(-1.2f, 1.2f);
        pathBuilder3.curveTo(5.38f, 7.59f, 5.12f, 6.32f, 5.03f, 5.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 18.97f);
        pathBuilder3.curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f);
        pathBuilder3.lineToRelative(1.19f, -1.19f);
        pathBuilder3.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        pathBuilder3.verticalLineTo(18.97f);
        pathBuilder3.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw4 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk84 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(22.0f, 4.95f);
        pathBuilder4.curveTo(21.79f, 4.78f, 19.67f, 3.0f, 16.5f, 3.0f);
        pathBuilder4.curveToRelative(-3.18f, 0.0f, -5.29f, 1.78f, -5.5f, 1.95f);
        pathBuilder4.lineTo(16.5f, 12.0f);
        pathBuilder4.lineTo(22.0f, 4.95f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw4, m72053getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25323a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
