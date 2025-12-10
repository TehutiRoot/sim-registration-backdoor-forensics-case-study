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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_troubleshoot", "Landroidx/compose/material/icons/Icons$Rounded;", "getTroubleshoot", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Troubleshoot", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTroubleshoot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Troubleshoot.kt\nandroidx/compose/material/icons/rounded/TroubleshootKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n122#2:89\n116#2,3:90\n119#2,3:94\n132#2,18:97\n152#2:134\n132#2,18:135\n152#2:172\n174#3:93\n694#4,2:115\n706#4,2:117\n708#4,11:123\n694#4,2:153\n706#4,2:155\n708#4,11:161\n64#5,4:119\n64#5,4:157\n*S KotlinDebug\n*F\n+ 1 Troubleshoot.kt\nandroidx/compose/material/icons/rounded/TroubleshootKt\n*L\n29#1:89\n29#1:90,3\n29#1:94,3\n30#1:97,18\n30#1:134\n50#1:135,18\n50#1:172\n29#1:93\n30#1:115,2\n30#1:117,2\n30#1:123,11\n50#1:153,2\n50#1:155,2\n50#1:161,11\n30#1:119,4\n50#1:157,4\n*E\n"})
/* loaded from: classes.dex */
public final class TroubleshootKt {

    /* renamed from: a */
    public static ImageVector f21006a;

    @NotNull
    public static final ImageVector getTroubleshoot(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f21006a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Troubleshoot", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.29f, 19.88f);
        pathBuilder.lineToRelative(-3.98f, -3.98f);
        pathBuilder.curveToRelative(1.3f, -1.67f, 1.96f, -3.85f, 1.58f, -6.2f);
        pathBuilder.curveToRelative(-0.54f, -3.41f, -3.33f, -6.14f, -6.75f, -6.62f);
        pathBuilder.curveTo(7.57f, 2.44f, 3.61f, 5.69f, 3.07f, 10.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveToRelative(0.53f, -3.13f, 3.48f, -5.44f, 6.85f, -4.93f);
        pathBuilder.curveToRelative(2.61f, 0.4f, 4.7f, 2.57f, 5.02f, 5.2f);
        pathBuilder.curveTo(17.39f, 13.9f, 14.55f, 17.0f, 11.0f, 17.0f);
        pathBuilder.curveToRelative(-2.42f, 0.0f, -4.5f, -1.44f, -5.45f, -3.5f);
        pathBuilder.horizontalLineTo(3.4f);
        pathBuilder.curveTo(4.45f, 16.69f, 7.46f, 19.0f, 11.0f, 19.0f);
        pathBuilder.curveToRelative(1.85f, 0.0f, 3.55f, -0.63f, 4.9f, -1.69f);
        pathBuilder.lineToRelative(3.98f, 3.98f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(21.68f, 20.9f, 21.68f, 20.27f, 21.29f, 19.88f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.43f, 9.69f);
        pathBuilder2.lineToRelative(1.03f, 4.47f);
        pathBuilder2.curveTo(9.57f, 14.65f, 10.01f, 15.0f, 10.51f, 15.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.46f, 0.0f, 0.87f, -0.3f, 1.02f, -0.74f);
        pathBuilder2.lineToRelative(1.01f, -3.04f);
        pathBuilder2.lineToRelative(0.69f, 1.66f);
        pathBuilder2.curveToRelative(0.16f, 0.37f, 0.52f, 0.62f, 0.92f, 0.62f);
        pathBuilder2.horizontalLineToRelative(0.58f);
        pathBuilder2.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder2.horizontalLineTo(14.5f);
        pathBuilder2.lineToRelative(-0.97f, -2.34f);
        pathBuilder2.curveTo(13.36f, 9.26f, 12.97f, 9.0f, 12.53f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-0.05f);
        pathBuilder2.curveToRelative(-0.46f, 0.0f, -0.87f, 0.3f, -1.02f, 0.74f);
        pathBuilder2.lineToRelative(-0.88f, 2.63f);
        pathBuilder2.lineTo(9.54f, 7.83f);
        pathBuilder2.curveTo(9.43f, 7.35f, 8.99f, 7.0f, 8.49f, 7.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(8.02f, 7.0f, 7.6f, 7.31f, 7.46f, 7.76f);
        pathBuilder2.lineTo(6.45f, 11.0f);
        pathBuilder2.horizontalLineToRelative(-4.7f);
        pathBuilder2.curveTo(1.34f, 11.0f, 1.0f, 11.34f, 1.0f, 11.75f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder2.horizontalLineToRelative(5.07f);
        pathBuilder2.curveToRelative(0.44f, 0.0f, 0.82f, -0.28f, 0.95f, -0.7f);
        pathBuilder2.lineTo(8.43f, 9.69f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f21006a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}