package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m28850d2 = {"Landroidx/compose/material/Colors;", "colors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "rememberTextSelectionColors", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "Landroidx/compose/ui/graphics/Color;", "selectionColor", "textColor", "backgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "calculateSelectionBackgroundColor", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JJJ)F", "selectionColorAlpha", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JFJJ)F", "foreground", "background", "calculateContrastRatio--OWjLjI", "(JJ)F", "calculateContrastRatio", "material_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n76#3:245\n67#4,3:246\n66#4:249\n1097#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    /* renamed from: a */
    public static final float m60883a(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float m60882b = (m60882b(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= m60882b && m60882b <= 0.01f) {
                break;
            }
            if (m60882b < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: b */
    public static final float m60882b(long j, float f, long j2, long j3) {
        long m71780compositeOverOWjLjI = ColorKt.m71780compositeOverOWjLjI(Color.m71734copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m70047calculateContrastRatioOWjLjI(ColorKt.m71780compositeOverOWjLjI(j2, m71780compositeOverOWjLjI), m71780compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI  reason: not valid java name */
    public static final float m70047calculateContrastRatioOWjLjI(long j, long j2) {
        float m71786luminance8_81llA = ColorKt.m71786luminance8_81llA(j) + 0.05f;
        float m71786luminance8_81llA2 = ColorKt.m71786luminance8_81llA(j2) + 0.05f;
        return Math.max(m71786luminance8_81llA, m71786luminance8_81llA2) / Math.min(m71786luminance8_81llA, m71786luminance8_81llA2);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8  reason: not valid java name */
    public static final long m70048calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float m60883a;
        float m60882b = m60882b(j, 0.4f, j2, j3);
        float m60882b2 = m60882b(j, 0.2f, j2, j3);
        if (m60882b >= 4.5f) {
            m60883a = 0.4f;
        } else if (m60882b2 < 4.5f) {
            m60883a = 0.2f;
        } else {
            m60883a = m60883a(j, j2, j3);
        }
        return Color.m71734copywmQWz5c$default(j, m60883a, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @NotNull
    public static final TextSelectionColors rememberTextSelectionColors(@NotNull Colors colors, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m69970getPrimary0d7_KjU = colors.m69970getPrimary0d7_KjU();
        long m69963getBackground0d7_KjU = colors.m69963getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long m69987contentColorFor4WTKRHQ = ColorsKt.m69987contentColorFor4WTKRHQ(colors, m69963getBackground0d7_KjU);
        if (m69987contentColorFor4WTKRHQ == Color.Companion.m71771getUnspecified0d7_KjU()) {
            m69987contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m71745unboximpl();
        }
        long j = m69987contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long m71734copywmQWz5c$default = Color.m71734copywmQWz5c$default(j, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m71725boximpl = Color.m71725boximpl(m69970getPrimary0d7_KjU);
        Color m71725boximpl2 = Color.m71725boximpl(m69963getBackground0d7_KjU);
        Color m71725boximpl3 = Color.m71725boximpl(m71734copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m71725boximpl) | composer.changed(m71725boximpl2) | composer.changed(m71725boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(colors.m69970getPrimary0d7_KjU(), m70048calculateSelectionBackgroundColorysEtTa8(m69970getPrimary0d7_KjU, m71734copywmQWz5c$default, m69963getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors = (TextSelectionColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }
}
