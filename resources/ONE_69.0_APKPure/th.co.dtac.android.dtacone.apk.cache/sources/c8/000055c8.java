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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_thunderstorm", "Landroidx/compose/material/icons/Icons$TwoTone;", "getThunderstorm", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Thunderstorm", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThunderstorm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thunderstorm.kt\nandroidx/compose/material/icons/twotone/ThunderstormKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n122#2:97\n116#2,3:98\n119#2,3:102\n132#2,18:105\n152#2:142\n132#2,18:143\n152#2:180\n132#2,18:181\n152#2:218\n132#2,18:219\n152#2:256\n174#3:101\n694#4,2:123\n706#4,2:125\n708#4,11:131\n694#4,2:161\n706#4,2:163\n708#4,11:169\n694#4,2:199\n706#4,2:201\n708#4,11:207\n694#4,2:237\n706#4,2:239\n708#4,11:245\n64#5,4:127\n64#5,4:165\n64#5,4:203\n64#5,4:241\n*S KotlinDebug\n*F\n+ 1 Thunderstorm.kt\nandroidx/compose/material/icons/twotone/ThunderstormKt\n*L\n29#1:97\n29#1:98,3\n29#1:102,3\n30#1:105,18\n30#1:142\n45#1:143,18\n45#1:180\n69#1:181,18\n69#1:218\n80#1:219,18\n80#1:256\n29#1:101\n30#1:123,2\n30#1:125,2\n30#1:131,11\n45#1:161,2\n45#1:163,2\n45#1:169,11\n69#1:199,2\n69#1:201,2\n69#1:207,11\n80#1:237,2\n80#1:239,2\n80#1:245,11\n30#1:127,4\n45#1:165,4\n69#1:203,4\n80#1:241,4\n*E\n"})
/* loaded from: classes.dex */
public final class ThunderstormKt {

    /* renamed from: a */
    public static ImageVector f25230a;

    @NotNull
    public static final ImageVector getThunderstorm(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25230a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Thunderstorm", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.73f, 9.01f);
        pathBuilder.lineTo(16.2f, 8.87f);
        pathBuilder.lineToRelative(-0.25f, -1.52f);
        pathBuilder.curveTo(15.63f, 5.44f, 13.94f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-1.44f, 0.0f, -2.77f, 0.78f, -3.48f, 2.04f);
        pathBuilder.lineTo(8.03f, 6.91f);
        pathBuilder.lineTo(7.04f, 7.04f);
        pathBuilder.curveTo(5.31f, 7.27f, 4.0f, 8.76f, 4.0f, 10.5f);
        pathBuilder.curveTo(4.0f, 12.43f, 5.57f, 14.0f, 7.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveTo(20.0f, 10.22f, 19.01f, 9.13f, 17.73f, 9.01f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.92f, 7.02f);
        pathBuilder2.curveTo(17.45f, 4.18f, 14.97f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveTo(9.82f, 2.0f, 7.83f, 3.18f, 6.78f, 5.06f);
        pathBuilder2.curveTo(4.09f, 5.41f, 2.0f, 7.74f, 2.0f, 10.5f);
        pathBuilder2.curveTo(2.0f, 13.53f, 4.47f, 16.0f, 7.5f, 16.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilder2.curveTo(22.0f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.5f, 14.0f);
        pathBuilder2.horizontalLineToRelative(-10.0f);
        pathBuilder2.curveTo(5.57f, 14.0f, 4.0f, 12.43f, 4.0f, 10.5f);
        pathBuilder2.curveToRelative(0.0f, -1.74f, 1.31f, -3.23f, 3.04f, -3.46f);
        pathBuilder2.lineToRelative(0.99f, -0.13f);
        pathBuilder2.lineToRelative(0.49f, -0.87f);
        pathBuilder2.curveTo(9.23f, 4.78f, 10.56f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(1.94f, 0.0f, 3.63f, 1.44f, 3.95f, 3.35f);
        pathBuilder2.lineToRelative(0.25f, 1.52f);
        pathBuilder2.lineToRelative(1.54f, 0.14f);
        pathBuilder2.curveTo(19.01f, 9.13f, 20.0f, 10.22f, 20.0f, 11.5f);
        pathBuilder2.curveTo(20.0f, 12.88f, 18.88f, 14.0f, 17.5f, 14.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(14.8f, 17.0f);
        pathBuilder3.lineToRelative(-2.9f, 3.32f);
        pathBuilder3.lineToRelative(2.0f, 1.0f);
        pathBuilder3.lineToRelative(-2.35f, 2.68f);
        pathBuilder3.lineToRelative(2.65f, 0.0f);
        pathBuilder3.lineToRelative(2.9f, -3.32f);
        pathBuilder3.lineToRelative(-2.0f, -1.0f);
        pathBuilder3.lineToRelative(2.35f, -2.68f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.8f, 17.0f);
        pathBuilder4.lineToRelative(-2.9f, 3.32f);
        pathBuilder4.lineToRelative(2.0f, 1.0f);
        pathBuilder4.lineToRelative(-2.35f, 2.68f);
        pathBuilder4.lineToRelative(2.65f, 0.0f);
        pathBuilder4.lineToRelative(2.9f, -3.32f);
        pathBuilder4.lineToRelative(-2.0f, -1.0f);
        pathBuilder4.lineToRelative(2.35f, -2.68f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25230a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}