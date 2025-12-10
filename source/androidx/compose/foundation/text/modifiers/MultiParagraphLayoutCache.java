package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.MultiParagraph;
import androidx.compose.p003ui.text.MultiParagraphIntrinsics;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.TextLayoutInput;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001Bb\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJa\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b%\u0010$J-\u0010*\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100J+\u00101\u001a\u00020\n*\u0004\u0018\u00010)2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001fH\u0002¢\u0006\u0004\b3\u00104R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00105R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00106R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00107R\u001f\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u00108R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00109R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00108R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R.\u0010J\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u00108R\u0016\u0010W\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00108R\u0011\u0010Z\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010\\\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b[\u0010Y\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m28850d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "width", "intrinsicHeight", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "", "update-ZNqEYIc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;)V", "update", "maxIntrinsicWidth", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "minIntrinsicWidth", "finalConstraints", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/text/TextLayoutResult;", "e", "(Landroidx/compose/ui/unit/LayoutDirection;JLandroidx/compose/ui/text/MultiParagraph;)Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "d", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraphIntrinsics;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", OperatorName.CURVE_TO, "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/unit/LayoutDirection;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "Z", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "i", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/ui/unit/Density;", "value", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "paragraphIntrinsics", OperatorName.LINE_TO, "Landroidx/compose/ui/unit/LayoutDirection;", "intrinsicsLayoutDirection", OperatorName.MOVE_TO, "Landroidx/compose/ui/text/TextLayoutResult;", "layoutCache", OperatorName.ENDPATH, "cachedIntrinsicHeightInputWidth", "o", "cachedIntrinsicHeight", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "getLayoutOrNull", "layoutOrNull", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {

    /* renamed from: a */
    public AnnotatedString f14100a;

    /* renamed from: b */
    public TextStyle f14101b;

    /* renamed from: c */
    public FontFamily.Resolver f14102c;

    /* renamed from: d */
    public int f14103d;

    /* renamed from: e */
    public boolean f14104e;

    /* renamed from: f */
    public int f14105f;

    /* renamed from: g */
    public int f14106g;

    /* renamed from: h */
    public List f14107h;

    /* renamed from: i */
    public MinLinesConstrainer f14108i;

    /* renamed from: j */
    public Density f14109j;

    /* renamed from: k */
    public MultiParagraphIntrinsics f14110k;

    /* renamed from: l */
    public LayoutDirection f14111l;

    /* renamed from: m */
    public TextLayoutResult f14112m;

    /* renamed from: n */
    public int f14113n;

    /* renamed from: o */
    public int f14114o;

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, i, z, i2, i3, list);
    }

    /* renamed from: a */
    public final MultiParagraph m61041a(long j, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics m61038d = m61038d(layoutDirection);
        return new MultiParagraph(m61038d, LayoutUtilsKt.m69807finalConstraintstfFHcEY(j, this.f14104e, this.f14103d, m61038d.getMaxIntrinsicWidth()), LayoutUtilsKt.m69808finalMaxLinesxdlQI24(this.f14104e, this.f14103d, this.f14105f), TextOverflow.m73587equalsimpl0(this.f14103d, TextOverflow.Companion.m73595getEllipsisgIe3tQ8()), null);
    }

    /* renamed from: b */
    public final void m61040b() {
        this.f14110k = null;
        this.f14112m = null;
    }

    /* renamed from: c */
    public final boolean m61039c(TextLayoutResult textLayoutResult, long j, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.m73620equalsimpl0(j, textLayoutResult.getLayoutInput().m73185getConstraintsmsEJaDk())) {
            return false;
        }
        if (Constraints.m73626getMaxWidthimpl(j) != Constraints.m73626getMaxWidthimpl(textLayoutResult.getLayoutInput().m73185getConstraintsmsEJaDk()) || Constraints.m73625getMaxHeightimpl(j) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final MultiParagraphIntrinsics m61038d(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f14110k;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f14111l || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.f14111l = layoutDirection;
            AnnotatedString annotatedString = this.f14100a;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.f14101b, layoutDirection);
            Density density = this.f14109j;
            Intrinsics.checkNotNull(density);
            FontFamily.Resolver resolver = this.f14102c;
            List list = this.f14107h;
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, resolveDefaults, list, density, resolver);
        }
        this.f14110k = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    /* renamed from: e */
    public final TextLayoutResult m61037e(LayoutDirection layoutDirection, long j, MultiParagraph multiParagraph) {
        AnnotatedString annotatedString = this.f14100a;
        TextStyle textStyle = this.f14101b;
        List list = this.f14107h;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        int i = this.f14105f;
        boolean z = this.f14104e;
        int i2 = this.f14103d;
        Density density = this.f14109j;
        Intrinsics.checkNotNull(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, this.f14102c, j, (DefaultConstructorMarker) null), multiParagraph, ConstraintsKt.m73637constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraph.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraph.getHeight()))), null);
    }

    @Nullable
    public final Density getDensity$foundation_release() {
        return this.f14109j;
    }

    @Nullable
    public final TextLayoutResult getLayoutOrNull() {
        return this.f14112m;
    }

    @NotNull
    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult textLayoutResult = this.f14112m;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int intrinsicHeight(int i, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i2 = this.f14113n;
        int i3 = this.f14114o;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(m61041a(ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.f14113n = i;
        this.f14114o = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA  reason: not valid java name */
    public final boolean m69812layoutWithConstraintsK40F9xA(long j, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (this.f14106g > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer minLinesConstrainer = this.f14108i;
            TextStyle textStyle = this.f14101b;
            Density density = this.f14109j;
            Intrinsics.checkNotNull(density);
            MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.f14102c);
            this.f14108i = from;
            j = from.m69810coerceMinLinesOh53vG4$foundation_release(j, this.f14106g);
        }
        if (!m61039c(this.f14112m, j, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.f14112m;
            Intrinsics.checkNotNull(textLayoutResult);
            if (Constraints.m73620equalsimpl0(j, textLayoutResult.getLayoutInput().m73185getConstraintsmsEJaDk())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.f14112m;
            Intrinsics.checkNotNull(textLayoutResult2);
            this.f14112m = m61037e(layoutDirection, j, textLayoutResult2.getMultiParagraph());
            return true;
        }
        this.f14112m = m61037e(layoutDirection, j, m61041a(j, layoutDirection));
        return true;
    }

    public final int maxIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(m61038d(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(m61038d(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@Nullable Density density) {
        Density density2 = this.f14109j;
        if (density2 == null) {
            this.f14109j = density;
        } else if (density == null) {
            this.f14109j = density;
            m61040b();
        } else if (density2.getDensity() != density.getDensity() || density2.getFontScale() != density.getFontScale()) {
            this.f14109j = density;
            m61040b();
        }
    }

    /* renamed from: update-ZNqEYIc  reason: not valid java name */
    public final void m69813updateZNqEYIc(@NotNull AnnotatedString text, @NotNull TextStyle style, @NotNull FontFamily.Resolver fontFamilyResolver, int i, boolean z, int i2, int i3, @Nullable List<AnnotatedString.Range<Placeholder>> list) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f14100a = text;
        this.f14101b = style;
        this.f14102c = fontFamilyResolver;
        this.f14103d = i;
        this.f14104e = z;
        this.f14105f = i2;
        this.f14106g = i3;
        this.f14107h = list;
        m61040b();
    }

    public MultiParagraphLayoutCache(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i, boolean z, int i2, int i3, List list) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f14100a = text;
        this.f14101b = style;
        this.f14102c = fontFamilyResolver;
        this.f14103d = i;
        this.f14104e = z;
        this.f14105f = i2;
        this.f14106g = i3;
        this.f14107h = list;
        this.f14113n = -1;
        this.f14114o = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.Companion.m73594getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, (i4 & 128) != 0 ? null : list, null);
    }
}
