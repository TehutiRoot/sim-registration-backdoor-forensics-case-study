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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_historyEdu", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHistoryEdu", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "HistoryEdu", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHistoryEdu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryEdu.kt\nandroidx/compose/material/icons/twotone/HistoryEduKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n122#2:113\n116#2,3:114\n119#2,3:118\n132#2,18:121\n152#2:158\n132#2,18:159\n152#2:196\n132#2,18:197\n152#2:234\n174#3:117\n694#4,2:139\n706#4,2:141\n708#4,11:147\n694#4,2:177\n706#4,2:179\n708#4,11:185\n694#4,2:215\n706#4,2:217\n708#4,11:223\n64#5,4:143\n64#5,4:181\n64#5,4:219\n*S KotlinDebug\n*F\n+ 1 HistoryEdu.kt\nandroidx/compose/material/icons/twotone/HistoryEduKt\n*L\n29#1:113\n29#1:114,3\n29#1:118,3\n30#1:121,18\n30#1:158\n43#1:159,18\n43#1:196\n61#1:197,18\n61#1:234\n29#1:117\n30#1:139,2\n30#1:141,2\n30#1:147,11\n43#1:177,2\n43#1:179,2\n43#1:185,11\n61#1:215,2\n61#1:217,2\n61#1:223,11\n30#1:143,4\n43#1:181,4\n61#1:219,4\n*E\n"})
/* loaded from: classes.dex */
public final class HistoryEduKt {

    /* renamed from: a */
    public static ImageVector f24153a;

    @NotNull
    public static final ImageVector getHistoryEdu(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24153a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HistoryEdu", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.34f, 9.76f);
        pathBuilder.lineTo(9.93f, 8.34f);
        pathBuilder.curveTo(8.98f, 7.4f, 7.73f, 6.88f, 6.39f, 6.88f);
        pathBuilder.curveTo(5.76f, 6.88f, 5.14f, 7.0f, 4.57f, 7.22f);
        pathBuilder.lineToRelative(1.04f, 1.04f);
        pathBuilder.horizontalLineToRelative(2.28f);
        pathBuilder.verticalLineToRelative(2.14f);
        pathBuilder.curveToRelative(0.4f, 0.23f, 0.86f, 0.35f, 1.33f, 0.35f);
        pathBuilder.curveToRelative(0.73f, 0.0f, 1.41f, -0.28f, 1.92f, -0.8f);
        pathBuilder.lineTo(11.34f, 9.76f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 6.62f);
        pathBuilder2.lineToRelative(6.0f, 5.97f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.horizontalLineToRelative(-1.41f);
        pathBuilder2.lineToRelative(-2.83f, -2.83f);
        pathBuilder2.lineToRelative(-0.2f, 0.2f);
        pathBuilder2.curveToRelative(-0.46f, 0.46f, -0.99f, 0.8f, -1.56f, 1.03f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.verticalLineTo(6.62f);
        pathBuilder2.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw3 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk83 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(9.0f, 4.0f);
        pathBuilder3.verticalLineToRelative(1.38f);
        pathBuilder3.curveToRelative(-0.83f, -0.33f, -1.72f, -0.5f, -2.61f, -0.5f);
        pathBuilder3.curveToRelative(-1.79f, 0.0f, -3.58f, 0.68f, -4.95f, 2.05f);
        pathBuilder3.lineToRelative(3.33f, 3.33f);
        pathBuilder3.horizontalLineToRelative(1.11f);
        pathBuilder3.verticalLineToRelative(1.11f);
        pathBuilder3.curveToRelative(0.86f, 0.86f, 1.98f, 1.31f, 3.11f, 1.36f);
        pathBuilder3.verticalLineTo(15.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(10.0f);
        pathBuilder3.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.horizontalLineTo(9.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(7.89f, 10.41f);
        pathBuilder3.verticalLineTo(8.26f);
        pathBuilder3.horizontalLineTo(5.61f);
        pathBuilder3.lineTo(4.57f, 7.22f);
        pathBuilder3.curveTo(5.14f, 7.0f, 5.76f, 6.88f, 6.39f, 6.88f);
        pathBuilder3.curveToRelative(1.34f, 0.0f, 2.59f, 0.52f, 3.54f, 1.46f);
        pathBuilder3.lineToRelative(1.41f, 1.41f);
        pathBuilder3.lineToRelative(-0.2f, 0.2f);
        pathBuilder3.curveToRelative(-0.51f, 0.51f, -1.19f, 0.8f, -1.92f, 0.8f);
        pathBuilder3.curveTo(8.75f, 10.75f, 8.29f, 10.63f, 7.89f, 10.41f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 17.0f);
        pathBuilder3.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder3.verticalLineToRelative(-2.0f);
        pathBuilder3.horizontalLineToRelative(-6.0f);
        pathBuilder3.verticalLineToRelative(-2.59f);
        pathBuilder3.curveToRelative(0.57f, -0.23f, 1.1f, -0.57f, 1.56f, -1.03f);
        pathBuilder3.lineToRelative(0.2f, -0.2f);
        pathBuilder3.lineTo(15.59f, 14.0f);
        pathBuilder3.horizontalLineTo(17.0f);
        pathBuilder3.verticalLineToRelative(-1.41f);
        pathBuilder3.lineToRelative(-6.0f, -5.97f);
        pathBuilder3.verticalLineTo(6.0f);
        pathBuilder3.horizontalLineToRelative(8.0f);
        pathBuilder3.verticalLineTo(17.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw3, m72053getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24153a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
