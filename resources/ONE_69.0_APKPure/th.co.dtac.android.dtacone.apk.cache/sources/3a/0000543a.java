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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_recycling", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRecycling", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Recycling", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecycling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recycling.kt\nandroidx/compose/material/icons/twotone/RecyclingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n122#2:95\n116#2,3:96\n119#2,3:100\n132#2,18:103\n152#2:140\n174#3:99\n694#4,2:121\n706#4,2:123\n708#4,11:129\n64#5,4:125\n*S KotlinDebug\n*F\n+ 1 Recycling.kt\nandroidx/compose/material/icons/twotone/RecyclingKt\n*L\n29#1:95\n29#1:96,3\n29#1:100,3\n30#1:103,18\n30#1:140\n29#1:99\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"})
/* loaded from: classes.dex */
public final class RecyclingKt {

    /* renamed from: a */
    public static ImageVector f24832a;

    @NotNull
    public static final ImageVector getRecycling(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24832a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Recycling", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.77f, 7.15f);
        pathBuilder.lineTo(7.2f, 4.78f);
        pathBuilder.lineToRelative(1.03f, -1.71f);
        pathBuilder.curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0.0f);
        pathBuilder.lineToRelative(1.48f, 2.46f);
        pathBuilder.lineToRelative(-1.23f, 2.06f);
        pathBuilder.lineTo(9.2f, 9.21f);
        pathBuilder.lineTo(5.77f, 7.15f);
        pathBuilder.close();
        pathBuilder.moveTo(21.72f, 12.97f);
        pathBuilder.lineToRelative(-1.6f, -2.66f);
        pathBuilder.lineToRelative(-3.46f, 2.0f);
        pathBuilder.lineTo(18.87f, 16.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        pathBuilder.curveTo(21.93f, 14.61f, 22.0f, 14.31f, 22.0f, 14.0f);
        pathBuilder.curveTo(22.0f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        pathBuilder.lineTo(20.74f, 17.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 17.0f);
        pathBuilder.horizontalLineTo(5.7f);
        pathBuilder.lineToRelative(-0.84f, 1.41f);
        pathBuilder.curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(5.08f, 20.63f, 5.67f, 21.0f, 6.32f, 21.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.12f, 14.35f);
        pathBuilder.lineToRelative(1.73f, 1.04f);
        pathBuilder.lineTo(6.48f, 9.9f);
        pathBuilder.lineTo(1.0f, 11.27f);
        pathBuilder.lineToRelative(1.7f, 1.02f);
        pathBuilder.lineToRelative(-0.41f, 0.69f);
        pathBuilder.curveToRelative(-0.35f, 0.59f, -0.38f, 1.31f, -0.07f, 1.92f);
        pathBuilder.lineToRelative(1.63f, 3.26f);
        pathBuilder.lineTo(6.12f, 14.35f);
        pathBuilder.close();
        pathBuilder.moveTo(17.02f, 5.14f);
        pathBuilder.lineToRelative(-1.3f, -2.17f);
        pathBuilder.curveTo(15.35f, 2.37f, 14.7f, 2.0f, 14.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-3.53f);
        pathBuilder.lineToRelative(3.12f, 5.2f);
        pathBuilder.lineToRelative(-1.72f, 1.03f);
        pathBuilder.lineToRelative(5.49f, 1.37f);
        pathBuilder.lineToRelative(1.37f, -5.49f);
        pathBuilder.lineTo(17.02f, 5.14f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24832a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}