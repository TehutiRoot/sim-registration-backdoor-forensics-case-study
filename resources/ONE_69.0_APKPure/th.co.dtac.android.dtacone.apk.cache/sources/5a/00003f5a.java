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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_construction", "Landroidx/compose/material/icons/Icons$Rounded;", "getConstruction", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Construction", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConstruction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Construction.kt\nandroidx/compose/material/icons/rounded/ConstructionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n122#2:83\n116#2,3:84\n119#2,3:88\n132#2,18:91\n152#2:128\n132#2,18:129\n152#2:166\n174#3:87\n694#4,2:109\n706#4,2:111\n708#4,11:117\n694#4,2:147\n706#4,2:149\n708#4,11:155\n64#5,4:113\n64#5,4:151\n*S KotlinDebug\n*F\n+ 1 Construction.kt\nandroidx/compose/material/icons/rounded/ConstructionKt\n*L\n29#1:83\n29#1:84,3\n29#1:88,3\n30#1:91,18\n30#1:128\n39#1:129,18\n39#1:166\n29#1:87\n30#1:109,2\n30#1:111,2\n30#1:117,11\n39#1:147,2\n39#1:149,2\n39#1:155,11\n30#1:113,4\n39#1:151,4\n*E\n"})
/* loaded from: classes.dex */
public final class ConstructionKt {

    /* renamed from: a */
    public static ImageVector f19488a;

    @NotNull
    public static final ImageVector getConstruction(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19488a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Construction", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.99f, 17.99f);
        pathBuilder.lineToRelative(-4.94f, -4.94f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.lineToRelative(4.94f, 4.94f);
        pathBuilder.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        pathBuilder.curveTo(21.57f, 19.52f, 21.57f, 18.57f, 20.99f, 17.99f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.65f, 10.0f);
        pathBuilder2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder2.curveToRelative(0.0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f);
        pathBuilder2.lineToRelative(-2.7f, 2.7f);
        pathBuilder2.lineToRelative(-1.49f, -1.49f);
        pathBuilder2.lineToRelative(2.7f, -2.7f);
        pathBuilder2.curveTo(18.77f, 3.16f, 18.23f, 3.0f, 17.65f, 3.0f);
        pathBuilder2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder2.curveToRelative(0.0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f);
        pathBuilder2.lineToRelative(-1.85f, 1.85f);
        pathBuilder2.lineToRelative(-1.78f, -1.78f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder2.lineToRelative(-0.71f, -0.71f);
        pathBuilder2.lineToRelative(2.12f, -2.12f);
        pathBuilder2.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        pathBuilder2.lineTo(5.08f, 6.32f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder2.lineToRelative(0.71f, 0.71f);
        pathBuilder2.horizontalLineTo(3.25f);
        pathBuilder2.curveToRelative(-0.19f, 0.0f, -0.37f, 0.07f, -0.5f, 0.21f);
        pathBuilder2.curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0.0f, 1.0f);
        pathBuilder2.lineToRelative(2.54f, 2.54f);
        pathBuilder2.curveToRelative(0.28f, 0.28f, 0.72f, 0.28f, 1.0f, 0.0f);
        pathBuilder2.curveToRelative(0.13f, -0.13f, 0.21f, -0.31f, 0.21f, -0.5f);
        pathBuilder2.verticalLineTo(9.15f);
        pathBuilder2.lineTo(7.2f, 9.85f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder2.lineToRelative(1.78f, 1.78f);
        pathBuilder2.lineToRelative(-6.35f, 6.35f);
        pathBuilder2.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        pathBuilder2.lineTo(16.48f, 9.79f);
        pathBuilder2.curveTo(16.85f, 9.92f, 17.24f, 10.0f, 17.65f, 10.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19488a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}