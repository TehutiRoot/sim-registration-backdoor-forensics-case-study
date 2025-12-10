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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_connectWithoutContact", "Landroidx/compose/material/icons/Icons$Rounded;", "getConnectWithoutContact", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "ConnectWithoutContact", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConnectWithoutContact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectWithoutContact.kt\nandroidx/compose/material/icons/rounded/ConnectWithoutContactKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n122#2:99\n116#2,3:100\n119#2,3:104\n132#2,18:107\n152#2:144\n174#3:103\n694#4,2:125\n706#4,2:127\n708#4,11:133\n64#5,4:129\n*S KotlinDebug\n*F\n+ 1 ConnectWithoutContact.kt\nandroidx/compose/material/icons/rounded/ConnectWithoutContactKt\n*L\n29#1:99\n29#1:100,3\n29#1:104,3\n30#1:107,18\n30#1:144\n29#1:103\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"})
/* loaded from: classes.dex */
public final class ConnectWithoutContactKt {

    /* renamed from: a */
    public static ImageVector f19485a;

    @NotNull
    public static final ImageVector getConnectWithoutContact(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f19485a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConnectWithoutContact", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 2.89f, 3.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 5.11f, 7.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.19f, 4.5f);
        pathBuilder.lineTo(10.19f, 4.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.76f, 0.25f, -0.92f, 0.63f);
        pathBuilder.curveTo(8.83f, 6.23f, 7.76f, 7.0f, 6.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(2.67f, 7.0f, 2.0f, 7.67f, 2.0f, 8.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(8.74f);
        pathBuilder.curveToRelative(1.43f, -0.45f, 2.58f, -1.53f, 3.12f, -2.91f);
        pathBuilder.curveTo(11.38f, 5.19f, 10.88f, 4.5f, 10.19f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(17.89f, 17.0f, 19.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 18.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-1.26f, 0.0f, -2.33f, -0.77f, -2.77f, -1.87f);
        pathBuilder.curveToRelative(-0.15f, -0.38f, -0.51f, -0.63f, -0.92f, -0.63f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.19f, 0.69f, -0.94f, 1.33f);
        pathBuilder.curveToRelative(0.55f, 1.38f, 1.69f, 2.46f, 3.12f, 2.91f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.curveTo(22.0f, 18.67f, 21.33f, 18.0f, 20.5f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 11.09f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, -0.01f, 0.01f, 0.0f);
        pathBuilder.curveToRelative(-1.06f, 0.27f, -1.9f, 1.11f, -2.17f, 2.17f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, -0.01f, 0.0f, -0.01f);
        pathBuilder.curveTo(14.98f, 13.68f, 14.58f, 14.0f, 14.11f, 14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.05f, 0.02f, -0.14f, 0.02f, -0.14f);
        pathBuilder.curveToRelative(0.43f, -1.85f, 1.89f, -3.31f, 3.75f, -3.73f);
        pathBuilder.curveToRelative(0.04f, 0.0f, 0.08f, -0.01f, 0.12f, -0.01f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(18.0f, 10.58f, 17.68f, 10.98f, 17.25f, 11.09f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 6.06f);
        pathBuilder.curveToRelative(0.0f, 0.51f, -0.37f, 0.92f, -0.86f, 0.99f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveToRelative(-3.19f, 0.39f, -5.7f, 2.91f, -6.09f, 6.1f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveTo(10.98f, 13.63f, 10.56f, 14.0f, 10.06f, 14.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.02f, 0.0f, -0.04f, 0.0f, -0.06f);
        pathBuilder.curveToRelative(0.0f, -0.01f, 0.0f, -0.02f, 0.0f, -0.03f);
        pathBuilder.curveToRelative(0.5f, -4.12f, 3.79f, -7.38f, 7.92f, -7.85f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.01f, 0.0f, 0.01f, 0.0f);
        pathBuilder.curveTo(17.55f, 5.06f, 18.0f, 5.51f, 18.0f, 6.06f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f19485a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}