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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_rtt", "Landroidx/compose/material/icons/Icons$Rounded;", "getRtt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Rtt", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRtt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rtt.kt\nandroidx/compose/material/icons/rounded/RttKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n122#2:98\n116#2,3:99\n119#2,3:103\n132#2,18:106\n152#2:143\n174#3:102\n694#4,2:124\n706#4,2:126\n708#4,11:132\n64#5,4:128\n*S KotlinDebug\n*F\n+ 1 Rtt.kt\nandroidx/compose/material/icons/rounded/RttKt\n*L\n29#1:98\n29#1:99,3\n29#1:103,3\n30#1:106,18\n30#1:143\n29#1:102\n30#1:124,2\n30#1:126,2\n30#1:132,11\n30#1:128,4\n*E\n"})
/* loaded from: classes.dex */
public final class RttKt {

    /* renamed from: a */
    public static ImageVector f20633a;

    @NotNull
    public static final ImageVector getRtt(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20633a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rtt", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.76f, 4.69f);
        pathBuilder.lineTo(8.15f, 8.58f);
        pathBuilder.curveToRelative(-0.12f, 0.78f, 0.48f, 1.49f, 1.28f, 1.49f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.64f, 0.0f, 1.18f, -0.46f, 1.28f, -1.09f);
        pathBuilder.lineToRelative(0.53f, -3.41f);
        pathBuilder.horizontalLineToRelative(2.58f);
        pathBuilder.lineTo(11.8f, 18.43f);
        pathBuilder.horizontalLineToRelative(-1.24f);
        pathBuilder.curveToRelative(-0.63f, 0.0f, -1.16f, 0.46f, -1.26f, 1.08f);
        pathBuilder.lineToRelative(0.0f, 0.01f);
        pathBuilder.curveTo(9.17f, 20.3f, 9.77f, 21.0f, 10.56f, 21.0f);
        pathBuilder.horizontalLineToRelative(4.67f);
        pathBuilder.curveToRelative(0.63f, 0.0f, 1.17f, -0.46f, 1.26f, -1.08f);
        pathBuilder.lineToRelative(0.0f, -0.01f);
        pathBuilder.curveToRelative(0.12f, -0.78f, -0.48f, -1.48f, -1.26f, -1.48f);
        pathBuilder.horizontalLineToRelative(-0.86f);
        pathBuilder.lineToRelative(2.0f, -12.86f);
        pathBuilder.horizontalLineToRelative(2.58f);
        pathBuilder.lineToRelative(-0.47f, 3.01f);
        pathBuilder.curveToRelative(-0.12f, 0.78f, 0.48f, 1.49f, 1.28f, 1.49f);
        pathBuilder.horizontalLineToRelative(0.03f);
        pathBuilder.curveToRelative(0.64f, 0.0f, 1.18f, -0.46f, 1.28f, -1.09f);
        pathBuilder.lineToRelative(0.57f, -3.67f);
        pathBuilder.curveTo(21.83f, 4.09f, 20.89f, 3.0f, 19.66f, 3.0f);
        pathBuilder.horizontalLineToRelative(-8.92f);
        pathBuilder.curveTo(9.76f, 3.0f, 8.92f, 3.72f, 8.76f, 4.69f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 5.0f);
        pathBuilder.horizontalLineTo(4.86f);
        pathBuilder.curveTo(4.36f, 5.0f, 3.94f, 5.36f, 3.87f, 5.85f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(3.77f, 6.45f, 4.24f, 7.0f, 4.86f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.83f);
        pathBuilder.lineTo(8.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.39f, 9.0f);
        pathBuilder.horizontalLineTo(4.25f);
        pathBuilder.curveTo(3.75f, 9.0f, 3.33f, 9.36f, 3.26f, 9.85f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(3.16f, 10.45f, 3.63f, 11.0f, 4.25f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.83f);
        pathBuilder.lineTo(7.39f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.31f, 17.0f);
        pathBuilder.horizontalLineTo(3.17f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.91f, 0.36f, -0.99f, 0.85f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(2.08f, 18.45f, 2.55f, 19.0f, 3.17f, 19.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineTo(8.31f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.93f, 13.0f);
        pathBuilder.horizontalLineTo(3.79f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.91f, 0.36f, -0.99f, 0.85f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(2.7f, 14.45f, 3.17f, 15.0f, 3.79f, 15.0f);
        pathBuilder.horizontalLineToRelative(4.84f);
        pathBuilder.lineTo(8.93f, 13.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20633a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}