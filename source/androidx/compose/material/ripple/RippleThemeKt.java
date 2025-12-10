package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ripple/RippleTheme;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRippleTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalRippleTheme", "Landroidx/compose/material/ripple/RippleAlpha;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/material/ripple/RippleAlpha;", "LightThemeHighContrastRippleAlpha", OperatorName.CURVE_TO, "LightThemeLowContrastRippleAlpha", "d", "DarkThemeRippleAlpha", "material-ripple_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RippleThemeKt {

    /* renamed from: a */
    public static final ProvidableCompositionLocal f25507a = CompositionLocalKt.staticCompositionLocalOf(RippleThemeKt$LocalRippleTheme$1.INSTANCE);

    /* renamed from: b */
    public static final RippleAlpha f25508b = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);

    /* renamed from: c */
    public static final RippleAlpha f25509c = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);

    /* renamed from: d */
    public static final RippleAlpha f25510d = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    @NotNull
    public static final ProvidableCompositionLocal<RippleTheme> getLocalRippleTheme() {
        return f25507a;
    }
}
