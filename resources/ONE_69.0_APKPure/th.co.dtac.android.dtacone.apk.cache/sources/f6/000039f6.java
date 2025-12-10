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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_modeFanOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getModeFanOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ModeFanOff", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModeFanOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeFanOff.kt\nandroidx/compose/material/icons/outlined/ModeFanOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n122#2:100\n116#2,3:101\n119#2,3:105\n132#2,18:108\n152#2:145\n132#2,18:146\n152#2:183\n174#3:104\n694#4,2:126\n706#4,2:128\n708#4,11:134\n694#4,2:164\n706#4,2:166\n708#4,11:172\n64#5,4:130\n64#5,4:168\n*S KotlinDebug\n*F\n+ 1 ModeFanOff.kt\nandroidx/compose/material/icons/outlined/ModeFanOffKt\n*L\n29#1:100\n29#1:101,3\n29#1:105,3\n30#1:108,18\n30#1:145\n59#1:146,18\n59#1:183\n29#1:104\n30#1:126,2\n30#1:128,2\n30#1:134,11\n59#1:164,2\n59#1:166,2\n59#1:172,11\n30#1:130,4\n59#1:168,4\n*E\n"})
/* loaded from: classes.dex */
public final class ModeFanOffKt {

    /* renamed from: a */
    public static ImageVector f18108a;

    @NotNull
    public static final ImageVector getModeFanOff(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f18108a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ModeFanOff", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 8.0f);
        pathBuilder.curveToRelative(-1.06f, 0.0f, -1.64f, 0.29f, -3.91f, 1.19f);
        pathBuilder.curveToRelative(-0.19f, -0.14f, -0.4f, -0.27f, -0.62f, -0.37f);
        pathBuilder.curveToRelative(0.25f, -1.03f, 0.61f, -1.53f, 1.33f, -2.04f);
        pathBuilder.curveTo(15.61f, 6.21f, 16.0f, 5.44f, 16.0f, 4.5f);
        pathBuilder.curveTo(16.0f, 3.28f, 15.05f, 2.0f, 13.4f, 2.0f);
        pathBuilder.curveToRelative(-3.08f, 0.0f, -4.92f, 1.47f, -5.32f, 3.26f);
        pathBuilder.lineToRelative(2.33f, 2.33f);
        pathBuilder.curveTo(10.07f, 6.69f, 10.0f, 6.38f, 10.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.18f, 1.4f, -2.0f, 3.4f, -2.0f);
        pathBuilder.curveTo(13.97f, 4.0f, 14.0f, 4.42f, 14.0f, 4.5f);
        pathBuilder.curveToRelative(0.0f, 0.27f, -0.05f, 0.43f, -0.35f, 0.65f);
        pathBuilder.curveToRelative(-1.27f, 0.9f, -1.83f, 1.91f, -2.16f, 3.39f);
        pathBuilder.lineToRelative(-0.02f, 0.1f);
        pathBuilder.lineToRelative(7.25f, 7.25f);
        pathBuilder.curveTo(18.96f, 15.95f, 19.22f, 16.0f, 19.5f, 16.0f);
        pathBuilder.curveToRelative(1.22f, 0.0f, 2.5f, -0.95f, 2.5f, -2.6f);
        pathBuilder.curveTo(22.0f, 9.91f, 20.11f, 8.0f, 18.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 14.0f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.43f, -0.05f, -0.65f, -0.35f);
        pathBuilder.curveToRelative(-0.9f, -1.27f, -1.91f, -1.83f, -3.39f, -2.16f);
        pathBuilder.curveToRelative(-0.03f, -0.22f, -0.08f, -0.42f, -0.15f, -0.62f);
        pathBuilder.curveTo(17.11f, 10.12f, 17.49f, 10.0f, 18.0f, 10.0f);
        pathBuilder.curveToRelative(1.18f, 0.0f, 2.0f, 1.4f, 2.0f, 3.4f);
        pathBuilder.curveTo(20.0f, 13.97f, 19.58f, 14.0f, 19.5f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(1.39f, 4.22f);
        pathBuilder2.lineToRelative(3.89f, 3.89f);
        pathBuilder2.curveTo(5.04f, 8.05f, 4.78f, 8.0f, 4.5f, 8.0f);
        pathBuilder2.curveTo(3.28f, 8.0f, 2.0f, 8.95f, 2.0f, 10.6f);
        pathBuilder2.curveTo(2.0f, 14.09f, 3.89f, 16.0f, 6.0f, 16.0f);
        pathBuilder2.curveToRelative(1.06f, 0.0f, 1.64f, -0.29f, 3.91f, -1.19f);
        pathBuilder2.curveToRelative(0.19f, 0.14f, 0.4f, 0.27f, 0.62f, 0.37f);
        pathBuilder2.curveToRelative(-0.25f, 1.03f, -0.61f, 1.53f, -1.33f, 2.04f);
        pathBuilder2.curveTo(8.39f, 17.79f, 8.0f, 18.56f, 8.0f, 19.5f);
        pathBuilder2.curveToRelative(0.0f, 1.22f, 0.95f, 2.5f, 2.6f, 2.5f);
        pathBuilder2.curveToRelative(3.08f, 0.0f, 4.92f, -1.47f, 5.32f, -3.26f);
        pathBuilder2.lineToRelative(3.86f, 3.86f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.52f, 15.46f);
        pathBuilder2.curveToRelative(0.03f, 0.0f, 0.06f, -0.02f, 0.09f, -0.02f);
        pathBuilder2.lineToRelative(0.97f, 0.97f);
        pathBuilder2.curveTo(13.93f, 17.31f, 14.0f, 17.62f, 14.0f, 18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.18f, -1.4f, 2.0f, -3.4f, 2.0f);
        pathBuilder2.curveToRelative(-0.57f, 0.0f, -0.6f, -0.42f, -0.6f, -0.5f);
        pathBuilder2.curveToRelative(0.0f, -0.27f, 0.05f, -0.43f, 0.35f, -0.65f);
        pathBuilder2.curveTo(11.63f, 17.96f, 12.18f, 16.94f, 12.52f, 15.46f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.54f, 12.52f);
        pathBuilder2.curveToRelative(0.03f, 0.22f, 0.08f, 0.42f, 0.15f, 0.62f);
        pathBuilder2.curveTo(6.89f, 13.88f, 6.51f, 14.0f, 6.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.18f, 0.0f, -2.0f, -1.4f, -2.0f, -3.4f);
        pathBuilder2.curveTo(4.0f, 10.03f, 4.42f, 10.0f, 4.5f, 10.0f);
        pathBuilder2.curveToRelative(0.27f, 0.0f, 0.43f, 0.05f, 0.65f, 0.35f);
        pathBuilder2.curveTo(6.04f, 11.63f, 7.06f, 12.18f, 8.54f, 12.52f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f18108a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}