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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/TextLayoutInput;", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.CacheTextLayoutInput */
/* loaded from: classes2.dex */
public final class CacheTextLayoutInput {

    /* renamed from: a */
    public final TextLayoutInput f31071a;

    public CacheTextLayoutInput(@NotNull TextLayoutInput textLayoutInput) {
        Intrinsics.checkNotNullParameter(textLayoutInput, "textLayoutInput");
        this.f31071a = textLayoutInput;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.f31071a;
        CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
        if (Intrinsics.areEqual(textLayoutInput.getText(), cacheTextLayoutInput.f31071a.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.f31071a.getStyle()) && Intrinsics.areEqual(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.f31071a.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.f31071a.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.f31071a.getSoftWrap() && TextOverflow.m73771equalsimpl0(textLayoutInput.m73370getOverflowgIe3tQ8(), cacheTextLayoutInput.f31071a.m73370getOverflowgIe3tQ8()) && Intrinsics.areEqual(textLayoutInput.getDensity(), cacheTextLayoutInput.f31071a.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.f31071a.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.f31071a.getFontFamilyResolver() && Constraints.m73810getMaxWidthimpl(textLayoutInput.m73369getConstraintsmsEJaDk()) == Constraints.m73810getMaxWidthimpl(cacheTextLayoutInput.f31071a.m73369getConstraintsmsEJaDk()) && Constraints.m73809getMaxHeightimpl(textLayoutInput.m73369getConstraintsmsEJaDk()) == Constraints.m73809getMaxHeightimpl(cacheTextLayoutInput.f31071a.m73369getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }

    @NotNull
    public final TextLayoutInput getTextLayoutInput() {
        return this.f31071a;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.f31071a;
        return (((((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput.getPlaceholders().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + AbstractC1694Xp.m65565a(textLayoutInput.getSoftWrap())) * 31) + TextOverflow.m73772hashCodeimpl(textLayoutInput.m73370getOverflowgIe3tQ8())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Constraints.m73810getMaxWidthimpl(textLayoutInput.m73369getConstraintsmsEJaDk())) * 31) + Constraints.m73809getMaxHeightimpl(textLayoutInput.m73369getConstraintsmsEJaDk());
    }
}