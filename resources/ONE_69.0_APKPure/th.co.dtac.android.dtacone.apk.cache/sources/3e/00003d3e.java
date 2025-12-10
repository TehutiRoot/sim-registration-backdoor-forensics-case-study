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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_viewInAr", "Landroidx/compose/material/icons/Icons$Outlined;", "getViewInAr", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewInAr", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewInAr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/outlined/ViewInArKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n122#2:120\n116#2,3:121\n119#2,3:125\n132#2,18:128\n152#2:165\n132#2,18:166\n152#2:203\n132#2,18:204\n152#2:241\n132#2,18:242\n152#2:279\n132#2,18:280\n152#2:317\n174#3:124\n694#4,2:146\n706#4,2:148\n708#4,11:154\n694#4,2:184\n706#4,2:186\n708#4,11:192\n694#4,2:222\n706#4,2:224\n708#4,11:230\n694#4,2:260\n706#4,2:262\n708#4,11:268\n694#4,2:298\n706#4,2:300\n708#4,11:306\n64#5,4:150\n64#5,4:188\n64#5,4:226\n64#5,4:264\n64#5,4:302\n*S KotlinDebug\n*F\n+ 1 ViewInAr.kt\nandroidx/compose/material/icons/outlined/ViewInArKt\n*L\n29#1:120\n29#1:121,3\n29#1:125,3\n30#1:128,18\n30#1:165\n42#1:166,18\n42#1:203\n54#1:204,18\n54#1:241\n66#1:242,18\n66#1:279\n78#1:280,18\n78#1:317\n29#1:124\n30#1:146,2\n30#1:148,2\n30#1:154,11\n42#1:184,2\n42#1:186,2\n42#1:192,11\n54#1:222,2\n54#1:224,2\n54#1:230,11\n66#1:260,2\n66#1:262,2\n66#1:268,11\n78#1:298,2\n78#1:300,2\n78#1:306,11\n30#1:150,4\n42#1:188,4\n54#1:226,4\n66#1:264,4\n78#1:302,4\n*E\n"})
/* loaded from: classes.dex */
public final class ViewInArKt {

    /* renamed from: a */
    public static ImageVector f18948a;

    @NotNull
    public static final ImageVector getViewInAr(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f18948a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ViewInAr", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.34f, 1.0f, 1.0f, 2.34f, 1.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(3.45f, 21.0f, 3.0f, 20.55f, 3.0f, 20.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 1.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.curveTo(23.0f, 2.34f, 21.66f, 1.0f, 20.0f, 1.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(21.0f, 20.0f);
        pathBuilder4.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder4.verticalLineToRelative(-2.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.verticalLineTo(20.0f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(19.0f, 14.87f);
        pathBuilder5.verticalLineTo(9.13f);
        pathBuilder5.curveToRelative(0.0f, -0.72f, -0.38f, -1.38f, -1.0f, -1.73f);
        pathBuilder5.lineToRelative(-5.0f, -2.88f);
        pathBuilder5.curveToRelative(-0.31f, -0.18f, -0.65f, -0.27f, -1.0f, -0.27f);
        pathBuilder5.reflectiveCurveToRelative(-0.69f, 0.09f, -1.0f, 0.27f);
        pathBuilder5.lineTo(6.0f, 7.39f);
        pathBuilder5.curveTo(5.38f, 7.75f, 5.0f, 8.41f, 5.0f, 9.13f);
        pathBuilder5.verticalLineToRelative(5.74f);
        pathBuilder5.curveToRelative(0.0f, 0.72f, 0.38f, 1.38f, 1.0f, 1.73f);
        pathBuilder5.lineToRelative(5.0f, 2.88f);
        pathBuilder5.curveToRelative(0.31f, 0.18f, 0.65f, 0.27f, 1.0f, 0.27f);
        pathBuilder5.reflectiveCurveToRelative(0.69f, -0.09f, 1.0f, -0.27f);
        pathBuilder5.lineToRelative(5.0f, -2.88f);
        pathBuilder5.curveTo(18.62f, 16.25f, 19.0f, 15.59f, 19.0f, 14.87f);
        pathBuilder5.close();
        pathBuilder5.moveTo(11.0f, 17.17f);
        pathBuilder5.lineToRelative(-4.0f, -2.3f);
        pathBuilder5.verticalLineToRelative(-4.63f);
        pathBuilder5.lineToRelative(4.0f, 2.33f);
        pathBuilder5.verticalLineTo(17.17f);
        pathBuilder5.close();
        pathBuilder5.moveTo(12.0f, 10.84f);
        pathBuilder5.lineTo(8.04f, 8.53f);
        pathBuilder5.lineTo(12.0f, 6.25f);
        pathBuilder5.lineToRelative(3.96f, 2.28f);
        pathBuilder5.lineTo(12.0f, 10.84f);
        pathBuilder5.close();
        pathBuilder5.moveTo(17.0f, 14.87f);
        pathBuilder5.lineToRelative(-4.0f, 2.3f);
        pathBuilder5.verticalLineToRelative(-4.6f);
        pathBuilder5.lineToRelative(4.0f, -2.33f);
        pathBuilder5.verticalLineTo(14.87f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f18948a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}