package androidx.compose.material.icons.rounded;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_landslide", "Landroidx/compose/material/icons/Icons$Rounded;", "getLandslide", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Landslide", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLandslide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/rounded/LandslideKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n122#2:99\n116#2,3:100\n119#2,3:104\n132#2,18:107\n152#2:144\n132#2,18:145\n152#2:182\n132#2,18:183\n152#2:220\n132#2,18:221\n152#2:258\n132#2,18:259\n152#2:296\n174#3:103\n694#4,2:125\n706#4,2:127\n708#4,11:133\n694#4,2:163\n706#4,2:165\n708#4,11:171\n694#4,2:201\n706#4,2:203\n708#4,11:209\n694#4,2:239\n706#4,2:241\n708#4,11:247\n694#4,2:277\n706#4,2:279\n708#4,11:285\n64#5,4:129\n64#5,4:167\n64#5,4:205\n64#5,4:243\n64#5,4:281\n*S KotlinDebug\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/rounded/LandslideKt\n*L\n29#1:99\n29#1:100,3\n29#1:104,3\n30#1:107,18\n30#1:144\n39#1:145,18\n39#1:182\n50#1:183,18\n50#1:220\n61#1:221,18\n61#1:258\n77#1:259,18\n77#1:296\n29#1:103\n30#1:125,2\n30#1:127,2\n30#1:133,11\n39#1:163,2\n39#1:165,2\n39#1:171,11\n50#1:201,2\n50#1:203,2\n50#1:209,11\n61#1:239,2\n61#1:241,2\n61#1:247,11\n77#1:277,2\n77#1:279,2\n77#1:285,11\n30#1:129,4\n39#1:167,4\n50#1:205,4\n61#1:243,4\n77#1:281,4\n*E\n"})
/* loaded from: classes.dex */
public final class LandslideKt {

    /* renamed from: a */
    public static ImageVector f20083a;

    @NotNull
    public static final ImageVector getLandslide(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20083a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Landslide", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.47f, 13.79f);
        pathBuilder.lineToRelative(-2.58f, -1.03f);
        pathBuilder.lineToRelative(-6.89f, 2.29f);
        pathBuilder.lineToRelative(-4.0f, -1.54f);
        pathBuilder.lineToRelative(0.0f, 2.1f);
        pathBuilder.lineToRelative(4.0f, 1.34f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.57f, 11.42f);
        pathBuilder2.lineTo(8.6f, 8.8f);
        pathBuilder2.curveTo(8.22f, 8.3f, 7.63f, 8.0f, 7.0f, 8.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(1.61f);
        pathBuilder2.lineToRelative(4.0f, 1.33f);
        pathBuilder2.lineTo(10.57f, 11.42f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.0f, 19.05f);
        pathBuilder3.lineToRelative(-4.0f, -1.33f);
        pathBuilder3.verticalLineTo(20.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(14.0f);
        pathBuilder3.curveToRelative(1.65f, 0.0f, 2.59f, -1.88f, 1.6f, -3.2f);
        pathBuilder3.lineToRelative(-2.57f, -3.42f);
        pathBuilder3.lineTo(6.0f, 19.05f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.0f, 4.65f);
        pathBuilder4.verticalLineTo(2.64f);
        pathBuilder4.curveToRelative(0.0f, -0.95f, -0.67f, -1.77f, -1.61f, -1.96f);
        pathBuilder4.lineToRelative(-2.58f, -0.52f);
        pathBuilder4.curveToRelative(-0.52f, -0.1f, -1.06f, 0.0f, -1.5f, 0.3f);
        pathBuilder4.lineTo(9.89f, 1.41f);
        pathBuilder4.curveTo(9.33f, 1.78f, 9.0f, 2.4f, 9.0f, 3.07f);
        pathBuilder4.verticalLineToRelative(1.86f);
        pathBuilder4.curveTo(9.0f, 5.6f, 9.33f, 6.22f, 9.89f, 6.59f);
        pathBuilder4.lineToRelative(1.23f, 0.82f);
        pathBuilder4.curveToRelative(0.55f, 0.37f, 1.24f, 0.44f, 1.85f, 0.19f);
        pathBuilder4.lineToRelative(2.77f, -1.11f);
        pathBuilder4.curveTo(16.5f, 6.2f, 17.0f, 5.46f, 17.0f, 4.65f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.75f, 7.6f);
        pathBuilder5.lineToRelative(-1.0f, 0.8f);
        pathBuilder5.curveTo(16.28f, 8.78f, 16.0f, 9.35f, 16.0f, 9.96f);
        pathBuilder5.verticalLineToRelative(1.08f);
        pathBuilder5.curveToRelative(0.0f, 0.61f, 0.28f, 1.18f, 0.75f, 1.56f);
        pathBuilder5.lineToRelative(0.8f, 0.64f);
        pathBuilder5.curveToRelative(0.58f, 0.47f, 1.38f, 0.57f, 2.06f, 0.27f);
        pathBuilder5.lineToRelative(2.2f, -0.98f);
        pathBuilder5.curveTo(22.53f, 12.21f, 23.0f, 11.49f, 23.0f, 10.7f);
        pathBuilder5.verticalLineTo(9.6f);
        pathBuilder5.curveToRelative(0.0f, -0.94f, -0.65f, -1.75f, -1.57f, -1.95f);
        pathBuilder5.lineToRelative(-2.0f, -0.44f);
        pathBuilder5.curveTo(18.84f, 7.08f, 18.22f, 7.22f, 17.75f, 7.6f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20083a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}