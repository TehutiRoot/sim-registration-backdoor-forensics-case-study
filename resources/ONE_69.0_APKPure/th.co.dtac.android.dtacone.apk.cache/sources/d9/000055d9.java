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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_token", "Landroidx/compose/material/icons/Icons$TwoTone;", "getToken", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Token", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Token.kt\nandroidx/compose/material/icons/twotone/TokenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n122#2:108\n116#2,3:109\n119#2,3:113\n132#2,18:116\n152#2:153\n132#2,18:154\n152#2:191\n174#3:112\n694#4,2:134\n706#4,2:136\n708#4,11:142\n694#4,2:172\n706#4,2:174\n708#4,11:180\n64#5,4:138\n64#5,4:176\n*S KotlinDebug\n*F\n+ 1 Token.kt\nandroidx/compose/material/icons/twotone/TokenKt\n*L\n29#1:108\n29#1:109,3\n29#1:113,3\n30#1:116,18\n30#1:153\n62#1:154,18\n62#1:191\n29#1:112\n30#1:134,2\n30#1:136,2\n30#1:142,11\n62#1:172,2\n62#1:174,2\n62#1:180,11\n30#1:138,4\n62#1:176,4\n*E\n"})
/* loaded from: classes.dex */
public final class TokenKt {

    /* renamed from: a */
    public static ImageVector f25247a;

    @NotNull
    public static final ImageVector getToken(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25247a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Token", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.29f);
        pathBuilder.lineToRelative(5.91f, 3.28f);
        pathBuilder.lineTo(14.9f, 9.24f);
        pathBuilder.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        pathBuilder.lineTo(6.09f, 7.57f);
        pathBuilder.lineTo(12.0f, 4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 19.16f);
        pathBuilder.lineToRelative(-6.0f, -3.33f);
        pathBuilder.verticalLineTo(9.26f);
        pathBuilder.lineToRelative(3.13f, 1.74f);
        pathBuilder.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder.verticalLineTo(19.16f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.16f);
        pathBuilder.verticalLineToRelative(-3.28f);
        pathBuilder.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder.lineTo(19.0f, 9.26f);
        pathBuilder.lineToRelative(0.0f, 6.57f);
        pathBuilder.lineTo(13.0f, 19.16f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 7.0f);
        pathBuilder2.lineToRelative(-9.0f, -5.0f);
        pathBuilder2.lineTo(3.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.lineToRelative(9.0f, 5.0f);
        pathBuilder2.lineToRelative(9.0f, -5.0f);
        pathBuilder2.lineTo(21.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 4.29f);
        pathBuilder2.lineToRelative(5.91f, 3.28f);
        pathBuilder2.lineTo(14.9f, 9.24f);
        pathBuilder2.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder2.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        pathBuilder2.lineTo(6.09f, 7.57f);
        pathBuilder2.lineTo(12.0f, 4.29f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 19.16f);
        pathBuilder2.lineToRelative(-6.0f, -3.33f);
        pathBuilder2.verticalLineTo(9.26f);
        pathBuilder2.lineToRelative(3.13f, 1.74f);
        pathBuilder2.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder2.verticalLineTo(19.16f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 19.16f);
        pathBuilder2.verticalLineToRelative(-3.28f);
        pathBuilder2.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder2.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder2.lineTo(19.0f, 9.26f);
        pathBuilder2.lineToRelative(0.0f, 6.57f);
        pathBuilder2.lineTo(13.0f, 19.16f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25247a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}