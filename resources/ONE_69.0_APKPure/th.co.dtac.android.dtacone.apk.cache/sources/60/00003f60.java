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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_contactless", "Landroidx/compose/material/icons/Icons$Rounded;", "getContactless", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Contactless", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContactless.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/rounded/ContactlessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n122#2:79\n116#2,3:80\n119#2,3:84\n132#2,18:87\n152#2:124\n174#3:83\n694#4,2:105\n706#4,2:107\n708#4,11:113\n64#5,4:109\n*S KotlinDebug\n*F\n+ 1 Contactless.kt\nandroidx/compose/material/icons/rounded/ContactlessKt\n*L\n29#1:79\n29#1:80,3\n29#1:84,3\n30#1:87,18\n30#1:124\n29#1:83\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"})
/* loaded from: classes.dex */
public final class ContactlessKt {

    /* renamed from: a */
    public static ImageVector f19494a;

    @NotNull
    public static final ImageVector getContactless(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19494a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Contactless", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.75f, 13.68f);
        pathBuilder.curveToRelative(-0.13f, 0.43f, -0.62f, 0.63f, -1.02f, 0.45f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.34f, -0.16f, -0.51f, -0.54f, -0.4f, -0.9f);
        pathBuilder.curveToRelative(0.12f, -0.41f, 0.18f, -0.83f, 0.17f, -1.24f);
        pathBuilder.curveToRelative(-0.01f, -0.41f, -0.06f, -0.8f, -0.17f, -1.18f);
        pathBuilder.curveToRelative(-0.1f, -0.36f, 0.06f, -0.75f, 0.4f, -0.9f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.42f, -0.19f, 0.91f, 0.04f, 1.04f, 0.49f);
        pathBuilder.curveToRelative(0.15f, 0.51f, 0.22f, 1.03f, 0.23f, 1.57f);
        pathBuilder.curveTo(9.0f, 12.53f, 8.92f, 13.11f, 8.75f, 13.68f);
        pathBuilder.close();
        pathBuilder.moveTo(11.89f, 15.27f);
        pathBuilder.curveToRelative(-0.17f, 0.41f, -0.67f, 0.57f, -1.06f, 0.35f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.33f, -0.19f, -0.46f, -0.59f, -0.32f, -0.94f);
        pathBuilder.curveToRelative(0.33f, -0.77f, 0.49f, -1.63f, 0.49f, -2.56f);
        pathBuilder.curveToRelative(0.0f, -0.96f, -0.18f, -1.89f, -0.53f, -2.78f);
        pathBuilder.curveToRelative(-0.14f, -0.36f, 0.02f, -0.76f, 0.36f, -0.94f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.2f, 0.87f, -0.02f, 1.03f, 0.39f);
        pathBuilder.curveToRelative(0.42f, 1.06f, 0.63f, 2.18f, 0.63f, 3.33f);
        pathBuilder.curveTo(12.51f, 13.25f, 12.3f, 14.31f, 11.89f, 15.27f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 16.6f);
        pathBuilder.curveToRelative(-0.17f, 0.4f, -0.64f, 0.58f, -1.02f, 0.39f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.35f, -0.17f, -0.52f, -0.59f, -0.37f, -0.95f);
        pathBuilder.curveToRelative(0.59f, -1.39f, 0.89f, -2.75f, 0.89f, -4.06f);
        pathBuilder.curveToRelative(0.0f, -1.31f, -0.3f, -2.65f, -0.88f, -4.01f);
        pathBuilder.curveToRelative(-0.16f, -0.36f, 0.01f, -0.78f, 0.36f, -0.95f);
        pathBuilder.curveTo(14.37f, 6.82f, 14.83f, 7.0f, 15.0f, 7.4f);
        pathBuilder.curveToRelative(0.66f, 1.54f, 1.0f, 3.08f, 1.0f, 4.58f);
        pathBuilder.curveTo(16.0f, 13.48f, 15.66f, 15.04f, 15.0f, 16.6f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19494a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}