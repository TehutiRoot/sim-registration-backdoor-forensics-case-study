package androidx.compose.material.icons.twotone;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_findInPage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFindInPage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FindInPage", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFindInPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindInPage.kt\nandroidx/compose/material/icons/twotone/FindInPageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n122#2:90\n116#2,3:91\n119#2,3:95\n132#2,18:98\n152#2:135\n132#2,18:136\n152#2:173\n174#3:94\n694#4,2:116\n706#4,2:118\n708#4,11:124\n694#4,2:154\n706#4,2:156\n708#4,11:162\n64#5,4:120\n64#5,4:158\n*S KotlinDebug\n*F\n+ 1 FindInPage.kt\nandroidx/compose/material/icons/twotone/FindInPageKt\n*L\n29#1:90\n29#1:91,3\n29#1:95,3\n30#1:98,18\n30#1:135\n47#1:136,18\n47#1:173\n29#1:94\n30#1:116,2\n30#1:118,2\n30#1:124,11\n47#1:154,2\n47#1:156,2\n47#1:162,11\n30#1:120,4\n47#1:158,4\n*E\n"})
/* loaded from: classes.dex */
public final class FindInPageKt {

    /* renamed from: a */
    public static ImageVector f23981a;

    @NotNull
    public static final ImageVector getFindInPage(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23981a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FindInPage", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(11.6f);
        pathBuilder.lineToRelative(-2.85f, -2.85f);
        pathBuilder.curveToRelative(-0.83f, 0.55f, -1.79f, 0.83f, -2.75f, 0.83f);
        pathBuilder.curveToRelative(-1.28f, 0.0f, -2.55f, -0.49f, -3.53f, -1.46f);
        pathBuilder.curveToRelative(-1.95f, -1.95f, -1.95f, -5.11f, 0.0f, -7.05f);
        pathBuilder.curveTo(9.45f, 8.49f, 10.72f, 8.0f, 12.0f, 8.0f);
        pathBuilder.curveToRelative(1.28f, 0.0f, 2.55f, 0.49f, 3.53f, 1.46f);
        pathBuilder.curveToRelative(1.71f, 1.71f, 1.92f, 4.34f, 0.64f, 6.28f);
        pathBuilder.lineTo(18.0f, 17.58f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(-5.0f, -5.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.0f, 2.0f);
        pathBuilder2.lineTo(6.0f, 2.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder2.lineTo(4.0f, 20.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder2.lineTo(18.0f, 22.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(20.0f, 8.0f);
        pathBuilder2.lineToRelative(-6.0f, -6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 17.58f);
        pathBuilder2.lineToRelative(-1.84f, -1.84f);
        pathBuilder2.curveToRelative(1.28f, -1.94f, 1.07f, -4.57f, -0.64f, -6.28f);
        pathBuilder2.curveTo(14.55f, 8.49f, 13.28f, 8.0f, 12.0f, 8.0f);
        pathBuilder2.curveToRelative(-1.28f, 0.0f, -2.55f, 0.49f, -3.53f, 1.46f);
        pathBuilder2.curveToRelative(-1.95f, 1.95f, -1.95f, 5.11f, 0.0f, 7.05f);
        pathBuilder2.curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.53f, 1.46f);
        pathBuilder2.curveToRelative(0.96f, 0.0f, 1.92f, -0.28f, 2.75f, -0.83f);
        pathBuilder2.lineTo(17.6f, 20.0f);
        pathBuilder2.lineTo(6.0f, 20.0f);
        pathBuilder2.lineTo(6.0f, 4.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.lineToRelative(5.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(8.58f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.99f, 12.99f);
        pathBuilder2.curveToRelative(0.0f, 0.8f, -0.31f, 1.55f, -0.88f, 2.11f);
        pathBuilder2.curveToRelative(-0.56f, 0.56f, -1.31f, 0.88f, -2.11f, 0.88f);
        pathBuilder2.reflectiveCurveToRelative(-1.55f, -0.31f, -2.11f, -0.88f);
        pathBuilder2.curveToRelative(-0.56f, -0.56f, -0.88f, -1.31f, -0.88f, -2.11f);
        pathBuilder2.reflectiveCurveToRelative(0.31f, -1.55f, 0.88f, -2.11f);
        pathBuilder2.reflectiveCurveTo(11.2f, 10.0f, 12.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(1.55f, 0.31f, 2.11f, 0.88f);
        pathBuilder2.curveToRelative(0.57f, 0.56f, 0.88f, 1.31f, 0.88f, 2.11f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23981a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
