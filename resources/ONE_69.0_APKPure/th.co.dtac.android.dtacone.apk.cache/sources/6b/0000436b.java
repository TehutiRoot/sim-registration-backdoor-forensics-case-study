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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_psychology", "Landroidx/compose/material/icons/Icons$Rounded;", "getPsychology", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Psychology", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPsychology.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Psychology.kt\nandroidx/compose/material/icons/rounded/PsychologyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n122#2:102\n116#2,3:103\n119#2,3:107\n132#2,18:110\n152#2:147\n132#2,18:148\n152#2:185\n174#3:106\n694#4,2:128\n706#4,2:130\n708#4,11:136\n694#4,2:166\n706#4,2:168\n708#4,11:174\n64#5,4:132\n64#5,4:170\n*S KotlinDebug\n*F\n+ 1 Psychology.kt\nandroidx/compose/material/icons/rounded/PsychologyKt\n*L\n29#1:102\n29#1:103,3\n29#1:107,3\n30#1:110,18\n30#1:147\n38#1:148,18\n38#1:185\n29#1:106\n30#1:128,2\n30#1:130,2\n30#1:136,11\n38#1:166,2\n38#1:168,2\n38#1:174,11\n30#1:132,4\n38#1:170,4\n*E\n"})
/* loaded from: classes.dex */
public final class PsychologyKt {

    /* renamed from: a */
    public static ImageVector f20529a;

    @NotNull
    public static final ImageVector getPsychology(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20529a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Psychology", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 8.57f);
        pathBuilder.curveToRelative(-0.79f, 0.0f, -1.43f, 0.64f, -1.43f, 1.43f);
        pathBuilder.reflectiveCurveToRelative(0.64f, 1.43f, 1.43f, 1.43f);
        pathBuilder.reflectiveCurveToRelative(1.43f, -0.64f, 1.43f, -1.43f);
        pathBuilder.reflectiveCurveTo(13.79f, 8.57f, 13.0f, 8.57f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.21f, 3.0f);
        pathBuilder2.curveToRelative(-3.84f, -0.11f, -7.0f, 2.87f, -7.19f, 6.64f);
        pathBuilder2.lineTo(4.1f, 12.2f);
        pathBuilder2.curveTo(3.85f, 12.53f, 4.09f, 13.0f, 4.5f, 13.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-3.68f);
        pathBuilder2.curveToRelative(2.44f, -1.16f, 4.1f, -3.68f, 4.0f, -6.58f);
        pathBuilder2.curveTo(19.86f, 6.12f, 16.82f, 3.11f, 13.21f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, 0.13f, -0.01f, 0.26f, -0.02f, 0.39f);
        pathBuilder2.lineToRelative(0.83f, 0.66f);
        pathBuilder2.curveToRelative(0.08f, 0.06f, 0.1f, 0.16f, 0.05f, 0.25f);
        pathBuilder2.lineToRelative(-0.8f, 1.39f);
        pathBuilder2.curveToRelative(-0.05f, 0.09f, -0.16f, 0.12f, -0.24f, 0.09f);
        pathBuilder2.lineToRelative(-0.99f, -0.4f);
        pathBuilder2.curveToRelative(-0.21f, 0.16f, -0.43f, 0.29f, -0.67f, 0.39f);
        pathBuilder2.lineTo(14.0f, 13.83f);
        pathBuilder2.curveToRelative(-0.01f, 0.1f, -0.1f, 0.17f, -0.2f, 0.17f);
        pathBuilder2.horizontalLineToRelative(-1.6f);
        pathBuilder2.curveToRelative(-0.1f, 0.0f, -0.18f, -0.07f, -0.2f, -0.17f);
        pathBuilder2.lineToRelative(-0.15f, -1.06f);
        pathBuilder2.curveToRelative(-0.25f, -0.1f, -0.47f, -0.23f, -0.68f, -0.39f);
        pathBuilder2.lineToRelative(-0.99f, 0.4f);
        pathBuilder2.curveToRelative(-0.09f, 0.03f, -0.2f, 0.0f, -0.25f, -0.09f);
        pathBuilder2.lineToRelative(-0.8f, -1.39f);
        pathBuilder2.curveToRelative(-0.05f, -0.08f, -0.03f, -0.19f, 0.05f, -0.25f);
        pathBuilder2.lineToRelative(0.84f, -0.66f);
        pathBuilder2.curveTo(10.01f, 10.26f, 10.0f, 10.13f, 10.0f, 10.0f);
        pathBuilder2.curveToRelative(0.0f, -0.13f, 0.02f, -0.27f, 0.04f, -0.39f);
        pathBuilder2.lineTo(9.19f, 8.95f);
        pathBuilder2.curveToRelative(-0.08f, -0.06f, -0.1f, -0.16f, -0.05f, -0.26f);
        pathBuilder2.lineToRelative(0.8f, -1.38f);
        pathBuilder2.curveToRelative(0.05f, -0.09f, 0.15f, -0.12f, 0.24f, -0.09f);
        pathBuilder2.lineToRelative(1.0f, 0.4f);
        pathBuilder2.curveToRelative(0.2f, -0.15f, 0.43f, -0.29f, 0.67f, -0.39f);
        pathBuilder2.lineToRelative(0.15f, -1.06f);
        pathBuilder2.curveTo(12.02f, 6.07f, 12.1f, 6.0f, 12.2f, 6.0f);
        pathBuilder2.horizontalLineToRelative(1.6f);
        pathBuilder2.curveToRelative(0.1f, 0.0f, 0.18f, 0.07f, 0.2f, 0.17f);
        pathBuilder2.lineToRelative(0.15f, 1.06f);
        pathBuilder2.curveToRelative(0.24f, 0.1f, 0.46f, 0.23f, 0.67f, 0.39f);
        pathBuilder2.lineToRelative(1.0f, -0.4f);
        pathBuilder2.curveToRelative(0.09f, -0.03f, 0.2f, 0.0f, 0.24f, 0.09f);
        pathBuilder2.lineToRelative(0.8f, 1.38f);
        pathBuilder2.curveToRelative(0.05f, 0.09f, 0.03f, 0.2f, -0.05f, 0.26f);
        pathBuilder2.lineToRelative(-0.85f, 0.66f);
        pathBuilder2.curveTo(15.99f, 9.73f, 16.0f, 9.86f, 16.0f, 10.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20529a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}