package androidx.compose.material.icons.rounded;

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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_webhook", "Landroidx/compose/material/icons/Icons$Rounded;", "getWebhook", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Webhook", "material-icons-extended_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebhook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Webhook.kt\nandroidx/compose/material/icons/rounded/WebhookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n122#2:93\n116#2,3:94\n119#2,3:98\n132#2,18:101\n152#2:138\n174#3:97\n694#4,2:119\n706#4,2:121\n708#4,11:127\n64#5,4:123\n*S KotlinDebug\n*F\n+ 1 Webhook.kt\nandroidx/compose/material/icons/rounded/WebhookKt\n*L\n29#1:93\n29#1:94,3\n29#1:98,3\n30#1:101,18\n30#1:138\n29#1:97\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"})
/* loaded from: classes.dex */
public final class WebhookKt {

    /* renamed from: a */
    public static ImageVector f21045a;

    @NotNull
    public static final ImageVector getWebhook(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f21045a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Webhook", C3641Dp.m73658constructorimpl(24.0f), C3641Dp.m73658constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71761getBlack0d7_KjU(), null);
        int m72043getButtKaPHkGw = StrokeCap.Companion.m72043getButtKaPHkGw();
        int m72053getBevelLxFBmk8 = StrokeJoin.Companion.m72053getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -1.84f, 1.0f, -3.45f, 2.48f, -4.32f);
        pathBuilder.curveTo(5.15f, 11.29f, 6.0f, 11.76f, 6.0f, 12.54f);
        pathBuilder.curveToRelative(0.0f, 0.36f, -0.19f, 0.68f, -0.5f, 0.86f);
        pathBuilder.curveTo(4.6f, 13.92f, 4.0f, 14.89f, 4.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, 1.68f, 3.31f, 3.6f, 2.94f);
        pathBuilder.curveToRelative(1.42f, -0.28f, 2.4f, -1.61f, 2.4f, -3.06f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.49f, 0.39f, -0.88f, 0.88f, -0.88f);
        pathBuilder.lineToRelative(5.0f, 0.0f);
        pathBuilder.curveToRelative(0.27f, -0.31f, 0.67f, -0.5f, 1.12f, -0.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.84f, -0.19f, -1.12f, -0.5f);
        pathBuilder.lineToRelative(-3.98f, 0.0f);
        pathBuilder.curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        pathBuilder.curveTo(4.24f, 21.0f, 2.0f, 18.76f, 2.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.37f, 7.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.14f, -0.62f, 0.97f, -1.25f);
        pathBuilder.curveTo(16.79f, 3.59f, 14.83f, 2.0f, 12.5f, 2.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 1.43f, 0.6f, 2.71f, 1.55f, 3.62f);
        pathBuilder.lineToRelative(-2.35f, 3.9f);
        pathBuilder.curveTo(6.02f, 14.66f, 5.5f, 15.27f, 5.5f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.16f, -0.02f, -0.31f, -0.07f, -0.45f);
        pathBuilder.lineToRelative(2.86f, -4.75f);
        pathBuilder.curveToRelative(0.25f, -0.41f, 0.13f, -0.95f, -0.28f, -1.19f);
        pathBuilder.curveTo(10.11f, 9.08f, 9.5f, 8.11f, 9.5f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.54f, 0.93f, 2.89f, 2.2f);
        pathBuilder.curveTo(15.52f, 6.66f, 15.9f, 7.0f, 16.37f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 13.0f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.75f, 0.07f, -1.09f, 0.2f);
        pathBuilder.curveToRelative(-0.4f, 0.16f, -0.86f, -0.04f, -1.08f, -0.41f);
        pathBuilder.lineToRelative(-2.6f, -4.32f);
        pathBuilder.curveTo(11.53f, 8.35f, 11.0f, 7.74f, 11.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(14.0f, 6.17f, 14.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.15f, -0.02f, 0.29f, -0.06f, 0.43f);
        pathBuilder.lineToRelative(2.19f, 3.65f);
        pathBuilder.curveTo(16.41f, 11.03f, 16.7f, 11.0f, 17.0f, 11.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(-0.86f, 0.0f, -1.68f, -0.22f, -2.39f, -0.61f);
        pathBuilder.curveToRelative(-0.92f, -0.5f, -0.58f, -1.89f, 0.47f, -1.89f);
        pathBuilder.curveToRelative(0.17f, 0.0f, 0.34f, 0.05f, 0.49f, 0.14f);
        pathBuilder.curveTo(15.99f, 18.87f, 16.48f, 19.0f, 17.0f, 19.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(18.65f, 13.0f, 17.0f, 13.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72248addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72043getButtKaPHkGw, m72053getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f21045a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
