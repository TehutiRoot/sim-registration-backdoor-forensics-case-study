package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.graphics.vector.PathBuilder;
import androidx.compose.p003ui.graphics.vector.VectorKt;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_faceRetouchingOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFaceRetouchingOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "FaceRetouchingOff", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFaceRetouchingOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceRetouchingOff.kt\nandroidx/compose/material/icons/twotone/FaceRetouchingOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n122#2:96\n116#2,3:97\n119#2,3:101\n132#2,18:104\n152#2:141\n132#2,18:142\n152#2:179\n174#3:100\n694#4,2:122\n706#4,2:124\n708#4,11:130\n694#4,2:160\n706#4,2:162\n708#4,11:168\n64#5,4:126\n64#5,4:164\n*S KotlinDebug\n*F\n+ 1 FaceRetouchingOff.kt\nandroidx/compose/material/icons/twotone/FaceRetouchingOffKt\n*L\n29#1:96\n29#1:97,3\n29#1:101,3\n30#1:104,18\n30#1:141\n43#1:142,18\n43#1:179\n29#1:100\n30#1:122,2\n30#1:124,2\n30#1:130,11\n43#1:160,2\n43#1:162,2\n43#1:168,11\n30#1:126,4\n43#1:164,4\n*E\n"})
/* loaded from: classes.dex */
public final class FaceRetouchingOffKt {

    /* renamed from: a */
    public static ImageVector f23928a;

    @NotNull
    public static final ImageVector getFaceRetouchingOff(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23928a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FaceRetouchingOff", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f);
        pathBuilder.curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f);
        pathBuilder.curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.42f, 9.47f);
        pathBuilder.curveTo(5.09f, 9.09f, 5.7f, 8.61f, 6.23f, 8.06f);
        pathBuilder.lineTo(5.51f, 7.34f);
        pathBuilder.curveTo(5.05f, 7.99f, 4.68f, 8.7f, 4.42f, 9.47f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 14.25f);
        pathBuilder2.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder2.reflectiveCurveTo(9.69f, 11.75f, 9.0f, 11.75f);
        pathBuilder2.reflectiveCurveTo(7.75f, 12.31f, 7.75f, 13.0f);
        pathBuilder2.reflectiveCurveTo(8.31f, 14.25f, 9.0f, 14.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.5f, 10.0f);
        pathBuilder2.curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f);
        pathBuilder2.curveTo(19.88f, 10.47f, 20.0f, 11.22f, 20.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.22f, -0.28f, 2.37f, -0.77f, 3.4f);
        pathBuilder2.lineToRelative(1.49f, 1.49f);
        pathBuilder2.curveTo(21.53f, 15.44f, 22.0f, 13.78f, 22.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder2.curveToRelative(-1.78f, 0.0f, -3.44f, 0.47f, -4.89f, 1.28f);
        pathBuilder2.lineToRelative(5.33f, 5.33f);
        pathBuilder2.curveTo(13.93f, 9.49f, 15.65f, 10.0f, 17.5f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.66f, 4.12f);
        pathBuilder2.curveTo(11.09f, 4.05f, 11.54f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(2.9f, 0.0f, 5.44f, 1.56f, 6.84f, 3.88f);
        pathBuilder2.curveTo(18.41f, 7.95f, 17.96f, 8.0f, 17.5f, 8.0f);
        pathBuilder2.curveTo(14.6f, 8.0f, 12.06f, 6.44f, 10.66f, 4.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(1.89f, 3.72f);
        pathBuilder2.lineToRelative(2.19f, 2.19f);
        pathBuilder2.curveTo(2.78f, 7.6f, 2.0f, 9.71f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.curveToRelative(2.29f, 0.0f, 4.4f, -0.78f, 6.09f, -2.08f);
        pathBuilder2.lineToRelative(2.19f, 2.19f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(3.31f, 2.31f);
        pathBuilder2.lineTo(1.89f, 3.72f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.66f, 18.49f);
        pathBuilder2.curveTo(15.35f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
        pathBuilder2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder2.curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.0f, -0.14f);
        pathBuilder2.curveToRelative(1.39f, -0.52f, 2.63f, -1.35f, 3.64f, -2.39f);
        pathBuilder2.lineTo(16.66f, 18.49f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.51f, 7.34f);
        pathBuilder2.lineToRelative(0.72f, 0.72f);
        pathBuilder2.curveTo(5.7f, 8.61f, 5.09f, 9.09f, 4.42f, 9.47f);
        pathBuilder2.curveTo(4.68f, 8.7f, 5.05f, 7.99f, 5.51f, 7.34f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23928a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
