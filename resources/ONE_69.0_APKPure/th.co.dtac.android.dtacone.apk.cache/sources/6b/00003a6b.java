package androidx.compose.material.icons.outlined;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_onDeviceTraining", "Landroidx/compose/material/icons/Icons$Outlined;", "getOnDeviceTraining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "OnDeviceTraining", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnDeviceTraining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDeviceTraining.kt\nandroidx/compose/material/icons/outlined/OnDeviceTrainingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n122#2:107\n116#2,3:108\n119#2,3:112\n132#2,18:115\n152#2:152\n132#2,18:153\n152#2:190\n132#2,18:191\n152#2:228\n132#2,18:229\n152#2:266\n132#2,18:267\n152#2:304\n174#3:111\n694#4,2:133\n706#4,2:135\n708#4,11:141\n694#4,2:171\n706#4,2:173\n708#4,11:179\n694#4,2:209\n706#4,2:211\n708#4,11:217\n694#4,2:247\n706#4,2:249\n708#4,11:255\n694#4,2:285\n706#4,2:287\n708#4,11:293\n64#5,4:137\n64#5,4:175\n64#5,4:213\n64#5,4:251\n64#5,4:289\n*S KotlinDebug\n*F\n+ 1 OnDeviceTraining.kt\nandroidx/compose/material/icons/outlined/OnDeviceTrainingKt\n*L\n29#1:107\n29#1:108,3\n29#1:112,3\n30#1:115,18\n30#1:152\n37#1:153,18\n37#1:190\n48#1:191,18\n48#1:228\n78#1:229,18\n78#1:266\n88#1:267,18\n88#1:304\n29#1:111\n30#1:133,2\n30#1:135,2\n30#1:141,11\n37#1:171,2\n37#1:173,2\n37#1:179,11\n48#1:209,2\n48#1:211,2\n48#1:217,11\n78#1:247,2\n78#1:249,2\n78#1:255,11\n88#1:285,2\n88#1:287,2\n88#1:293,11\n30#1:137,4\n37#1:175,4\n48#1:213,4\n78#1:251,4\n88#1:289,4\n*E\n"})
/* loaded from: classes.dex */
public final class OnDeviceTrainingKt {

    /* renamed from: a */
    public static ImageVector f18225a;

    @NotNull
    public static final ImageVector getOnDeviceTraining(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f18225a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.OnDeviceTraining", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 11.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder2.verticalLineToRelative(0.78f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-0.78f);
        pathBuilder2.curveToRelative(0.6f, -0.35f, 1.0f, -0.98f, 1.0f, -1.72f);
        pathBuilder2.curveTo(14.0f, 11.9f, 13.1f, 11.0f, 12.0f, 11.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.0f, 1.01f);
        pathBuilder3.lineTo(6.0f, 1.0f);
        pathBuilder3.curveTo(4.9f, 1.0f, 4.0f, 1.9f, 4.0f, 3.0f);
        pathBuilder3.verticalLineToRelative(18.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineTo(3.0f);
        pathBuilder3.curveTo(20.0f, 1.9f, 19.1f, 1.01f, 18.0f, 1.01f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 21.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineTo(21.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 18.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineTo(18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 4.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.verticalLineTo(3.0f);
        pathBuilder3.horizontalLineToRelative(12.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(16.01f, 15.95f);
        pathBuilder4.curveTo(16.63f, 15.12f, 17.0f, 14.11f, 17.0f, 13.0f);
        pathBuilder4.reflectiveCurveToRelative(-0.37f, -2.12f, -0.99f, -2.95f);
        pathBuilder4.lineToRelative(-1.07f, 1.07f);
        pathBuilder4.curveToRelative(0.35f, 0.54f, 0.56f, 1.19f, 0.56f, 1.88f);
        pathBuilder4.reflectiveCurveToRelative(-0.21f, 1.34f, -0.56f, 1.88f);
        pathBuilder4.lineTo(16.01f, 15.95f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(9.06f, 14.88f);
        pathBuilder5.curveTo(8.71f, 14.34f, 8.5f, 13.69f, 8.5f, 13.0f);
        pathBuilder5.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder5.verticalLineToRelative(1.25f);
        pathBuilder5.lineToRelative(2.25f, -2.0f);
        pathBuilder5.lineToRelative(-2.25f, -2.0f);
        pathBuilder5.verticalLineTo(8.0f);
        pathBuilder5.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder5.curveToRelative(0.0f, 1.11f, 0.37f, 2.12f, 0.99f, 2.95f);
        pathBuilder5.lineTo(9.06f, 14.88f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f18225a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}