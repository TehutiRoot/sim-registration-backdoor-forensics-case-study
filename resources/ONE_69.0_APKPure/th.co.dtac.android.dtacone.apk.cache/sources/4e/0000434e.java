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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_podcasts", "Landroidx/compose/material/icons/Icons$Rounded;", "getPodcasts", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "Podcasts", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPodcasts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Podcasts.kt\nandroidx/compose/material/icons/rounded/PodcastsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n122#2:81\n116#2,3:82\n119#2,3:86\n132#2,18:89\n152#2:126\n174#3:85\n694#4,2:107\n706#4,2:109\n708#4,11:115\n64#5,4:111\n*S KotlinDebug\n*F\n+ 1 Podcasts.kt\nandroidx/compose/material/icons/rounded/PodcastsKt\n*L\n29#1:81\n29#1:82,3\n29#1:86,3\n30#1:89,18\n30#1:126\n29#1:85\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"})
/* loaded from: classes.dex */
public final class PodcastsKt {

    /* renamed from: a */
    public static ImageVector f20500a;

    @NotNull
    public static final ImageVector getPodcasts(@NotNull Icons.Rounded rounded) {
        Intrinsics.checkNotNullParameter(rounded, "<this>");
        ImageVector imageVector = f20500a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Podcasts", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw = StrokeCap.Companion.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk8 = StrokeJoin.Companion.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.74f, -0.4f, 1.38f, -1.0f, 1.72f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-7.28f);
        pathBuilder.curveToRelative(-0.6f, -0.35f, -1.0f, -0.98f, -1.0f, -1.72f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.75f, 6.13f);
        pathBuilder.curveToRelative(-2.27f, 0.46f, -4.12f, 2.28f, -4.61f, 4.55f);
        pathBuilder.curveToRelative(-0.4f, 1.86f, 0.07f, 3.62f, 1.08f, 4.94f);
        pathBuilder.curveToRelative(0.35f, 0.45f, 1.03f, 0.47f, 1.43f, 0.07f);
        pathBuilder.lineToRelative(0.07f, -0.07f);
        pathBuilder.curveToRelative(0.34f, -0.34f, 0.34f, -0.87f, 0.06f, -1.25f);
        pathBuilder.curveToRelative(-0.68f, -0.9f, -0.98f, -2.1f, -0.66f, -3.37f);
        pathBuilder.curveToRelative(0.35f, -1.42f, 1.52f, -2.57f, 2.95f, -2.88f);
        pathBuilder.curveTo(13.69f, 7.52f, 16.0f, 9.49f, 16.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.87f, -0.28f, 1.67f, -0.76f, 2.32f);
        pathBuilder.curveToRelative(-0.3f, 0.41f, -0.29f, 0.97f, 0.07f, 1.33f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.44f, 0.44f, 1.17f, 0.37f, 1.54f, -0.14f);
        pathBuilder.curveTo(17.57f, 14.53f, 18.0f, 13.31f, 18.0f, 12.0f);
        pathBuilder.curveTo(18.0f, 8.28f, 14.61f, 5.35f, 10.75f, 6.13f);
        pathBuilder.close();
        pathBuilder.moveTo(10.83f, 2.07f);
        pathBuilder.curveTo(6.3f, 2.58f, 2.61f, 6.25f, 2.07f, 10.78f);
        pathBuilder.curveToRelative(-0.35f, 2.95f, 0.59f, 5.67f, 2.32f, 7.7f);
        pathBuilder.curveToRelative(0.37f, 0.43f, 1.03f, 0.46f, 1.43f, 0.06f);
        pathBuilder.lineToRelative(0.05f, -0.05f);
        pathBuilder.curveToRelative(0.35f, -0.35f, 0.38f, -0.92f, 0.05f, -1.3f);
        pathBuilder.curveToRelative(-1.56f, -1.83f, -2.33f, -4.37f, -1.7f, -7.06f);
        pathBuilder.curveToRelative(0.7f, -3.01f, 3.18f, -5.39f, 6.22f, -5.97f);
        pathBuilder.curveTo(15.53f, 3.18f, 20.0f, 7.08f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.96f, -0.72f, 3.76f, -1.9f, 5.16f);
        pathBuilder.curveToRelative(-0.34f, 0.4f, -0.31f, 0.98f, 0.05f, 1.35f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.42f, 0.42f, 1.11f, 0.39f, 1.49f, -0.07f);
        pathBuilder.curveTo(21.11f, 16.7f, 22.0f, 14.46f, 22.0f, 12.0f);
        pathBuilder.curveTo(22.0f, 6.09f, 16.87f, 1.38f, 10.83f, 2.07f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f20500a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}