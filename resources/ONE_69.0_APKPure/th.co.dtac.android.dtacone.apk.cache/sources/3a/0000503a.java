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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_curtains", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCurtains", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Curtains", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCurtains.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Curtains.kt\nandroidx/compose/material/icons/twotone/CurtainsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n122#2:104\n116#2,3:105\n119#2,3:109\n132#2,18:112\n152#2:149\n132#2,18:150\n152#2:187\n132#2,18:188\n152#2:225\n132#2,18:226\n152#2:263\n132#2,18:264\n152#2:301\n174#3:108\n694#4,2:130\n706#4,2:132\n708#4,11:138\n694#4,2:168\n706#4,2:170\n708#4,11:176\n694#4,2:206\n706#4,2:208\n708#4,11:214\n694#4,2:244\n706#4,2:246\n708#4,11:252\n694#4,2:282\n706#4,2:284\n708#4,11:290\n64#5,4:134\n64#5,4:172\n64#5,4:210\n64#5,4:248\n64#5,4:286\n*S KotlinDebug\n*F\n+ 1 Curtains.kt\nandroidx/compose/material/icons/twotone/CurtainsKt\n*L\n29#1:104\n29#1:105,3\n29#1:109,3\n30#1:112,18\n30#1:149\n37#1:150,18\n37#1:187\n44#1:188,18\n44#1:225\n51#1:226,18\n51#1:263\n58#1:264,18\n58#1:301\n29#1:108\n30#1:130,2\n30#1:132,2\n30#1:138,11\n37#1:168,2\n37#1:170,2\n37#1:176,11\n44#1:206,2\n44#1:208,2\n44#1:214,11\n51#1:244,2\n51#1:246,2\n51#1:252,11\n58#1:282,2\n58#1:284,2\n58#1:290,11\n30#1:134,4\n37#1:172,4\n44#1:210,4\n51#1:248,4\n58#1:286,4\n*E\n"})
/* loaded from: classes.dex */
public final class CurtainsKt {

    /* renamed from: a */
    public static ImageVector f23808a;

    @NotNull
    public static final ImageVector getCurtains(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23808a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Curtains", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 13.14f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(3.94f);
        pathBuilder.curveTo(9.64f, 16.07f, 8.05f, 13.73f, 6.0f, 13.14f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.94f, 5.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(5.86f);
        pathBuilder2.curveTo(8.05f, 10.27f, 9.64f, 7.93f, 9.94f, 5.0f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(14.06f, 19.0f);
        pathBuilder3.horizontalLineTo(18.0f);
        pathBuilder3.verticalLineToRelative(-5.86f);
        pathBuilder3.curveTo(15.95f, 13.73f, 14.36f, 16.07f, 14.06f, 19.0f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(18.0f, 10.86f);
        pathBuilder4.verticalLineTo(5.0f);
        pathBuilder4.horizontalLineToRelative(-3.94f);
        pathBuilder4.curveTo(14.36f, 7.93f, 15.95f, 10.27f, 18.0f, 10.86f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(20.0f, 19.0f);
        pathBuilder5.verticalLineTo(3.0f);
        pathBuilder5.horizontalLineTo(4.0f);
        pathBuilder5.verticalLineToRelative(16.0f);
        pathBuilder5.horizontalLineTo(2.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.horizontalLineToRelative(20.0f);
        pathBuilder5.verticalLineToRelative(-2.0f);
        pathBuilder5.horizontalLineTo(20.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(6.0f, 5.0f);
        pathBuilder5.horizontalLineToRelative(3.94f);
        pathBuilder5.curveTo(9.64f, 7.93f, 8.05f, 10.27f, 6.0f, 10.86f);
        pathBuilder5.verticalLineTo(5.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(6.0f, 19.0f);
        pathBuilder5.verticalLineToRelative(-5.86f);
        pathBuilder5.curveToRelative(2.05f, 0.58f, 3.64f, 2.93f, 3.94f, 5.86f);
        pathBuilder5.horizontalLineTo(6.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(11.95f, 19.0f);
        pathBuilder5.curveToRelative(-0.26f, -3.06f, -1.72f, -5.65f, -3.76f, -7.0f);
        pathBuilder5.curveToRelative(2.04f, -1.35f, 3.5f, -3.94f, 3.76f, -7.0f);
        pathBuilder5.horizontalLineToRelative(0.09f);
        pathBuilder5.curveToRelative(0.26f, 3.06f, 1.72f, 5.65f, 3.76f, 7.0f);
        pathBuilder5.curveToRelative(-2.04f, 1.35f, -3.5f, 3.94f, -3.76f, 7.0f);
        pathBuilder5.horizontalLineTo(11.95f);
        pathBuilder5.close();
        pathBuilder5.moveTo(18.0f, 19.0f);
        pathBuilder5.horizontalLineToRelative(-3.94f);
        pathBuilder5.curveToRelative(0.3f, -2.93f, 1.89f, -5.27f, 3.94f, -5.86f);
        pathBuilder5.verticalLineTo(19.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(18.0f, 10.86f);
        pathBuilder5.curveToRelative(-2.05f, -0.58f, -3.64f, -2.93f, -3.94f, -5.86f);
        pathBuilder5.horizontalLineTo(18.0f);
        pathBuilder5.verticalLineTo(10.86f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23808a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}