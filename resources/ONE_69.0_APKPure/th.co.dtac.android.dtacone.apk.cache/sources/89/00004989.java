package androidx.compose.material.icons.sharp;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_heatPump", "Landroidx/compose/material/icons/Icons$Sharp;", "getHeatPump", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "HeatPump", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeatPump.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeatPump.kt\nandroidx/compose/material/icons/sharp/HeatPumpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n122#2:90\n116#2,3:91\n119#2,3:95\n132#2,18:98\n152#2:135\n174#3:94\n694#4,2:116\n706#4,2:118\n708#4,11:124\n64#5,4:120\n*S KotlinDebug\n*F\n+ 1 HeatPump.kt\nandroidx/compose/material/icons/sharp/HeatPumpKt\n*L\n29#1:90\n29#1:91,3\n29#1:95,3\n30#1:98,18\n30#1:135\n29#1:94\n30#1:116,2\n30#1:118,2\n30#1:124,11\n30#1:120,4\n*E\n"})
/* loaded from: classes.dex */
public final class HeatPumpKt {

    /* renamed from: a */
    public static ImageVector f22095a;

    @NotNull
    public static final ImageVector getHeatPump(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f22095a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HeatPump", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 7.08f);
        pathBuilder.curveToRelative(0.82f, 0.12f, 1.57f, 0.44f, 2.2f, 0.91f);
        pathBuilder.lineToRelative(-2.2f, 2.2f);
        pathBuilder.verticalLineTo(7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 7.08f);
        pathBuilder.verticalLineToRelative(3.11f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.curveTo(9.68f, 7.52f, 10.43f, 7.2f, 11.25f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(7.99f, 9.05f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.horizontalLineTo(7.08f);
        pathBuilder.curveTo(7.2f, 10.43f, 7.52f, 9.68f, 7.99f, 9.05f);
        pathBuilder.close();
        pathBuilder.moveTo(7.08f, 12.75f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.lineToRelative(-2.2f, 2.2f);
        pathBuilder.curveTo(7.52f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 16.92f);
        pathBuilder.curveToRelative(-0.82f, -0.12f, -1.57f, -0.44f, -2.2f, -0.91f);
        pathBuilder.lineToRelative(2.2f, -2.2f);
        pathBuilder.verticalLineTo(16.92f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 16.92f);
        pathBuilder.verticalLineToRelative(-3.11f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.curveTo(14.32f, 16.48f, 13.57f, 16.8f, 12.75f, 16.92f);
        pathBuilder.close();
        pathBuilder.moveTo(16.01f, 14.95f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.curveTo(16.8f, 13.57f, 16.48f, 14.32f, 16.01f, 14.95f);
        pathBuilder.close();
        pathBuilder.moveTo(13.81f, 11.25f);
        pathBuilder.lineToRelative(2.2f, -2.2f);
        pathBuilder.curveToRelative(0.47f, 0.64f, 0.79f, 1.39f, 0.91f, 2.2f);
        pathBuilder.horizontalLineTo(13.81f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f22095a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}