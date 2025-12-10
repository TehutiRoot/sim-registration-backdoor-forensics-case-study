package androidx.compose.material.icons.twotone;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_noFlash", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNoFlash", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "NoFlash", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNoFlash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoFlash.kt\nandroidx/compose/material/icons/twotone/NoFlashKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n122#2:113\n116#2,3:114\n119#2,3:118\n132#2,18:121\n152#2:158\n132#2,18:159\n152#2:196\n174#3:117\n694#4,2:139\n706#4,2:141\n708#4,11:147\n694#4,2:177\n706#4,2:179\n708#4,11:185\n64#5,4:143\n64#5,4:181\n*S KotlinDebug\n*F\n+ 1 NoFlash.kt\nandroidx/compose/material/icons/twotone/NoFlashKt\n*L\n29#1:113\n29#1:114,3\n29#1:118,3\n30#1:121,18\n30#1:158\n50#1:159,18\n50#1:196\n29#1:117\n30#1:139,2\n30#1:141,2\n30#1:147,11\n50#1:177,2\n50#1:179,2\n50#1:185,11\n30#1:143,4\n50#1:181,4\n*E\n"})
/* loaded from: classes.dex */
public final class NoFlashKt {

    /* renamed from: a */
    public static ImageVector f24586a;

    @NotNull
    public static final ImageVector getNoFlash(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24586a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoFlash", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.42f, 16.24f);
        pathBuilder.lineToRelative(2.55f, 2.55f);
        pathBuilder.lineTo(15.96f, 20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-8.6f);
        pathBuilder.horizontalLineToRelative(3.02f);
        pathBuilder.lineToRelative(0.59f, -0.65f);
        pathBuilder.lineToRelative(0.15f, -0.16f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f);
        pathBuilder.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder.curveTo(11.68f, 19.0f, 13.07f, 17.82f, 13.42f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 13.17f);
        pathBuilder.lineToRelative(0.0f, -1.77f);
        pathBuilder.horizontalLineToRelative(-1.77f);
        pathBuilder.lineTo(16.0f, 13.17f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.4f, 5.6f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.lineTo(19.0f, 11.0f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.verticalLineTo(2.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.lineTo(20.4f, 5.6f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 11.4f);
        pathBuilder2.verticalLineToRelative(1.77f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.curveToRelative(0.0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f);
        pathBuilder2.horizontalLineToRelative(-2.54f);
        pathBuilder2.lineTo(12.58f, 8.0f);
        pathBuilder2.horizontalLineToRelative(-1.75f);
        pathBuilder2.lineToRelative(3.4f, 3.4f);
        pathBuilder2.horizontalLineTo(16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.97f, 17.97f);
        pathBuilder2.lineTo(2.1f, 2.1f);
        pathBuilder2.lineTo(0.69f, 3.51f);
        pathBuilder2.lineToRelative(5.66f, 5.66f);
        pathBuilder2.lineTo(6.14f, 9.4f);
        pathBuilder2.horizontalLineTo(3.6f);
        pathBuilder2.curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f);
        pathBuilder2.verticalLineToRelative(9.4f);
        pathBuilder2.curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f);
        pathBuilder2.horizontalLineToRelative(12.8f);
        pathBuilder2.curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f);
        pathBuilder2.lineToRelative(2.54f, 2.54f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(17.97f, 17.97f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.5f, 15.5f);
        pathBuilder2.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(9.17f, 14.0f, 10.0f, 14.0f);
        pathBuilder2.reflectiveCurveTo(11.5f, 14.67f, 11.5f, 15.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.96f, 20.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(-8.6f);
        pathBuilder2.horizontalLineToRelative(2.14f);
        pathBuilder2.horizontalLineToRelative(0.88f);
        pathBuilder2.lineToRelative(0.59f, -0.65f);
        pathBuilder2.lineToRelative(0.15f, -0.16f);
        pathBuilder2.lineToRelative(1.5f, 1.5f);
        pathBuilder2.curveTo(7.68f, 12.43f, 6.5f, 13.82f, 6.5f, 15.5f);
        pathBuilder2.curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder2.curveToRelative(1.68f, 0.0f, 3.07f, -1.18f, 3.42f, -2.76f);
        pathBuilder2.lineToRelative(2.55f, 2.55f);
        pathBuilder2.lineTo(15.96f, 20.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24586a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}