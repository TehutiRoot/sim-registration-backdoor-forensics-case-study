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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_thumbDownOffAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getThumbDownOffAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbDownOffAlt", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThumbDownOffAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbDownOffAlt.kt\nandroidx/compose/material/icons/rounded/ThumbDownOffAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n122#2:75\n116#2,3:76\n119#2,3:80\n132#2,18:83\n152#2:120\n132#2,18:121\n152#2:158\n174#3:79\n694#4,2:101\n706#4,2:103\n708#4,11:109\n694#4,2:139\n706#4,2:141\n708#4,11:147\n64#5,4:105\n64#5,4:143\n*S KotlinDebug\n*F\n+ 1 ThumbDownOffAlt.kt\nandroidx/compose/material/icons/rounded/ThumbDownOffAltKt\n*L\n29#1:75\n29#1:76,3\n29#1:80,3\n30#1:83,18\n30#1:120\n59#1:121,18\n59#1:158\n29#1:79\n30#1:101,2\n30#1:103,2\n30#1:109,11\n59#1:139,2\n59#1:141,2\n59#1:147,11\n30#1:105,4\n59#1:143,4\n*E\n"})
/* loaded from: classes.dex */
public final class ThumbDownOffAltKt {

    /* renamed from: a */
    public static ImageVector f20961a;

    @NotNull
    public static final ImageVector getThumbDownOffAlt(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20961a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbDownOffAlt", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.99f, 3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(5.2f, 3.0f, 4.48f, 3.48f, 4.17f, 4.21f);
        pathBuilder.lineToRelative(-3.26f, 7.61f);
        pathBuilder.curveTo(0.06f, 13.8f, 1.51f, 16.0f, 3.66f, 16.0f);
        pathBuilder.horizontalLineToRelative(5.65f);
        pathBuilder.lineToRelative(-0.95f, 4.58f);
        pathBuilder.curveToRelative(-0.1f, 0.5f, 0.05f, 1.01f, 0.41f, 1.37f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.77f, -0.15f, 1.06f, -0.44f);
        pathBuilder.lineToRelative(5.53f, -5.54f);
        pathBuilder.curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(16.99f, 3.9f, 16.09f, 3.0f, 14.99f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.66f, 19.33f);
        pathBuilder.lineToRelative(0.61f, -2.92f);
        pathBuilder.lineToRelative(0.5f, -2.41f);
        pathBuilder.horizontalLineTo(9.31f);
        pathBuilder.horizontalLineTo(3.66f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.72f, -0.28f, -0.83f, -0.45f);
        pathBuilder.curveToRelative(-0.11f, -0.17f, -0.27f, -0.51f, -0.08f, -0.95f);
        pathBuilder.lineTo(6.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(8.99f);
        pathBuilder.lineToRelative(0.0f, 9.99f);
        pathBuilder.lineTo(10.66f, 19.33f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 3.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20961a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}