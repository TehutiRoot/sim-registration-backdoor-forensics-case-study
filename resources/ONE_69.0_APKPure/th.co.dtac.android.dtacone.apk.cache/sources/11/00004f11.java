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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_autoAwesome", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoAwesome", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoAwesome", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoAwesome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoAwesome.kt\nandroidx/compose/material/icons/twotone/AutoAwesomeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n122#2:91\n116#2,3:92\n119#2,3:96\n132#2,18:99\n152#2:136\n132#2,18:137\n152#2:174\n132#2,18:175\n152#2:212\n132#2,18:213\n152#2:250\n174#3:95\n694#4,2:117\n706#4,2:119\n708#4,11:125\n694#4,2:155\n706#4,2:157\n708#4,11:163\n694#4,2:193\n706#4,2:195\n708#4,11:201\n694#4,2:231\n706#4,2:233\n708#4,11:239\n64#5,4:121\n64#5,4:159\n64#5,4:197\n64#5,4:235\n*S KotlinDebug\n*F\n+ 1 AutoAwesome.kt\nandroidx/compose/material/icons/twotone/AutoAwesomeKt\n*L\n29#1:91\n29#1:92,3\n29#1:96,3\n30#1:99,18\n30#1:136\n41#1:137,18\n41#1:174\n52#1:175,18\n52#1:212\n63#1:213,18\n63#1:250\n29#1:95\n30#1:117,2\n30#1:119,2\n30#1:125,11\n41#1:155,2\n41#1:157,2\n41#1:163,11\n52#1:193,2\n52#1:195,2\n52#1:201,11\n63#1:231,2\n63#1:233,2\n63#1:239,11\n30#1:121,4\n41#1:159,4\n52#1:197,4\n63#1:235,4\n*E\n"})
/* loaded from: classes.dex */
public final class AutoAwesomeKt {

    /* renamed from: a */
    public static ImageVector f23511a;

    @NotNull
    public static final ImageVector getAutoAwesome(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f23511a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AutoAwesome", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.99f, 11.01f);
        pathBuilder.lineToRelative(-0.99f, -2.18f);
        pathBuilder.lineToRelative(-0.99f, 2.18f);
        pathBuilder.lineToRelative(-2.18f, 0.99f);
        pathBuilder.lineToRelative(2.18f, 0.99f);
        pathBuilder.lineToRelative(0.99f, 2.18f);
        pathBuilder.lineToRelative(0.99f, -2.18f);
        pathBuilder.lineToRelative(2.18f, -0.99f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 9.0f);
        pathBuilder2.lineToRelative(1.25f, -2.75f);
        pathBuilder2.lineToRelative(2.75f, -1.25f);
        pathBuilder2.lineToRelative(-2.75f, -1.25f);
        pathBuilder2.lineToRelative(-1.25f, -2.75f);
        pathBuilder2.lineToRelative(-1.25f, 2.75f);
        pathBuilder2.lineToRelative(-2.75f, 1.25f);
        pathBuilder2.lineToRelative(2.75f, 1.25f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.0f, 15.0f);
        pathBuilder3.lineToRelative(-1.25f, 2.75f);
        pathBuilder3.lineToRelative(-2.75f, 1.25f);
        pathBuilder3.lineToRelative(2.75f, 1.25f);
        pathBuilder3.lineToRelative(1.25f, 2.75f);
        pathBuilder3.lineToRelative(1.25f, -2.75f);
        pathBuilder3.lineToRelative(2.75f, -1.25f);
        pathBuilder3.lineToRelative(-2.75f, -1.25f);
        pathBuilder3.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw4 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk84 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(11.5f, 9.5f);
        pathBuilder4.lineTo(9.0f, 4.0f);
        pathBuilder4.lineTo(6.5f, 9.5f);
        pathBuilder4.lineTo(1.0f, 12.0f);
        pathBuilder4.lineToRelative(5.5f, 2.5f);
        pathBuilder4.lineTo(9.0f, 20.0f);
        pathBuilder4.lineToRelative(2.5f, -5.5f);
        pathBuilder4.lineTo(17.0f, 12.0f);
        pathBuilder4.lineTo(11.5f, 9.5f);
        pathBuilder4.close();
        pathBuilder4.moveTo(9.99f, 12.99f);
        pathBuilder4.lineTo(9.0f, 15.17f);
        pathBuilder4.lineToRelative(-0.99f, -2.18f);
        pathBuilder4.lineTo(5.83f, 12.0f);
        pathBuilder4.lineToRelative(2.18f, -0.99f);
        pathBuilder4.lineTo(9.0f, 8.83f);
        pathBuilder4.lineToRelative(0.99f, 2.18f);
        pathBuilder4.lineTo(12.17f, 12.0f);
        pathBuilder4.lineTo(9.99f, 12.99f);
        pathBuilder4.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw4, m72237getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f23511a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}