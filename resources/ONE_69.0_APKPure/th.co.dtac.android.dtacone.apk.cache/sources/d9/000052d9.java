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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_menuBook", "Landroidx/compose/material/icons/Icons$TwoTone;", "getMenuBook", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "MenuBook", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenuBook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/twotone/MenuBookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,110:1\n122#2:111\n116#2,3:112\n119#2,3:116\n132#2,18:119\n152#2:156\n132#2,18:157\n152#2:194\n132#2,18:195\n152#2:232\n132#2,18:233\n152#2:270\n132#2,18:271\n152#2:308\n174#3:115\n694#4,2:137\n706#4,2:139\n708#4,11:145\n694#4,2:175\n706#4,2:177\n708#4,11:183\n694#4,2:213\n706#4,2:215\n708#4,11:221\n694#4,2:251\n706#4,2:253\n708#4,11:259\n694#4,2:289\n706#4,2:291\n708#4,11:297\n64#5,4:141\n64#5,4:179\n64#5,4:217\n64#5,4:255\n64#5,4:293\n*S KotlinDebug\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/twotone/MenuBookKt\n*L\n29#1:111\n29#1:112,3\n29#1:116,3\n30#1:119,18\n30#1:156\n65#1:157,18\n65#1:194\n75#1:195,18\n75#1:232\n85#1:233,18\n85#1:270\n95#1:271,18\n95#1:308\n29#1:115\n30#1:137,2\n30#1:139,2\n30#1:145,11\n65#1:175,2\n65#1:177,2\n65#1:183,11\n75#1:213,2\n75#1:215,2\n75#1:221,11\n85#1:251,2\n85#1:253,2\n85#1:259,11\n95#1:289,2\n95#1:291,2\n95#1:297,11\n30#1:141,4\n65#1:179,4\n75#1:217,4\n85#1:255,4\n95#1:293,4\n*E\n"})
/* loaded from: classes.dex */
public final class MenuBookKt {

    /* renamed from: a */
    public static ImageVector f24479a;

    @NotNull
    public static final ImageVector getMenuBook(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24479a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MenuBook", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        pathBuilder.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f);
        pathBuilder.verticalLineToRelative(14.65f);
        pathBuilder.curveToRelative(0.0f, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f);
        pathBuilder.curveToRelative(0.1f, 0.0f, 0.15f, -0.05f, 0.25f, -0.05f);
        pathBuilder.curveTo(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 4.05f, 0.4f, 5.5f, 1.5f);
        pathBuilder.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.35f, 0.3f, 4.75f, 1.05f);
        pathBuilder.curveToRelative(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f);
        pathBuilder.curveToRelative(0.25f, 0.0f, 0.5f, -0.25f, 0.5f, -0.5f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveTo(22.4f, 5.55f, 21.75f, 5.25f, 21.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 18.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(1.1f, -0.35f, 2.3f, -0.5f, 3.5f, -0.5f);
        pathBuilder.curveToRelative(1.34f, 0.0f, 3.13f, 0.41f, 4.5f, 0.99f);
        pathBuilder.verticalLineToRelative(11.5f);
        pathBuilder.curveTo(9.63f, 18.41f, 7.84f, 18.0f, 6.5f, 18.0f);
        pathBuilder.curveTo(5.3f, 18.0f, 4.1f, 18.15f, 3.0f, 18.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 18.5f);
        pathBuilder.curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        pathBuilder.curveToRelative(-1.34f, 0.0f, -3.13f, 0.41f, -4.5f, 0.99f);
        pathBuilder.verticalLineTo(7.49f);
        pathBuilder.curveToRelative(1.37f, -0.59f, 3.16f, -0.99f, 4.5f, -0.99f);
        pathBuilder.curveToRelative(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f);
        pathBuilder.verticalLineTo(18.5f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 7.49f);
        pathBuilder2.curveTo(9.63f, 6.91f, 7.84f, 6.5f, 6.5f, 6.5f);
        pathBuilder2.curveTo(5.3f, 6.5f, 4.1f, 6.65f, 3.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(11.5f);
        pathBuilder2.curveTo(4.1f, 18.15f, 5.3f, 18.0f, 6.5f, 18.0f);
        pathBuilder2.curveToRelative(1.34f, 0.0f, 3.13f, 0.41f, 4.5f, 0.99f);
        pathBuilder2.verticalLineTo(7.49f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.5f, 10.5f);
        pathBuilder3.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        pathBuilder3.verticalLineTo(9.24f);
        pathBuilder3.curveTo(19.21f, 9.09f, 18.36f, 9.0f, 17.5f, 9.0f);
        pathBuilder3.curveToRelative(-1.28f, 0.0f, -2.46f, 0.16f, -3.5f, 0.47f);
        pathBuilder3.verticalLineToRelative(1.57f);
        pathBuilder3.curveTo(14.99f, 10.69f, 16.18f, 10.5f, 17.5f, 10.5f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(17.5f, 13.16f);
        pathBuilder4.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        pathBuilder4.verticalLineTo(11.9f);
        pathBuilder4.curveToRelative(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f);
        pathBuilder4.curveToRelative(-1.28f, 0.0f, -2.46f, 0.16f, -3.5f, 0.47f);
        pathBuilder4.verticalLineToRelative(1.57f);
        pathBuilder4.curveTo(14.99f, 13.36f, 16.18f, 13.16f, 17.5f, 13.16f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(17.5f, 15.83f);
        pathBuilder5.curveToRelative(0.88f, 0.0f, 1.73f, 0.09f, 2.5f, 0.26f);
        pathBuilder5.verticalLineToRelative(-1.52f);
        pathBuilder5.curveToRelative(-0.79f, -0.15f, -1.64f, -0.24f, -2.5f, -0.24f);
        pathBuilder5.curveToRelative(-1.28f, 0.0f, -2.46f, 0.16f, -3.5f, 0.47f);
        pathBuilder5.verticalLineToRelative(1.57f);
        pathBuilder5.curveTo(14.99f, 16.02f, 16.18f, 15.83f, 17.5f, 15.83f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24479a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}