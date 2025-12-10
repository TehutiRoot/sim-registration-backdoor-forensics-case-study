package androidx.compose.material.icons.filled;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_militaryTech", "Landroidx/compose/material/icons/Icons$Filled;", "getMilitaryTech", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "MilitaryTech", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMilitaryTech.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MilitaryTech.kt\nandroidx/compose/material/icons/filled/MilitaryTechKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n122#2:64\n116#2,3:65\n119#2,3:69\n132#2,18:72\n152#2:109\n174#3:68\n694#4,2:90\n706#4,2:92\n708#4,11:98\n64#5,4:94\n*S KotlinDebug\n*F\n+ 1 MilitaryTech.kt\nandroidx/compose/material/icons/filled/MilitaryTechKt\n*L\n29#1:64\n29#1:65,3\n29#1:69,3\n30#1:72,18\n30#1:109\n29#1:68\n30#1:90,2\n30#1:92,2\n30#1:98,11\n30#1:94,4\n*E\n"})
/* loaded from: classes.dex */
public final class MilitaryTechKt {

    /* renamed from: a */
    public static ImageVector f15963a;

    @NotNull
    public static final ImageVector getMilitaryTech(@NotNull Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = f15963a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MilitaryTech", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 10.43f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(8.43f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        pathBuilder.lineToRelative(4.18f, 2.51f);
        pathBuilder.lineToRelative(-0.99f, 2.34f);
        pathBuilder.lineToRelative(-3.41f, 0.29f);
        pathBuilder.lineToRelative(2.59f, 2.24f);
        pathBuilder.lineTo(9.07f, 22.0f);
        pathBuilder.lineTo(12.0f, 20.23f);
        pathBuilder.lineTo(14.93f, 22.0f);
        pathBuilder.lineToRelative(-0.78f, -3.33f);
        pathBuilder.lineToRelative(2.59f, -2.24f);
        pathBuilder.lineToRelative(-3.41f, -0.29f);
        pathBuilder.lineToRelative(-0.99f, -2.34f);
        pathBuilder.lineToRelative(4.18f, -2.51f);
        pathBuilder.curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.23f);
        pathBuilder.lineToRelative(-1.0f, 0.6f);
        pathBuilder.lineToRelative(-1.0f, -0.6f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(12.23f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f15963a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}