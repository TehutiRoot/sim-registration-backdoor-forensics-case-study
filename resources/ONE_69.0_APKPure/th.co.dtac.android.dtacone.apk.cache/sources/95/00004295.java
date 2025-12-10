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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_noAdultContent", "Landroidx/compose/material/icons/Icons$Rounded;", "getNoAdultContent", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "NoAdultContent", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNoAdultContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoAdultContent.kt\nandroidx/compose/material/icons/rounded/NoAdultContentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n122#2:103\n116#2,3:104\n119#2,3:108\n132#2,18:111\n152#2:148\n132#2,18:149\n152#2:186\n132#2,18:187\n152#2:224\n132#2,18:225\n152#2:262\n174#3:107\n694#4,2:129\n706#4,2:131\n708#4,11:137\n694#4,2:167\n706#4,2:169\n708#4,11:175\n694#4,2:205\n706#4,2:207\n708#4,11:213\n694#4,2:243\n706#4,2:245\n708#4,11:251\n64#5,4:133\n64#5,4:171\n64#5,4:209\n64#5,4:247\n*S KotlinDebug\n*F\n+ 1 NoAdultContent.kt\nandroidx/compose/material/icons/rounded/NoAdultContentKt\n*L\n29#1:103\n29#1:104,3\n29#1:108,3\n30#1:111,18\n30#1:148\n52#1:149,18\n52#1:186\n67#1:187,18\n67#1:224\n82#1:225,18\n82#1:262\n29#1:107\n30#1:129,2\n30#1:131,2\n30#1:137,11\n52#1:167,2\n52#1:169,2\n52#1:175,11\n67#1:205,2\n67#1:207,2\n67#1:213,11\n82#1:243,2\n82#1:245,2\n82#1:251,11\n30#1:133,4\n52#1:171,4\n67#1:209,4\n82#1:247,4\n*E\n"})
/* loaded from: classes.dex */
public final class NoAdultContentKt {

    /* renamed from: a */
    public static ImageVector f20315a;

    @NotNull
    public static final ImageVector getNoAdultContent(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20315a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoAdultContent", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.85f, 0.63f, -3.54f, 1.69f, -4.9f);
        pathBuilder.lineTo(7.59f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.83f);
        pathBuilder.lineTo(7.1f, 5.69f);
        pathBuilder.curveTo(8.46f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        pathBuilder.lineToRelative(-1.9f, -1.9f);
        pathBuilder.horizontalLineToRelative(-2.83f);
        pathBuilder.lineToRelative(3.31f, 3.31f);
        pathBuilder.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilder.curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.25f, 14.0f);
        pathBuilder2.lineToRelative(-1.5f, -2.0f);
        pathBuilder2.lineToRelative(1.5f, -2.0f);
        pathBuilder2.lineToRelative(-1.5f, 0.0f);
        pathBuilder2.lineToRelative(-0.75f, 1.0f);
        pathBuilder2.lineToRelative(-0.75f, -1.0f);
        pathBuilder2.lineToRelative(-1.5f, 0.0f);
        pathBuilder2.lineToRelative(1.5f, 2.0f);
        pathBuilder2.lineToRelative(-1.5f, 2.0f);
        pathBuilder2.lineToRelative(1.5f, 0.0f);
        pathBuilder2.lineToRelative(0.75f, -1.0f);
        pathBuilder2.lineToRelative(0.75f, 1.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(8.0f, 10.0f);
        pathBuilder3.lineToRelative(-0.75f, 1.0f);
        pathBuilder3.lineToRelative(-0.75f, -1.0f);
        pathBuilder3.lineToRelative(-1.5f, 0.0f);
        pathBuilder3.lineToRelative(1.5f, 2.0f);
        pathBuilder3.lineToRelative(-1.5f, 2.0f);
        pathBuilder3.lineToRelative(1.5f, 0.0f);
        pathBuilder3.lineToRelative(0.75f, -1.0f);
        pathBuilder3.lineToRelative(0.75f, 1.0f);
        pathBuilder3.lineToRelative(1.5f, 0.0f);
        pathBuilder3.lineToRelative(-1.5f, -2.0f);
        pathBuilder3.lineToRelative(1.5f, -2.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.0f, 14.0f);
        pathBuilder4.lineToRelative(0.75f, -1.0f);
        pathBuilder4.lineToRelative(0.75f, 1.0f);
        pathBuilder4.lineToRelative(1.5f, 0.0f);
        pathBuilder4.lineToRelative(-1.5f, -2.0f);
        pathBuilder4.lineToRelative(1.5f, -2.0f);
        pathBuilder4.lineToRelative(-1.5f, 0.0f);
        pathBuilder4.lineToRelative(-0.75f, 1.0f);
        pathBuilder4.lineToRelative(-0.75f, -1.0f);
        pathBuilder4.lineToRelative(-1.5f, 0.0f);
        pathBuilder4.lineToRelative(1.5f, 2.0f);
        pathBuilder4.lineToRelative(-1.5f, 2.0f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20315a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}