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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_repartition", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRepartition", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Repartition", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepartition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Repartition.kt\nandroidx/compose/material/icons/twotone/RepartitionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n122#2:102\n116#2,3:103\n119#2,3:107\n132#2,18:110\n152#2:147\n132#2,18:148\n152#2:185\n132#2,18:186\n152#2:223\n132#2,18:224\n152#2:261\n132#2,18:262\n152#2:299\n174#3:106\n694#4,2:128\n706#4,2:130\n708#4,11:136\n694#4,2:166\n706#4,2:168\n708#4,11:174\n694#4,2:204\n706#4,2:206\n708#4,11:212\n694#4,2:242\n706#4,2:244\n708#4,11:250\n694#4,2:280\n706#4,2:282\n708#4,11:288\n64#5,4:132\n64#5,4:170\n64#5,4:208\n64#5,4:246\n64#5,4:284\n*S KotlinDebug\n*F\n+ 1 Repartition.kt\nandroidx/compose/material/icons/twotone/RepartitionKt\n*L\n29#1:102\n29#1:103,3\n29#1:107,3\n30#1:110,18\n30#1:147\n37#1:148,18\n37#1:185\n44#1:186,18\n44#1:223\n51#1:224,18\n51#1:261\n77#1:262,18\n77#1:299\n29#1:106\n30#1:128,2\n30#1:130,2\n30#1:136,11\n37#1:166,2\n37#1:168,2\n37#1:174,11\n44#1:204,2\n44#1:206,2\n44#1:212,11\n51#1:242,2\n51#1:244,2\n51#1:250,11\n77#1:280,2\n77#1:282,2\n77#1:288,11\n30#1:132,4\n37#1:170,4\n44#1:208,4\n51#1:246,4\n77#1:284,4\n*E\n"})
/* loaded from: classes.dex */
public final class RepartitionKt {

    /* renamed from: a */
    public static ImageVector f24848a;

    @NotNull
    public static final ImageVector getRepartition(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f24848a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Repartition", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.67f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.33f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-3.33f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.33f, 17.0f);
        pathBuilder2.horizontalLineToRelative(3.33f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-3.33f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(5.0f, 17.0f);
        pathBuilder3.horizontalLineToRelative(3.33f);
        pathBuilder3.verticalLineToRelative(2.0f);
        pathBuilder3.horizontalLineToRelative(-3.33f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(3.0f, 21.0f);
        pathBuilder4.horizontalLineToRelative(18.0f);
        pathBuilder4.verticalLineToRelative(-6.0f);
        pathBuilder4.horizontalLineTo(3.0f);
        pathBuilder4.verticalLineTo(21.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(15.67f, 17.0f);
        pathBuilder4.horizontalLineTo(19.0f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(-3.33f);
        pathBuilder4.verticalLineTo(17.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(10.33f, 17.0f);
        pathBuilder4.horizontalLineToRelative(3.33f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineToRelative(-3.33f);
        pathBuilder4.verticalLineTo(17.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(5.0f, 17.0f);
        pathBuilder4.horizontalLineToRelative(3.33f);
        pathBuilder4.verticalLineToRelative(2.0f);
        pathBuilder4.horizontalLineTo(5.0f);
        pathBuilder4.verticalLineTo(17.0f);
        pathBuilder4.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw5 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk85 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(6.0f, 10.0f);
        pathBuilder5.lineToRelative(1.42f, -1.42f);
        pathBuilder5.lineTo(5.83f, 7.0f);
        pathBuilder5.horizontalLineTo(17.0f);
        pathBuilder5.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder5.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder5.horizontalLineTo(3.0f);
        pathBuilder5.verticalLineToRelative(2.0f);
        pathBuilder5.horizontalLineToRelative(14.0f);
        pathBuilder5.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder5.horizontalLineTo(5.83f);
        pathBuilder5.lineToRelative(1.59f, -1.59f);
        pathBuilder5.lineTo(6.0f, 2.0f);
        pathBuilder5.lineTo(2.0f, 6.0f);
        pathBuilder5.lineTo(6.0f, 10.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw5, m72237getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f24848a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}