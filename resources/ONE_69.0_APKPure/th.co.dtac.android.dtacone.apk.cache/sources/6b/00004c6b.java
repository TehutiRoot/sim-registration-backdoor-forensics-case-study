package androidx.compose.material.icons.sharp;

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

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "_settingsApplications", "Landroidx/compose/material/icons/Icons$Sharp;", "getSettingsApplications", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsApplications", "material-icons-extended_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettingsApplications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/sharp/SettingsApplicationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n122#2:97\n116#2,3:98\n119#2,3:102\n132#2,18:105\n152#2:142\n132#2,18:143\n152#2:180\n174#3:101\n694#4,2:123\n706#4,2:125\n708#4,11:131\n694#4,2:161\n706#4,2:163\n708#4,11:169\n64#5,4:127\n64#5,4:165\n*S KotlinDebug\n*F\n+ 1 SettingsApplications.kt\nandroidx/compose/material/icons/sharp/SettingsApplicationsKt\n*L\n29#1:97\n29#1:98,3\n29#1:102,3\n30#1:105,18\n30#1:142\n85#1:143,18\n85#1:180\n29#1:101\n30#1:123,2\n30#1:125,2\n30#1:131,11\n85#1:161,2\n85#1:163,2\n85#1:169,11\n30#1:127,4\n85#1:165,4\n*E\n"})
/* loaded from: classes.dex */
public final class SettingsApplicationsKt {

    /* renamed from: a */
    public static ImageVector f22833a;

    @NotNull
    public static final ImageVector getSettingsApplications(@NotNull Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = f22833a;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsApplications", C3623Dp.m73842constructorimpl(24.0f), C3623Dp.m73842constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m72227getButtKaPHkGw = companion2.m72227getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m72237getBevelLxFBmk8 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.24f, -0.02f, 0.47f, -0.05f, 0.71f);
        pathBuilder.lineToRelative(0.01f, -0.02f);
        pathBuilder.lineToRelative(1.47f, 1.16f);
        pathBuilder.curveToRelative(0.14f, 0.1f, 0.23f, 0.18f, 0.23f, 0.18f);
        pathBuilder.lineToRelative(-1.7f, 2.94f);
        pathBuilder.lineToRelative(-2.02f, -0.8f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.curveToRelative(-0.37f, 0.29f, -0.77f, 0.53f, -1.21f, 0.71f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.lineToRelative(-0.27f, 1.85f);
        pathBuilder.curveToRelative(-0.02f, 0.17f, -0.04f, 0.3f, -0.04f, 0.3f);
        pathBuilder.horizontalLineToRelative(-3.4f);
        pathBuilder.lineToRelative(-0.31f, -2.15f);
        pathBuilder.lineTo(10.0f, 16.85f);
        pathBuilder.curveToRelative(-0.44f, -0.18f, -0.84f, -0.42f, -1.21f, -0.71f);
        pathBuilder.lineToRelative(0.02f, 0.03f);
        pathBuilder.lineToRelative(-2.02f, 0.8f);
        pathBuilder.lineToRelative(-1.7f, -2.94f);
        pathBuilder.reflectiveCurveToRelative(0.1f, -0.08f, 0.23f, -0.18f);
        pathBuilder.lineToRelative(1.47f, -1.16f);
        pathBuilder.lineToRelative(0.01f, 0.02f);
        pathBuilder.curveToRelative(-0.03f, -0.24f, -0.05f, -0.47f, -0.05f, -0.71f);
        pathBuilder.reflectiveCurveToRelative(0.02f, -0.47f, 0.05f, -0.69f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.lineToRelative(-1.7f, -1.34f);
        pathBuilder.lineToRelative(1.7f, -2.95f);
        pathBuilder.lineToRelative(2.01f, 0.81f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.37f, -0.28f, 0.77f, -0.52f, 1.2f, -0.7f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.lineTo(10.3f, 5.0f);
        pathBuilder.horizontalLineToRelative(3.41f);
        pathBuilder.lineToRelative(0.3f, 2.15f);
        pathBuilder.lineTo(14.0f, 7.15f);
        pathBuilder.curveToRelative(0.43f, 0.18f, 0.83f, 0.42f, 1.2f, 0.7f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.lineToRelative(2.01f, -0.81f);
        pathBuilder.lineToRelative(1.7f, 2.95f);
        pathBuilder.lineToRelative(-1.71f, 1.34f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder.curveToRelative(0.04f, 0.22f, 0.06f, 0.45f, 0.06f, 0.69f);
        pathBuilder.close();
        ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw, m72237getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m71945getBlack0d7_KjU(), null);
        int m72227getButtKaPHkGw2 = companion2.m72227getButtKaPHkGw();
        int m72237getBevelLxFBmk82 = companion3.m72237getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.moveToRelative(-2.45f, 0.0f);
        pathBuilder2.arcToRelative(2.45f, 2.45f, 0.0f, true, true, 4.9f, 0.0f);
        pathBuilder2.arcToRelative(2.45f, 2.45f, 0.0f, true, true, -4.9f, 0.0f);
        ImageVector build = ImageVector.Builder.m72432addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m72227getButtKaPHkGw2, m72237getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        f22833a = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}