package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\n\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/ui/graphics/Color;", "backgroundColor", "Landroidx/compose/ui/unit/Dp;", "elevation", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JFLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ElevationOverlay;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalElevationOverlay", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalElevationOverlay", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLocalAbsoluteElevation", "LocalAbsoluteElevation", "material_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ElevationOverlayKt {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f14476a = CompositionLocalKt.staticCompositionLocalOf(ElevationOverlayKt$LocalElevationOverlay$1.INSTANCE);

    /* renamed from: b */
    public static final ProvidableCompositionLocal f14477b = CompositionLocalKt.compositionLocalOf$default(null, ElevationOverlayKt$LocalAbsoluteElevation$1.INSTANCE, 1, null);

    /* renamed from: a */
    public static final long m60901a(long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long m71734copywmQWz5c$default = Color.m71734copywmQWz5c$default(ColorsKt.m69988contentColorForek8zF_U(j, composer, i & 14), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m71734copywmQWz5c$default;
    }

    @NotNull
    public static final ProvidableCompositionLocal<C3641Dp> getLocalAbsoluteElevation() {
        return f14477b;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ElevationOverlay> getLocalElevationOverlay() {
        return f14476a;
    }
}
