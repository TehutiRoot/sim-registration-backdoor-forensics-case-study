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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_borderColor", "Landroidx/compose/material/icons/Icons$Outlined;", "getBorderColor", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "BorderColor", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBorderColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BorderColor.kt\nandroidx/compose/material/icons/outlined/BorderColorKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n122#2:70\n116#2,3:71\n119#2,3:75\n132#2,18:78\n152#2:115\n132#2,18:116\n152#2:153\n132#2,18:154\n152#2:191\n174#3:74\n694#4,2:96\n706#4,2:98\n708#4,11:104\n694#4,2:134\n706#4,2:136\n708#4,11:142\n694#4,2:172\n706#4,2:174\n708#4,11:180\n64#5,4:100\n64#5,4:138\n64#5,4:176\n*S KotlinDebug\n*F\n+ 1 BorderColor.kt\nandroidx/compose/material/icons/outlined/BorderColorKt\n*L\n29#1:70\n29#1:71,3\n29#1:75,3\n30#1:78,18\n30#1:115\n46#1:116,18\n46#1:153\n57#1:154,18\n57#1:191\n29#1:74\n30#1:96,2\n30#1:98,2\n30#1:104,11\n46#1:134,2\n46#1:136,2\n46#1:142,11\n57#1:172,2\n57#1:174,2\n57#1:180,11\n30#1:100,4\n46#1:138,4\n57#1:176,4\n*E\n"})
/* loaded from: classes.dex */
public final class BorderColorKt {

    /* renamed from: a */
    public static ImageVector f17107a;

    @NotNull
    public static final ImageVector getBorderColor(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f17107a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BorderColor", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.81f, 8.94f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineTo(4.0f, 14.25f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(3.75f);
        pathBuilder.lineTo(16.81f, 8.94f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-0.92f);
        pathBuilder.lineToRelative(7.06f, -7.06f);
        pathBuilder.lineToRelative(0.92f, 0.92f);
        pathBuilder.lineTo(6.92f, 16.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.71f, 6.04f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.lineToRelative(-2.34f, -2.34f);
        pathBuilder2.curveTo(17.17f, 2.09f, 16.92f, 2.0f, 16.66f, 2.0f);
        pathBuilder2.curveToRelative(-0.25f, 0.0f, -0.51f, 0.1f, -0.7f, 0.29f);
        pathBuilder2.lineToRelative(-1.83f, 1.83f);
        pathBuilder2.lineToRelative(3.75f, 3.75f);
        pathBuilder2.lineTo(19.71f, 6.04f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(2.0f, 20.0f);
        pathBuilder3.horizontalLineToRelative(20.0f);
        pathBuilder3.verticalLineToRelative(4.0f);
        pathBuilder3.horizontalLineToRelative(-20.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f17107a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
