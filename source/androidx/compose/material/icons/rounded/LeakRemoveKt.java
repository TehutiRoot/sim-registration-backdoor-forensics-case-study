package androidx.compose.material.icons.rounded;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_leakRemove", "Landroidx/compose/material/icons/Icons$Rounded;", "getLeakRemove", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "LeakRemove", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLeakRemove.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeakRemove.kt\nandroidx/compose/material/icons/rounded/LeakRemoveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n122#2:92\n116#2,3:93\n119#2,3:97\n132#2,18:100\n152#2:137\n174#3:96\n694#4,2:118\n706#4,2:120\n708#4,11:126\n64#5,4:122\n*S KotlinDebug\n*F\n+ 1 LeakRemove.kt\nandroidx/compose/material/icons/rounded/LeakRemoveKt\n*L\n29#1:92\n29#1:93,3\n29#1:97,3\n30#1:100,18\n30#1:137\n29#1:96\n30#1:118,2\n30#1:120,2\n30#1:126,11\n30#1:122,4\n*E\n"})
/* loaded from: classes.dex */
public final class LeakRemoveKt {

    /* renamed from: a */
    public static ImageVector f20007a;

    @NotNull
    public static final ImageVector getLeakRemove(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20007a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LeakRemove", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.12f, 12.04f);
        pathBuilder.curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f);
        pathBuilder.curveToRelative(0.0f, -0.59f, -0.51f, -1.06f, -1.1f, -1.0f);
        pathBuilder.curveToRelative(-1.5f, 0.15f, -2.9f, 0.61f, -4.16f, 1.3f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.curveToRelative(0.9f, -0.41f, 1.87f, -0.69f, 2.9f, -0.79f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 15.09f);
        pathBuilder.curveToRelative(0.0f, -0.61f, -0.54f, -1.09f, -1.14f, -1.0f);
        pathBuilder.curveToRelative(-0.38f, 0.06f, -0.75f, 0.16f, -1.11f, 0.28f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.curveToRelative(0.37f, -0.15f, 0.63f, -0.49f, 0.63f, -0.9f);
        pathBuilder.close();
        pathBuilder.moveTo(13.97f, 4.14f);
        pathBuilder.curveToRelative(0.06f, -0.59f, -0.4f, -1.11f, -1.0f, -1.11f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.94f, 0.37f, -0.99f, 0.87f);
        pathBuilder.curveToRelative(-0.1f, 1.03f, -0.38f, 2.01f, -0.79f, 2.91f);
        pathBuilder.lineToRelative(1.48f, 1.48f);
        pathBuilder.curveToRelative(0.69f, -1.26f, 1.15f, -2.66f, 1.3f, -4.15f);
        pathBuilder.close();
        pathBuilder.moveTo(9.93f, 4.16f);
        pathBuilder.curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.26f, -0.9f, 0.62f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.curveToRelative(0.13f, -0.35f, 0.22f, -0.72f, 0.28f, -1.1f);
        pathBuilder.close();
        pathBuilder.moveTo(20.44f, 18.88f);
        pathBuilder.lineTo(5.12f, 3.56f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(2.15f, 2.15f);
        pathBuilder.curveToRelative(-0.59f, 0.41f, -1.26f, 0.7f, -1.99f, 0.82f);
        pathBuilder.curveToRelative(-0.48f, 0.1f, -0.84f, 0.5f, -0.84f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.61f, 0.54f, 1.09f, 1.14f, 1.0f);
        pathBuilder.curveToRelative(1.17f, -0.19f, 2.23f, -0.68f, 3.13f, -1.37f);
        pathBuilder.lineTo(8.73f, 10.0f);
        pathBuilder.curveToRelative(-1.34f, 1.1f, -3.0f, 1.82f, -4.81f, 1.99f);
        pathBuilder.curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f);
        pathBuilder.curveToRelative(0.0f, 0.59f, 0.51f, 1.06f, 1.1f, 1.0f);
        pathBuilder.curveToRelative(2.28f, -0.23f, 4.36f, -1.15f, 6.01f, -2.56f);
        pathBuilder.lineToRelative(2.48f, 2.48f);
        pathBuilder.curveToRelative(-1.4f, 1.65f, -2.33f, 3.72f, -2.56f, 6.0f);
        pathBuilder.curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 1.0f, 1.11f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.94f, -0.37f, 0.99f, -0.87f);
        pathBuilder.curveToRelative(0.18f, -1.82f, 0.9f, -3.48f, 1.99f, -4.82f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveToRelative(-0.69f, 0.9f, -1.18f, 1.96f, -1.37f, 3.13f);
        pathBuilder.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        pathBuilder.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilder.curveToRelative(0.12f, -0.73f, 0.42f, -1.4f, 0.82f, -1.99f);
        pathBuilder.lineToRelative(2.13f, 2.13f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.38f, -0.41f, 0.38f, -1.04f, -0.01f, -1.43f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20007a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
