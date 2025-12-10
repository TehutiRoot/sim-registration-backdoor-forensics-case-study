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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_designServices", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDesignServices", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "DesignServices", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDesignServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DesignServices.kt\nandroidx/compose/material/icons/twotone/DesignServicesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,132:1\n122#2:133\n116#2,3:134\n119#2,3:138\n132#2,18:141\n152#2:178\n132#2,18:179\n152#2:216\n132#2,18:217\n152#2:254\n132#2,18:255\n152#2:292\n132#2,18:293\n152#2:330\n174#3:137\n694#4,2:159\n706#4,2:161\n708#4,11:167\n694#4,2:197\n706#4,2:199\n708#4,11:205\n694#4,2:235\n706#4,2:237\n708#4,11:243\n694#4,2:273\n706#4,2:275\n708#4,11:281\n694#4,2:311\n706#4,2:313\n708#4,11:319\n64#5,4:163\n64#5,4:201\n64#5,4:239\n64#5,4:277\n64#5,4:315\n*S KotlinDebug\n*F\n+ 1 DesignServices.kt\nandroidx/compose/material/icons/twotone/DesignServicesKt\n*L\n29#1:133\n29#1:134,3\n29#1:138,3\n30#1:141,18\n30#1:178\n39#1:179,18\n39#1:216\n51#1:217,18\n51#1:254\n62#1:255,18\n62#1:292\n69#1:293,18\n69#1:330\n29#1:137\n30#1:159,2\n30#1:161,2\n30#1:167,11\n39#1:197,2\n39#1:199,2\n39#1:205,11\n51#1:235,2\n51#1:237,2\n51#1:243,11\n62#1:273,2\n62#1:275,2\n62#1:281,11\n69#1:311,2\n69#1:313,2\n69#1:319,11\n30#1:163,4\n39#1:201,4\n51#1:239,4\n62#1:277,4\n69#1:315,4\n*E\n"})
/* loaded from: classes.dex */
public final class DesignServicesKt {

    /* renamed from: a */
    public static ImageVector f23838a;

    @NotNull
    public static final ImageVector getDesignServices(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23838a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DesignServices", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.91f, 9.28f);
        pathBuilder.lineToRelative(-1.3f, -1.3f);
        pathBuilder.lineToRelative(-9.61f, 9.61f);
        pathBuilder.lineToRelative(0.0f, 1.41f);
        pathBuilder.lineToRelative(1.41f, 0.0f);
        pathBuilder.lineToRelative(9.61f, -9.61f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.83f, 8.93f);
        pathBuilder2.lineToRelative(-1.2f, -1.2f);
        pathBuilder2.lineToRelative(-1.19f, 1.19f);
        pathBuilder2.lineToRelative(-1.42f, -1.42f);
        pathBuilder2.lineToRelative(1.19f, -1.18f);
        pathBuilder2.lineToRelative(-1.27f, -1.28f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.lineToRelative(-1.9f, 1.9f);
        pathBuilder2.lineToRelative(3.89f, 3.89f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.27f, 14.38f);
        pathBuilder3.lineToRelative(-1.2f, -1.21f);
        pathBuilder3.lineToRelative(-1.9f, 1.9f);
        pathBuilder3.lineToRelative(3.89f, 3.89f);
        pathBuilder3.lineToRelative(1.9f, -1.9f);
        pathBuilder3.lineToRelative(-1.27f, -1.27f);
        pathBuilder3.lineToRelative(-1.19f, 1.19f);
        pathBuilder3.lineToRelative(-1.42f, -1.41f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.021f, 6.558f);
        pathBuilder4.lineToRelative(1.414f, -1.414f);
        pathBuilder4.lineToRelative(1.414f, 1.414f);
        pathBuilder4.lineToRelative(-1.414f, 1.414f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(20.97f, 5.86f);
        pathBuilder5.lineToRelative(-2.83f, -2.83f);
        pathBuilder5.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder5.lineToRelative(-4.49f, 4.49f);
        pathBuilder5.lineTo(8.35f, 3.63f);
        pathBuilder5.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder5.lineToRelative(-1.9f, 1.9f);
        pathBuilder5.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder5.lineToRelative(3.89f, 3.89f);
        pathBuilder5.lineTo(3.0f, 16.76f);
        pathBuilder5.verticalLineTo(21.0f);
        pathBuilder5.horizontalLineToRelative(4.24f);
        pathBuilder5.lineToRelative(4.52f, -4.52f);
        pathBuilder5.lineToRelative(3.89f, 3.89f);
        pathBuilder5.curveToRelative(0.95f, 0.95f, 2.23f, 0.6f, 2.83f, 0.0f);
        pathBuilder5.lineToRelative(1.9f, -1.9f);
        pathBuilder5.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder5.lineToRelative(-3.89f, -3.89f);
        pathBuilder5.lineToRelative(4.49f, -4.49f);
        pathBuilder5.curveTo(21.36f, 6.88f, 21.36f, 6.25f, 20.97f, 5.86f);
        pathBuilder5.close();
        pathBuilder5.moveTo(5.04f, 6.94f);
        pathBuilder5.lineToRelative(1.89f, -1.9f);
        pathBuilder5.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder5.lineToRelative(1.27f, 1.27f);
        pathBuilder5.lineTo(7.02f, 7.5f);
        pathBuilder5.lineToRelative(1.41f, 1.41f);
        pathBuilder5.lineToRelative(1.19f, -1.19f);
        pathBuilder5.lineToRelative(1.2f, 1.2f);
        pathBuilder5.lineToRelative(-1.9f, 1.9f);
        pathBuilder5.lineTo(5.04f, 6.94f);
        pathBuilder5.close();
        pathBuilder5.moveTo(6.41f, 19.0f);
        pathBuilder5.horizontalLineTo(5.0f);
        pathBuilder5.verticalLineToRelative(-1.41f);
        pathBuilder5.lineToRelative(9.61f, -9.61f);
        pathBuilder5.lineToRelative(1.3f, 1.3f);
        pathBuilder5.lineToRelative(0.11f, 0.11f);
        pathBuilder5.lineTo(6.41f, 19.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(16.5f, 16.98f);
        pathBuilder5.lineToRelative(1.19f, -1.19f);
        pathBuilder5.lineToRelative(1.27f, 1.27f);
        pathBuilder5.lineToRelative(-1.9f, 1.9f);
        pathBuilder5.lineToRelative(-3.89f, -3.89f);
        pathBuilder5.lineToRelative(1.9f, -1.9f);
        pathBuilder5.lineToRelative(1.2f, 1.2f);
        pathBuilder5.lineToRelative(-1.19f, 1.19f);
        pathBuilder5.lineTo(16.5f, 16.98f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.44f, 7.98f);
        pathBuilder5.lineToRelative(-1.41f, -1.41f);
        pathBuilder5.lineToRelative(1.41f, -1.41f);
        pathBuilder5.lineToRelative(1.41f, 1.41f);
        pathBuilder5.lineTo(17.44f, 7.98f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23838a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}