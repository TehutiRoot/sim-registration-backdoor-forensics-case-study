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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_flipCameraIos", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFlipCameraIos", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FlipCameraIos", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlipCameraIos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlipCameraIos.kt\nandroidx/compose/material/icons/twotone/FlipCameraIosKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n122#2:130\n116#2,3:131\n119#2,3:135\n132#2,18:138\n152#2:175\n132#2,18:176\n152#2:213\n132#2,18:214\n152#2:251\n132#2,18:252\n152#2:289\n174#3:134\n694#4,2:156\n706#4,2:158\n708#4,11:164\n694#4,2:194\n706#4,2:196\n708#4,11:202\n694#4,2:232\n706#4,2:234\n708#4,11:240\n694#4,2:270\n706#4,2:272\n708#4,11:278\n64#5,4:160\n64#5,4:198\n64#5,4:236\n64#5,4:274\n*S KotlinDebug\n*F\n+ 1 FlipCameraIos.kt\nandroidx/compose/material/icons/twotone/FlipCameraIosKt\n*L\n29#1:130\n29#1:131,3\n29#1:135,3\n30#1:138,18\n30#1:175\n68#1:176,18\n68#1:213\n94#1:214,18\n94#1:251\n109#1:252,18\n109#1:289\n29#1:134\n30#1:156,2\n30#1:158,2\n30#1:164,11\n68#1:194,2\n68#1:196,2\n68#1:202,11\n94#1:232,2\n94#1:234,2\n94#1:240,11\n109#1:270,2\n109#1:272,2\n109#1:278,11\n30#1:160,4\n68#1:198,4\n94#1:236,4\n109#1:274,4\n*E\n"})
/* loaded from: classes.dex */
public final class FlipCameraIosKt {

    /* renamed from: a */
    public static ImageVector f24095a;

    @NotNull
    public static final ImageVector getFlipCameraIos(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24095a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FlipCameraIos", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.12f, 5.0f);
        pathBuilder.horizontalLineTo(9.88f);
        pathBuilder.lineTo(8.05f, 7.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-4.05f);
        pathBuilder.lineTo(14.12f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineToRelative(2.49f, -2.49f);
        pathBuilder.lineTo(7.5f, 10.5f);
        pathBuilder.lineTo(10.0f, 13.0f);
        pathBuilder.horizontalLineTo(9.97f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.58f, 0.0f, 1.13f, -0.13f, 1.62f, -0.35f);
        pathBuilder.lineToRelative(0.74f, 0.74f);
        pathBuilder.curveTo(13.65f, 17.76f, 12.86f, 18.0f, 12.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.lineToRelative(-2.49f, 2.49f);
        pathBuilder.lineTo(16.5f, 15.5f);
        pathBuilder.lineTo(14.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(0.03f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(-0.58f, 0.0f, -1.13f, 0.13f, -1.62f, 0.35f);
        pathBuilder.lineTo(9.64f, 8.62f);
        pathBuilder.curveTo(10.35f, 8.24f, 11.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(-3.17f);
        pathBuilder2.lineTo(15.0f, 3.0f);
        pathBuilder2.horizontalLineTo(9.0f);
        pathBuilder2.lineTo(7.17f, 5.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 19.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineToRelative(4.05f);
        pathBuilder2.lineToRelative(1.83f, -2.0f);
        pathBuilder2.horizontalLineToRelative(4.24f);
        pathBuilder2.lineToRelative(1.83f, 2.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 17.0f);
        pathBuilder3.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder3.horizontalLineToRelative(1.97f);
        pathBuilder3.horizontalLineTo(10.0f);
        pathBuilder3.lineToRelative(-2.5f, -2.5f);
        pathBuilder3.lineToRelative(-0.01f, 0.01f);
        pathBuilder3.lineTo(5.0f, 13.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder3.curveToRelative(0.86f, 0.0f, 1.65f, -0.24f, 2.36f, -0.62f);
        pathBuilder3.lineToRelative(-0.74f, -0.74f);
        pathBuilder3.curveTo(13.13f, 16.87f, 12.58f, 17.0f, 12.0f, 17.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 8.0f);
        pathBuilder4.curveToRelative(-0.86f, 0.0f, -1.65f, 0.24f, -2.36f, 0.62f);
        pathBuilder4.lineToRelative(0.74f, 0.73f);
        pathBuilder4.curveTo(10.87f, 9.13f, 11.42f, 9.0f, 12.0f, 9.0f);
        pathBuilder4.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder4.horizontalLineToRelative(-1.97f);
        pathBuilder4.horizontalLineTo(14.0f);
        pathBuilder4.lineToRelative(2.5f, 2.5f);
        pathBuilder4.lineToRelative(0.01f, -0.01f);
        pathBuilder4.lineTo(19.0f, 13.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.curveTo(17.0f, 10.24f, 14.76f, 8.0f, 12.0f, 8.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24095a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}