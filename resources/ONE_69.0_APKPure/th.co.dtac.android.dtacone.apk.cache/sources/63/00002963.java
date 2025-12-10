package androidx.compose.foundation.text.modifiers;

import androidx.compose.p003ui.text.ParagraphKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, m29142d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextStyle;", "inputTextStyle", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/unit/Constraints;", "inConstraints", "", "minLines", "coerceMinLines-Oh53vG4$foundation_release", "(JI)J", "coerceMinLines", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/TextStyle;", "getInputTextStyle", "()Landroidx/compose/ui/text/TextStyle;", OperatorName.CURVE_TO, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "d", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "e", "resolvedStyle", "", OperatorName.FILL_NON_ZERO, "F", "lineHeightCache", OperatorName.NON_STROKING_GRAY, "oneLineHeightCache", "Companion", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MinLinesConstrainer {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: h */
    public static MinLinesConstrainer f14178h;

    /* renamed from: a */
    public final LayoutDirection f14179a;

    /* renamed from: b */
    public final TextStyle f14180b;

    /* renamed from: c */
    public final Density f14181c;

    /* renamed from: d */
    public final FontFamily.Resolver f14182d;

    /* renamed from: e */
    public final TextStyle f14183e;

    /* renamed from: f */
    public float f14184f;

    /* renamed from: g */
    public float f14185g;

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m29142d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "()V", "last", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "from", "minMaxUtil", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "paramStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MinLinesConstrainer from(@Nullable MinLinesConstrainer minLinesConstrainer, @NotNull LayoutDirection layoutDirection, @NotNull TextStyle paramStyle, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(paramStyle, "paramStyle");
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
            if (minLinesConstrainer == null || layoutDirection != minLinesConstrainer.getLayoutDirection() || !Intrinsics.areEqual(paramStyle, minLinesConstrainer.getInputTextStyle()) || density.getDensity() != minLinesConstrainer.getDensity().getDensity() || fontFamilyResolver != minLinesConstrainer.getFontFamilyResolver()) {
                MinLinesConstrainer minLinesConstrainer2 = MinLinesConstrainer.f14178h;
                if (minLinesConstrainer2 != null && layoutDirection == minLinesConstrainer2.getLayoutDirection() && Intrinsics.areEqual(paramStyle, minLinesConstrainer2.getInputTextStyle()) && density.getDensity() == minLinesConstrainer2.getDensity().getDensity() && fontFamilyResolver == minLinesConstrainer2.getFontFamilyResolver()) {
                    return minLinesConstrainer2;
                }
                MinLinesConstrainer minLinesConstrainer3 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(paramStyle, layoutDirection), density, fontFamilyResolver, null);
                MinLinesConstrainer.f14178h = minLinesConstrainer3;
                return minLinesConstrainer3;
            }
            return minLinesConstrainer;
        }

        public Companion() {
        }
    }

    public /* synthetic */ MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutDirection, textStyle, density, resolver);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation_release  reason: not valid java name */
    public final long m69994coerceMinLinesOh53vG4$foundation_release(long j, int i) {
        String str;
        String str2;
        int m73811getMinHeightimpl;
        float f = this.f14185g;
        float f2 = this.f14184f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            str = MinLinesConstrainerKt.f14186a;
            f = ParagraphKt.m73300ParagraphUdtVg6A$default(str, this.f14183e, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.f14181c, this.f14182d, null, null, 1, false, 96, null).getHeight();
            str2 = MinLinesConstrainerKt.f14187b;
            f2 = ParagraphKt.m73300ParagraphUdtVg6A$default(str2, this.f14183e, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.f14181c, this.f14182d, null, null, 2, false, 96, null).getHeight() - f;
            this.f14185g = f;
            this.f14184f = f2;
        }
        if (i != 1) {
            m73811getMinHeightimpl = AbstractC11695c.coerceAtMost(AbstractC11695c.coerceAtLeast(AbstractC22237sr0.roundToInt(f + (f2 * (i - 1))), 0), Constraints.m73809getMaxHeightimpl(j));
        } else {
            m73811getMinHeightimpl = Constraints.m73811getMinHeightimpl(j);
        }
        return ConstraintsKt.Constraints(Constraints.m73812getMinWidthimpl(j), Constraints.m73810getMaxWidthimpl(j), m73811getMinHeightimpl, Constraints.m73809getMaxHeightimpl(j));
    }

    @NotNull
    public final Density getDensity() {
        return this.f14181c;
    }

    @NotNull
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.f14182d;
    }

    @NotNull
    public final TextStyle getInputTextStyle() {
        return this.f14180b;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.f14179a;
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.f14179a = layoutDirection;
        this.f14180b = textStyle;
        this.f14181c = density;
        this.f14182d = resolver;
        this.f14183e = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
        this.f14184f = Float.NaN;
        this.f14185g = Float.NaN;
    }
}