package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_bugReport", "Landroidx/compose/material/icons/Icons$Outlined;", "getBugReport", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "BugReport", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBugReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReport.kt\nandroidx/compose/material/icons/outlined/BugReportKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,114:1\n122#2:115\n116#2,3:116\n119#2,3:120\n132#2,18:123\n152#2:160\n174#3:119\n694#4,2:141\n706#4,2:143\n708#4,11:149\n64#5,4:145\n*S KotlinDebug\n*F\n+ 1 BugReport.kt\nandroidx/compose/material/icons/outlined/BugReportKt\n*L\n29#1:115\n29#1:116,3\n29#1:120,3\n30#1:123,18\n30#1:160\n29#1:119\n30#1:141,2\n30#1:143,2\n30#1:149,11\n30#1:145,4\n*E\n"})
/* loaded from: classes.dex */
public final class BugReportKt {

    /* renamed from: a */
    public static ImageVector f17139a;

    @NotNull
    public static final ImageVector getBugReport(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f17139a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BugReport", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-2.81f);
        pathBuilder.curveToRelative(-0.45f, -0.78f, -1.07f, -1.45f, -1.82f, -1.96f);
        pathBuilder.lineTo(17.0f, 4.41f);
        pathBuilder.lineTo(15.59f, 3.0f);
        pathBuilder.lineToRelative(-2.17f, 2.17f);
        pathBuilder.curveTo(12.96f, 5.06f, 12.49f, 5.0f, 12.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(-0.96f, 0.06f, -1.41f, 0.17f);
        pathBuilder.lineTo(8.41f, 3.0f);
        pathBuilder.lineTo(7.0f, 4.41f);
        pathBuilder.lineToRelative(1.62f, 1.63f);
        pathBuilder.curveTo(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8.0f);
        pathBuilder.lineTo(4.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.09f);
        pathBuilder.curveToRelative(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineTo(4.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        pathBuilder.lineTo(4.0f, 16.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.81f);
        pathBuilder.curveToRelative(1.04f, 1.79f, 2.97f, 3.0f, 5.19f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(4.15f, -1.21f, 5.19f, -3.0f);
        pathBuilder.lineTo(20.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.09f);
        pathBuilder.curveToRelative(0.05f, -0.33f, 0.09f, -0.66f, 0.09f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        pathBuilder.lineTo(20.0f, 10.0f);
        pathBuilder.lineTo(20.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 12.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.22f, -0.03f, 0.47f, -0.07f, 0.7f);
        pathBuilder.lineToRelative(-0.1f, 0.65f);
        pathBuilder.lineToRelative(-0.37f, 0.65f);
        pathBuilder.curveToRelative(-0.72f, 1.24f, -2.04f, 2.0f, -3.46f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.74f, -0.77f, -3.46f, -2.0f);
        pathBuilder.lineToRelative(-0.37f, -0.64f);
        pathBuilder.lineToRelative(-0.1f, -0.65f);
        pathBuilder.curveTo(8.03f, 15.48f, 8.0f, 15.23f, 8.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.23f, 0.03f, -0.48f, 0.07f, -0.7f);
        pathBuilder.lineToRelative(0.1f, -0.65f);
        pathBuilder.lineToRelative(0.37f, -0.65f);
        pathBuilder.curveToRelative(0.3f, -0.52f, 0.72f, -0.97f, 1.21f, -1.31f);
        pathBuilder.lineToRelative(0.57f, -0.39f);
        pathBuilder.lineToRelative(0.74f, -0.18f);
        pathBuilder.curveToRelative(0.31f, -0.08f, 0.63f, -0.12f, 0.94f, -0.12f);
        pathBuilder.curveToRelative(0.32f, 0.0f, 0.63f, 0.04f, 0.95f, 0.12f);
        pathBuilder.lineToRelative(0.68f, 0.16f);
        pathBuilder.lineToRelative(0.61f, 0.42f);
        pathBuilder.curveToRelative(0.5f, 0.34f, 0.91f, 0.78f, 1.21f, 1.31f);
        pathBuilder.lineToRelative(0.38f, 0.65f);
        pathBuilder.lineToRelative(0.1f, 0.65f);
        pathBuilder.curveToRelative(0.04f, 0.22f, 0.07f, 0.47f, 0.07f, 0.69f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f17139a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
