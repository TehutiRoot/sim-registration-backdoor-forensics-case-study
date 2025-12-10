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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_sensorOccupied", "Landroidx/compose/material/icons/Icons$Rounded;", "getSensorOccupied", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "SensorOccupied", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSensorOccupied.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorOccupied.kt\nandroidx/compose/material/icons/rounded/SensorOccupiedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n122#2:105\n116#2,3:106\n119#2,3:110\n132#2,18:113\n152#2:150\n132#2,18:151\n152#2:188\n132#2,18:189\n152#2:226\n132#2,18:227\n152#2:264\n132#2,18:265\n152#2:302\n132#2,18:303\n152#2:340\n174#3:109\n694#4,2:131\n706#4,2:133\n708#4,11:139\n694#4,2:169\n706#4,2:171\n708#4,11:177\n694#4,2:207\n706#4,2:209\n708#4,11:215\n694#4,2:245\n706#4,2:247\n708#4,11:253\n694#4,2:283\n706#4,2:285\n708#4,11:291\n694#4,2:321\n706#4,2:323\n708#4,11:329\n64#5,4:135\n64#5,4:173\n64#5,4:211\n64#5,4:249\n64#5,4:287\n64#5,4:325\n*S KotlinDebug\n*F\n+ 1 SensorOccupied.kt\nandroidx/compose/material/icons/rounded/SensorOccupiedKt\n*L\n29#1:105\n29#1:106,3\n29#1:110,3\n30#1:113,18\n30#1:150\n38#1:151,18\n38#1:188\n51#1:189,18\n51#1:226\n63#1:227,18\n63#1:264\n75#1:265,18\n75#1:302\n87#1:303,18\n87#1:340\n29#1:109\n30#1:131,2\n30#1:133,2\n30#1:139,11\n38#1:169,2\n38#1:171,2\n38#1:177,11\n51#1:207,2\n51#1:209,2\n51#1:215,11\n63#1:245,2\n63#1:247,2\n63#1:253,11\n75#1:283,2\n75#1:285,2\n75#1:291,11\n87#1:321,2\n87#1:323,2\n87#1:329,11\n30#1:135,4\n38#1:173,4\n51#1:211,4\n63#1:249,4\n75#1:287,4\n87#1:325,4\n*E\n"})
/* loaded from: classes.dex */
public final class SensorOccupiedKt {

    /* renamed from: a */
    public static ImageVector f20689a;

    @NotNull
    public static final ImageVector getSensorOccupied(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20689a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SensorOccupied", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 11.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 6.34f, 9.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(10.34f, 11.0f, 12.0f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.curveToRelative(-1.84f, 0.0f, -3.56f, 0.5f, -5.03f, 1.37f);
        pathBuilder2.curveTo(6.36f, 13.73f, 6.0f, 14.39f, 6.0f, 15.09f);
        pathBuilder2.lineTo(6.0f, 16.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.lineToRelative(0.0f, -0.91f);
        pathBuilder2.curveToRelative(0.0f, -0.7f, -0.36f, -1.36f, -0.97f, -1.72f);
        pathBuilder2.curveTo(15.56f, 12.5f, 13.84f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(22.11f, 7.79f);
        pathBuilder3.lineTo(22.11f, 7.79f);
        pathBuilder3.curveToRelative(0.55f, -0.23f, 0.78f, -0.88f, 0.5f, -1.41f);
        pathBuilder3.curveToRelative(-1.13f, -2.12f, -2.87f, -3.86f, -4.99f, -4.99f);
        pathBuilder3.curveToRelative(-0.52f, -0.28f, -1.17f, -0.04f, -1.4f, 0.5f);
        pathBuilder3.verticalLineToRelative(0.0f);
        pathBuilder3.curveToRelative(-0.19f, 0.47f, -0.01f, 1.02f, 0.43f, 1.25f);
        pathBuilder3.curveToRelative(1.79f, 0.94f, 3.26f, 2.42f, 4.21f, 4.21f);
        pathBuilder3.curveTo(21.09f, 7.8f, 21.64f, 7.98f, 22.11f, 7.79f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(7.79f, 1.89f);
        pathBuilder4.lineTo(7.79f, 1.89f);
        pathBuilder4.curveToRelative(-0.23f, -0.55f, -0.88f, -0.78f, -1.4f, -0.5f);
        pathBuilder4.curveTo(4.27f, 2.52f, 2.52f, 4.26f, 1.4f, 6.38f);
        pathBuilder4.curveToRelative(-0.28f, 0.52f, -0.05f, 1.18f, 0.5f, 1.41f);
        pathBuilder4.lineToRelative(0.0f, 0.0f);
        pathBuilder4.curveToRelative(0.47f, 0.2f, 1.02f, 0.01f, 1.25f, -0.43f);
        pathBuilder4.curveToRelative(0.94f, -1.79f, 2.42f, -3.26f, 4.21f, -4.21f);
        pathBuilder4.curveTo(7.8f, 2.91f, 7.98f, 2.36f, 7.79f, 1.89f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(1.89f, 16.21f);
        pathBuilder5.lineTo(1.89f, 16.21f);
        pathBuilder5.curveToRelative(-0.55f, 0.23f, -0.78f, 0.88f, -0.5f, 1.4f);
        pathBuilder5.curveToRelative(1.13f, 2.12f, 2.87f, 3.87f, 5.0f, 5.0f);
        pathBuilder5.curveToRelative(0.52f, 0.28f, 1.17f, 0.04f, 1.4f, -0.5f);
        pathBuilder5.lineToRelative(0.0f, 0.0f);
        pathBuilder5.curveToRelative(0.19f, -0.47f, 0.01f, -1.02f, -0.43f, -1.25f);
        pathBuilder5.curveToRelative(-1.79f, -0.94f, -3.26f, -2.42f, -4.21f, -4.21f);
        pathBuilder5.curveTo(2.91f, 16.2f, 2.36f, 16.02f, 1.89f, 16.21f);
        pathBuilder5.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw6 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk86 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder6 = new PathBuilder();
        pathBuilder6.moveTo(16.21f, 22.11f);
        pathBuilder6.lineTo(16.21f, 22.11f);
        pathBuilder6.curveToRelative(0.23f, 0.55f, 0.88f, 0.78f, 1.4f, 0.5f);
        pathBuilder6.curveToRelative(2.12f, -1.13f, 3.87f, -2.87f, 5.0f, -5.0f);
        pathBuilder6.curveToRelative(0.28f, -0.52f, 0.04f, -1.17f, -0.5f, -1.4f);
        pathBuilder6.horizontalLineToRelative(0.0f);
        pathBuilder6.curveToRelative(-0.47f, -0.19f, -1.02f, -0.01f, -1.25f, 0.43f);
        pathBuilder6.curveToRelative(-0.94f, 1.79f, -2.42f, 3.26f, -4.21f, 4.21f);
        pathBuilder6.curveTo(16.2f, 21.09f, 16.02f, 21.64f, 16.21f, 22.11f);
        pathBuilder6.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder6.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw6, m72237getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20689a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}