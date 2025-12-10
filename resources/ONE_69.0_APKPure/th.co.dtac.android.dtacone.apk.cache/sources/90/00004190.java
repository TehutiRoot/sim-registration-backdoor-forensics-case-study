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
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_key", "Landroidx/compose/material/icons/Icons$Rounded;", "getKey", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", PDAnnotationText.NAME_KEY, "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Key.kt\nandroidx/compose/material/icons/rounded/KeyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,60:1\n122#2:61\n116#2,3:62\n119#2,3:66\n132#2,18:69\n152#2:106\n174#3:65\n694#4,2:87\n706#4,2:89\n708#4,11:95\n64#5,4:91\n*S KotlinDebug\n*F\n+ 1 Key.kt\nandroidx/compose/material/icons/rounded/KeyKt\n*L\n29#1:61\n29#1:62,3\n29#1:66,3\n30#1:69,18\n30#1:106\n29#1:65\n30#1:87,2\n30#1:89,2\n30#1:95,11\n30#1:91,4\n*E\n"})
/* loaded from: classes.dex */
public final class KeyKt {

    /* renamed from: a */
    public static ImageVector f20054a;

    @NotNull
    public static final ImageVector getKey(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20054a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Key", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.59f, 10.0f);
        pathBuilder.horizontalLineToRelative(-7.94f);
        pathBuilder.curveTo(11.7f, 7.31f, 8.89f, 5.5f, 5.77f, 6.12f);
        pathBuilder.curveToRelative(-2.29f, 0.46f, -4.15f, 2.3f, -4.63f, 4.58f);
        pathBuilder.curveTo(0.32f, 14.58f, 3.26f, 18.0f, 7.0f, 18.0f);
        pathBuilder.curveToRelative(2.61f, 0.0f, 4.83f, -1.67f, 5.65f, -4.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.lineToRelative(1.29f, 1.29f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(17.0f, 14.0f);
        pathBuilder.lineToRelative(1.29f, 1.29f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(2.59f, -2.61f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f);
        pathBuilder.lineToRelative(-0.99f, -0.97f);
        pathBuilder.curveTo(21.1f, 10.1f, 20.85f, 10.0f, 20.59f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 15.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.curveTo(10.0f, 13.65f, 8.65f, 15.0f, 7.0f, 15.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20054a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}