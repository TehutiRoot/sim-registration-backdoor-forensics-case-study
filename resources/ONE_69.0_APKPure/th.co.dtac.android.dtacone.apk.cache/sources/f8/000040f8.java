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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_generatingTokens", "Landroidx/compose/material/icons/Icons$Rounded;", "getGeneratingTokens", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "GeneratingTokens", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGeneratingTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeneratingTokens.kt\nandroidx/compose/material/icons/rounded/GeneratingTokensKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n122#2:85\n116#2,3:86\n119#2,3:90\n132#2,18:93\n152#2:130\n174#3:89\n694#4,2:111\n706#4,2:113\n708#4,11:119\n64#5,4:115\n*S KotlinDebug\n*F\n+ 1 GeneratingTokens.kt\nandroidx/compose/material/icons/rounded/GeneratingTokensKt\n*L\n29#1:85\n29#1:86,3\n29#1:90,3\n30#1:93,18\n30#1:130\n29#1:89\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"})
/* loaded from: classes.dex */
public final class GeneratingTokensKt {

    /* renamed from: a */
    public static ImageVector f19902a;

    @NotNull
    public static final ImageVector getGeneratingTokens(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19902a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GeneratingTokens", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.curveTo(17.0f, 7.58f, 13.42f, 4.0f, 9.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 15.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(6.75f);
        pathBuilder.curveTo(6.34f, 10.5f, 6.0f, 10.16f, 6.0f, 9.75f);
        pathBuilder.reflectiveCurveTo(6.34f, 9.0f, 6.75f, 9.0f);
        pathBuilder.horizontalLineToRelative(4.5f);
        pathBuilder.curveTo(11.66f, 9.0f, 12.0f, 9.34f, 12.0f, 9.75f);
        pathBuilder.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveTo(10.0f, 15.05f, 9.55f, 15.5f, 9.0f, 15.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.25f, 3.75f);
        pathBuilder.lineTo(22.0f, 4.54f);
        pathBuilder.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(-1.75f, 0.79f);
        pathBuilder.lineTo(19.46f, 8.0f);
        pathBuilder.curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.79f, -1.75f);
        pathBuilder.lineTo(16.0f, 5.46f);
        pathBuilder.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(1.75f, -0.79f);
        pathBuilder.lineTo(18.54f, 2.0f);
        pathBuilder.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        pathBuilder.lineTo(20.25f, 3.75f);
        pathBuilder.close();
        pathBuilder.moveTo(20.25f, 17.75f);
        pathBuilder.lineTo(22.0f, 18.54f);
        pathBuilder.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(-1.75f, 0.79f);
        pathBuilder.lineTo(19.46f, 22.0f);
        pathBuilder.curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.79f, -1.75f);
        pathBuilder.lineTo(16.0f, 19.46f);
        pathBuilder.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(1.75f, -0.79f);
        pathBuilder.lineTo(18.54f, 16.0f);
        pathBuilder.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        pathBuilder.lineTo(20.25f, 17.75f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19902a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}