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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_leakAdd", "Landroidx/compose/material/icons/Icons$Rounded;", "getLeakAdd", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "LeakAdd", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLeakAdd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeakAdd.kt\nandroidx/compose/material/icons/rounded/LeakAddKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n122#2:80\n116#2,3:81\n119#2,3:85\n132#2,18:88\n152#2:125\n174#3:84\n694#4,2:106\n706#4,2:108\n708#4,11:114\n64#5,4:110\n*S KotlinDebug\n*F\n+ 1 LeakAdd.kt\nandroidx/compose/material/icons/rounded/LeakAddKt\n*L\n29#1:80\n29#1:81,3\n29#1:85,3\n30#1:88,18\n30#1:125\n29#1:84\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"})
/* loaded from: classes.dex */
public final class LeakAddKt {

    /* renamed from: a */
    public static ImageVector f20006a;

    @NotNull
    public static final ImageVector getLeakAdd(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20006a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LeakAdd", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.05f, 21.0f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.94f, -0.37f, 0.99f, -0.87f);
        pathBuilder.curveToRelative(0.41f, -4.27f, 3.81f, -7.67f, 8.08f, -8.08f);
        pathBuilder.curveToRelative(0.5f, -0.05f, 0.88f, -0.48f, 0.88f, -0.99f);
        pathBuilder.curveToRelative(0.0f, -0.59f, -0.51f, -1.06f, -1.1f, -1.0f);
        pathBuilder.curveToRelative(-5.19f, 0.52f, -9.32f, 4.65f, -9.84f, 9.83f);
        pathBuilder.curveToRelative(-0.06f, 0.59f, 0.4f, 1.11f, 0.99f, 1.11f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.09f, 21.0f);
        pathBuilder.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilder.curveToRelative(0.36f, -2.08f, 2.0f, -3.72f, 4.08f, -4.08f);
        pathBuilder.curveToRelative(0.49f, -0.08f, 0.85f, -0.49f, 0.85f, -0.98f);
        pathBuilder.curveToRelative(0.0f, -0.61f, -0.54f, -1.09f, -1.14f, -1.0f);
        pathBuilder.curveToRelative(-2.96f, 0.48f, -5.29f, 2.81f, -5.77f, 5.77f);
        pathBuilder.curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1.0f, 1.14f);
        pathBuilder.close();
        pathBuilder.moveTo(12.97f, 3.02f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.94f, 0.37f, -0.99f, 0.87f);
        pathBuilder.curveToRelative(-0.41f, 4.27f, -3.81f, 7.67f, -8.08f, 8.08f);
        pathBuilder.curveToRelative(-0.5f, 0.05f, -0.88f, 0.48f, -0.88f, 0.99f);
        pathBuilder.curveToRelative(0.0f, 0.59f, 0.51f, 1.06f, 1.1f, 1.0f);
        pathBuilder.curveToRelative(5.19f, -0.52f, 9.32f, -4.65f, 9.84f, -9.83f);
        pathBuilder.curveToRelative(0.07f, -0.58f, -0.39f, -1.11f, -0.99f, -1.11f);
        pathBuilder.close();
        pathBuilder.moveTo(6.03f, 3.02f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.94f, 3.02f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f);
        pathBuilder.curveToRelative(-0.36f, 2.08f, -2.0f, 3.72f, -4.08f, 4.08f);
        pathBuilder.curveToRelative(-0.49f, 0.09f, -0.85f, 0.49f, -0.85f, 0.99f);
        pathBuilder.curveToRelative(0.0f, 0.61f, 0.54f, 1.09f, 1.14f, 1.0f);
        pathBuilder.curveToRelative(2.96f, -0.48f, 5.29f, -2.81f, 5.77f, -5.77f);
        pathBuilder.curveToRelative(0.09f, -0.61f, -0.4f, -1.15f, -1.0f, -1.15f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20006a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
