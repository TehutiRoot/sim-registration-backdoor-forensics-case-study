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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_settingsBrightness", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSettingsBrightness", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsBrightness", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettingsBrightness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsBrightness.kt\nandroidx/compose/material/icons/twotone/SettingsBrightnessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n122#2:103\n116#2,3:104\n119#2,3:108\n132#2,18:111\n152#2:148\n132#2,18:149\n152#2:186\n174#3:107\n694#4,2:129\n706#4,2:131\n708#4,11:137\n694#4,2:167\n706#4,2:169\n708#4,11:175\n64#5,4:133\n64#5,4:171\n*S KotlinDebug\n*F\n+ 1 SettingsBrightness.kt\nandroidx/compose/material/icons/twotone/SettingsBrightnessKt\n*L\n29#1:103\n29#1:104,3\n29#1:108,3\n30#1:111,18\n30#1:148\n56#1:149,18\n56#1:186\n29#1:107\n30#1:129,2\n30#1:131,2\n30#1:137,11\n56#1:167,2\n56#1:169,2\n56#1:175,11\n30#1:133,4\n56#1:171,4\n*E\n"})
/* loaded from: classes.dex */
public final class SettingsBrightnessKt {

    /* renamed from: a */
    public static ImageVector f24880a;

    @NotNull
    public static final ImageVector getSettingsBrightness(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24880a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SettingsBrightness", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 19.01f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 4.99f);
        pathBuilder.lineTo(3.0f, 4.99f);
        pathBuilder.verticalLineToRelative(14.02f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 10.5f);
        pathBuilder.lineTo(8.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.lineTo(12.0f, 6.5f);
        pathBuilder.lineTo(13.5f, 8.0f);
        pathBuilder.lineTo(16.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.5f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.lineToRelative(-1.5f, 1.5f);
        pathBuilder.lineTo(16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-2.5f);
        pathBuilder.lineTo(12.0f, 17.5f);
        pathBuilder.lineTo(10.5f, 16.0f);
        pathBuilder.lineTo(8.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.lineTo(6.5f, 12.0f);
        pathBuilder.lineTo(8.0f, 10.5f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(2.5f);
        pathBuilder2.lineToRelative(1.5f, 1.5f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineTo(16.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(-2.5f);
        pathBuilder2.lineToRelative(1.5f, -1.5f);
        pathBuilder2.lineToRelative(-1.5f, -1.5f);
        pathBuilder2.lineTo(16.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(-2.5f);
        pathBuilder2.lineTo(12.0f, 6.5f);
        pathBuilder2.lineTo(10.5f, 8.0f);
        pathBuilder2.lineTo(8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(2.5f);
        pathBuilder2.lineTo(6.5f, 12.0f);
        pathBuilder2.lineTo(8.0f, 13.5f);
        pathBuilder2.lineTo(8.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 9.0f);
        pathBuilder2.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder2.lineTo(12.0f, 9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 3.0f);
        pathBuilder2.lineTo(3.0f, 3.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(18.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(23.0f, 5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 19.01f);
        pathBuilder2.lineTo(3.0f, 19.01f);
        pathBuilder2.lineTo(3.0f, 4.99f);
        pathBuilder2.horizontalLineToRelative(18.0f);
        pathBuilder2.verticalLineToRelative(14.02f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24880a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
