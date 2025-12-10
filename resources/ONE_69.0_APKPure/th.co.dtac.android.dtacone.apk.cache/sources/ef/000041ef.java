package androidx.compose.material.icons.rounded;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_localSee", "Landroidx/compose/material/icons/Icons$Rounded;", "getLocalSee", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "LocalSee", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalSee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSee.kt\nandroidx/compose/material/icons/rounded/LocalSeeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n122#2:87\n116#2,3:88\n119#2,3:92\n132#2,18:95\n152#2:132\n132#2,18:133\n152#2:170\n132#2,18:171\n152#2:208\n174#3:91\n694#4,2:113\n706#4,2:115\n708#4,11:121\n694#4,2:151\n706#4,2:153\n708#4,11:159\n694#4,2:189\n706#4,2:191\n708#4,11:197\n64#5,4:117\n64#5,4:155\n64#5,4:193\n*S KotlinDebug\n*F\n+ 1 LocalSee.kt\nandroidx/compose/material/icons/rounded/LocalSeeKt\n*L\n29#1:87\n29#1:88,3\n29#1:92,3\n30#1:95,18\n30#1:132\n38#1:133,18\n38#1:170\n60#1:171,18\n60#1:208\n29#1:91\n30#1:113,2\n30#1:115,2\n30#1:121,11\n38#1:151,2\n38#1:153,2\n38#1:159,11\n60#1:189,2\n60#1:191,2\n60#1:197,11\n30#1:117,4\n38#1:155,4\n60#1:193,4\n*E\n"})
/* loaded from: classes.dex */
public final class LocalSeeKt {

    /* renamed from: a */
    public static ImageVector f20149a;

    @NotNull
    public static final ImageVector getLocalSee(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20149a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalSee", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.5f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(1.23f, 0.0f, 2.25f, -0.9f, 2.46f, -2.07f);
        pathBuilder.curveToRelative(-1.0f, -1.01f, -1.83f, -1.98f, -2.48f, -2.93f);
        pathBuilder.curveTo(10.61f, 11.52f, 9.5f, 12.63f, 9.5f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.65f, 17.08f);
        pathBuilder2.curveToRelative(-0.37f, 0.32f, -0.92f, 0.32f, -1.3f, 0.0f);
        pathBuilder2.curveToRelative(-1.26f, -1.08f, -0.7f, -0.61f, -1.3f, -1.14f);
        pathBuilder2.curveToRelative(-0.83f, 1.74f, -2.73f, 2.87f, -4.85f, 2.5f);
        pathBuilder2.curveToRelative(-1.83f, -0.32f, -3.31f, -1.8f, -3.63f, -3.63f);
        pathBuilder2.curveToRelative(-0.42f, -2.44f, 1.13f, -4.58f, 3.31f, -5.14f);
        pathBuilder2.curveTo(10.3f, 8.45f, 10.0f, 7.28f, 10.0f, 6.15f);
        pathBuilder2.curveTo(10.0f, 5.4f, 10.1f, 4.68f, 10.28f, 4.0f);
        pathBuilder2.horizontalLineToRelative(-0.4f);
        pathBuilder2.curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f);
        pathBuilder2.lineTo(7.17f, 6.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.curveTo(2.9f, 6.0f, 2.0f, 6.9f, 2.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(-6.03f);
        pathBuilder2.curveTo(20.59f, 15.46f, 19.35f, 16.48f, 18.65f, 17.08f);
        pathBuilder2.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw3 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk83 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.34f, 14.42f);
        pathBuilder3.curveToRelative(0.37f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        pathBuilder3.curveTo(22.22f, 11.25f, 24.0f, 8.5f, 24.0f, 6.15f);
        pathBuilder3.curveTo(24.0f, 2.42f, 21.15f, 0.0f, 18.0f, 0.0f);
        pathBuilder3.reflectiveCurveToRelative(-6.0f, 2.42f, -6.0f, 6.15f);
        pathBuilder3.curveTo(12.0f, 8.5f, 13.78f, 11.25f, 17.34f, 14.42f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.27f, 5.25f);
        pathBuilder3.lineTo(18.0f, 3.0f);
        pathBuilder3.lineToRelative(0.73f, 2.25f);
        pathBuilder3.horizontalLineTo(21.0f);
        pathBuilder3.lineToRelative(-1.85f, 1.47f);
        pathBuilder3.lineTo(19.85f, 9.0f);
        pathBuilder3.lineTo(18.0f, 7.59f);
        pathBuilder3.lineTo(16.15f, 9.0f);
        pathBuilder3.lineToRelative(0.7f, -2.28f);
        pathBuilder3.lineTo(15.0f, 5.25f);
        pathBuilder3.horizontalLineTo(17.27f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw3, m72237getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20149a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}