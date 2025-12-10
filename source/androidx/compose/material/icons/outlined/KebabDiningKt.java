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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_kebabDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getKebabDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "KebabDining", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKebabDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KebabDining.kt\nandroidx/compose/material/icons/outlined/KebabDiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,149:1\n122#2:150\n116#2,3:151\n119#2,3:155\n132#2,18:158\n152#2:195\n174#3:154\n694#4,2:176\n706#4,2:178\n708#4,11:184\n64#5,4:180\n*S KotlinDebug\n*F\n+ 1 KebabDining.kt\nandroidx/compose/material/icons/outlined/KebabDiningKt\n*L\n29#1:150\n29#1:151,3\n29#1:155,3\n30#1:158,18\n30#1:195\n29#1:154\n30#1:176,2\n30#1:178,2\n30#1:184,11\n30#1:180,4\n*E\n"})
/* loaded from: classes.dex */
public final class KebabDiningKt {

    /* renamed from: a */
    public static ImageVector f17833a;

    @NotNull
    public static final ImageVector getKebabDining(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f17833a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.KebabDining", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.75f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.curveTo(19.88f, 7.0f, 21.0f, 5.88f, 21.0f, 4.5f);
        pathBuilder.curveTo(21.0f, 3.12f, 19.88f, 2.0f, 18.5f, 2.0f);
        pathBuilder.horizontalLineToRelative(-0.75f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.curveTo(14.12f, 2.0f, 13.0f, 3.12f, 13.0f, 4.5f);
        pathBuilder.curveTo(13.0f, 5.88f, 14.12f, 7.0f, 15.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(3.25f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.horizontalLineToRelative(-0.75f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-3.25f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 5.0f);
        pathBuilder.curveTo(15.22f, 5.0f, 15.0f, 4.78f, 15.0f, 4.5f);
        pathBuilder.reflectiveCurveTo(15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveTo(18.78f, 4.0f, 19.0f, 4.22f, 19.0f, 4.5f);
        pathBuilder.reflectiveCurveTo(18.78f, 5.0f, 18.5f, 5.0f);
        pathBuilder.horizontalLineTo(15.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 16.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(18.78f, 17.0f, 18.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineTo(18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.75f, 7.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(9.88f, 7.0f, 11.0f, 5.88f, 11.0f, 4.5f);
        pathBuilder.curveTo(11.0f, 3.12f, 9.88f, 2.0f, 8.5f, 2.0f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.curveTo(4.12f, 2.0f, 3.0f, 3.12f, 3.0f, 4.5f);
        pathBuilder.curveTo(3.0f, 5.88f, 4.12f, 7.0f, 5.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(3.25f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.curveTo(4.12f, 14.0f, 3.0f, 15.12f, 3.0f, 16.5f);
        pathBuilder.curveTo(3.0f, 17.88f, 4.12f, 19.0f, 5.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(7.75f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 5.0f);
        pathBuilder.curveTo(5.22f, 5.0f, 5.0f, 4.78f, 5.0f, 4.5f);
        pathBuilder.reflectiveCurveTo(5.22f, 4.0f, 5.5f, 4.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveTo(8.78f, 4.0f, 9.0f, 4.22f, 9.0f, 4.5f);
        pathBuilder.reflectiveCurveTo(8.78f, 5.0f, 8.5f, 5.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 16.0f);
        pathBuilder.curveTo(8.78f, 16.0f, 9.0f, 16.22f, 9.0f, 16.5f);
        pathBuilder.reflectiveCurveTo(8.78f, 17.0f, 8.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(5.22f, 17.0f, 5.0f, 16.78f, 5.0f, 16.5f);
        pathBuilder.reflectiveCurveTo(5.22f, 16.0f, 5.5f, 16.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f17833a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
