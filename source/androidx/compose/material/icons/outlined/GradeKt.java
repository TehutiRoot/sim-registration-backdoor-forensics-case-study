package androidx.compose.material.icons.outlined;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_grade", "Landroidx/compose/material/icons/Icons$Outlined;", "getGrade", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Grade", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grade.kt\nandroidx/compose/material/icons/outlined/GradeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n122#2:71\n116#2,3:72\n119#2,3:76\n132#2,18:79\n152#2:116\n174#3:75\n694#4,2:97\n706#4,2:99\n708#4,11:105\n64#5,4:101\n*S KotlinDebug\n*F\n+ 1 Grade.kt\nandroidx/compose/material/icons/outlined/GradeKt\n*L\n29#1:71\n29#1:72,3\n29#1:76,3\n30#1:79,18\n30#1:116\n29#1:75\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"})
/* loaded from: classes.dex */
public final class GradeKt {

    /* renamed from: a */
    public static ImageVector f17696a;

    @NotNull
    public static final ImageVector getGrade(@NotNull Icons.Outlined outlined) {
        Intrinsics.checkNotNullParameter(outlined, "<this>");
        ImageVector imageVector = f17696a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Grade", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.13f);
        pathBuilder.lineToRelative(0.97f, 2.29f);
        pathBuilder.lineToRelative(0.47f, 1.11f);
        pathBuilder.lineToRelative(1.2f, 0.1f);
        pathBuilder.lineToRelative(2.47f, 0.21f);
        pathBuilder.lineToRelative(-1.88f, 1.63f);
        pathBuilder.lineToRelative(-0.91f, 0.79f);
        pathBuilder.lineToRelative(0.27f, 1.18f);
        pathBuilder.lineToRelative(0.56f, 2.41f);
        pathBuilder.lineToRelative(-2.12f, -1.28f);
        pathBuilder.lineToRelative(-1.03f, -0.64f);
        pathBuilder.lineToRelative(-1.03f, 0.62f);
        pathBuilder.lineToRelative(-2.12f, 1.28f);
        pathBuilder.lineToRelative(0.56f, -2.41f);
        pathBuilder.lineToRelative(0.27f, -1.18f);
        pathBuilder.lineToRelative(-0.91f, -0.79f);
        pathBuilder.lineToRelative(-1.88f, -1.63f);
        pathBuilder.lineToRelative(2.47f, -0.21f);
        pathBuilder.lineToRelative(1.2f, -0.1f);
        pathBuilder.lineToRelative(0.47f, -1.11f);
        pathBuilder.lineToRelative(0.97f, -2.27f);
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(9.19f, 8.63f);
        pathBuilder.lineTo(2.0f, 9.24f);
        pathBuilder.lineToRelative(5.46f, 4.73f);
        pathBuilder.lineTo(5.82f, 21.0f);
        pathBuilder.lineTo(12.0f, 17.27f);
        pathBuilder.lineTo(18.18f, 21.0f);
        pathBuilder.lineToRelative(-1.64f, -7.03f);
        pathBuilder.lineTo(22.0f, 9.24f);
        pathBuilder.lineToRelative(-7.19f, -0.61f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f17696a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
