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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_viewKanban", "Landroidx/compose/material/icons/Icons$TwoTone;", "getViewKanban", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ViewKanban", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewKanban.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewKanban.kt\nandroidx/compose/material/icons/twotone/ViewKanbanKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n122#2:101\n116#2,3:102\n119#2,3:106\n132#2,18:109\n152#2:146\n132#2,18:147\n152#2:184\n132#2,18:185\n152#2:222\n132#2,18:223\n152#2:260\n132#2,18:261\n152#2:298\n174#3:105\n694#4,2:127\n706#4,2:129\n708#4,11:135\n694#4,2:165\n706#4,2:167\n708#4,11:173\n694#4,2:203\n706#4,2:205\n708#4,11:211\n694#4,2:241\n706#4,2:243\n708#4,11:249\n694#4,2:279\n706#4,2:281\n708#4,11:287\n64#5,4:131\n64#5,4:169\n64#5,4:207\n64#5,4:245\n64#5,4:283\n*S KotlinDebug\n*F\n+ 1 ViewKanban.kt\nandroidx/compose/material/icons/twotone/ViewKanbanKt\n*L\n29#1:101\n29#1:102,3\n29#1:106,3\n30#1:109,18\n30#1:146\n56#1:147,18\n56#1:184\n63#1:185,18\n63#1:222\n70#1:223,18\n70#1:260\n77#1:261,18\n77#1:298\n29#1:105\n30#1:127,2\n30#1:129,2\n30#1:135,11\n56#1:165,2\n56#1:167,2\n56#1:173,11\n63#1:203,2\n63#1:205,2\n63#1:211,11\n70#1:241,2\n70#1:243,2\n70#1:249,11\n77#1:279,2\n77#1:281,2\n77#1:287,11\n30#1:131,4\n56#1:169,4\n63#1:207,4\n70#1:245,4\n77#1:283,4\n*E\n"})
/* loaded from: classes.dex */
public final class ViewKanbanKt {

    /* renamed from: a */
    public static ImageVector f25345a;

    @NotNull
    public static final ImageVector getViewKanban(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25345a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ViewKanban", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(11.0f, 7.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineToRelative(5.0f);
        pathBuilder3.horizontalLineToRelative(-2.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(15.0f, 7.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(8.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(19.0f, 3.0f);
        pathBuilder5.horizontalLineTo(5.0f);
        pathBuilder5.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder5.verticalLineToRelative(14.0f);
        pathBuilder5.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder5.horizontalLineToRelative(14.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(19.0f, 19.0f);
        pathBuilder5.horizontalLineTo(5.0f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.horizontalLineToRelative(14.0f);
        pathBuilder5.verticalLineTo(19.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25345a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}