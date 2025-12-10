package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!Je\u0010$\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u000fJQ\u0010&\u001a\u00020\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001aR \u0010+\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010.\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0011\u00102\u001a\u00020/8G¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, m28850d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "Landroidx/compose/material3/ChipColors;", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipColors", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/ChipElevation;", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "assistChipElevation", "borderColor", "disabledBorderColor", "borderWidth", "Landroidx/compose/material3/ChipBorder;", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "assistChipBorder", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipColors", "elevatedAssistChipElevation-aqJV_2Y", "elevatedAssistChipElevation", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getHeight-D9Ej5fM", "()F", "Height", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();

    /* renamed from: a */
    public static final float f25549a;

    /* renamed from: b */
    public static final float f25550b;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        f25549a = assistChipTokens.m70822getContainerHeightD9Ej5fM();
        f25550b = assistChipTokens.m70831getIconSizeD9Ej5fM();
    }

    @Composable
    @NotNull
    /* renamed from: assistChipBorder-d_3_b6Q  reason: not valid java name */
    public final ChipBorder m70193assistChipBorderd_3_b6Q(long j, long j2, float f, @Nullable Composer composer, int i, int i2) {
        long j3;
        long j4;
        float f2;
        composer.startReplaceableGroup(382372847);
        if ((i2 & 1) != 0) {
            j3 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            f2 = AssistChipTokens.INSTANCE.m70830getFlatOutlineWidthD9Ej5fM();
        } else {
            f2 = f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:703)");
        }
        ChipBorder chipBorder = new ChipBorder(j3, j4, f2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @Composable
    @NotNull
    /* renamed from: assistChipColors-oq7We08  reason: not valid java name */
    public final ChipColors m70194assistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @Nullable Composer composer, int i, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(-391745725);
        if ((i2 & 1) != 0) {
            j9 = Color.Companion.m71770getTransparent0d7_KjU();
        } else {
            j9 = j;
        }
        if ((i2 & 2) != 0) {
            j10 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j10 = j2;
        }
        if ((i2 & 4) != 0) {
            j11 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6);
        } else {
            j11 = j3;
        }
        if ((i2 & 8) != 0) {
            j12 = j11;
        } else {
            j12 = j4;
        }
        if ((i2 & 16) != 0) {
            j13 = Color.Companion.m71770getTransparent0d7_KjU();
        } else {
            j13 = j5;
        }
        if ((i2 & 32) != 0) {
            j14 = Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j6;
        }
        if ((i2 & 64) != 0) {
            j15 = Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j7;
        }
        if ((i2 & 128) != 0) {
            j16 = j15;
        } else {
            j16 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:643)");
        }
        ChipColors chipColors = new ChipColors(j9, j10, j11, j12, j13, j14, j15, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    @NotNull
    /* renamed from: assistChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m70195assistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, @Nullable Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(245366099);
        if ((i2 & 1) != 0) {
            f7 = AssistChipTokens.INSTANCE.m70829getFlatContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = f7;
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = f7;
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = f7;
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = AssistChipTokens.INSTANCE.m70823getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = f7;
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:679)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedAssistChipColors-oq7We08  reason: not valid java name */
    public final ChipColors m70196elevatedAssistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, @Nullable Composer composer, int i, int i2) {
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(-535762675);
        if ((i2 & 1) != 0) {
            j9 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6);
        } else {
            j9 = j;
        }
        if ((i2 & 2) != 0) {
            j10 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6);
        } else {
            j10 = j2;
        }
        if ((i2 & 4) != 0) {
            j11 = ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6);
        } else {
            j11 = j3;
        }
        if ((i2 & 8) != 0) {
            j12 = j11;
        } else {
            j12 = j4;
        }
        if ((i2 & 16) != 0) {
            j13 = Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j5;
        }
        if ((i2 & 32) != 0) {
            j14 = Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j6;
        }
        if ((i2 & 64) != 0) {
            j15 = Color.m71734copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j15 = j7;
        }
        if ((i2 & 128) != 0) {
            j16 = j15;
        } else {
            j16 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:728)");
        }
        ChipColors chipColors = new ChipColors(j9, j10, j11, j12, j13, j14, j15, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m70197elevatedAssistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, @Nullable Composer composer, int i, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        composer.startReplaceableGroup(1457698077);
        if ((i2 & 1) != 0) {
            f7 = AssistChipTokens.INSTANCE.m70824getElevatedContainerElevationD9Ej5fM();
        } else {
            f7 = f;
        }
        if ((i2 & 2) != 0) {
            f8 = AssistChipTokens.INSTANCE.m70828getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f8 = f2;
        }
        if ((i2 & 4) != 0) {
            f9 = AssistChipTokens.INSTANCE.m70826getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f9 = f3;
        }
        if ((i2 & 8) != 0) {
            f10 = AssistChipTokens.INSTANCE.m70827getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f10 = f4;
        }
        if ((i2 & 16) != 0) {
            f11 = AssistChipTokens.INSTANCE.m70823getDraggedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i2 & 32) != 0) {
            f12 = AssistChipTokens.INSTANCE.m70825getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:765)");
        }
        ChipElevation chipElevation = new ChipElevation(f7, f8, f9, f10, f11, f12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public final float m70198getHeightD9Ej5fM() {
        return f25549a;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m70199getIconSizeD9Ej5fM() {
        return f25550b;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1988153916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:782)");
        }
        Shape shape = ShapesKt.toShape(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
