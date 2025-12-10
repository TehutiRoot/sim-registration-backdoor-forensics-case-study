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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_wbAuto", "Landroidx/compose/material/icons/Icons$Rounded;", "getWbAuto", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "WbAuto", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWbAuto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbAuto.kt\nandroidx/compose/material/icons/rounded/WbAutoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n122#2:78\n116#2,3:79\n119#2,3:83\n132#2,18:86\n152#2:123\n174#3:82\n694#4,2:104\n706#4,2:106\n708#4,11:112\n64#5,4:108\n*S KotlinDebug\n*F\n+ 1 WbAuto.kt\nandroidx/compose/material/icons/rounded/WbAutoKt\n*L\n29#1:78\n29#1:79,3\n29#1:83,3\n30#1:86,18\n30#1:123\n29#1:82\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"})
/* loaded from: classes.dex */
public final class WbAutoKt {

    /* renamed from: a */
    public static ImageVector f21121a;

    @NotNull
    public static final ImageVector getWbAuto(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f21121a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WbAuto", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.85f, 12.65f);
        pathBuilder.horizontalLineToRelative(2.3f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.72f, 7.0f);
        pathBuilder.curveToRelative(-0.42f, 0.0f, -0.77f, 0.3f, -0.85f, 0.7f);
        pathBuilder.lineToRelative(-1.07f, 5.59f);
        pathBuilder.lineToRelative(-1.31f, -5.51f);
        pathBuilder.curveToRelative(-0.11f, -0.46f, -0.52f, -0.78f, -0.99f, -0.78f);
        pathBuilder.reflectiveCurveToRelative(-0.88f, 0.32f, -0.98f, 0.78f);
        pathBuilder.lineToRelative(-1.31f, 5.51f);
        pathBuilder.lineToRelative(-1.07f, -5.59f);
        pathBuilder.curveToRelative(-0.08f, -0.4f, -0.44f, -0.7f, -0.85f, -0.7f);
        pathBuilder.curveToRelative(-0.01f, 0.0f, -0.03f, 0.01f, -0.04f, 0.01f);
        pathBuilder.curveTo(12.78f, 5.18f, 10.53f, 4.0f, 8.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(3.17f, 0.0f, 5.9f, -1.85f, 7.2f, -4.52f);
        pathBuilder.curveToRelative(0.2f, 0.32f, 0.55f, 0.52f, 0.94f, 0.52f);
        pathBuilder.curveToRelative(0.51f, 0.0f, 0.95f, -0.35f, 1.07f, -0.84f);
        pathBuilder.lineTo(18.5f, 9.9f);
        pathBuilder.lineToRelative(1.29f, 5.26f);
        pathBuilder.curveToRelative(0.12f, 0.49f, 0.57f, 0.84f, 1.07f, 0.84f);
        pathBuilder.curveToRelative(0.52f, 0.0f, 0.96f, -0.36f, 1.08f, -0.86f);
        pathBuilder.lineToRelative(1.61f, -7.08f);
        pathBuilder.curveToRelative(0.13f, -0.54f, -0.28f, -1.06f, -0.83f, -1.06f);
        pathBuilder.close();
        pathBuilder.moveTo(10.93f, 16.0f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.72f, -0.24f, -0.84f, -0.6f);
        pathBuilder.lineTo(9.6f, 14.0f);
        pathBuilder.lineTo(6.4f, 14.0f);
        pathBuilder.lineToRelative(-0.49f, 1.4f);
        pathBuilder.curveToRelative(-0.13f, 0.36f, -0.46f, 0.6f, -0.84f, 0.6f);
        pathBuilder.curveToRelative(-0.62f, 0.0f, -1.05f, -0.61f, -0.84f, -1.19f);
        pathBuilder.lineToRelative(2.44f, -6.86f);
        pathBuilder.curveTo(6.87f, 7.38f, 7.4f, 7.0f, 8.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(1.13f, 0.38f, 1.34f, 0.94f);
        pathBuilder.lineToRelative(2.44f, 6.86f);
        pathBuilder.curveToRelative(0.2f, 0.59f, -0.23f, 1.2f, -0.85f, 1.2f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f21121a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}