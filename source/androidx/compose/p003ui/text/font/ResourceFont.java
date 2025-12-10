package androidx.compose.p003ui.text.font;

import androidx.compose.p003ui.text.ExperimentalTextApi;
import androidx.compose.p003ui.text.font.FontVariation;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R)\u0010\u000b\u001a\u00020\n8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001e\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m28850d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "<init>", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getResId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", OperatorName.CURVE_TO, "getStyle-_-LCdwA", "d", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "e", "getLoadingStrategy-PKNRLFQ", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.ResourceFont */
/* loaded from: classes2.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f31331a;

    /* renamed from: b */
    public final FontWeight f31332b;

    /* renamed from: c */
    public final int f31333c;

    /* renamed from: d */
    public final FontVariation.Settings f31334d;

    /* renamed from: e */
    public final int f31335e;

    public /* synthetic */ ResourceFont(int i, FontWeight fontWeight, int i2, @ExperimentalTextApi FontVariation.Settings settings, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fontWeight, i2, settings, i3);
    }

    /* renamed from: copy-F3nL8kk$default  reason: not valid java name */
    public static /* synthetic */ ResourceFont m73336copyF3nL8kk$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceFont.f31331a;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i4 & 4) != 0) {
            i2 = resourceFont.mo73268getStyle_LCdwA();
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = resourceFont.mo73258getLoadingStrategyPKNRLFQ();
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            settings = resourceFont.f31334d;
        }
        return resourceFont.m73339copyF3nL8kk(i, fontWeight2, i5, i6, settings);
    }

    /* renamed from: copy-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ ResourceFont m73337copyRetOiIg$default(ResourceFont resourceFont, int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.f31331a;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.mo73268getStyle_LCdwA();
        }
        return resourceFont.m73340copyRetOiIg(i, fontWeight, i2);
    }

    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations  reason: not valid java name */
    public static /* synthetic */ void m73338getLoadingStrategyPKNRLFQ$annotations() {
    }

    @ExperimentalTextApi
    @NotNull
    /* renamed from: copy-F3nL8kk  reason: not valid java name */
    public final ResourceFont m73339copyF3nL8kk(int i, @NotNull FontWeight weight, int i2, int i3, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new ResourceFont(i, weight, i2, variationSettings, i3, null);
    }

    @NotNull
    /* renamed from: copy-RetOiIg  reason: not valid java name */
    public final ResourceFont m73340copyRetOiIg(int i, @NotNull FontWeight weight, int i2) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return m73336copyF3nL8kk$default(this, i, weight, i2, mo73258getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) obj;
        if (this.f31331a == resourceFont.f31331a && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.m73311equalsimpl0(mo73268getStyle_LCdwA(), resourceFont.mo73268getStyle_LCdwA()) && Intrinsics.areEqual(this.f31334d, resourceFont.f31334d) && FontLoadingStrategy.m73298equalsimpl0(mo73258getLoadingStrategyPKNRLFQ(), resourceFont.mo73258getLoadingStrategyPKNRLFQ())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.text.font.Font
    @ExperimentalTextApi
    /* renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo73258getLoadingStrategyPKNRLFQ() {
        return this.f31335e;
    }

    public final int getResId() {
        return this.f31331a;
    }

    @Override // androidx.compose.p003ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo73268getStyle_LCdwA() {
        return this.f31333c;
    }

    @ExperimentalTextApi
    @NotNull
    public final FontVariation.Settings getVariationSettings() {
        return this.f31334d;
    }

    @Override // androidx.compose.p003ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.f31332b;
    }

    public int hashCode() {
        return (((((((this.f31331a * 31) + getWeight().hashCode()) * 31) + FontStyle.m73312hashCodeimpl(mo73268getStyle_LCdwA())) * 31) + FontLoadingStrategy.m73299hashCodeimpl(mo73258getLoadingStrategyPKNRLFQ())) * 31) + this.f31334d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.f31331a + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m73313toStringimpl(mo73268getStyle_LCdwA())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m73300toStringimpl(mo73258getLoadingStrategyPKNRLFQ())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ResourceFont(int i, FontWeight weight, int i2, FontVariation.Settings variationSettings, int i3) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.f31331a = i;
        this.f31332b = weight;
        this.f31333c = i2;
        this.f31334d = variationSettings;
        this.f31335e = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ResourceFont(int r8, androidx.compose.p003ui.text.font.FontWeight r9, int r10, androidx.compose.p003ui.text.font.FontVariation.Settings r11, int r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r7 = this;
            r14 = r13 & 2
            if (r14 == 0) goto La
            androidx.compose.ui.text.font.FontWeight$Companion r9 = androidx.compose.p003ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r9 = r9.getNormal()
        La:
            r2 = r9
            r9 = r13 & 4
            if (r9 == 0) goto L15
            androidx.compose.ui.text.font.FontStyle$Companion r9 = androidx.compose.p003ui.text.font.FontStyle.Companion
            int r10 = r9.m73316getNormal_LCdwA()
        L15:
            r3 = r10
            r9 = r13 & 8
            if (r9 == 0) goto L23
            androidx.compose.ui.text.font.FontVariation r9 = androidx.compose.p003ui.text.font.FontVariation.INSTANCE
            r10 = 0
            androidx.compose.ui.text.font.FontVariation$Setting[] r10 = new androidx.compose.p003ui.text.font.FontVariation.Setting[r10]
            androidx.compose.ui.text.font.FontVariation$Settings r11 = r9.m73331Settings6EWAqTQ(r2, r3, r10)
        L23:
            r4 = r11
            r9 = r13 & 16
            if (r9 == 0) goto L2e
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r9 = androidx.compose.p003ui.text.font.FontLoadingStrategy.Companion
            int r12 = r9.m73302getAsyncPKNRLFQ()
        L2e:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.font.ResourceFont.<init>(int, androidx.compose.ui.text.font.FontWeight, int, androidx.compose.ui.text.font.FontVariation$Settings, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
