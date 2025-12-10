package androidx.compose.material3.tokens;

import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.font.GenericFontFamily;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/material3/tokens/TypefaceTokens;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/GenericFontFamily;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBrand", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Brand", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPlain", "Plain", "Landroidx/compose/ui/text/font/FontWeight;", OperatorName.CURVE_TO, "Landroidx/compose/ui/text/font/FontWeight;", "getWeightBold", "()Landroidx/compose/ui/text/font/FontWeight;", "WeightBold", "d", "getWeightMedium", "WeightMedium", "e", "getWeightRegular", "WeightRegular", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TypefaceTokens {
    @NotNull
    public static final TypefaceTokens INSTANCE = new TypefaceTokens();

    /* renamed from: a */
    public static final GenericFontFamily f28165a;

    /* renamed from: b */
    public static final GenericFontFamily f28166b;

    /* renamed from: c */
    public static final FontWeight f28167c;

    /* renamed from: d */
    public static final FontWeight f28168d;

    /* renamed from: e */
    public static final FontWeight f28169e;

    static {
        FontFamily.Companion companion = FontFamily.Companion;
        f28165a = companion.getSansSerif();
        f28166b = companion.getSansSerif();
        FontWeight.Companion companion2 = FontWeight.Companion;
        f28167c = companion2.getBold();
        f28168d = companion2.getMedium();
        f28169e = companion2.getNormal();
    }

    @NotNull
    public final GenericFontFamily getBrand() {
        return f28165a;
    }

    @NotNull
    public final GenericFontFamily getPlain() {
        return f28166b;
    }

    @NotNull
    public final FontWeight getWeightBold() {
        return f28167c;
    }

    @NotNull
    public final FontWeight getWeightMedium() {
        return f28168d;
    }

    @NotNull
    public final FontWeight getWeightRegular() {
        return f28169e;
    }
}
