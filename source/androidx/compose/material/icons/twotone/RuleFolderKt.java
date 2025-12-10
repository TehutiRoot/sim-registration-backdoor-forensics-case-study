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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_ruleFolder", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRuleFolder", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "RuleFolder", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRuleFolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuleFolder.kt\nandroidx/compose/material/icons/twotone/RuleFolderKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,111:1\n122#2:112\n116#2,3:113\n119#2,3:117\n132#2,18:120\n152#2:157\n132#2,18:158\n152#2:195\n174#3:116\n694#4,2:138\n706#4,2:140\n708#4,11:146\n694#4,2:176\n706#4,2:178\n708#4,11:184\n64#5,4:142\n64#5,4:180\n*S KotlinDebug\n*F\n+ 1 RuleFolder.kt\nandroidx/compose/material/icons/twotone/RuleFolderKt\n*L\n29#1:112\n29#1:113,3\n29#1:117,3\n30#1:120,18\n30#1:157\n62#1:158,18\n62#1:195\n29#1:116\n30#1:138,2\n30#1:140,2\n30#1:146,11\n62#1:176,2\n62#1:178,2\n62#1:184,11\n30#1:142,4\n62#1:180,4\n*E\n"})
/* loaded from: classes.dex */
public final class RuleFolderKt {

    /* renamed from: a */
    public static ImageVector f24810a;

    @NotNull
    public static final ImageVector getRuleFolder(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24810a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RuleFolder", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72043getButtKaPHkGw = companion2.m72043getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72053getBevelLxFBmk8 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.17f, 8.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.lineToRelative(16.0f, 0.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(11.17f);
        pathBuilder.close();
        pathBuilder.moveTo(7.83f, 16.0f);
        pathBuilder.lineTo(5.0f, 13.17f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(7.83f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 14.59f);
        pathBuilder.lineTo(17.59f, 16.0f);
        pathBuilder.lineTo(16.0f, 14.41f);
        pathBuilder.lineTo(14.41f, 16.0f);
        pathBuilder.lineTo(13.0f, 14.59f);
        pathBuilder.lineTo(14.59f, 13.0f);
        pathBuilder.lineTo(13.0f, 11.41f);
        pathBuilder.lineTo(14.41f, 10.0f);
        pathBuilder.lineTo(16.0f, 11.59f);
        pathBuilder.lineTo(17.59f, 10.0f);
        pathBuilder.lineTo(19.0f, 11.41f);
        pathBuilder.lineTo(17.41f, 13.0f);
        pathBuilder.lineTo(19.0f, 14.59f);
        pathBuilder.close();
        ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw2 = companion2.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk82 = companion3.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.83f, 16.0f);
        pathBuilder2.lineTo(5.0f, 13.17f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(3.54f, -3.54f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineTo(7.83f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.41f, 13.0f);
        pathBuilder2.lineTo(19.0f, 14.59f);
        pathBuilder2.lineTo(17.59f, 16.0f);
        pathBuilder2.lineTo(16.0f, 14.41f);
        pathBuilder2.lineTo(14.41f, 16.0f);
        pathBuilder2.lineTo(13.0f, 14.59f);
        pathBuilder2.lineTo(14.59f, 13.0f);
        pathBuilder2.lineTo(13.0f, 11.41f);
        pathBuilder2.lineTo(14.41f, 10.0f);
        pathBuilder2.lineTo(16.0f, 11.59f);
        pathBuilder2.lineTo(17.59f, 10.0f);
        pathBuilder2.lineTo(19.0f, 11.41f);
        pathBuilder2.lineTo(17.41f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.lineToRelative(-2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        pathBuilder2.lineTo(2.0f, 18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 18.0f);
        pathBuilder2.lineTo(4.0f, 18.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.horizontalLineToRelative(5.17f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw2, m72053getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24810a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
