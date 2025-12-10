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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_onlinePrediction", "Landroidx/compose/material/icons/Icons$Rounded;", "getOnlinePrediction", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "OnlinePrediction", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnlinePrediction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/rounded/OnlinePredictionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n122#2:101\n116#2,3:102\n119#2,3:106\n132#2,18:109\n152#2:146\n174#3:105\n694#4,2:127\n706#4,2:129\n708#4,11:135\n64#5,4:131\n*S KotlinDebug\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/rounded/OnlinePredictionKt\n*L\n29#1:101\n29#1:102,3\n29#1:106,3\n30#1:109,18\n30#1:146\n29#1:105\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"})
/* loaded from: classes.dex */
public final class OnlinePredictionKt {

    /* renamed from: a */
    public static ImageVector f20359a;

    @NotNull
    public static final ImageVector getOnlinePrediction(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20359a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OnlinePrediction", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 11.5f);
        pathBuilder.curveToRelative(0.0f, 2.0f, -2.5f, 3.5f, -2.5f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        pathBuilder.curveTo(8.5f, 9.57f, 10.07f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(15.5f, 9.57f, 15.5f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.46f, -0.89f, -4.71f, -2.36f, -6.45f);
        pathBuilder.curveToRelative(-0.29f, -0.34f, -0.8f, -0.38f, -1.12f, -0.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.27f, 0.27f, -0.3f, 0.71f, -0.06f, 1.0f);
        pathBuilder.curveTo(19.73f, 7.97f, 20.5f, 9.9f, 20.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.1f, -0.77f, 4.03f, -2.04f, 5.52f);
        pathBuilder.curveToRelative(-0.25f, 0.29f, -0.21f, 0.73f, 0.06f, 1.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.32f, 0.32f, 0.83f, 0.28f, 1.12f, -0.06f);
        pathBuilder.curveTo(21.11f, 16.71f, 22.0f, 14.46f, 22.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.1f, 0.77f, -4.03f, 2.04f, -5.52f);
        pathBuilder.curveToRelative(0.25f, -0.29f, 0.21f, -0.73f, -0.06f, -1.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(5.17f, 5.17f, 4.65f, 5.2f, 4.36f, 5.54f);
        pathBuilder.curveTo(2.89f, 7.29f, 2.0f, 9.54f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.46f, 0.89f, 4.71f, 2.36f, 6.46f);
        pathBuilder.curveToRelative(0.29f, 0.34f, 0.8f, 0.38f, 1.12f, 0.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.27f, -0.27f, 0.3f, -0.71f, 0.06f, -1.0f);
        pathBuilder.curveTo(4.27f, 16.03f, 3.5f, 14.1f, 3.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.28f, -0.44f, 2.47f, -1.18f, 3.41f);
        pathBuilder.curveToRelative(-0.23f, 0.29f, -0.2f, 0.71f, 0.07f, 0.98f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.32f, 0.32f, 0.85f, 0.29f, 1.13f, -0.07f);
        pathBuilder.curveTo(18.44f, 15.13f, 19.0f, 13.63f, 19.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.63f, -0.56f, -3.13f, -1.49f, -4.31f);
        pathBuilder.curveToRelative(-0.28f, -0.36f, -0.81f, -0.39f, -1.13f, -0.07f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.26f, 0.26f, -0.3f, 0.68f, -0.07f, 0.98f);
        pathBuilder.curveTo(17.06f, 9.53f, 17.5f, 10.72f, 17.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.62f, 16.38f);
        pathBuilder.lineTo(7.62f, 16.38f);
        pathBuilder.curveToRelative(0.26f, -0.26f, 0.3f, -0.68f, 0.07f, -0.98f);
        pathBuilder.curveTo(6.94f, 14.47f, 6.5f, 13.28f, 6.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.28f, 0.44f, -2.47f, 1.18f, -3.41f);
        pathBuilder.curveToRelative(0.23f, -0.29f, 0.2f, -0.71f, -0.07f, -0.98f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(7.3f, 7.3f, 6.77f, 7.33f, 6.49f, 7.68f);
        pathBuilder.curveTo(5.56f, 8.87f, 5.0f, 10.37f, 5.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.63f, 0.56f, 3.13f, 1.49f, 4.32f);
        pathBuilder.curveTo(6.77f, 16.67f, 7.3f, 16.7f, 7.62f, 16.38f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20359a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}