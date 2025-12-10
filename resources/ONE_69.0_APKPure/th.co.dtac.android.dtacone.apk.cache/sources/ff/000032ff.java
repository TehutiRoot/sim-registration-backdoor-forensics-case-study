package androidx.compose.material.icons.filled;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_replay10", "Landroidx/compose/material/icons/Icons$Filled;", "getReplay10", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Replay10", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReplay10.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay10.kt\nandroidx/compose/material/icons/filled/Replay10Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n122#2:104\n116#2,3:105\n119#2,3:109\n132#2,18:112\n152#2:149\n132#2,18:150\n152#2:187\n132#2,18:188\n152#2:225\n174#3:108\n694#4,2:130\n706#4,2:132\n708#4,11:138\n694#4,2:168\n706#4,2:170\n708#4,11:176\n694#4,2:206\n706#4,2:208\n708#4,11:214\n64#5,4:134\n64#5,4:172\n64#5,4:210\n*S KotlinDebug\n*F\n+ 1 Replay10.kt\nandroidx/compose/material/icons/filled/Replay10Kt\n*L\n29#1:104\n29#1:105,3\n29#1:109,3\n30#1:112,18\n30#1:149\n45#1:150,18\n45#1:187\n56#1:188,18\n56#1:225\n29#1:108\n30#1:130,2\n30#1:132,2\n30#1:138,11\n45#1:168,2\n45#1:170,2\n45#1:176,11\n56#1:206,2\n56#1:208,2\n56#1:214,11\n30#1:134,4\n45#1:172,4\n56#1:210,4\n*E\n"})
/* loaded from: classes.dex */
public final class Replay10Kt {

    /* renamed from: a */
    public static ImageVector f16325a;

    @NotNull
    public static final ImageVector getReplay10(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f16325a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Replay10", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.99f, 5.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.lineToRelative(-5.0f, 5.0f);
        pathBuilder.lineToRelative(5.0f, 5.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveTo(16.41f, 5.0f, 11.99f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.89f, 16.0f);
        pathBuilder2.horizontalLineToRelative(-0.85f);
        pathBuilder2.verticalLineToRelative(-3.26f);
        pathBuilder2.lineToRelative(-1.01f, 0.31f);
        pathBuilder2.verticalLineToRelative(-0.69f);
        pathBuilder2.lineToRelative(1.77f, -0.63f);
        pathBuilder2.horizontalLineToRelative(0.09f);
        pathBuilder2.verticalLineTo(16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(15.17f, 14.24f);
        pathBuilder3.curveToRelative(0.0f, 0.32f, -0.03f, 0.6f, -0.1f, 0.82f);
        pathBuilder3.reflectiveCurveToRelative(-0.17f, 0.42f, -0.29f, 0.57f);
        pathBuilder3.reflectiveCurveToRelative(-0.28f, 0.26f, -0.45f, 0.33f);
        pathBuilder3.reflectiveCurveToRelative(-0.37f, 0.1f, -0.59f, 0.1f);
        pathBuilder3.reflectiveCurveToRelative(-0.41f, -0.03f, -0.59f, -0.1f);
        pathBuilder3.reflectiveCurveToRelative(-0.33f, -0.18f, -0.46f, -0.33f);
        pathBuilder3.reflectiveCurveToRelative(-0.23f, -0.34f, -0.3f, -0.57f);
        pathBuilder3.reflectiveCurveToRelative(-0.11f, -0.5f, -0.11f, -0.82f);
        pathBuilder3.verticalLineTo(13.5f);
        pathBuilder3.curveToRelative(0.0f, -0.32f, 0.03f, -0.6f, 0.1f, -0.82f);
        pathBuilder3.reflectiveCurveToRelative(0.17f, -0.42f, 0.29f, -0.57f);
        pathBuilder3.reflectiveCurveToRelative(0.28f, -0.26f, 0.45f, -0.33f);
        pathBuilder3.reflectiveCurveToRelative(0.37f, -0.1f, 0.59f, -0.1f);
        pathBuilder3.reflectiveCurveToRelative(0.41f, 0.03f, 0.59f, 0.1f);
        pathBuilder3.curveToRelative(0.18f, 0.07f, 0.33f, 0.18f, 0.46f, 0.33f);
        pathBuilder3.reflectiveCurveToRelative(0.23f, 0.34f, 0.3f, 0.57f);
        pathBuilder3.reflectiveCurveToRelative(0.11f, 0.5f, 0.11f, 0.82f);
        pathBuilder3.verticalLineTo(14.24f);
        pathBuilder3.close();
        pathBuilder3.moveTo(14.32f, 13.38f);
        pathBuilder3.curveToRelative(0.0f, -0.19f, -0.01f, -0.35f, -0.04f, -0.48f);
        pathBuilder3.reflectiveCurveToRelative(-0.07f, -0.23f, -0.12f, -0.31f);
        pathBuilder3.reflectiveCurveToRelative(-0.11f, -0.14f, -0.19f, -0.17f);
        pathBuilder3.reflectiveCurveToRelative(-0.16f, -0.05f, -0.25f, -0.05f);
        pathBuilder3.reflectiveCurveToRelative(-0.18f, 0.02f, -0.25f, 0.05f);
        pathBuilder3.reflectiveCurveToRelative(-0.14f, 0.09f, -0.19f, 0.17f);
        pathBuilder3.reflectiveCurveToRelative(-0.09f, 0.18f, -0.12f, 0.31f);
        pathBuilder3.reflectiveCurveToRelative(-0.04f, 0.29f, -0.04f, 0.48f);
        pathBuilder3.verticalLineToRelative(0.97f);
        pathBuilder3.curveToRelative(0.0f, 0.19f, 0.01f, 0.35f, 0.04f, 0.48f);
        pathBuilder3.reflectiveCurveToRelative(0.07f, 0.24f, 0.12f, 0.32f);
        pathBuilder3.reflectiveCurveToRelative(0.11f, 0.14f, 0.19f, 0.17f);
        pathBuilder3.reflectiveCurveToRelative(0.16f, 0.05f, 0.25f, 0.05f);
        pathBuilder3.reflectiveCurveToRelative(0.18f, -0.02f, 0.25f, -0.05f);
        pathBuilder3.reflectiveCurveToRelative(0.14f, -0.09f, 0.19f, -0.17f);
        pathBuilder3.reflectiveCurveToRelative(0.09f, -0.19f, 0.11f, -0.32f);
        pathBuilder3.reflectiveCurveToRelative(0.04f, -0.29f, 0.04f, -0.48f);
        pathBuilder3.verticalLineTo(13.38f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f16325a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}