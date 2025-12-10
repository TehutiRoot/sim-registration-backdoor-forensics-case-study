package androidx.compose.p003ui.text.font;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B6\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0006HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\bHÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0012R \u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, m28850d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/text/font/FontFamily;", "component2", "()Landroidx/compose/ui/text/font/FontWeight;", "component3-_-LCdwA", "()I", "component3", "component4-GVVA2EU", "component4", "component5", "()Ljava/lang/Object;", "copy-e1PVR60", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;)Landroidx/compose/ui/text/font/TypefaceRequest;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", OperatorName.CURVE_TO, "I", "getFontStyle-_-LCdwA", "d", "getFontSynthesis-GVVA2EU", "e", "Ljava/lang/Object;", "getResourceLoaderCacheKey", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.TypefaceRequest */
/* loaded from: classes2.dex */
public final class TypefaceRequest {

    /* renamed from: a */
    public final FontFamily f31338a;

    /* renamed from: b */
    public final FontWeight f31339b;

    /* renamed from: c */
    public final int f31340c;

    /* renamed from: d */
    public final int f31341d;

    /* renamed from: e */
    public final Object f31342e;

    public /* synthetic */ TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, fontWeight, i, i2, obj);
    }

    /* renamed from: copy-e1PVR60$default  reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m73341copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            fontFamily = typefaceRequest.f31338a;
        }
        if ((i3 & 2) != 0) {
            fontWeight = typefaceRequest.f31339b;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i3 & 4) != 0) {
            i = typefaceRequest.f31340c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = typefaceRequest.f31341d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            obj = typefaceRequest.f31342e;
        }
        return typefaceRequest.m73344copye1PVR60(fontFamily, fontWeight2, i4, i5, obj);
    }

    @Nullable
    public final FontFamily component1() {
        return this.f31338a;
    }

    @NotNull
    public final FontWeight component2() {
        return this.f31339b;
    }

    /* renamed from: component3-_-LCdwA  reason: not valid java name */
    public final int m73342component3_LCdwA() {
        return this.f31340c;
    }

    /* renamed from: component4-GVVA2EU  reason: not valid java name */
    public final int m73343component4GVVA2EU() {
        return this.f31341d;
    }

    @Nullable
    public final Object component5() {
        return this.f31342e;
    }

    @NotNull
    /* renamed from: copy-e1PVR60  reason: not valid java name */
    public final TypefaceRequest m73344copye1PVR60(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int i, int i2, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new TypefaceRequest(fontFamily, fontWeight, i, i2, obj, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypefaceRequest) {
            TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
            return Intrinsics.areEqual(this.f31338a, typefaceRequest.f31338a) && Intrinsics.areEqual(this.f31339b, typefaceRequest.f31339b) && FontStyle.m73311equalsimpl0(this.f31340c, typefaceRequest.f31340c) && FontSynthesis.m73320equalsimpl0(this.f31341d, typefaceRequest.f31341d) && Intrinsics.areEqual(this.f31342e, typefaceRequest.f31342e);
        }
        return false;
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.f31338a;
    }

    /* renamed from: getFontStyle-_-LCdwA  reason: not valid java name */
    public final int m73345getFontStyle_LCdwA() {
        return this.f31340c;
    }

    /* renamed from: getFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m73346getFontSynthesisGVVA2EU() {
        return this.f31341d;
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.f31339b;
    }

    @Nullable
    public final Object getResourceLoaderCacheKey() {
        return this.f31342e;
    }

    public int hashCode() {
        FontFamily fontFamily = this.f31338a;
        int hashCode = (((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.f31339b.hashCode()) * 31) + FontStyle.m73312hashCodeimpl(this.f31340c)) * 31) + FontSynthesis.m73321hashCodeimpl(this.f31341d)) * 31;
        Object obj = this.f31342e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f31338a + ", fontWeight=" + this.f31339b + ", fontStyle=" + ((Object) FontStyle.m73313toStringimpl(this.f31340c)) + ", fontSynthesis=" + ((Object) FontSynthesis.m73324toStringimpl(this.f31341d)) + ", resourceLoaderCacheKey=" + this.f31342e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.f31338a = fontFamily;
        this.f31339b = fontWeight;
        this.f31340c = i;
        this.f31341d = i2;
        this.f31342e = obj;
    }
}
