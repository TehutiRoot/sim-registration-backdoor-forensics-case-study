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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_historyToggleOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHistoryToggleOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "HistoryToggleOff", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHistoryToggleOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryToggleOff.kt\nandroidx/compose/material/icons/twotone/HistoryToggleOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n122#2:118\n116#2,3:119\n119#2,3:123\n132#2,18:126\n152#2:163\n174#3:122\n694#4,2:144\n706#4,2:146\n708#4,11:152\n64#5,4:148\n*S KotlinDebug\n*F\n+ 1 HistoryToggleOff.kt\nandroidx/compose/material/icons/twotone/HistoryToggleOffKt\n*L\n29#1:118\n29#1:119,3\n29#1:123,3\n30#1:126,18\n30#1:163\n29#1:122\n30#1:144,2\n30#1:146,2\n30#1:152,11\n30#1:148,4\n*E\n"})
/* loaded from: classes.dex */
public final class HistoryToggleOffKt {

    /* renamed from: a */
    public static ImageVector f24243a;

    @NotNull
    public static final ImageVector getHistoryToggleOff(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24243a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HistoryToggleOff", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.1f, 19.37f);
        pathBuilder.lineToRelative(1.0f, 1.74f);
        pathBuilder.curveToRelative(-0.96f, 0.44f, -2.01f, 0.73f, -3.1f, 0.84f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveTo(13.74f, 19.84f, 14.44f, 19.65f, 15.1f, 19.37f);
        pathBuilder.close();
        pathBuilder.moveTo(4.07f, 13.0f);
        pathBuilder.horizontalLineTo(2.05f);
        pathBuilder.curveToRelative(0.11f, 1.1f, 0.4f, 2.14f, 0.84f, 3.1f);
        pathBuilder.lineToRelative(1.74f, -1.0f);
        pathBuilder.curveTo(4.35f, 14.44f, 4.16f, 13.74f, 4.07f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.1f, 4.63f);
        pathBuilder.lineToRelative(1.0f, -1.74f);
        pathBuilder.curveTo(15.14f, 2.45f, 14.1f, 2.16f, 13.0f, 2.05f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveTo(13.74f, 4.16f, 14.44f, 4.35f, 15.1f, 4.63f);
        pathBuilder.close();
        pathBuilder.moveTo(19.93f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveToRelative(-0.11f, -1.1f, -0.4f, -2.14f, -0.84f, -3.1f);
        pathBuilder.lineToRelative(-1.74f, 1.0f);
        pathBuilder.curveTo(19.65f, 9.56f, 19.84f, 10.26f, 19.93f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.9f, 19.37f);
        pathBuilder.lineToRelative(-1.0f, 1.74f);
        pathBuilder.curveToRelative(0.96f, 0.44f, 2.01f, 0.73f, 3.1f, 0.84f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveTo(10.26f, 19.84f, 9.56f, 19.65f, 8.9f, 19.37f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 4.07f);
        pathBuilder.verticalLineTo(2.05f);
        pathBuilder.curveToRelative(-1.1f, 0.11f, -2.14f, 0.4f, -3.1f, 0.84f);
        pathBuilder.lineToRelative(1.0f, 1.74f);
        pathBuilder.curveTo(9.56f, 4.35f, 10.26f, 4.16f, 11.0f, 4.07f);
        pathBuilder.close();
        pathBuilder.moveTo(18.36f, 7.17f);
        pathBuilder.lineToRelative(1.74f, -1.01f);
        pathBuilder.curveToRelative(-0.63f, -0.87f, -1.4f, -1.64f, -2.27f, -2.27f);
        pathBuilder.lineToRelative(-1.01f, 1.74f);
        pathBuilder.curveTo(17.41f, 6.08f, 17.92f, 6.59f, 18.36f, 7.17f);
        pathBuilder.close();
        pathBuilder.moveTo(4.63f, 8.9f);
        pathBuilder.lineToRelative(-1.74f, -1.0f);
        pathBuilder.curveTo(2.45f, 8.86f, 2.16f, 9.9f, 2.05f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveTo(4.16f, 10.26f, 4.35f, 9.56f, 4.63f, 8.9f);
        pathBuilder.close();
        pathBuilder.moveTo(19.93f, 13.0f);
        pathBuilder.curveToRelative(-0.09f, 0.74f, -0.28f, 1.44f, -0.56f, 2.1f);
        pathBuilder.lineToRelative(1.74f, 1.0f);
        pathBuilder.curveToRelative(0.44f, -0.96f, 0.73f, -2.01f, 0.84f, -3.1f);
        pathBuilder.horizontalLineTo(19.93f);
        pathBuilder.close();
        pathBuilder.moveTo(16.83f, 18.36f);
        pathBuilder.lineToRelative(1.01f, 1.74f);
        pathBuilder.curveToRelative(0.87f, -0.63f, 1.64f, -1.4f, 2.27f, -2.27f);
        pathBuilder.lineToRelative(-1.74f, -1.01f);
        pathBuilder.curveTo(17.92f, 17.41f, 17.41f, 17.92f, 16.83f, 18.36f);
        pathBuilder.close();
        pathBuilder.moveTo(7.17f, 5.64f);
        pathBuilder.lineTo(6.17f, 3.89f);
        pathBuilder.curveTo(5.29f, 4.53f, 4.53f, 5.29f, 3.9f, 6.17f);
        pathBuilder.lineToRelative(1.74f, 1.01f);
        pathBuilder.curveTo(6.08f, 6.59f, 6.59f, 6.08f, 7.17f, 5.64f);
        pathBuilder.close();
        pathBuilder.moveTo(5.64f, 16.83f);
        pathBuilder.lineTo(3.9f, 17.83f);
        pathBuilder.curveToRelative(0.63f, 0.87f, 1.4f, 1.64f, 2.27f, 2.27f);
        pathBuilder.lineToRelative(1.01f, -1.74f);
        pathBuilder.curveTo(6.59f, 17.92f, 6.08f, 17.41f, 5.64f, 16.83f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(5.41f);
        pathBuilder.lineToRelative(4.29f, 4.29f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(13.0f, 11.59f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24243a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}