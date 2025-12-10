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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_editAttributes", "Landroidx/compose/material/icons/Icons$TwoTone;", "getEditAttributes", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "EditAttributes", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditAttributes.kt\nandroidx/compose/material/icons/twotone/EditAttributesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n122#2:79\n116#2,3:80\n119#2,3:84\n132#2,18:87\n152#2:124\n132#2,18:125\n152#2:162\n174#3:83\n694#4,2:105\n706#4,2:107\n708#4,11:113\n694#4,2:143\n706#4,2:145\n708#4,11:151\n64#5,4:109\n64#5,4:147\n*S KotlinDebug\n*F\n+ 1 EditAttributes.kt\nandroidx/compose/material/icons/twotone/EditAttributesKt\n*L\n29#1:79\n29#1:80,3\n29#1:84,3\n30#1:87,18\n30#1:124\n48#1:125,18\n48#1:162\n29#1:83\n30#1:105,2\n30#1:107,2\n30#1:113,11\n48#1:143,2\n48#1:145,2\n48#1:151,11\n30#1:109,4\n48#1:147,4\n*E\n"})
/* loaded from: classes.dex */
public final class EditAttributesKt {

    /* renamed from: a */
    public static ImageVector f23852a;

    @NotNull
    public static final ImageVector getEditAttributes(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23852a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EditAttributes", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.63f, 9.0f);
        pathBuilder.horizontalLineTo(6.37f);
        pathBuilder.curveTo(5.09f, 9.0f, 4.0f, 10.37f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.09f, 3.0f, 2.37f, 3.0f);
        pathBuilder.horizontalLineToRelative(11.26f);
        pathBuilder.curveToRelative(1.28f, 0.0f, 2.37f, -1.37f, 2.37f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.09f, -3.0f, -2.37f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.24f, 14.46f);
        pathBuilder.lineToRelative(-2.57f, -2.57f);
        pathBuilder.lineToRelative(0.7f, -0.7f);
        pathBuilder.lineToRelative(1.87f, 1.87f);
        pathBuilder.lineToRelative(3.52f, -3.52f);
        pathBuilder.lineToRelative(0.7f, 0.7f);
        pathBuilder.lineToRelative(-4.22f, 4.22f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.63f, 7.0f);
        pathBuilder2.lineTo(6.37f, 7.0f);
        pathBuilder2.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        pathBuilder2.horizontalLineToRelative(11.26f);
        pathBuilder2.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.63f, 15.0f);
        pathBuilder2.lineTo(6.37f, 15.0f);
        pathBuilder2.curveTo(5.09f, 15.0f, 4.0f, 13.63f, 4.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.09f, -3.0f, 2.37f, -3.0f);
        pathBuilder2.horizontalLineToRelative(11.26f);
        pathBuilder2.curveTo(18.91f, 9.0f, 20.0f, 10.37f, 20.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.09f, 3.0f, -2.37f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.24f, 13.06f);
        pathBuilder2.lineToRelative(-1.87f, -1.87f);
        pathBuilder2.lineToRelative(-0.7f, 0.7f);
        pathBuilder2.lineToRelative(2.57f, 2.57f);
        pathBuilder2.lineToRelative(4.22f, -4.22f);
        pathBuilder2.lineToRelative(-0.7f, -0.7f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23852a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
