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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_spa", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSpa", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Spa", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpa.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spa.kt\nandroidx/compose/material/icons/twotone/SpaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,127:1\n122#2:128\n116#2,3:129\n119#2,3:133\n132#2,18:136\n152#2:173\n132#2,18:174\n152#2:211\n132#2,18:212\n152#2:249\n132#2,18:250\n152#2:287\n174#3:132\n694#4,2:154\n706#4,2:156\n708#4,11:162\n694#4,2:192\n706#4,2:194\n708#4,11:200\n694#4,2:230\n706#4,2:232\n708#4,11:238\n694#4,2:268\n706#4,2:270\n708#4,11:276\n64#5,4:158\n64#5,4:196\n64#5,4:234\n64#5,4:272\n*S KotlinDebug\n*F\n+ 1 Spa.kt\nandroidx/compose/material/icons/twotone/SpaKt\n*L\n29#1:128\n29#1:129,3\n29#1:133,3\n30#1:136,18\n30#1:173\n40#1:174,18\n40#1:211\n72#1:212,18\n72#1:249\n115#1:250,18\n115#1:287\n29#1:132\n30#1:154,2\n30#1:156,2\n30#1:162,11\n40#1:192,2\n40#1:194,2\n40#1:200,11\n72#1:230,2\n72#1:232,2\n72#1:238,11\n115#1:268,2\n115#1:270,2\n115#1:276,11\n30#1:158,4\n40#1:196,4\n72#1:234,4\n115#1:272,4\n*E\n"})
/* loaded from: classes.dex */
public final class SpaKt {

    /* renamed from: a */
    public static ImageVector f25064a;

    @NotNull
    public static final ImageVector getSpa(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25064a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Spa", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.55f, 12.0f);
        pathBuilder.curveToRelative(-1.07f, -0.71f, -2.25f, -1.27f, -3.53f, -1.61f);
        pathBuilder.curveToRelative(1.28f, 0.34f, 2.46f, 0.9f, 3.53f, 1.61f);
        pathBuilder.close();
        pathBuilder.moveTo(18.98f, 10.39f);
        pathBuilder.curveToRelative(-1.29f, 0.34f, -2.49f, 0.91f, -3.57f, 1.64f);
        pathBuilder.curveToRelative(1.08f, -0.73f, 2.28f, -1.3f, 3.57f, -1.64f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.94f, 12.25f);
        pathBuilder2.curveToRelative(0.0f, -0.01f, 0.0f, -0.01f, 0.0f, 0.0f);
        pathBuilder2.curveToRelative(-0.13f, -0.09f, -0.27f, -0.17f, -0.4f, -0.26f);
        pathBuilder2.curveToRelative(0.13f, 0.1f, 0.27f, 0.17f, 0.4f, 0.26f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.35f, 8.58f);
        pathBuilder2.curveToRelative(-0.22f, -1.21f, -0.66f, -2.35f, -1.3f, -3.38f);
        pathBuilder2.curveToRelative(-0.66f, 1.04f, -1.12f, 2.19f, -1.37f, 3.39f);
        pathBuilder2.curveToRelative(0.46f, 0.3f, 0.9f, 0.62f, 1.33f, 0.97f);
        pathBuilder2.curveToRelative(0.42f, -0.35f, 0.87f, -0.68f, 1.34f, -0.98f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.54f, 13.66f);
        pathBuilder2.lineToRelative(0.01f, 0.02f);
        pathBuilder2.curveToRelative(-0.09f, 0.06f, -0.18f, 0.12f, -0.27f, 0.17f);
        pathBuilder2.lineToRelative(-0.07f, 0.05f);
        pathBuilder2.curveToRelative(-0.98f, 0.71f, -1.84f, 1.61f, -2.53f, 2.66f);
        pathBuilder2.lineTo(12.0f, 19.1f);
        pathBuilder2.lineToRelative(-1.67f, -2.55f);
        pathBuilder2.curveToRelative(-0.68f, -1.03f, -1.52f, -1.92f, -2.51f, -2.65f);
        pathBuilder2.lineToRelative(-0.07f, -0.04f);
        pathBuilder2.curveToRelative(-0.13f, -0.08f, -0.26f, -0.16f, -0.39f, -0.25f);
        pathBuilder2.lineToRelative(0.01f, -0.01f);
        pathBuilder2.curveToRelative(-0.96f, -0.63f, -2.01f, -1.07f, -3.12f, -1.33f);
        pathBuilder2.curveToRelative(0.75f, 3.36f, 3.16f, 6.17f, 6.45f, 7.35f);
        pathBuilder2.curveToRelative(0.42f, 0.15f, 0.84f, 0.27f, 1.28f, 0.36f);
        pathBuilder2.curveToRelative(0.45f, -0.09f, 0.89f, -0.21f, 1.33f, -0.37f);
        pathBuilder2.curveToRelative(3.27f, -1.17f, 5.67f, -3.98f, 6.43f, -7.34f);
        pathBuilder2.curveToRelative(-1.14f, 0.26f, -2.23f, 0.73f, -3.2f, 1.39f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.99f, 12.28f);
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 15.45f);
        pathBuilder3.curveToRelative(-0.82f, -1.25f, -1.86f, -2.34f, -3.06f, -3.2f);
        pathBuilder3.curveToRelative(-0.13f, -0.09f, -0.27f, -0.16f, -0.4f, -0.26f);
        pathBuilder3.curveToRelative(0.13f, 0.09f, 0.27f, 0.17f, 0.39f, 0.25f);
        pathBuilder3.curveTo(6.98f, 10.83f, 4.59f, 10.0f, 2.0f, 10.0f);
        pathBuilder3.curveToRelative(0.0f, 5.32f, 3.36f, 9.82f, 8.03f, 11.49f);
        pathBuilder3.curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f);
        pathBuilder3.curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f);
        pathBuilder3.curveTo(18.64f, 19.82f, 22.0f, 15.32f, 22.0f, 10.0f);
        pathBuilder3.curveToRelative(-4.18f, 0.0f, -7.85f, 2.17f, -10.0f, 5.45f);
        pathBuilder3.close();
        pathBuilder3.moveTo(13.32f, 19.6f);
        pathBuilder3.curveToRelative(-0.44f, 0.15f, -0.88f, 0.27f, -1.33f, 0.37f);
        pathBuilder3.curveToRelative(-0.44f, -0.09f, -0.87f, -0.21f, -1.28f, -0.36f);
        pathBuilder3.curveToRelative(-3.29f, -1.18f, -5.7f, -3.99f, -6.45f, -7.35f);
        pathBuilder3.curveToRelative(1.1f, 0.26f, 2.15f, 0.71f, 3.12f, 1.33f);
        pathBuilder3.lineToRelative(-0.02f, 0.01f);
        pathBuilder3.curveToRelative(0.13f, 0.09f, 0.26f, 0.18f, 0.39f, 0.25f);
        pathBuilder3.lineToRelative(0.07f, 0.04f);
        pathBuilder3.curveToRelative(0.99f, 0.72f, 1.84f, 1.61f, 2.51f, 2.65f);
        pathBuilder3.lineTo(12.0f, 19.1f);
        pathBuilder3.lineToRelative(1.67f, -2.55f);
        pathBuilder3.curveToRelative(0.69f, -1.05f, 1.55f, -1.95f, 2.53f, -2.66f);
        pathBuilder3.lineToRelative(0.07f, -0.05f);
        pathBuilder3.curveToRelative(0.09f, -0.05f, 0.18f, -0.11f, 0.27f, -0.17f);
        pathBuilder3.lineToRelative(-0.01f, -0.02f);
        pathBuilder3.curveToRelative(0.98f, -0.65f, 2.07f, -1.13f, 3.21f, -1.4f);
        pathBuilder3.curveToRelative(-0.75f, 3.37f, -3.15f, 6.18f, -6.42f, 7.35f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.49f, 9.63f);
        pathBuilder3.curveToRelative(-0.18f, -2.79f, -1.31f, -5.51f, -3.43f, -7.63f);
        pathBuilder3.curveToRelative(-2.14f, 2.14f, -3.32f, 4.86f, -3.55f, 7.63f);
        pathBuilder3.curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f);
        pathBuilder3.curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.05f, 5.19f);
        pathBuilder3.curveToRelative(0.63f, 1.03f, 1.07f, 2.18f, 1.3f, 3.38f);
        pathBuilder3.curveToRelative(-0.47f, 0.3f, -0.91f, 0.63f, -1.34f, 0.98f);
        pathBuilder3.curveToRelative(-0.42f, -0.34f, -0.87f, -0.67f, -1.33f, -0.97f);
        pathBuilder3.curveToRelative(0.25f, -1.2f, 0.71f, -2.35f, 1.37f, -3.39f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(8.99f, 12.28f);
        pathBuilder4.curveToRelative(-0.02f, -0.01f, -0.04f, -0.03f, -0.05f, -0.04f);
        pathBuilder4.curveToRelative(0.0f, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f);
        pathBuilder4.curveToRelative(0.01f, 0.01f, 0.02f, 0.02f, 0.04f, 0.03f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25064a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}