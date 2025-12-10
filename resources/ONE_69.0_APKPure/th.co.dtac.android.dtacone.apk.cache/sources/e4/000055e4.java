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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_tram", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTram", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Tram", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTram.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tram.kt\nandroidx/compose/material/icons/twotone/TramKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n122#2:116\n116#2,3:117\n119#2,3:121\n132#2,18:124\n152#2:161\n132#2,18:162\n152#2:199\n174#3:120\n694#4,2:142\n706#4,2:144\n708#4,11:150\n694#4,2:180\n706#4,2:182\n708#4,11:188\n64#5,4:146\n64#5,4:184\n*S KotlinDebug\n*F\n+ 1 Tram.kt\nandroidx/compose/material/icons/twotone/TramKt\n*L\n29#1:116\n29#1:117,3\n29#1:121,3\n30#1:124,18\n30#1:161\n54#1:162,18\n54#1:199\n29#1:120\n30#1:142,2\n30#1:144,2\n30#1:150,11\n54#1:180,2\n54#1:182,2\n54#1:188,11\n30#1:146,4\n54#1:184,4\n*E\n"})
/* loaded from: classes.dex */
public final class TramKt {

    /* renamed from: a */
    public static ImageVector f25258a;

    @NotNull
    public static final ImageVector getTram(@NotNull Icons.TwoTone twoTone) {
        Intrinsics.checkNotNullParameter(twoTone, "<this>");
        ImageVector imageVector = f25258a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Tram", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.97f, 7.0f);
        pathBuilder.horizontalLineToRelative(-1.94f);
        pathBuilder.curveToRelative(-2.75f, 0.08f, -3.62f, 0.58f, -3.9f, 1.0f);
        pathBuilder.horizontalLineToRelative(9.74f);
        pathBuilder.curveToRelative(-0.28f, -0.42f, -1.15f, -0.92f, -3.9f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 16.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.3f, 0.84f, 0.74f, 0.95f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.curveToRelative(-0.22f, -0.26f, -0.35f, -0.59f, -0.35f, -0.95f);
        pathBuilder.curveToRelative(0.0f, -0.39f, 0.15f, -0.73f, 0.39f, -1.0f);
        pathBuilder.lineTo(7.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 0.36f, -0.13f, 0.69f, -0.35f, 0.95f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.curveToRelative(0.44f, -0.11f, 0.74f, -0.5f, 0.74f, -0.95f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(-3.89f);
        pathBuilder.curveToRelative(0.24f, 0.27f, 0.39f, 0.61f, 0.39f, 1.0f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 5.0f);
        pathBuilder2.lineToRelative(0.75f, -1.5f);
        pathBuilder2.lineTo(17.0f, 3.5f);
        pathBuilder2.lineTo(17.0f, 2.0f);
        pathBuilder2.lineTo(7.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(1.5f);
        pathBuilder2.horizontalLineToRelative(4.75f);
        pathBuilder2.lineTo(11.0f, 5.0f);
        pathBuilder2.curveToRelative(-3.13f, 0.09f, -6.0f, 0.73f, -6.0f, 3.5f);
        pathBuilder2.lineTo(5.0f, 17.0f);
        pathBuilder2.curveToRelative(0.0f, 1.5f, 1.11f, 2.73f, 2.55f, 2.95f);
        pathBuilder2.lineTo(6.0f, 21.5f);
        pathBuilder2.verticalLineToRelative(0.5f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.lineToRelative(2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-0.5f);
        pathBuilder2.lineToRelative(-1.55f, -1.55f);
        pathBuilder2.horizontalLineToRelative(-0.01f);
        pathBuilder2.horizontalLineToRelative(0.01f);
        pathBuilder2.curveTo(17.89f, 19.73f, 19.0f, 18.5f, 19.0f, 17.0f);
        pathBuilder2.lineTo(19.0f, 8.5f);
        pathBuilder2.curveToRelative(0.0f, -2.77f, -2.87f, -3.41f, -6.0f, -3.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.03f, 7.0f);
        pathBuilder2.horizontalLineToRelative(1.94f);
        pathBuilder2.curveToRelative(2.75f, 0.08f, 3.62f, 0.58f, 3.9f, 1.0f);
        pathBuilder2.lineTo(7.13f, 8.0f);
        pathBuilder2.curveToRelative(0.28f, -0.42f, 1.15f, -0.92f, 3.9f, -1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.85f, 17.95f);
        pathBuilder2.lineTo(7.74f, 17.95f);
        pathBuilder2.curveTo(7.3f, 17.84f, 7.0f, 17.45f, 7.0f, 17.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(3.89f);
        pathBuilder2.curveToRelative(-0.24f, 0.27f, -0.39f, 0.61f, -0.39f, 1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.36f, 0.13f, 0.69f, 0.35f, 0.95f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 17.0f);
        pathBuilder2.curveToRelative(0.0f, 0.45f, -0.3f, 0.84f, -0.74f, 0.95f);
        pathBuilder2.horizontalLineToRelative(-3.11f);
        pathBuilder2.curveToRelative(0.22f, -0.26f, 0.35f, -0.59f, 0.35f, -0.95f);
        pathBuilder2.curveToRelative(0.0f, -0.39f, -0.15f, -0.73f, -0.39f, -1.0f);
        pathBuilder2.lineTo(17.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 14.0f);
        pathBuilder2.lineTo(7.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f25258a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}