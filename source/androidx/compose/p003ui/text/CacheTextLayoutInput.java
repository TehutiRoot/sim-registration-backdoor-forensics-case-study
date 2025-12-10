package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/TextLayoutInput;", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.CacheTextLayoutInput */
/* loaded from: classes2.dex */
public final class CacheTextLayoutInput {

    /* renamed from: a */
    public final TextLayoutInput f30983a;

    public CacheTextLayoutInput(@NotNull TextLayoutInput textLayoutInput) {
        Intrinsics.checkNotNullParameter(textLayoutInput, "textLayoutInput");
        this.f30983a = textLayoutInput;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.f30983a;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        if (Intrinsics.areEqual(textLayoutInput.getText(), cacheTextLayoutInput.f30983a.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.f30983a.getStyle()) && Intrinsics.areEqual(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.f30983a.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.f30983a.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.f30983a.getSoftWrap() && TextOverflow.m73587equalsimpl0(textLayoutInput.m73186getOverflowgIe3tQ8(), cacheTextLayoutInput.f30983a.m73186getOverflowgIe3tQ8()) && Intrinsics.areEqual(textLayoutInput.getDensity(), cacheTextLayoutInput.f30983a.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.f30983a.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.f30983a.getFontFamilyResolver() && Constraints.m73626getMaxWidthimpl(textLayoutInput.m73185getConstraintsmsEJaDk()) == Constraints.m73626getMaxWidthimpl(cacheTextLayoutInput.f30983a.m73185getConstraintsmsEJaDk()) && Constraints.m73625getMaxHeightimpl(textLayoutInput.m73185getConstraintsmsEJaDk()) == Constraints.m73625getMaxHeightimpl(cacheTextLayoutInput.f30983a.m73185getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }

    @NotNull
    public final TextLayoutInput getTextLayoutInput() {
        return this.f30983a;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.f30983a;
        return (((((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput.getPlaceholders().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + AbstractC1705Xp.m65430a(textLayoutInput.getSoftWrap())) * 31) + TextOverflow.m73588hashCodeimpl(textLayoutInput.m73186getOverflowgIe3tQ8())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Constraints.m73626getMaxWidthimpl(textLayoutInput.m73185getConstraintsmsEJaDk())) * 31) + Constraints.m73625getMaxHeightimpl(textLayoutInput.m73185getConstraintsmsEJaDk());
    }
}
