package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u008d\u0001\u0010\"\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!Jw\u0010\"\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020#2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00063"}, m28850d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fallbackFontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "fallbackDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "fallbackLayoutDirection", "", "cacheSize", "<init>", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Constraints;", "constraints", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "Landroidx/compose/ui/text/TextLayoutResult;", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "measure", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/font/FontFamily$Resolver;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/unit/Density;", OperatorName.CURVE_TO, "Landroidx/compose/ui/unit/LayoutDirection;", "d", "I", "Landroidx/compose/ui/text/TextLayoutCache;", "e", "Landroidx/compose/ui/text/TextLayoutCache;", "textLayoutCache", "Companion", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.TextMeasurer */
/* loaded from: classes2.dex */
public final class TextMeasurer {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final FontFamily.Resolver f31102a;

    /* renamed from: b */
    public final Density f31103b;

    /* renamed from: c */
    public final LayoutDirection f31104c;

    /* renamed from: d */
    public final int f31105d;

    /* renamed from: e */
    public final TextLayoutCache f31106e;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28850d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutResult;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.TextMeasurer$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final TextLayoutResult m59095a(TextLayoutInput textLayoutInput) {
            int m73626getMaxWidthimpl;
            int maxLines;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(textLayoutInput.m73185getConstraintsmsEJaDk());
            if ((textLayoutInput.getSoftWrap() || TextOverflow.m73587equalsimpl0(textLayoutInput.m73186getOverflowgIe3tQ8(), TextOverflow.Companion.m73595getEllipsisgIe3tQ8())) && Constraints.m73622getHasBoundedWidthimpl(textLayoutInput.m73185getConstraintsmsEJaDk())) {
                m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(textLayoutInput.m73185getConstraintsmsEJaDk());
            } else {
                m73626getMaxWidthimpl = Integer.MAX_VALUE;
            }
            if (!textLayoutInput.getSoftWrap() && TextOverflow.m73587equalsimpl0(textLayoutInput.m73186getOverflowgIe3tQ8(), TextOverflow.Companion.m73595getEllipsisgIe3tQ8())) {
                maxLines = 1;
            } else {
                maxLines = textLayoutInput.getMaxLines();
            }
            if (m73628getMinWidthimpl != m73626getMaxWidthimpl) {
                m73626getMaxWidthimpl = AbstractC11719c.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), m73628getMinWidthimpl, m73626getMaxWidthimpl);
            }
            MultiParagraph multiParagraph = new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, m73626getMaxWidthimpl, 0, Constraints.m73625getMaxHeightimpl(textLayoutInput.m73185getConstraintsmsEJaDk()), 5, null), maxLines, TextOverflow.m73587equalsimpl0(textLayoutInput.m73186getOverflowgIe3tQ8(), TextOverflow.Companion.m73595getEllipsisgIe3tQ8()), null);
            return new TextLayoutResult(textLayoutInput, multiParagraph, ConstraintsKt.m73637constrain4WqzIAM(textLayoutInput.m73185getConstraintsmsEJaDk(), IntSizeKt.IntSize((int) Math.ceil(multiParagraph.getWidth()), (int) Math.ceil(multiParagraph.getHeight()))), null);
        }

        public Companion() {
        }
    }

    public TextMeasurer(@NotNull FontFamily.Resolver fallbackFontFamilyResolver, @NotNull Density fallbackDensity, @NotNull LayoutDirection fallbackLayoutDirection, int i) {
        Intrinsics.checkNotNullParameter(fallbackFontFamilyResolver, "fallbackFontFamilyResolver");
        Intrinsics.checkNotNullParameter(fallbackDensity, "fallbackDensity");
        Intrinsics.checkNotNullParameter(fallbackLayoutDirection, "fallbackLayoutDirection");
        this.f31102a = fallbackFontFamilyResolver;
        this.f31103b = fallbackDensity;
        this.f31104c = fallbackLayoutDirection;
        this.f31105d = i;
        this.f31106e = i > 0 ? new TextLayoutCache(i) : null;
    }

    /* renamed from: measure-wNUYSr0$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m73192measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        TextStyle textStyle2;
        int i4;
        boolean z3;
        int i5;
        long j2;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z4;
        if ((i3 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i3 & 4) != 0) {
            i4 = TextOverflow.Companion.m73594getClipgIe3tQ8();
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i3 & 16) != 0) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            j2 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        } else {
            j2 = j;
        }
        if ((i3 & 64) != 0) {
            layoutDirection2 = textMeasurer.f31104c;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i3 & 128) != 0) {
            density2 = textMeasurer.f31103b;
        } else {
            density2 = density;
        }
        if ((i3 & 256) != 0) {
            resolver2 = textMeasurer.f31102a;
        } else {
            resolver2 = resolver;
        }
        if ((i3 & 512) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return textMeasurer.m73194measurewNUYSr0(str, textStyle2, i4, z3, i5, j2, layoutDirection2, density2, resolver2, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measure-xDpz5zY$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m73193measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z2, int i3, Object obj) {
        TextStyle textStyle2;
        int i4;
        boolean z3;
        int i5;
        List<AnnotatedString.Range<Placeholder>> list2;
        long j2;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z4;
        if ((i3 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i3 & 4) != 0) {
            i4 = TextOverflow.Companion.m73594getClipgIe3tQ8();
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i3 & 16) != 0) {
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        if ((i3 & 32) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        } else {
            list2 = list;
        }
        if ((i3 & 64) != 0) {
            j2 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        } else {
            j2 = j;
        }
        if ((i3 & 128) != 0) {
            layoutDirection2 = textMeasurer.f31104c;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i3 & 256) != 0) {
            density2 = textMeasurer.f31103b;
        } else {
            density2 = density;
        }
        if ((i3 & 512) != 0) {
            resolver2 = textMeasurer.f31102a;
        } else {
            resolver2 = resolver;
        }
        if ((i3 & 1024) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        return textMeasurer.m73195measurexDpz5zY(annotatedString, textStyle2, i4, z3, i5, list2, j2, layoutDirection2, density2, resolver2, z4);
    }

    @Stable
    @NotNull
    /* renamed from: measure-wNUYSr0  reason: not valid java name */
    public final TextLayoutResult m73194measurewNUYSr0(@NotNull String text, @NotNull TextStyle style, int i, boolean z, int i2, long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return m73193measurexDpz5zY$default(this, new AnnotatedString(text, null, null, 6, null), style, i, z, i2, null, j, layoutDirection, density, fontFamilyResolver, z2, 32, null);
    }

    @Stable
    @NotNull
    /* renamed from: measure-xDpz5zY  reason: not valid java name */
    public final TextLayoutResult m73195measurexDpz5zY(@NotNull AnnotatedString text, @NotNull TextStyle style, int i, boolean z, int i2, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, boolean z2) {
        TextLayoutResult textLayoutResult;
        TextLayoutCache textLayoutCache;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, i2, z, i, density, layoutDirection, fontFamilyResolver, j, (DefaultConstructorMarker) null);
        if (!z2 && (textLayoutCache = this.f31106e) != null) {
            textLayoutResult = textLayoutCache.get(textLayoutInput);
        } else {
            textLayoutResult = null;
        }
        if (textLayoutResult == null) {
            TextLayoutResult m59095a = Companion.m59095a(textLayoutInput);
            TextLayoutCache textLayoutCache2 = this.f31106e;
            if (textLayoutCache2 != null) {
                textLayoutCache2.put(textLayoutInput, m59095a);
            }
            return m59095a;
        }
        return textLayoutResult.m73188copyO0kMr_c(textLayoutInput, ConstraintsKt.m73637constrain4WqzIAM(j, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i2 & 8) != 0 ? TextMeasurerKt.f31108a : i);
    }
}
