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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_sentimentVeryDissatisfied", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSentimentVeryDissatisfied", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "SentimentVeryDissatisfied", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSentimentVeryDissatisfied.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentimentVeryDissatisfied.kt\nandroidx/compose/material/icons/twotone/SentimentVeryDissatisfiedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,121:1\n122#2:122\n116#2,3:123\n119#2,3:127\n132#2,18:130\n152#2:167\n132#2,18:168\n152#2:205\n174#3:126\n694#4,2:148\n706#4,2:150\n708#4,11:156\n694#4,2:186\n706#4,2:188\n708#4,11:194\n64#5,4:152\n64#5,4:190\n*S KotlinDebug\n*F\n+ 1 SentimentVeryDissatisfied.kt\nandroidx/compose/material/icons/twotone/SentimentVeryDissatisfiedKt\n*L\n29#1:122\n29#1:123,3\n29#1:127,3\n30#1:130,18\n30#1:167\n71#1:168,18\n71#1:205\n29#1:126\n30#1:148,2\n30#1:150,2\n30#1:156,11\n71#1:186,2\n71#1:188,2\n71#1:194,11\n30#1:152,4\n71#1:190,4\n*E\n"})
/* loaded from: classes.dex */
public final class SentimentVeryDissatisfiedKt {

    /* renamed from: a */
    public static ImageVector f24873a;

    @NotNull
    public static final ImageVector getSentimentVeryDissatisfied(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24873a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SentimentVeryDissatisfied", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.76f, 8.82f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(11.0f, 8.82f);
        pathBuilder.lineTo(9.94f, 9.88f);
        pathBuilder.lineTo(11.0f, 10.94f);
        pathBuilder.lineTo(9.94f, 12.0f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineTo(7.82f, 12.0f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.close();
        pathBuilder.moveTo(6.89f, 17.0f);
        pathBuilder.curveToRelative(0.8f, -2.04f, 2.78f, -3.5f, 5.11f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(4.31f, 1.46f, 5.11f, 3.5f);
        pathBuilder.lineTo(6.89f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.24f, 10.94f);
        pathBuilder.lineTo(16.18f, 12.0f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineTo(14.06f, 12.0f);
        pathBuilder.lineTo(13.0f, 10.94f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(13.0f, 8.82f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 13.5f);
        pathBuilder2.curveToRelative(-2.33f, 0.0f, -4.31f, 1.46f, -5.11f, 3.5f);
        pathBuilder2.horizontalLineToRelative(10.22f);
        pathBuilder2.curveToRelative(-0.8f, -2.04f, -2.78f, -3.5f, -5.11f, -3.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.82f, 12.0f);
        pathBuilder2.lineToRelative(1.06f, -1.06f);
        pathBuilder2.lineTo(9.94f, 12.0f);
        pathBuilder2.lineTo(11.0f, 10.94f);
        pathBuilder2.lineTo(9.94f, 9.88f);
        pathBuilder2.lineTo(11.0f, 8.82f);
        pathBuilder2.lineTo(9.94f, 7.76f);
        pathBuilder2.lineTo(8.88f, 8.82f);
        pathBuilder2.lineTo(7.82f, 7.76f);
        pathBuilder2.lineTo(6.76f, 8.82f);
        pathBuilder2.lineToRelative(1.06f, 1.06f);
        pathBuilder2.lineToRelative(-1.06f, 1.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.99f, 2.0f);
        pathBuilder2.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder2.reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f);
        pathBuilder2.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder2.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.18f, 7.76f);
        pathBuilder2.lineToRelative(-1.06f, 1.06f);
        pathBuilder2.lineToRelative(-1.06f, -1.06f);
        pathBuilder2.lineTo(13.0f, 8.82f);
        pathBuilder2.lineToRelative(1.06f, 1.06f);
        pathBuilder2.lineTo(13.0f, 10.94f);
        pathBuilder2.lineTo(14.06f, 12.0f);
        pathBuilder2.lineToRelative(1.06f, -1.06f);
        pathBuilder2.lineTo(16.18f, 12.0f);
        pathBuilder2.lineToRelative(1.06f, -1.06f);
        pathBuilder2.lineToRelative(-1.06f, -1.06f);
        pathBuilder2.lineToRelative(1.06f, -1.06f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24873a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
