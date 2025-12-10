package androidx.compose.foundation.text;

import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.MultiParagraph;
import androidx.compose.p003ui.text.MultiParagraphIntrinsics;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.TextLayoutInput;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextPainter;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
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
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001XBh\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR$\u0010L\u001a\u0004\u0018\u00010E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010R\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\u001bR\u0011\u0010T\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bS\u00100R\u0011\u0010V\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bU\u00100R\u0014\u0010W\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, m28850d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "", "maxLines", "minLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "layoutIntrinsics", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "layout", "Landroidx/compose/ui/text/MultiParagraph;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", OperatorName.CURVE_TO, "I", "getMaxLines", "()I", "d", "getMinLines", "e", "Z", "getSoftWrap", "()Z", OperatorName.FILL_NON_ZERO, "getOverflow-gIe3tQ8", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "i", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation_release", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "paragraphIntrinsics", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "intrinsicsLayoutDirection", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "nonNullIntrinsics", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@InternalFoundationTextApi
/* loaded from: classes.dex */
public final class TextDelegate {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final AnnotatedString f14013a;

    /* renamed from: b */
    public final TextStyle f14014b;

    /* renamed from: c */
    public final int f14015c;

    /* renamed from: d */
    public final int f14016d;

    /* renamed from: e */
    public final boolean f14017e;

    /* renamed from: f */
    public final int f14018f;

    /* renamed from: g */
    public final Density f14019g;

    /* renamed from: h */
    public final FontFamily.Resolver f14020h;

    /* renamed from: i */
    public final List f14021i;

    /* renamed from: j */
    public MultiParagraphIntrinsics f14022j;

    /* renamed from: k */
    public LayoutDirection f14023k;

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m28850d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        public Companion() {
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i, i2, z, i3, density, resolver, list);
    }

    /* renamed from: layout-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m69771layoutNN6EwU$default(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
        if ((i & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m69773layoutNN6EwU(j, layoutDirection, textLayoutResult);
    }

    /* renamed from: a */
    public final MultiParagraphIntrinsics m61062a() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f14022j;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: b */
    public final MultiParagraph m61061b(long j, LayoutDirection layoutDirection) {
        int m73626getMaxWidthimpl;
        int i;
        layoutIntrinsics(layoutDirection);
        int m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        if ((this.f14017e || TextOverflow.m73587equalsimpl0(this.f14018f, TextOverflow.Companion.m73595getEllipsisgIe3tQ8())) && Constraints.m73622getHasBoundedWidthimpl(j)) {
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        } else {
            m73626getMaxWidthimpl = Integer.MAX_VALUE;
        }
        if (!this.f14017e && TextOverflow.m73587equalsimpl0(this.f14018f, TextOverflow.Companion.m73595getEllipsisgIe3tQ8())) {
            i = 1;
        } else {
            i = this.f14015c;
        }
        if (m73628getMinWidthimpl != m73626getMaxWidthimpl) {
            m73626getMaxWidthimpl = AbstractC11719c.coerceIn(getMaxIntrinsicWidth(), m73628getMinWidthimpl, m73626getMaxWidthimpl);
        }
        return new MultiParagraph(m61062a(), ConstraintsKt.Constraints$default(0, m73626getMaxWidthimpl, 0, Constraints.m73625getMaxHeightimpl(j), 5, null), i, TextOverflow.m73587equalsimpl0(this.f14018f, TextOverflow.Companion.m73595getEllipsisgIe3tQ8()), null);
    }

    @NotNull
    public final Density getDensity() {
        return this.f14019g;
    }

    @NotNull
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.f14020h;
    }

    @Nullable
    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.f14023k;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(m61062a().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.f14015c;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(m61062a().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.f14016d;
    }

    /* renamed from: getOverflow-gIe3tQ8  reason: not valid java name */
    public final int m69772getOverflowgIe3tQ8() {
        return this.f14018f;
    }

    @Nullable
    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.f14022j;
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.f14021i;
    }

    public final boolean getSoftWrap() {
        return this.f14017e;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.f14014b;
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.f14013a;
    }

    @NotNull
    /* renamed from: layout-NN6Ew-U  reason: not valid java name */
    public final TextLayoutResult m69773layoutNN6EwU(long j, @NotNull LayoutDirection layoutDirection, @Nullable TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (textLayoutResult != null && TextLayoutHelperKt.m69802canReuse7_7YC6M(textLayoutResult, this.f14013a, this.f14014b, this.f14021i, this.f14015c, this.f14017e, this.f14018f, this.f14019g, layoutDirection, this.f14020h, j)) {
            return textLayoutResult.m73188copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.f14014b, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m73186getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j, (DefaultConstructorMarker) null), ConstraintsKt.m73637constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        MultiParagraph m61061b = m61061b(j, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.f14013a, this.f14014b, this.f14021i, this.f14015c, this.f14017e, this.f14018f, this.f14019g, layoutDirection, this.f14020h, j, (DefaultConstructorMarker) null), m61061b, ConstraintsKt.m73637constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m61061b.getWidth()), TextDelegateKt.ceilToIntPx(m61061b.getHeight()))), null);
    }

    public final void layoutIntrinsics(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f14022j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f14023k || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.f14023k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f14013a, TextStyleKt.resolveDefaults(this.f14014b, layoutDirection), this.f14021i, this.f14019g, this.f14020h);
        }
        this.f14022j = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(@Nullable LayoutDirection layoutDirection) {
        this.f14023k = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(@Nullable MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.f14022j = multiParagraphIntrinsics;
    }

    public TextDelegate(AnnotatedString text, TextStyle style, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver fontFamilyResolver, List placeholders) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.f14013a = text;
        this.f14014b = style;
        this.f14015c = i;
        this.f14016d = i2;
        this.f14017e = z;
        this.f14018f = i3;
        this.f14019g = density;
        this.f14020h = fontFamilyResolver;
        this.f14021i = placeholders;
        if (i <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 > i) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i, int i2, boolean z, int i3, Density density, FontFamily.Resolver resolver, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? TextOverflow.Companion.m73594getClipgIe3tQ8() : i3, density, resolver, (i4 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, null);
    }
}
