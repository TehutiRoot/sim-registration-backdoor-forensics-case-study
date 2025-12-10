package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p003ui.text.font.Font;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001Br\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bBh\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001cBh\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u0085\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010%R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010\u0015\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bS\u0010T\u001a\u0004\bQ\u0010R\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, m28850d2 = {"Landroidx/compose/ui/text/TextLayoutInput;", "", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-hu-1Yfo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;J)Landroidx/compose/ui/text/TextLayoutInput;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", OperatorName.CURVE_TO, "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "d", "I", "getMaxLines", "e", "Z", "getSoftWrap", "()Z", OperatorName.FILL_NON_ZERO, "getOverflow-gIe3tQ8", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "i", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", OperatorName.SET_LINE_JOINSTYLE, OperatorName.SET_LINE_CAPSTYLE, "getConstraints-msEJaDk", "()J", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "_developerSuppliedResourceLoader", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getResourceLoader$annotations", "()V", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.TextLayoutInput */
/* loaded from: classes2.dex */
public final class TextLayoutInput {
    public static final int $stable = 8;

    /* renamed from: a */
    public final AnnotatedString f31085a;

    /* renamed from: b */
    public final TextStyle f31086b;

    /* renamed from: c */
    public final List f31087c;

    /* renamed from: d */
    public final int f31088d;

    /* renamed from: e */
    public final boolean f31089e;

    /* renamed from: f */
    public final int f31090f;

    /* renamed from: g */
    public final Density f31091g;

    /* renamed from: h */
    public final LayoutDirection f31092h;

    /* renamed from: i */
    public final FontFamily.Resolver f31093i;

    /* renamed from: j */
    public final long f31094j;

    /* renamed from: k */
    public Font.ResourceLoader f31095k;

    @Deprecated(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, resourceLoader, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-hu-1Yfo$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m73183copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j, int i3, Object obj) {
        AnnotatedString annotatedString2;
        TextStyle textStyle2;
        List<AnnotatedString.Range<Placeholder>> list2;
        int i4;
        boolean z2;
        int i5;
        Density density2;
        LayoutDirection layoutDirection2;
        Font.ResourceLoader resourceLoader2;
        long j2;
        if ((i3 & 1) != 0) {
            annotatedString2 = textLayoutInput.f31085a;
        } else {
            annotatedString2 = annotatedString;
        }
        if ((i3 & 2) != 0) {
            textStyle2 = textLayoutInput.f31086b;
        } else {
            textStyle2 = textStyle;
        }
        if ((i3 & 4) != 0) {
            list2 = textLayoutInput.f31087c;
        } else {
            list2 = list;
        }
        if ((i3 & 8) != 0) {
            i4 = textLayoutInput.f31088d;
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            z2 = textLayoutInput.f31089e;
        } else {
            z2 = z;
        }
        if ((i3 & 32) != 0) {
            i5 = textLayoutInput.f31090f;
        } else {
            i5 = i2;
        }
        if ((i3 & 64) != 0) {
            density2 = textLayoutInput.f31091g;
        } else {
            density2 = density;
        }
        if ((i3 & 128) != 0) {
            layoutDirection2 = textLayoutInput.f31092h;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i3 & 256) != 0) {
            resourceLoader2 = textLayoutInput.getResourceLoader();
        } else {
            resourceLoader2 = resourceLoader;
        }
        if ((i3 & 512) != 0) {
            j2 = textLayoutInput.f31094j;
        } else {
            j2 = j;
        }
        return textLayoutInput.m73184copyhu1Yfo(annotatedString2, textStyle2, list2, i4, z2, i5, density2, layoutDirection2, resourceLoader2, j2);
    }

    @Deprecated(message = "Replaced with FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated", replaceWith = @ReplaceWith(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    @NotNull
    /* renamed from: copy-hu-1Yfo  reason: not valid java name */
    public final TextLayoutInput m73184copyhu1Yfo(@NotNull AnnotatedString text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i, boolean z, int i2, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Font.ResourceLoader resourceLoader, long j) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        return new TextLayoutInput(text, style, placeholders, i, z, i2, density, layoutDirection, resourceLoader, this.f31093i, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        if (Intrinsics.areEqual(this.f31085a, textLayoutInput.f31085a) && Intrinsics.areEqual(this.f31086b, textLayoutInput.f31086b) && Intrinsics.areEqual(this.f31087c, textLayoutInput.f31087c) && this.f31088d == textLayoutInput.f31088d && this.f31089e == textLayoutInput.f31089e && TextOverflow.m73587equalsimpl0(this.f31090f, textLayoutInput.f31090f) && Intrinsics.areEqual(this.f31091g, textLayoutInput.f31091g) && this.f31092h == textLayoutInput.f31092h && Intrinsics.areEqual(this.f31093i, textLayoutInput.f31093i) && Constraints.m73620equalsimpl0(this.f31094j, textLayoutInput.f31094j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public final long m73185getConstraintsmsEJaDk() {
        return this.f31094j;
    }

    @NotNull
    public final Density getDensity() {
        return this.f31091g;
    }

    @NotNull
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.f31093i;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.f31092h;
    }

    public final int getMaxLines() {
        return this.f31088d;
    }

    /* renamed from: getOverflow-gIe3tQ8  reason: not valid java name */
    public final int m73186getOverflowgIe3tQ8() {
        return this.f31090f;
    }

    @NotNull
    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.f31087c;
    }

    @NotNull
    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this.f31095k;
        if (resourceLoader == null) {
            return DeprecatedBridgeFontResourceLoader.f30984b.from(this.f31093i);
        }
        return resourceLoader;
    }

    public final boolean getSoftWrap() {
        return this.f31089e;
    }

    @NotNull
    public final TextStyle getStyle() {
        return this.f31086b;
    }

    @NotNull
    public final AnnotatedString getText() {
        return this.f31085a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f31085a.hashCode() * 31) + this.f31086b.hashCode()) * 31) + this.f31087c.hashCode()) * 31) + this.f31088d) * 31) + AbstractC1705Xp.m65430a(this.f31089e)) * 31) + TextOverflow.m73588hashCodeimpl(this.f31090f)) * 31) + this.f31091g.hashCode()) * 31) + this.f31092h.hashCode()) * 31) + this.f31093i.hashCode()) * 31) + Constraints.m73629hashCodeimpl(this.f31094j);
    }

    @NotNull
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f31085a) + ", style=" + this.f31086b + ", placeholders=" + this.f31087c + ", maxLines=" + this.f31088d + ", softWrap=" + this.f31089e + ", overflow=" + ((Object) TextOverflow.m73589toStringimpl(this.f31090f)) + ", density=" + this.f31091g + ", layoutDirection=" + this.f31092h + ", fontFamilyResolver=" + this.f31093i + ", constraints=" + ((Object) Constraints.m73631toStringimpl(this.f31094j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, resolver, j);
    }

    public TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j) {
        this.f31085a = annotatedString;
        this.f31086b = textStyle;
        this.f31087c = list;
        this.f31088d = i;
        this.f31089e = z;
        this.f31090f = i2;
        this.f31091g = density;
        this.f31092h = layoutDirection;
        this.f31093i = resolver;
        this.f31094j = j;
        this.f31095k = resourceLoader;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextLayoutInput(AnnotatedString text, TextStyle style, List placeholders, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j) {
        this(text, style, placeholders, i, z, i2, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextLayoutInput(AnnotatedString text, TextStyle style, List placeholders, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long j) {
        this(text, style, placeholders, i, z, i2, density, layoutDirection, (Font.ResourceLoader) null, fontFamilyResolver, j);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
    }
}
