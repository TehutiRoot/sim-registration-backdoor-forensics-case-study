package androidx.compose.material.icons.filled;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_viewInAr", "Landroidx/compose/material/icons/Icons$Filled;", "getViewInAr", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewInAr", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewInAr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/filled/ViewInArKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n122#2:106\n116#2,3:107\n119#2,3:111\n132#2,18:114\n152#2:151\n174#3:110\n694#4,2:132\n706#4,2:134\n708#4,11:140\n64#5,4:136\n*S KotlinDebug\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/filled/ViewInArKt\n*L\n29#1:106\n29#1:107,3\n29#1:111,3\n30#1:114,18\n30#1:151\n29#1:110\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"})
/* loaded from: classes.dex */
public final class ViewInArKt {

    /* renamed from: a */
    public static ImageVector f16816a;

    @NotNull
    public static final ImageVector getViewInAr(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f16816a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ViewInAr", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.25f, 7.6f);
        pathBuilder.lineToRelative(-5.5f, -3.18f);
        pathBuilder.curveToRelative(-0.46f, -0.27f, -1.04f, -0.27f, -1.5f, 0.0f);
        pathBuilder.lineTo(5.75f, 7.6f);
        pathBuilder.curveToRelative(-0.46f, 0.27f, -0.75f, 0.76f, -0.75f, 1.3f);
        pathBuilder.verticalLineToRelative(6.35f);
        pathBuilder.curveToRelative(0.0f, 0.54f, 0.29f, 1.03f, 0.75f, 1.3f);
        pathBuilder.lineToRelative(5.5f, 3.18f);
        pathBuilder.curveToRelative(0.46f, 0.27f, 1.04f, 0.27f, 1.5f, 0.0f);
        pathBuilder.lineToRelative(5.5f, -3.18f);
        pathBuilder.curveToRelative(0.46f, -0.27f, 0.75f, -0.76f, 0.75f, -1.3f);
        pathBuilder.lineTo(19.0f, 8.9f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.29f, -1.03f, -0.75f, -1.3f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 14.96f);
        pathBuilder.verticalLineToRelative(-4.62f);
        pathBuilder.lineToRelative(4.0f, 2.32f);
        pathBuilder.verticalLineToRelative(4.61f);
        pathBuilder.lineToRelative(-4.0f, -2.31f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.93f);
        pathBuilder.lineTo(8.0f, 8.61f);
        pathBuilder.lineToRelative(4.0f, -2.31f);
        pathBuilder.lineToRelative(4.0f, 2.31f);
        pathBuilder.lineToRelative(-4.0f, 2.32f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.27f);
        pathBuilder.verticalLineToRelative(-4.61f);
        pathBuilder.lineToRelative(4.0f, -2.32f);
        pathBuilder.verticalLineToRelative(4.62f);
        pathBuilder.lineToRelative(-4.0f, 2.31f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 2.0f);
        pathBuilder.lineTo(3.5f, 2.0f);
        pathBuilder.curveTo(2.67f, 2.0f, 2.0f, 2.67f, 2.0f, 3.5f);
        pathBuilder.lineTo(2.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.lineTo(22.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(17.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 22.0f);
        pathBuilder.lineTo(3.5f, 22.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.lineTo(2.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.lineTo(22.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f16816a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}