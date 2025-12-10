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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_signLanguage", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSignLanguage", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "SignLanguage", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSignLanguage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/twotone/SignLanguageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,137:1\n122#2:138\n116#2,3:139\n119#2,3:143\n132#2,18:146\n152#2:183\n132#2,18:184\n152#2:221\n174#3:142\n694#4,2:164\n706#4,2:166\n708#4,11:172\n694#4,2:202\n706#4,2:204\n708#4,11:210\n64#5,4:168\n64#5,4:206\n*S KotlinDebug\n*F\n+ 1 SignLanguage.kt\nandroidx/compose/material/icons/twotone/SignLanguageKt\n*L\n29#1:138\n29#1:139,3\n29#1:143,3\n30#1:146,18\n30#1:183\n51#1:184,18\n51#1:221\n29#1:142\n30#1:164,2\n30#1:166,2\n30#1:172,11\n51#1:202,2\n51#1:204,2\n51#1:210,11\n30#1:168,4\n51#1:206,4\n*E\n"})
/* loaded from: classes.dex */
public final class SignLanguageKt {

    /* renamed from: a */
    public static ImageVector f25005a;

    @NotNull
    public static final ImageVector getSignLanguage(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25005a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SignLanguage", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 13.2f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.53f);
        pathBuilder.curveToRelative(0.0f, -0.27f, -0.11f, -0.54f, -0.31f, -0.73f);
        pathBuilder.lineTo(14.0f, 13.2f);
        pathBuilder.close();
        pathBuilder.moveTo(15.38f, 9.0f);
        pathBuilder.lineToRelative(1.93f, -1.87f);
        pathBuilder.lineToRelative(1.38f, 1.45f);
        pathBuilder.lineTo(20.0f, 7.34f);
        pathBuilder.verticalLineToRelative(3.7f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.11f, 0.54f, -0.31f, 0.73f);
        pathBuilder.lineToRelative(-0.7f, 0.66f);
        pathBuilder.lineTo(15.38f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.49f, 13.0f);
        pathBuilder2.lineToRelative(-0.93f, -1.86f);
        pathBuilder2.curveToRelative(-0.37f, -0.74f, -0.07f, -1.64f, 0.67f, -2.01f);
        pathBuilder2.lineTo(12.49f, 9.0f);
        pathBuilder2.lineToRelative(5.73f, 5.46f);
        pathBuilder2.curveToRelative(0.5f, 0.47f, 0.78f, 1.13f, 0.78f, 1.81f);
        pathBuilder2.verticalLineToRelative(5.23f);
        pathBuilder2.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilder2.horizontalLineToRelative(-11.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.horizontalLineTo(10.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineTo(3.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineTo(4.5f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.horizontalLineTo(12.49f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 13.2f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(7.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-4.53f);
        pathBuilder2.curveToRelative(0.0f, -0.27f, -0.11f, -0.54f, -0.31f, -0.73f);
        pathBuilder2.lineTo(14.0f, 13.2f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.78f, 7.12f);
        pathBuilder2.curveToRelative(-0.84f, 0.4f, -1.17f, 0.62f, -1.63f, 1.19f);
        pathBuilder2.lineToRelative(-2.7f, -2.85f);
        pathBuilder2.curveToRelative(-0.38f, -0.4f, -0.36f, -1.03f, 0.04f, -1.41f);
        pathBuilder2.curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f);
        pathBuilder2.lineTo(11.78f, 7.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.64f, 9.21f);
        pathBuilder2.curveTo(9.41f, 9.76f, 9.35f, 10.45f, 9.44f, 11.0f);
        pathBuilder2.horizontalLineTo(8.58f);
        pathBuilder2.lineTo(6.31f, 8.61f);
        pathBuilder2.curveTo(5.93f, 8.21f, 5.94f, 7.58f, 6.35f, 7.2f);
        pathBuilder2.curveToRelative(0.4f, -0.38f, 1.03f, -0.36f, 1.41f, 0.04f);
        pathBuilder2.lineTo(9.64f, 9.21f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.33f, 13.91f);
        pathBuilder2.lineToRelative(0.88f, -0.83f);
        pathBuilder2.curveToRelative(0.5f, -0.47f, 0.79f, -1.13f, 0.79f, -1.82f);
        pathBuilder2.verticalLineTo(3.35f);
        pathBuilder2.lineToRelative(-0.27f, -0.1f);
        pathBuilder2.curveToRelative(-0.78f, -0.28f, -1.64f, 0.12f, -1.92f, 0.9f);
        pathBuilder2.lineTo(19.1f, 6.11f);
        pathBuilder2.lineToRelative(-5.5f, -5.8f);
        pathBuilder2.curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.04f);
        pathBuilder2.curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.04f, 1.41f);
        pathBuilder2.lineToRelative(3.79f, 3.99f);
        pathBuilder2.lineToRelative(-0.73f, 0.69f);
        pathBuilder2.lineToRelative(-4.82f, -5.08f);
        pathBuilder2.curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.04f);
        pathBuilder2.curveToRelative(-0.4f, 0.38f, -0.42f, 1.01f, -0.04f, 1.41f);
        pathBuilder2.lineToRelative(3.78f, 3.98f);
        pathBuilder2.lineTo(15.38f, 9.0f);
        pathBuilder2.lineToRelative(1.93f, -1.87f);
        pathBuilder2.lineToRelative(1.38f, 1.45f);
        pathBuilder2.lineTo(20.0f, 7.34f);
        pathBuilder2.verticalLineToRelative(3.7f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, -0.11f, 0.54f, -0.31f, 0.73f);
        pathBuilder2.lineToRelative(-0.7f, 0.66f);
        pathBuilder2.lineToRelative(0.61f, 0.58f);
        pathBuilder2.curveTo(19.89f, 13.28f, 20.13f, 13.58f, 20.33f, 13.91f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25005a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}