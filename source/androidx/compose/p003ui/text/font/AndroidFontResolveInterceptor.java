package androidx.compose.p003ui.text.font;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "fontWeightAdjustment", "<init>", "(I)V", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "interceptFontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)Landroidx/compose/ui/text/font/FontWeight;", "copy", "(I)Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.AndroidFontResolveInterceptor */
/* loaded from: classes2.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {

    /* renamed from: a */
    public final int f31236a;

    public AndroidFontResolveInterceptor(int i) {
        this.f31236a = i;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = androidFontResolveInterceptor.f31236a;
        }
        return androidFontResolveInterceptor.copy(i);
    }

    @NotNull
    public final AndroidFontResolveInterceptor copy(int i) {
        return new AndroidFontResolveInterceptor(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.f31236a == ((AndroidFontResolveInterceptor) obj).f31236a;
    }

    public int hashCode() {
        return this.f31236a;
    }

    @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
    public /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
        return AbstractC17484Dk1.m68593a(this, fontFamily);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontStyle-T2F_aPo  reason: not valid java name */
    public /* synthetic */ int mo73265interceptFontStyleT2F_aPo(int i) {
        return AbstractC17484Dk1.m68592b(this, i);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontSynthesis-Mscr08Y  reason: not valid java name */
    public /* synthetic */ int mo73266interceptFontSynthesisMscr08Y(int i) {
        return AbstractC17484Dk1.m68591c(this, i);
    }

    @Override // androidx.compose.p003ui.text.font.PlatformResolveInterceptor
    @NotNull
    public FontWeight interceptFontWeight(@NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int i = this.f31236a;
        if (i != 0 && i != Integer.MAX_VALUE) {
            return new FontWeight(AbstractC11719c.coerceIn(fontWeight.getWeight() + this.f31236a, 1, 1000));
        }
        return fontWeight;
    }

    @NotNull
    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f31236a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
