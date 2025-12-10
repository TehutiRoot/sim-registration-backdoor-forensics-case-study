package androidx.compose.material.icons.rounded;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_downloading", "Landroidx/compose/material/icons/Icons$Rounded;", "getDownloading", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Downloading", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDownloading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Downloading.kt\nandroidx/compose/material/icons/rounded/DownloadingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n122#2:104\n116#2,3:105\n119#2,3:109\n132#2,18:112\n152#2:149\n174#3:108\n694#4,2:130\n706#4,2:132\n708#4,11:138\n64#5,4:134\n*S KotlinDebug\n*F\n+ 1 Downloading.kt\nandroidx/compose/material/icons/rounded/DownloadingKt\n*L\n29#1:104\n29#1:105,3\n29#1:109,3\n30#1:112,18\n30#1:149\n29#1:108\n30#1:130,2\n30#1:132,2\n30#1:138,11\n30#1:134,4\n*E\n"})
/* loaded from: classes.dex */
public final class DownloadingKt {

    /* renamed from: a */
    public static ImageVector f19565a;

    @NotNull
    public static final ImageVector getDownloading(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19565a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Downloading", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.33f, 3.55f);
        pathBuilder.curveToRelative(-0.94f, -0.6f, -1.99f, -1.04f, -3.12f, -1.3f);
        pathBuilder.curveTo(13.59f, 2.11f, 13.0f, 2.59f, 13.0f, 3.23f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.3f, 0.87f, 0.74f, 0.97f);
        pathBuilder.curveToRelative(0.91f, 0.2f, 1.77f, 0.56f, 2.53f, 1.05f);
        pathBuilder.curveToRelative(0.39f, 0.25f, 0.89f, 0.17f, 1.22f, -0.16f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(17.94f, 4.64f, 17.87f, 3.89f, 17.33f, 3.55f);
        pathBuilder.close();
        pathBuilder.moveTo(20.77f, 11.0f);
        pathBuilder.lineTo(20.77f, 11.0f);
        pathBuilder.curveToRelative(0.64f, 0.0f, 1.13f, -0.59f, 0.98f, -1.21f);
        pathBuilder.curveToRelative(-0.26f, -1.12f, -0.7f, -2.17f, -1.3f, -3.12f);
        pathBuilder.curveToRelative(-0.34f, -0.54f, -1.1f, -0.61f, -1.55f, -0.16f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.32f, 0.32f, -0.4f, 0.83f, -0.16f, 1.22f);
        pathBuilder.curveToRelative(0.49f, 0.77f, 0.85f, 1.62f, 1.05f, 2.53f);
        pathBuilder.curveTo(19.9f, 10.7f, 20.31f, 11.0f, 20.77f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.9f, 17.49f);
        pathBuilder.lineTo(18.9f, 17.49f);
        pathBuilder.curveToRelative(0.45f, 0.45f, 1.21f, 0.38f, 1.55f, -0.15f);
        pathBuilder.curveToRelative(0.6f, -0.94f, 1.04f, -1.99f, 1.3f, -3.11f);
        pathBuilder.curveToRelative(0.14f, -0.62f, -0.35f, -1.21f, -0.98f, -1.21f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.87f, 0.3f, -0.97f, 0.74f);
        pathBuilder.curveToRelative(-0.2f, 0.91f, -0.57f, 1.76f, -1.05f, 2.53f);
        pathBuilder.curveTo(18.5f, 16.66f, 18.58f, 17.17f, 18.9f, 17.49f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 20.77f);
        pathBuilder.lineTo(13.0f, 20.77f);
        pathBuilder.curveToRelative(0.0f, 0.64f, 0.59f, 1.13f, 1.21f, 0.98f);
        pathBuilder.curveToRelative(1.12f, -0.26f, 2.17f, -0.7f, 3.11f, -1.3f);
        pathBuilder.curveToRelative(0.54f, -0.34f, 0.61f, -1.1f, 0.16f, -1.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.32f, -0.32f, -0.83f, -0.4f, -1.21f, -0.15f);
        pathBuilder.curveToRelative(-0.76f, 0.49f, -1.61f, 0.85f, -2.53f, 1.05f);
        pathBuilder.curveTo(13.3f, 19.9f, 13.0f, 20.31f, 13.0f, 20.77f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(9.41f);
        pathBuilder.curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
        pathBuilder.lineToRelative(2.59f, 2.59f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.59f, -2.59f);
        pathBuilder.curveToRelative(0.63f, -0.63f, 0.18f, -1.71f, -0.71f, -1.71f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 20.77f);
        pathBuilder.lineTo(11.0f, 20.77f);
        pathBuilder.curveToRelative(0.0f, 0.64f, -0.59f, 1.13f, -1.21f, 0.99f);
        pathBuilder.curveTo(5.33f, 20.75f, 2.0f, 16.77f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(3.33f, -8.75f, 7.79f, -9.75f);
        pathBuilder.curveTo(10.41f, 2.11f, 11.0f, 2.59f, 11.0f, 3.23f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.46f, -0.31f, 0.87f, -0.76f, 0.97f);
        pathBuilder.curveTo(6.67f, 5.0f, 4.0f, 8.19f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(2.67f, 7.0f, 6.24f, 7.8f);
        pathBuilder.curveTo(10.69f, 19.9f, 11.0f, 20.31f, 11.0f, 20.77f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19565a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
