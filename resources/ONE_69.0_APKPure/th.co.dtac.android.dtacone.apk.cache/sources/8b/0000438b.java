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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_realEstateAgent", "Landroidx/compose/material/icons/Icons$Rounded;", "getRealEstateAgent", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "RealEstateAgent", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRealEstateAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealEstateAgent.kt\nandroidx/compose/material/icons/rounded/RealEstateAgentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n122#2:106\n116#2,3:107\n119#2,3:111\n132#2,18:114\n152#2:151\n174#3:110\n694#4,2:132\n706#4,2:134\n708#4,11:140\n64#5,4:136\n*S KotlinDebug\n*F\n+ 1 RealEstateAgent.kt\nandroidx/compose/material/icons/rounded/RealEstateAgentKt\n*L\n29#1:106\n29#1:107,3\n29#1:111,3\n30#1:114,18\n30#1:151\n29#1:110\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"})
/* loaded from: classes.dex */
public final class RealEstateAgentKt {

    /* renamed from: a */
    public static ImageVector f20561a;

    @NotNull
    public static final ImageVector getRealEstateAgent(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20561a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RealEstateAgent", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 22.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.37f, 16.43f);
        pathBuilder.lineToRelative(1.47f, 0.51f);
        pathBuilder.curveToRelative(0.11f, 0.04f, 0.22f, 0.06f, 0.33f, 0.06f);
        pathBuilder.horizontalLineToRelative(6.83f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, 0.89f, 2.01f, 2.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(-7.39f, 2.77f);
        pathBuilder.curveToRelative(-0.4f, 0.15f, -0.84f, 0.17f, -1.25f, 0.05f);
        pathBuilder.lineTo(7.0f, 20.02f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineTo(8.6f);
        pathBuilder.curveToRelative(0.24f, 0.0f, 0.48f, 0.04f, 0.7f, 0.13f);
        pathBuilder.lineToRelative(6.93f, 2.59f);
        pathBuilder.curveToRelative(0.46f, 0.17f, 0.77f, 0.61f, 0.77f, 1.11f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.65f, -0.53f, 1.18f, -1.18f, 1.18f);
        pathBuilder.horizontalLineToRelative(-2.63f);
        pathBuilder.curveToRelative(-0.12f, 0.0f, -0.24f, -0.02f, -0.36f, -0.07f);
        pathBuilder.lineToRelative(-1.12f, -0.43f);
        pathBuilder.curveToRelative(-0.26f, -0.1f, -0.55f, 0.04f, -0.64f, 0.3f);
        pathBuilder.curveTo(10.98f, 16.06f, 11.11f, 16.34f, 11.37f, 16.43f);
        pathBuilder.close();
        pathBuilder.moveTo(20.16f, 5.9f);
        pathBuilder.lineToRelative(-5.0f, -3.57f);
        pathBuilder.curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f);
        pathBuilder.lineToRelative(-5.0f, 3.57f);
        pathBuilder.curveTo(7.31f, 6.28f, 7.0f, 6.88f, 7.0f, 7.53f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(1.61f);
        pathBuilder.curveToRelative(0.25f, 0.0f, 0.51f, 0.05f, 0.74f, 0.14f);
        pathBuilder.lineToRelative(7.79f, 3.11f);
        pathBuilder.curveTo(18.26f, 12.71f, 19.0f, 13.79f, 19.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(7.53f);
        pathBuilder.curveTo(21.0f, 6.88f, 20.69f, 6.28f, 20.16f, 5.9f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveTo(12.5f, 9.22f, 12.72f, 9.0f, 13.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(13.5f, 9.78f, 13.28f, 10.0f, 13.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 8.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveTo(12.5f, 7.22f, 12.72f, 7.0f, 13.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(13.5f, 7.78f, 13.28f, 8.0f, 13.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 10.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveTo(14.5f, 9.22f, 14.72f, 9.0f, 15.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(15.5f, 9.78f, 15.28f, 10.0f, 15.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 8.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.curveTo(14.5f, 7.22f, 14.72f, 7.0f, 15.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.curveTo(15.5f, 7.78f, 15.28f, 8.0f, 15.0f, 8.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20561a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}