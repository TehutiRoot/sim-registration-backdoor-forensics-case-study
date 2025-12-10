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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_fiberDvr", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFiberDvr", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FiberDvr", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFiberDvr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiberDvr.kt\nandroidx/compose/material/icons/twotone/FiberDvrKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n122#2:104\n116#2,3:105\n119#2,3:109\n132#2,18:112\n152#2:149\n132#2,18:150\n152#2:187\n132#2,18:188\n152#2:225\n174#3:108\n694#4,2:130\n706#4,2:132\n708#4,11:138\n694#4,2:168\n706#4,2:170\n708#4,11:176\n694#4,2:206\n706#4,2:208\n708#4,11:214\n64#5,4:134\n64#5,4:172\n64#5,4:210\n*S KotlinDebug\n*F\n+ 1 FiberDvr.kt\nandroidx/compose/material/icons/twotone/FiberDvrKt\n*L\n29#1:104\n29#1:105,3\n29#1:109,3\n30#1:112,18\n30#1:149\n73#1:150,18\n73#1:187\n80#1:188,18\n80#1:225\n29#1:108\n30#1:130,2\n30#1:132,2\n30#1:138,11\n73#1:168,2\n73#1:170,2\n73#1:176,11\n80#1:206,2\n80#1:208,2\n80#1:214,11\n30#1:134,4\n73#1:172,4\n80#1:210,4\n*E\n"})
/* loaded from: classes.dex */
public final class FiberDvrKt {

    /* renamed from: a */
    public static ImageVector f23946a;

    @NotNull
    public static final ImageVector getFiberDvr(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23946a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FiberDvr", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 11.56f);
        pathBuilder.verticalLineToRelative(-0.89f);
        pathBuilder.curveToRelative(0.0f, -0.76f, -0.58f, -1.33f, -1.33f, -1.33f);
        pathBuilder.horizontalLineToRelative(-3.11f);
        pathBuilder.verticalLineToRelative(5.33f);
        pathBuilder.horizontalLineToRelative(1.33f);
        pathBuilder.verticalLineToRelative(-1.78f);
        pathBuilder.horizontalLineToRelative(1.02f);
        pathBuilder.lineToRelative(0.76f, 1.78f);
        pathBuilder.lineTo(20.0f, 14.67f);
        pathBuilder.lineToRelative(-0.8f, -1.87f);
        pathBuilder.curveToRelative(0.44f, -0.22f, 0.8f, -0.71f, 0.8f, -1.24f);
        pathBuilder.close();
        pathBuilder.moveTo(18.67f, 11.56f);
        pathBuilder.horizontalLineToRelative(-1.78f);
        pathBuilder.verticalLineToRelative(-0.89f);
        pathBuilder.horizontalLineToRelative(1.78f);
        pathBuilder.verticalLineToRelative(0.89f);
        pathBuilder.close();
        pathBuilder.moveTo(7.11f, 9.33f);
        pathBuilder.lineTo(4.0f, 9.33f);
        pathBuilder.verticalLineToRelative(5.33f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.33f, -0.58f, 1.33f, -1.33f);
        pathBuilder.verticalLineToRelative(-2.67f);
        pathBuilder.curveToRelative(0.0f, -0.75f, -0.57f, -1.33f, -1.33f, -1.33f);
        pathBuilder.close();
        pathBuilder.moveTo(7.11f, 13.33f);
        pathBuilder.lineTo(5.33f, 13.33f);
        pathBuilder.verticalLineToRelative(-2.67f);
        pathBuilder.horizontalLineToRelative(1.78f);
        pathBuilder.verticalLineToRelative(2.67f);
        pathBuilder.close();
        pathBuilder.moveTo(14.11f, 9.33f);
        pathBuilder.horizontalLineToRelative(-1.34f);
        pathBuilder.lineToRelative(-0.89f, 3.05f);
        pathBuilder.lineTo(11.0f, 9.33f);
        pathBuilder.lineTo(9.66f, 9.33f);
        pathBuilder.lineToRelative(1.56f, 5.34f);
        pathBuilder.horizontalLineToRelative(1.33f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(18.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.horizontalLineTo(3.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.0f, 3.0f);
        pathBuilder3.lineTo(3.0f, 3.0f);
        pathBuilder3.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(18.0f);
        pathBuilder3.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.lineTo(23.0f, 5.0f);
        pathBuilder3.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(21.0f, 19.0f);
        pathBuilder3.lineTo(3.0f, 19.0f);
        pathBuilder3.lineTo(3.0f, 5.0f);
        pathBuilder3.horizontalLineToRelative(18.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23946a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
